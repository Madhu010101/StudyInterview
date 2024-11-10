package za.co.fnb.cish.fid.topic.processor.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import za.co.fnb.cish.fid.repo.model.*;
import za.env.raw.opm.firstidmasterentity.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static za.co.fnb.cish.fid.topic.processor.util.Constants.*;

@Component("FirstIdMasterSourceMapper")
@DependsOn("CISReferenceDataUtil")
public class FirstIdMasterSourceMapper {

    private CISReferenceDataUtil cisReferenceDataUtil;

    public FirstIdMasterSourceMapper() {
    }

    public static long CalculateMonths(String sDate, String eDate) {
        long months = 0;
        try {


            DateTimeFormatter oldPattern = DateTimeFormatter.ofPattern("yyyyMMdd");
            DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            LocalDate localstartdate = LocalDate.parse(sDate, oldPattern);
            String SDate = localstartdate.format(newPattern);
            LocalDate Start_Date = LocalDate.parse(SDate, newPattern);

            LocalDate End_Date = null;

            if (StringUtils.isNotEmpty(eDate)) {
                LocalDate localendate = LocalDate.parse(eDate, oldPattern);
                String EDate = localendate.format(newPattern);
                End_Date = LocalDate.parse(EDate, newPattern);
            } else {
                End_Date = LocalDate.now();
            }
            months = ChronoUnit.MONTHS.between(Start_Date, End_Date);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return months;
    }

    public FirstIdMasterEntity map(za.co.fnb.cish.fid.common.api.fidmaster.FirstIdMasterEntity firstIdMasterEntity) {
        FirstIdMasterEntity firstId = new FirstIdMasterEntity();
        EventHeader eventHeader = getEventHeader(firstIdMasterEntity);
        firstId.setEventHeader(eventHeader);
        Key key = getKey(firstIdMasterEntity);
        firstId.setKey(key);
        Party party = getParty(firstIdMasterEntity.getParty());
        firstId.setParty(party);

        return firstId;
    }

    private Key getKey(za.co.fnb.cish.fid.common.api.fidmaster.FirstIdMasterEntity firstIdMasterEntity) {
        Key key = new Key();
        key.setKeyCompanyEntpsTypeCode(String.valueOf(cisReferenceDataUtil.getJurisdictionCompanyLookUp().getOrDefault(firstIdMasterEntity.getKey().getKeyCompanyEntpsTypeCode(), INTEGER_ZERO)));
        key.setKeyIdentifierEntpsTypeCode(cisReferenceDataUtil.getIdentifierTypeLookUp().getOrDefault(Integer.parseInt(firstIdMasterEntity.getKey().getKeyIdentifierEntpsTypeCode()), STRING_ZERO));
        key.setKeyIdentifierJurisdictionId(firstIdMasterEntity.getKey().getKeyIdentifierJurisdictionId());
        key.setKeyIdentifierNumber(firstIdMasterEntity.getKey().getKeyIdentifierNumber());
        key.setKeyIdentifierSystemEntpsTypeCode(firstIdMasterEntity.getKey().getKeyIdentifierSystemEntpsTypeCode());
        key.setKeyJurisdictionCountryEntpsCode(String.valueOf(cisReferenceDataUtil.getJurisdictionLookUp().getOrDefault(firstIdMasterEntity.getParty().getIdentifiers().get(0).getJurisdictionId(), STRING_ZERO)));
        return key;
    }

    private EventHeader getEventHeader(za.co.fnb.cish.fid.common.api.fidmaster.FirstIdMasterEntity firstIdMasterEntity) {
        EventHeader eventHeader = new EventHeader();
        eventHeader.setEventAction(firstIdMasterEntity.getEventHeader().getEventAction());
        eventHeader.setEventArchContext(firstIdMasterEntity.getEventHeader().getEventArchContext());
        eventHeader.setEventDateTime(firstIdMasterEntity.getEventHeader().getEventDateTime());
        eventHeader.setEventUUID(firstIdMasterEntity.getEventHeader().getEventUUID());
        eventHeader.setSourceSystemCode(firstIdMasterEntity.getEventHeader().getSourceSystemCode());

        List<za.co.fnb.cish.fid.common.api.fidmaster.Correlation> correlation1 = firstIdMasterEntity.getEventHeader().getCorrelations();
        List<Correlation> correlations = new ArrayList<>(correlation1.size());

        for (za.co.fnb.cish.fid.common.api.fidmaster.Correlation correlation : correlation1) {
            Correlation c = new Correlation();
            c.setCorrelationName(correlation.getCorrelationName());
            c.setCorrelationValue(correlation.getCorrelationValue());
            correlations.add(c);
        }
        eventHeader.setCorrelations(correlations);

        List<EventOrigin> eventOrigins = new ArrayList<>(1);
        List<za.co.fnb.cish.fid.common.api.fidmaster.EventOrigin> eventOrigin = firstIdMasterEntity.getEventHeader().getEventOrigins();
        for (za.co.fnb.cish.fid.common.api.fidmaster.EventOrigin eventOrigin1 : eventOrigin) {
            EventOrigin o = new EventOrigin();
            o.setEventOriginType(eventOrigin1.getEventOriginType());
            o.setEventOriginName(eventOrigin1.getEventOriginName());
            o.setEventOriginSourceSystemCode(eventOrigin1.getEventOriginSourceSystemCode());
            eventOrigins.add(o);
        }
        eventHeader.setEventOrigins(eventOrigins);
        return eventHeader;
    }

    private Party getParty(za.co.fnb.cish.fid.common.api.fidmaster.Party party) {
        Party partyMaster = new Party();
        Container container = getContainer(party);
        partyMaster.setContainer(container);
        List<Identifier> identifierList = getIdentifiers(party);
        partyMaster.setIdentifiers(identifierList);

        Integer jurisdiction_src_tp_cd = ((Objects.nonNull(identifierList) && identifierList.size() > 0 && Objects.nonNull(identifierList.stream().findFirst().get().getJurisdictionCountryEntpsCode())) ? (Integer.valueOf(identifierList.stream().findFirst().get().getJurisdictionCountryEntpsCode())) : null);

//        List<Identification> identificationList = getIdentifications(party, jurisdiction_src_tp_cd);
//        partyMaster.setIdentifications(identificationList);
        Individual individual = getIndividual(party, jurisdiction_src_tp_cd);
        partyMaster.setIndividual(individual);
        List<Location> locations = getLocations(party, jurisdiction_src_tp_cd);
        partyMaster.setLocations(locations);
        Organisation organisation = getOrganisation(party, jurisdiction_src_tp_cd);
        partyMaster.setOrganisation(organisation);
        List<Identification> identificationList = getIdentifications(party, jurisdiction_src_tp_cd,organisation);
        partyMaster.setIdentifications(identificationList);
        List<SourceOfFunds> sourceOfFunds = getSourceOfFunds(party, jurisdiction_src_tp_cd);
        partyMaster.setSourcesOfFunds(sourceOfFunds);
        List<TakeOnAttribute> takeOnAttribute = getTakeOnAttribute(party);
        partyMaster.setTakeOnAttributes(takeOnAttribute);
        partyMaster.setConversationLanguageEntpsTypeCode(party.getConversationLanguageEntpsTypeCode());

        if (StringUtils.isNotEmpty(party.getCorrespondenceLanguageEntpsTypeCode())) {
            Map<Integer, String> CorrespondenceLanguageLookUp = cisReferenceDataUtil.getLanguageLookUp().stream().filter(o -> o.getCmpnyTpCd() == jurisdiction_src_tp_cd && o.getLngEntpsTpCd() == Integer.valueOf(party.getCorrespondenceLanguageEntpsTypeCode())).collect((Collectors.toMap(LanguageTypeEntity::getLngEntpsTpCd, LanguageTypeEntity::getLngSrcTpCd, (existing, replacement) -> existing)));
            partyMaster.setCorrespondenceLanguageEntpsTypeCode(CorrespondenceLanguageLookUp.getOrDefault(Integer.valueOf(party.getCorrespondenceLanguageEntpsTypeCode()), STRING_BLANK));
        } else {
            partyMaster.setCorrespondenceLanguageEntpsTypeCode(STRING_BLANK);
        }
        partyMaster.setHomeLanguageEntpsTypeCode(party.getHomeLanguageEntpsTypeCode());
        partyMaster.setPartyCreatedDate(party.getPartyCreatedDate());
        if (Objects.nonNull(party.getPartyEntpsTypeCode()) && party.getPartyEntpsTypeCode().length() == 1) {
            partyMaster.setPartyEntpsTypeCode("0" + party.getPartyEntpsTypeCode());
        } else {
            partyMaster.setPartyEntpsTypeCode(party.getPartyEntpsTypeCode());
        }
        partyMaster.setPartyStatusDate(party.getPartyStatusDate());
        partyMaster.setPartyStatusEntpsTypeCode(party.getPartyStatusEntpsTypeCode());
        partyMaster.setProfileRegistrationName(party.getProfileRegistrationName());
        if (Objects.nonNull(party.getPartyEntpsTypeCode()) && ((Integer.valueOf(party.getPartyEntpsTypeCode()) == 02))) {
            partyMaster.setName(Constants.STAR_CHARACTER + party.getName());
        } else {
            partyMaster.setName(party.getName());
        }

        List<PartyClassification> partyClassification = getPartyClassification(party, jurisdiction_src_tp_cd);
        partyMaster.setPartyClassifications(partyClassification);


        return partyMaster;
    }

    private List<TakeOnAttribute> getTakeOnAttribute(za.co.fnb.cish.fid.common.api.fidmaster.Party party) {
        List<TakeOnAttribute> takeOnAttributeList = new ArrayList<>();
        if (Objects.nonNull(party.getTakeOnAttributes()) && party.getTakeOnAttributes().size() > 0) {
            for (za.co.fnb.cish.fid.common.api.fidmaster.TakeOnAttribute takeOnAttribute : party.getTakeOnAttributes()) {
                TakeOnAttribute attribute = new TakeOnAttribute();
                attribute.setAttributeName(takeOnAttribute.getAttributeName());
                attribute.setAttributeValue(takeOnAttribute.getAttributeValue());
                takeOnAttributeList.add(attribute);
            }
        }
        return takeOnAttributeList;
    }

    private List<SourceOfFunds> getSourceOfFunds(za.co.fnb.cish.fid.common.api.fidmaster.Party party, Integer jurisdiction_src_tp_cd) {
        List<SourceOfFunds> fundList = new ArrayList<>();
        if (Objects.nonNull(party.getSourcesOfFunds()) && party.getSourcesOfFunds().size() > 0) {
            for (za.co.fnb.cish.fid.common.api.fidmaster.SourceOfFunds sourceOfFunds : party.getSourcesOfFunds()) {
                SourceOfFunds sof = new SourceOfFunds();
                sof.setSourceOfFundsAmount(sourceOfFunds.getSourceOfFundsAmount());
                sof.setSourceOfFundsDate(sourceOfFunds.getSourceOfFundsDate());
                if (StringUtils.isNotEmpty(sourceOfFunds.getSourceOfFundsEntpsTypeCode()) && !DEFAULT_MAPPING.containsAll(Collections.singleton(sourceOfFunds.getSourceOfFundsEntpsTypeCode()))) {
                    Map<Integer, String> sourceOfFundLookUp = cisReferenceDataUtil.getSofLookup().stream().filter(o -> o.getCmpnyTpCd() == jurisdiction_src_tp_cd && o.getPartyEntpsTpCd() == Integer.valueOf(party.getPartyEntpsTypeCode())).collect(Collectors.toMap(SourceOfFundEntity::getPartyFundEntpsTpCd, SourceOfFundEntity::getPartyFundSrcTpCd, (existing, replacement) -> existing));
                    sof.setSourceOfFundsEntpsTypeCode(sourceOfFundLookUp.getOrDefault(Integer.valueOf(sourceOfFunds.getSourceOfFundsEntpsTypeCode()), STRING_BLANK));
                } else {
                    sof.setSourceOfFundsEntpsTypeCode(STRING_BLANK);
                }
                sof.setSourceOfFundsActiveIndicator(sourceOfFunds.getSourceOfFundsActiveIndicator());
                sof.setSourceOfFundsCurrencyEntpsTypeCode(sourceOfFunds.getSourceOfFundsCurrencyEntpsTypeCode());
                sof.setSourceOfFundsFrequencyEntpsTypeCode(sourceOfFunds.getSourceOfFundsFrequencyEntpsTypeCode());
                sof.setSourceOfFundsPaymentDay(sourceOfFunds.getSourceOfFundsPaymentDay());
                sof.setPrimarySourceOfFundsIndicator(sourceOfFunds.getPrimarySourceOfFundsIndicator());
                fundList.add(sof);

            }
        }
        return fundList;
    }

    private Organisation getOrganisation(za.co.fnb.cish.fid.common.api.fidmaster.Party party, Integer jurisdiction_src_tp_cd) {
        Organisation organisation = null;
        Map<Integer, String> organisationLookUp = new HashMap<Integer, String>();
        Map<Integer, Integer> orgTypeLookUp = new HashMap<Integer, Integer>();
        Optional<Integer> turnoveramount =null;

        List<OrganisationClassification> organisationClassification = null;
        if (Objects.nonNull(party.getOrganisation())) {
            za.co.fnb.cish.fid.common.api.fidmaster.Organisation org = party.getOrganisation();
            organisation = new Organisation();
            organisation.setEstablishedCountryEntpsCode(org.getEstablishedCountryEntpsCode());
            organisation.setEstablishedDate(org.getEstablishedDate());
            organisation.setLegalResponsibilityIndicator(org.getLegalResponsibilityIndicator());
            organisation.setOperationCountryEntpsCode(org.getOperationCountryEntpsCode());
            organisation.setOperationStartDate(org.getOperationStartDate());

            if (StringUtils.isNotEmpty(org.getOrganisationEntpsTypeCode()) && ORG_TYPES.contains(org.getOrganisationEntpsTypeCode())) {

                organisationLookUp.put(Integer.valueOf(org.getOrganisationEntpsTypeCode()), "11");
                organisation.setOrganisationEntpsTypeCode(organisationLookUp.getOrDefault(Integer.valueOf(org.getOrganisationEntpsTypeCode()), STRING_ZERO));
            }
            if (StringUtils.isNotEmpty(org.getOrganisationEntpsTypeCode()) && organisationLookUp.isEmpty()) {

                orgTypeLookUp = cisReferenceDataUtil.getOrganisationTypeLookUp().stream().filter(o -> o.getOrgEntpsTpCd() == Integer.valueOf(org.getOrganisationEntpsTypeCode())).collect((Collectors.toMap(OrganisationTypeEntity::getOrgEntpsTpCd, OrganisationTypeEntity::getOrgCatTpCd, (existing, replacement) -> existing)));
                Map<Integer, Integer> finalOrgTypeLookUp = orgTypeLookUp;
                organisationLookUp = cisReferenceDataUtil.getCategoryLookUp().stream().filter(o -> o.getOrgCatEntpsTpCd() == finalOrgTypeLookUp.getOrDefault(Integer.valueOf(org.getOrganisationEntpsTypeCode()), INTEGER_ZERO)).collect((Collectors.toMap(OrgCategoryTypeEntity::getOrgCatEntpsTpCd, OrgCategoryTypeEntity::getOrgCatSrcTpCd, (existing, replacement) -> existing)));
                organisation.setOrganisationEntpsTypeCode(organisationLookUp.getOrDefault(Integer.valueOf(org.getOrganisationEntpsTypeCode()), STRING_ZERO));

                organisation.setOrganisationEntpsTypeCode(organisationLookUp.values().stream().findFirst().orElse(STRING_ZERO));
            }
            if (StringUtils.isNotEmpty(org.getOrganisationEntpsTypeCode()) && organisationLookUp.isEmpty() && StringUtils.isEmpty(organisationLookUp.get(org.getOrganisationEntpsTypeCode()))) {
                organisationLookUp = cisReferenceDataUtil.getOrganisationLookUp().stream().filter(o -> o.getCmpnyTpCd() == jurisdiction_src_tp_cd && o.getOrgEntpsTpCd() == Integer.valueOf(org.getOrganisationEntpsTypeCode())).collect((Collectors.toMap(OrganisationTypeEntity::getOrgEntpsTpCd, OrganisationTypeEntity::getOrgSrcTpCd, (existing, replacement) -> existing)));
                organisation.setOrganisationEntpsTypeCode(organisationLookUp.getOrDefault(Integer.valueOf(org.getOrganisationEntpsTypeCode()), STRING_ZERO));
            }
            if (StringUtils.isEmpty(org.getOrganisationEntpsTypeCode())) {
                organisation.setOrganisationEntpsTypeCode(org.getOrganisationEntpsTypeCode());
            }
            //  organisation.setOrganisationEntpsTypeCode(StringUtils.isNotEmpty(OrganisationLookUp.getOrDefault(Integer.valueOf(org.getOrganisationEntpsTypeCode()), STRING_ZERO));

            organisation.setOrganisationStatusDate(org.getOrganisationStatusDate());

            if (StringUtils.isNotEmpty(org.getOrganisationStatusEntpsTypeCode())) {
                Map<Integer, String> OrganisationStatusLookUp = cisReferenceDataUtil.getOrganisationStatusLookUp().stream().filter(o -> o.getCmpnyTpCd() == jurisdiction_src_tp_cd && o.getOrgSttsEntpsTpCd() == Integer.valueOf(org.getOrganisationStatusEntpsTypeCode())).collect((Collectors.toMap(OrganisationStatusTypeEntity::getOrgSttsEntpsTpCd, OrganisationStatusTypeEntity::getOrgSttsSrcTpCd, (existing, replacement) -> existing)));
                organisation.setOrganisationStatusEntpsTypeCode(OrganisationStatusLookUp.getOrDefault(Integer.valueOf(org.getOrganisationStatusEntpsTypeCode()), STRING_ZERO));
            } else {
                organisation.setOrganisationStatusEntpsTypeCode(org.getOrganisationStatusEntpsTypeCode());
            }
            organisation.setRegisteredHeadOfficeCountryEntpsCode(StringUtils.isNotEmpty(org.getRegisteredHeadOfficeCountryEntpsCode()) && !DEFAULT_MAPPING.contains(org.getRegisteredHeadOfficeCountryEntpsCode())?org.getRegisteredHeadOfficeCountryEntpsCode():STRING_BLANK);
            organisation.setStateOwnedCompanyIndicator(StringUtils.isNotEmpty(org.getStateOwnedCompanyIndicator())?org.getStateOwnedCompanyIndicator(): STRING_BLANK);
            organisation.setTaxYearEndMonth(org.getTaxYearEndMonth());
            organisation.setTradingName(StringUtils.isNotEmpty(org.getTradingName()) ? org.getTradingName():STRING_BLANK);

            if( Objects.nonNull(org.getAnnualTurnoverAmount()) ) {
                 turnoveramount = cisReferenceDataUtil.getTurnoverTypeLookUp().stream().filter(t ->
                        (t.getCmpnyTpCd() == jurisdiction_src_tp_cd) && (org.getAnnualTurnoverAmount() >= Long.parseLong(t.getTnvrAmtFrom()) && org.getAnnualTurnoverAmount() <= Long.parseLong(t.getTnvrAmtTo()))).map(e -> e.getTnvrSrcTpCd()).findAny();
                organisation.setAnnualTurnoverAmount(turnoveramount.isPresent() ? Double.valueOf(turnoveramount.get()) : INTEGER_ZERO);
            }
            else{
                organisation.setAnnualTurnoverAmount(null);
            }
            organisationClassification = getOrganisationClassification(party, jurisdiction_src_tp_cd);
            organisation.setOrganisationClassifications(organisationClassification);

        }
        return organisation;
    }

    private Individual getIndividual(za.co.fnb.cish.fid.common.api.fidmaster.Party party, Integer jurisdiction_src_tp_cd) {
        Individual individual = new Individual();
        if (Objects.nonNull(party.getIndividual())) {
            individual.setMaritalConsentIndicator(Objects.nonNull(party.getIndividual().getMaritalConsentIndicator())?party.getIndividual().getMaritalConsentIndicator():STRING_BLANK);
            individual.setBirthCityName(party.getIndividual().getBirthCityName());
            individual.setBirthCountryEntpsCode(party.getIndividual().getBirthCountryEntpsCode());
            individual.setBirthDate(party.getIndividual().getBirthDate());
            individual.setDeceasedDate(party.getIndividual().getDeceasedDate());
            individual.setGenderEntpsTypeCode((StringUtils.isNotEmpty(party.getIndividual().getGenderEntpsTypeCode())) ? (cisReferenceDataUtil.getGenderTypeLookUp().getOrDefault(Integer.valueOf(party.getIndividual().getGenderEntpsTypeCode()), STRING_BLANK)) : STRING_BLANK);

            if (StringUtils.isNotEmpty(party.getIndividual().getMaritalContractEntpsTypeCode())) {
                Map<Integer, String> MaritalContractLookUp = cisReferenceDataUtil.getMaritalContractLookUp().stream().filter(o -> o.getCmpnyTpCd() == jurisdiction_src_tp_cd && o.getMrtlCntrctEntpsTpCd() == Integer.valueOf(party.getIndividual().getMaritalContractEntpsTypeCode())).collect(Collectors.toMap(MaritalContractTypeEntity::getMrtlCntrctEntpsTpCd, MaritalContractTypeEntity::getMrtlCntrctSrcTpCd, (existing, replacement) -> existing));
                individual.setMaritalContractEntpsTypeCode(MaritalContractLookUp.getOrDefault(Integer.valueOf(party.getIndividual().getMaritalContractEntpsTypeCode()), STRING_BLANK));
            } else {
                individual.setMaritalContractEntpsTypeCode(STRING_BLANK);
            }
            if (StringUtils.isNotEmpty(party.getIndividual().getMaritalStatusEntpsTypeCode())) {
                Map<Integer, String> MaritalStatusLookUp = cisReferenceDataUtil.getMaritalStatusLookUp().stream().filter(o -> o.getCmpnyTpCd() == jurisdiction_src_tp_cd && o.getMrtlSttsEntpsTpCd() == Integer.valueOf(party.getIndividual().getMaritalStatusEntpsTypeCode())).collect(Collectors.toMap(MaritalStatusTypeEntity::getMrtlSttsEntpsTpCd, MaritalStatusTypeEntity::getMrtlSttsSrcTpCd, (existing, replacement) -> existing));
                individual.setMaritalStatusEntpsTypeCode(MaritalStatusLookUp.getOrDefault(Integer.valueOf(party.getIndividual().getMaritalStatusEntpsTypeCode()), STRING_BLANK));
            } else {
                individual.setMaritalStatusEntpsTypeCode(STRING_BLANK);
            }
            individual.setNationalityCountryEntpsCode(party.getIndividual().getNationalityCountryEntpsCode());
            individual.setNumberOfDependants(Objects.nonNull(party.getIndividual().getNumberOfDependants())?party.getIndividual().getNumberOfDependants():INTEGER_ZERO);
            individual.setPermanentResidenceCountryEntpsCode(party.getIndividual().getPermanentResidenceCountryEntpsCode());
            individual.setTitleEntpsTypeCode((StringUtils.isNotEmpty(party.getIndividual().getTitleEntpsTypeCode())) ? (cisReferenceDataUtil.getTitleTypeLookUp().getOrDefault(Integer.valueOf(party.getIndividual().getTitleEntpsTypeCode()), STRING_ZERO)) : "");
            individual.setEducations(getEducation(party.getIndividual()));
            individual.setEmployments(getEmployment(party.getIndividual(), jurisdiction_src_tp_cd));

        }
        return individual;
    }

    private List<Employment> getEmployment(za.co.fnb.cish.fid.common.api.fidmaster.Individual individual, Integer jurisdiction_src_tp_cd) {
        List<Employment> employmentsList = new ArrayList<>();
        if (Objects.nonNull(individual.getEmployments())) {
            for (za.co.fnb.cish.fid.common.api.fidmaster.Employment employment : individual.getEmployments()) {
                Employment emp = new Employment();
                emp.setEmployerName(StringUtils.isNotEmpty(employment.getEmployerName())?employment.getEmployerName():STRING_BLANK);
                emp.setEmploymentStartDate((StringUtils.isNotEmpty(employment.getEmploymentStartDate())) ? (String.valueOf(CalculateMonths(employment.getEmploymentStartDate(), employment.getEmploymentEndDate()))) : employment.getEmploymentStartDate());
                emp.setEmploymentEndDate(employment.getEmploymentEndDate());
                if (StringUtils.isEmpty(employment.getEmploymentStatusEntpsTypeCode()) || EMPLOYMENT_STATUS_TYPE.contains(Integer.valueOf(employment.getEmploymentStatusEntpsTypeCode()))) {
                    Map<Integer, String> OccupationLookUp = cisReferenceDataUtil.getOccupationLookUp().stream().filter(o -> o.getCmpnyTpCd() == jurisdiction_src_tp_cd).collect((Collectors.toMap(OccupationTypeEntity::getOcptnEntpsTpCd, OccupationTypeEntity::getOcptnSrcTpCd, (existing, replacement) -> existing)));
                    emp.setOccupationEntpsTypeCode(StringUtils.isNotEmpty(employment.getOccupationEntpsTypeCode()) ?OccupationLookUp.getOrDefault(Integer.valueOf(employment.getOccupationEntpsTypeCode()), STRING_BLANK) :STRING_BLANK);
                    emp.setEmploymentStatusEntpsTypeCode(employment.getEmploymentStatusEntpsTypeCode());

                } else if (StringUtils.isNotEmpty(employment.getEmploymentStatusEntpsTypeCode()) && (Integer.valueOf(employment.getEmploymentStatusEntpsTypeCode()) == 4)) {
                    emp.setOccupationEntpsTypeCode(OCCUPATION_TYPE_RETIRED);
                    emp.setEmploymentStatusEntpsTypeCode(employment.getEmploymentStatusEntpsTypeCode());

                } else {
                    Map<Integer, String> EmployentStatusLookUp = cisReferenceDataUtil.getEmploymentStatusTypeLookUp().stream().filter(o -> o.getEmplmntSttsEntpsTpCd() == Integer.valueOf(employment.getEmploymentStatusEntpsTypeCode())).collect((Collectors.toMap(EmploymentStatusTypeEntity::getEmplmntSttsEntpsTpCd, EmploymentStatusTypeEntity::getEmplmntSttsSrcTpCd, (existing, replacement) -> existing)));
                    emp.setOccupationEntpsTypeCode(StringUtils.isNotEmpty(employment.getEmploymentStatusEntpsTypeCode())?EmployentStatusLookUp.getOrDefault(Integer.valueOf(employment.getEmploymentStatusEntpsTypeCode()), STRING_BLANK) :STRING_BLANK);
                    emp.setEmploymentStatusEntpsTypeCode(employment.getEmploymentStatusEntpsTypeCode());
                }

                emp.setAnnualGrossIncomeAmount(employment.getAnnualGrossIncomeAmount());
                emp.setEmploymentActiveIndicator(employment.getEmploymentActiveIndicator());
                emp.setPrimaryEmploymentIndicator(employment.getPrimaryEmploymentIndicator());
                emp.setNettIncomeAmount(employment.getNettIncomeAmount());
                emp.setNettIncomeCurrencyEntpsTypeCode(employment.getNettIncomeCurrencyEntpsTypeCode());
                emp.setNettIncomeFrequencyEntpsTypeCode(employment.getNettIncomeFrequencyEntpsTypeCode());
                emp.setNettIncomePaymentDay(employment.getNettIncomePaymentDay());
                employmentsList.add(emp);
            }
        }
        return employmentsList;
    }

    private List<Education> getEducation(za.co.fnb.cish.fid.common.api.fidmaster.Individual individual) {
        List<Education> educationList = new ArrayList<>();
        if (Objects.nonNull(individual.getEducations())) {
            for (za.co.fnb.cish.fid.common.api.fidmaster.Education education : individual.getEducations()) {
                Education edu = new Education();
                edu.setHighestQualificationEntpsTypeCode((StringUtils.isNotEmpty(education.getHighestQualificationEntpsTypeCode()) && !DEFAULT_MAPPING.contains(education.getHighestQualificationEntpsTypeCode())) ? (cisReferenceDataUtil.getHighestQualificationTypeLookUp().getOrDefault(Integer.valueOf(education.getHighestQualificationEntpsTypeCode()), STRING_BLANK)) : STRING_BLANK);
                edu.setQualificationDate(education.getQualificationDate());
                edu.setQualificationSpecialityEntpsTypeCode((StringUtils.isNotEmpty(education.getQualificationSpecialityEntpsTypeCode())&& !DEFAULT_MAPPING.contains(education.getQualificationSpecialityEntpsTypeCode())) ? (cisReferenceDataUtil.getQualificationSpecialityTypeLookUp().getOrDefault(Integer.valueOf(education.getQualificationSpecialityEntpsTypeCode()), STRING_BLANK)) : STRING_BLANK);
                edu.setQualificationStartDate(StringUtils.isNotEmpty(education.getQualificationStartDate())?education.getQualificationStartDate():STRING_ZERO);
                edu.setQualificationProofIndicator(StringUtils.isNotEmpty(education.getQualificationProofIndicator())?education.getQualificationProofIndicator():STRING_BLANK);
                edu.setEducationActiveIndicator(education.getEducationActiveIndicator());
                educationList.add(edu);
            }
        }
        return educationList;
    }

    private List<Identifier> getIdentifiers(za.co.fnb.cish.fid.common.api.fidmaster.Party party) {
        List<Identifier> identifiersList = new ArrayList<>();
        if (Objects.nonNull(party.getIdentifiers())) {
            for (za.co.fnb.cish.fid.common.api.fidmaster.Identifier identifier : party.getIdentifiers()) {
                if (identifier.getIdentifierSystemEntpsTypeCode().equalsIgnoreCase(IDENTIFIER_SYSTEM_TYPE_CODE) && (!identifier.getIdentifierStatusEntpsTypeCode().equals(INACTIVE_MERGE_IDENTIFIER))) {
                    Identifier identifier1 = new Identifier();
                    identifier1.setIdentifierEndDate(identifier.getIdentifierEndDate());
                    identifier1.setCompanyEntpsTypeCode(identifier.getCompanyEntpsTypeCode());
                    identifier1.setIdentifierNumber(identifier.getIdentifierNumber());
                    identifier1.setIdentifierStartDate(identifier.getIdentifierStartDate());
                    identifier1.setIdentifierStatusEntpsTypeCode(identifier.getIdentifierStatusEntpsTypeCode());
                    identifier1.setIdentifierSystemEntpsTypeCode(identifier.getIdentifierSystemEntpsTypeCode());
                    identifier1.setJurisdictionCountryEntpsCode((StringUtils.isNotEmpty(String.valueOf(identifier.getJurisdictionId()))) ? (cisReferenceDataUtil.getJurisdictionLookUp().getOrDefault(identifier.getJurisdictionId(), STRING_ZERO)) : String.valueOf(identifier.getJurisdictionId()));
                    identifier1.setJurisdictionId(identifier.getJurisdictionId());
                    identifier1.setRoleEntpsTypeCode(identifier.getRoleEntpsTypeCode());
                    identifier1.setIdentifierEntpsTypeCode((StringUtils.isNotEmpty(identifier.getIdentifierEntpsTypeCode())) ? (cisReferenceDataUtil.getIdentifierTypeLookUp().getOrDefault(Integer.valueOf(identifier.getIdentifierEntpsTypeCode()), STRING_ZERO)) : identifier.getIdentifierEntpsTypeCode());
                    identifier1.setIdentifierRoleActiveIndicator(identifier.getIdentifierRoleActiveIndicator());
                    identifiersList.add(identifier1);
                }
            }
        }
        return identifiersList;
    }

    private List<Identification> getIdentifications(za.co.fnb.cish.fid.common.api.fidmaster.Party party, Integer jurisdiction_src_tp_cd, Organisation organisation) {
        List<Identification> identifications = new ArrayList<>();
        List<za.co.fnb.cish.fid.common.api.fidmaster.Identification> identificationsPriorities = new ArrayList<>();
        List<IdentificationName> identificationNames = null;
        List<za.co.fnb.cish.fid.common.api.fidmaster.Identification> identificationsList = party.getIdentifications();

        //DateTimeFormatter systemDate = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate localDate = LocalDate.now();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH);


        Date sysDate = null;
        Date idExpiryDate = null;
        try {

            sysDate = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(String.valueOf(localDate));


            if (Objects.nonNull(party.getIdentifications())) {

                if (StringUtils.isNotEmpty(party.getPartyEntpsTypeCode()) && Integer.valueOf(party.getPartyEntpsTypeCode()).equals(IND)) {
//
                    identificationsPriorities = getIndIdentification(party,jurisdiction_src_tp_cd);
                } else {
                    identificationsPriorities = getOrgIdentification(party, jurisdiction_src_tp_cd,organisation);
                }
                for (za.co.fnb.cish.fid.common.api.fidmaster.Identification identification : identificationsPriorities) {

                    identificationNames = new ArrayList<>();
                    Identification id = new Identification();

                    idExpiryDate = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).parse((StringUtils.isNotEmpty((identification.getIdentificationExpiryDate())) ? String.valueOf(identification.getIdentificationExpiryDate()) : EXPIRYDATE));

                    if (StringUtils.isNotEmpty(identification.getIdentificationEntpsTypeCode()) && idExpiryDate.after(sysDate)) {
                        Map<Integer, String> IdentificationLookUp;
                        Map<Integer, String> ResidencyStatusLookup;

                        if (IDTYPE_ISSUER_CONTRY.contains(identification.getIdentificationEntpsTypeCode())) {
                            IdentificationLookUp = cisReferenceDataUtil.getIdentificationLookUp().stream().filter(o -> o.getCmpnyTpCd() == jurisdiction_src_tp_cd && o.getIdfctnEntpsTpCd() == (Integer.valueOf(identification.getIdentificationEntpsTypeCode())) && (Objects.nonNull(o.getIdfctnIssurCntryCd()) && o.getIdfctnIssurCntryCd().equalsIgnoreCase(identification.getIdentificationIssuerCountryEntpsCode()))).collect((Collectors.toMap(IdentificationTypeEntity::getIdfctnEntpsTpCd, IdentificationTypeEntity::getIdfctnSrcTpCd, (existing, replacement) -> existing)));
                        } else {
                            IdentificationLookUp = cisReferenceDataUtil.getIdentificationLookUp().stream().filter(o -> o.getCmpnyTpCd() == jurisdiction_src_tp_cd && o.getIdfctnEntpsTpCd() == (Integer.valueOf(identification.getIdentificationEntpsTypeCode()))).collect((Collectors.toMap(IdentificationTypeEntity::getIdfctnEntpsTpCd, IdentificationTypeEntity::getIdfctnSrcTpCd, (existing, replacement) -> existing)));
                        }

                        id.setIdentificationEntpsTypeCode(IdentificationLookUp.getOrDefault(Integer.valueOf(identification.getIdentificationEntpsTypeCode()), STRING_ZERO));
                        id.setIdentificationExpiryDate(StringUtils.isNotEmpty(identification.getIdentificationExpiryDate()) ? identification.getIdentificationExpiryDate() : EXPIRYDATE);
                        id.setIdentificationIssueDate(identification.getIdentificationIssueDate());
                        id.setIdentificationIssuerCountryEntpsCode(identification.getIdentificationIssuerCountryEntpsCode());
                        id.setIdentificationIssuerEntpsTypeCode(identification.getIdentificationIssuerEntpsTypeCode());
                        id.setIdentificationNumber(identification.getIdentificationNumber());
                        id.setIdentificationStatusDate(identification.getIdentificationStatusDate());
                        id.setIdentificationStatusEntpsTypeCode(identification.getIdentificationStatusEntpsTypeCode());

                        id.setIdentificationBarcodeNumber(identification.getIdentificationBarcodeNumber());
                        if (Objects.nonNull(identification.getIdentificationNames())) {
                            for (za.co.fnb.cish.fid.common.api.fidmaster.IdentificationName identificationName : identification.getIdentificationNames()) {
                                IdentificationName name = new IdentificationName();
                                name.setNameEntpsTypeCode(identificationName.getNameEntpsTypeCode());
                                name.setIdentificationNameValue(identificationName.getIdentificationNameValue());
                                name.setIdentificationNameAttributeName(identificationName.getIdentificationNameAttributeName());
                                identificationNames.add(name);
                            }
                        }
                        id.setCitizenshipCountryEntpsCode(identification.getCitizenshipCountryEntpsCode());
                        ResidencyStatusLookup = cisReferenceDataUtil.getResidencyStatusTypeLookUp().stream().filter(o -> o.getCmpnyTpCd() == jurisdiction_src_tp_cd && o.getRsdncySttsEntpsTpCd() == (Integer.valueOf(identification.getResidencyStatusEntpsTypeCode()))).collect((Collectors.toMap(ResidencyStatusTypeEntity::getRsdncySttsEntpsTpCd, ResidencyStatusTypeEntity::getRsdncySttsSrcTpCd, (existing, replacement) -> existing)));
                        id.setResidencyStatusEntpsTypeCode(ResidencyStatusLookup.getOrDefault(Integer.valueOf(identification.getResidencyStatusEntpsTypeCode()), STRING_ZERO));
                        id.setIdentificationNames(identificationNames);
                        id.setIdentificationActiveIndicator(identification.getIdentificationActiveIndicator());
                        id.setPrimaryIdentificationIndicator(identification.getPrimaryIdentificationIndicator());
                        identifications.add(id);


                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return identifications;

    }

    private List<za.co.fnb.cish.fid.common.api.fidmaster.Identification> getIndIdentification(za.co.fnb.cish.fid.common.api.fidmaster.Party party, Integer jurisdiction_src_tp_cd) {
        List<Identification> identifications = new ArrayList<>();
        List<za.co.fnb.cish.fid.common.api.fidmaster.Identification> IndIds = new ArrayList<>();
        List<za.co.fnb.cish.fid.common.api.fidmaster.Identification> identificationsList = party.getIdentifications();

        if (!party.getIdentifications().isEmpty()) {

            IndIds = priority.stream().map(m -> identificationsList.stream().filter(i -> i.getIdentificationEntpsTypeCode().equalsIgnoreCase(m.toString())).collect(Collectors.toList())).flatMap(Collection::stream).filter(Objects::nonNull).collect(Collectors.toList());
            List<za.co.fnb.cish.fid.common.api.fidmaster.Identification> finalIdentificationsPriorities = IndIds;
            IndIds.addAll(identificationsList.stream().filter(i -> !finalIdentificationsPriorities.contains(i)).collect(Collectors.toList()));

        }
    return IndIds;

}

    private List<za.co.fnb.cish.fid.common.api.fidmaster.Identification> getOrgIdentification(za.co.fnb.cish.fid.common.api.fidmaster.Party party, Integer jurisdiction_src_tp_cd, Organisation organisation) {
        List<za.co.fnb.cish.fid.common.api.fidmaster.Identification> OrgIds = new ArrayList<>();
        List<za.co.fnb.cish.fid.common.api.fidmaster.Identification> identificationsList = party.getIdentifications();


        if (StringUtils.isNotEmpty(party.getPartyEntpsTypeCode()) && Integer.valueOf( party.getPartyEntpsTypeCode()).equals(ORG) && Objects.nonNull(party.getIdentifications())) {

                if (StringUtils.isNotEmpty(organisation.getOrganisationEntpsTypeCode()) && !party.getIdentifications().isEmpty() && Integer.valueOf(organisation.getOrganisationEntpsTypeCode()).equals(RT)) {

                    OrgIds = REGISTERED_TRUST.stream().map(rt -> identificationsList.stream().filter(i -> i.getIdentificationEntpsTypeCode().equalsIgnoreCase(rt.toString())).collect(Collectors.toList())).flatMap(Collection::stream).filter(Objects::nonNull).collect(Collectors.toList());

                } else if (StringUtils.isNotEmpty(organisation.getOrganisationEntpsTypeCode()) && !party.getIdentifications().isEmpty() && Integer.valueOf(organisation.getOrganisationEntpsTypeCode()).equals(GQ)) {

                    OrgIds = GOVERNMENT_QUASI.stream().map(rt -> identificationsList.stream().filter(i -> i.getIdentificationEntpsTypeCode().equalsIgnoreCase(rt.toString())).collect(Collectors.toList())).flatMap(Collection::stream).filter(Objects::nonNull).collect(Collectors.toList());

                } else if (StringUtils.isNotEmpty(organisation.getOrganisationEntpsTypeCode()) && !party.getIdentifications().isEmpty() && Integer.valueOf(organisation.getOrganisationEntpsTypeCode()).equals(FR)) {

                    OrgIds = FOREIGN_BANK.stream().map(rt -> identificationsList.stream().filter(i -> i.getIdentificationEntpsTypeCode().equalsIgnoreCase(rt.toString())).collect(Collectors.toList())).flatMap(Collection::stream).filter(Objects::nonNull).collect(Collectors.toList());

                } else {
                    OrgIds = OTHER.stream().map(rt -> identificationsList.stream().filter(i -> i.getIdentificationEntpsTypeCode().equalsIgnoreCase(rt.toString())).collect(Collectors.toList())).flatMap(Collection::stream).filter(Objects::nonNull).collect(Collectors.toList());
                }
            }
        return OrgIds;

    }

    private Container getContainer(za.co.fnb.cish.fid.common.api.fidmaster.Party party) {

        Container container1 = null;
        za.co.fnb.cish.fid.common.api.fidmaster.Container container = party.getContainer();
        if (container != null) {
            container1 = new Container();
            container1.setContainerEntpsTypeCode((StringUtils.isNotEmpty(container.getContainerEntpsTypeCode().trim())) ? container.getContainerEntpsTypeCode() : CONTAINER_CONST);
            container1.setContainerStatusEntpsTypeCode((StringUtils.isNotEmpty(container.getContainerStatusEntpsTypeCode().trim())) ? container.getContainerStatusEntpsTypeCode(): CONTAINER_CONST);
            container1.setContainerOperatingEntpsTypeCode((StringUtils.isNotEmpty(container.getContainerOperatingEntpsTypeCode().trim())) ? container.getContainerOperatingEntpsTypeCode():CONTAINER_CONST);
        }
        return container1;
    }

    private List<Location> getLocations(za.co.fnb.cish.fid.common.api.fidmaster.Party party, Integer jurisdiction_src_tp_cd) {
        List<Location> locationList = new ArrayList<>();
        if (Objects.nonNull(party.getLocations()) && party.getLocations().size() > 0) {
            for (za.co.fnb.cish.fid.common.api.fidmaster.Location location : party.getLocations()) {
                Location location1 = new Location();
                location1.setAllArrangementStatementAddressIndicator(location.getAllArrangementStatementAddressIndicator());
                location1.setLocationEntpsTypeCode(location.getLocationEntpsTypeCode());
                location1.setLocationTag(location.getLocationTag());
                if (StringUtils.isNotEmpty(location.getLocationUseEntpsTypeCode())) {
                    if (((Integer.valueOf(location.getLocationUseEntpsTypeCode()) == 4) || (Integer.valueOf(location.getLocationUseEntpsTypeCode()) == 5))) {
                        location1.setLocationUseEntpsTypeCode("CR");
                    } else {
                        Map<Integer, String> LocationUseLookUp = cisReferenceDataUtil.getPartyLocationRelationshipNewLookUp().stream().filter(o -> o.getCmpnyTpCd() == jurisdiction_src_tp_cd && o.getPartyLocRltnpEntpsTpCd() == Integer.valueOf(location.getLocationUseEntpsTypeCode())).collect((Collectors.toMap(PartyLocationRelationshipEntity::getPartyLocRltnpEntpsTpCd, PartyLocationRelationshipEntity::getPartyLocRltnpSrcTpCd, (existing, replacement) -> existing)));
                        location1.setLocationUseEntpsTypeCode(LocationUseLookUp.getOrDefault(Integer.valueOf(location.getLocationUseEntpsTypeCode()), STRING_ZERO));
                    }
                } else {
                    location1.setLocationUseEntpsTypeCode(location.getLocationUseEntpsTypeCode());
                }
                location1.setDigitalAddresses(getDigitalAddress(location.getDigitalAddresses()));
                location1.setEmailAddresses(getEmailAddress(location.getEmailAddresses()));
                location1.setGeographicAddresses(getGeographicAddresses(location.getGeographicAddresses()));
                if (location.getTelephonicAddresses().size() > 0) {
                    location1.setTelephonicAddresses(getTelephonicAddresses(location.getTelephonicAddresses()));
                }
                location1.setLocationActiveIndicator(location.getLocationActiveIndicator());
                locationList.add(location1);
            }
        }
        return locationList;
    }

    private List<DigitalAddress> getDigitalAddress(List<za.co.fnb.cish.fid.common.api.fidmaster.DigitalAddress> digitalAddresses) {
        List<DigitalAddress> addressList = new ArrayList<>();
        if (Objects.nonNull(digitalAddresses) && digitalAddresses.size() > 0) {
            for (za.co.fnb.cish.fid.common.api.fidmaster.DigitalAddress digitalAddress : digitalAddresses) {
                DigitalAddress digitalAdd = new DigitalAddress();
                digitalAdd.setDigitalAddress(digitalAddress.getDigitalAddress());
                digitalAdd.setDigitalAddressEntpsTypeCode(digitalAddress.getDigitalAddressEntpsTypeCode());
                addressList.add(digitalAdd);
            }
        }
        return addressList;
    }

    private List<EmailAddress> getEmailAddress(List<za.co.fnb.cish.fid.common.api.fidmaster.EmailAddress> emailAddresses) {
        List<EmailAddress> emailAddressList = new ArrayList<>();

        if (Objects.nonNull(emailAddresses) && emailAddresses.size() > 0) {
            for (za.co.fnb.cish.fid.common.api.fidmaster.EmailAddress emailAdd : emailAddresses) {
                EmailAddress address = new EmailAddress();
                address.setEmailAddress(emailAdd.getEmailAddress());
                emailAddressList.add(address);
            }
        }
        return emailAddressList;
    }

    private List<GeographicalAddress> getGeographicAddresses(List<za.co.fnb.cish.fid.common.api.fidmaster.GeographicalAddress> geographicAddresses) {

        List<GeographicalAddress> geographicalAddressList = new ArrayList<>();
        if (Objects.nonNull(geographicAddresses) && geographicAddresses.size() > 0) {
            for (za.co.fnb.cish.fid.common.api.fidmaster.GeographicalAddress geographicalAddress : geographicAddresses) {
                GeographicalAddress geoAddress = new GeographicalAddress();
                geoAddress.setAddressEntpsTypeCode(geographicalAddress.getAddressEntpsTypeCode());
                geoAddress.setAddressLine1(StringUtils.isNotEmpty(geographicalAddress.getAddressLine1()) ?geographicalAddress.getAddressLine1():STRING_BLANK);
                geoAddress.setAddressLine2(geographicalAddress.getAddressLine2());
                geoAddress.setBuildingName(geographicalAddress.getBuildingName());
                geoAddress.setCareOfName(geographicalAddress.getCareOfName());
                geoAddress.setCityName(geographicalAddress.getCityName());
                geoAddress.setComplexName(geographicalAddress.getComplexName());
                geoAddress.setCountryEntpsCode(geographicalAddress.getCountryEntpsCode());
                geoAddress.setFloorNumber(geographicalAddress.getFloorNumber());
                geoAddress.setPostalAreaNumber(geographicalAddress.getPostalAreaNumber());
                geoAddress.setStateDistrictProvinceEntpsTypeCode(geographicalAddress.getStateDistrictProvinceEntpsTypeCode());

                if (Objects.isNull(geographicalAddress.getStateDistrictProvinceName()) || geographicalAddress.getStateDistrictProvinceName() == "") {
                    geoAddress.setStateDistrictProvinceName(cisReferenceDataUtil.getStateProvinceLookUp().getOrDefault(geographicalAddress.getStateDistrictProvinceEntpsTypeCode(), STRING_BLANK));
                } else {
                    geoAddress.setStateDistrictProvinceName(geographicalAddress.getStateDistrictProvinceName());
                }
                geoAddress.setStreetName(geographicalAddress.getStreetName());
                geoAddress.setStreetNumber(geographicalAddress.getStreetNumber());
                geoAddress.setSubAreaName(geographicalAddress.getSubAreaName());
                geoAddress.setSuburbName(StringUtils.isNotEmpty(geographicalAddress.getSuburbName())?geographicalAddress.getSuburbName():STRING_BLANK);
                geoAddress.setSuiteName(geographicalAddress.getSuiteName());
                geoAddress.setUnitNumber(geographicalAddress.getUnitNumber());
                geoAddress.setGooglePlusCode(geographicalAddress.getGooglePlusCode());
                geographicalAddressList.add(geoAddress);
            }
        }
        return geographicalAddressList;
    }

    private List<TelephonicAddress> getTelephonicAddresses(List<za.co.fnb.cish.fid.common.api.fidmaster.TelephonicAddress> telephonicAddresses) {
        List<TelephonicAddress> telephonicAddressList = new ArrayList<>();
        if (Objects.nonNull(telephonicAddresses) && telephonicAddresses.size() > 0) {
            for (za.co.fnb.cish.fid.common.api.fidmaster.TelephonicAddress telephonicAddress : telephonicAddresses) {
                TelephonicAddress telephonic = new TelephonicAddress();
                telephonic.setTelephoneAreaDailCode(telephonicAddress.getTelephoneAreaDailCode());
                if ((StringUtils.isNotEmpty(telephonicAddress.getTelephoneCountryDailCode()) && StringUtils.isNotEmpty(telephonicAddress.getTelephoneAreaDailCode())) && StringUtils.isNotEmpty(telephonicAddress.getTelephoneNumber())) {
                    if (telephonicAddress.getTelephoneAreaDailCode().startsWith("0")) {
                        telephonic.setTelephoneCountryDailCode(telephonicAddress.getTelephoneCountryDailCode() + telephonicAddress.getTelephoneAreaDailCode().replaceFirst("0", ""));
                        telephonic.setTelephoneNumber(telephonicAddress.getTelephoneNumber());
                    } else {
                        telephonic.setTelephoneCountryDailCode(telephonicAddress.getTelephoneCountryDailCode() + telephonicAddress.getTelephoneAreaDailCode());
                        telephonic.setTelephoneNumber(telephonicAddress.getTelephoneNumber());
                    }
                } else if (StringUtils.isNotEmpty(telephonicAddress.getTelephoneFullNumber())) {
                    if (telephonicAddress.getTelephoneFullNumber().contains("Z")) {
                        String[] contactNumber = telephonicAddress.getTelephoneFullNumber().split(SPLIT_CONSTANT);
                        telephonic.setTelephoneCountryDailCode(contactNumber[0]);
                        telephonic.setTelephoneNumber(contactNumber[1]);
                    } else {
                        telephonic.setTelephoneCountryDailCode(telephonicAddress.getTelephoneCountryDailCode());
                        telephonic.setTelephoneNumber(telephonicAddress.getTelephoneNumber());
                    }
                }
                telephonic.setTelephoneEntpsTypeCode(telephonicAddress.getTelephoneEntpsTypeCode());
                telephonic.setTelephoneExtensionNumber(telephonicAddress.getTelephoneExtensionNumber());
                telephonic.setTelephoneFullNumber(telephonicAddress.getTelephoneFullNumber());
                telephonicAddressList.add(telephonic);
            }
        }
        return telephonicAddressList;
    }

    private List<PartyClassification> getPartyClassification(za.co.fnb.cish.fid.common.api.fidmaster.Party party, Integer jurisdiction_src_tp_cd) {
        List<PartyClassification> partyClassificationList = new ArrayList<>();
        if (Objects.nonNull(party.getPartyClassification()) && party.getPartyClassification().size() > 0) {
            for (za.co.fnb.cish.fid.common.api.fidmaster.PartyClassification partyClassification : party.getPartyClassification()) {
                PartyClassification classification = new PartyClassification();
                classification.setPartyClassificationTypeCode(partyClassification.getPartyClassificationTypeCode());
                classification.setPartyClassificationAttributeName(partyClassification.getPartyClassificationAttributeName());
                if (StringUtils.isNotEmpty(partyClassification.getPartyClassificationTypeCode()) && Integer.valueOf(partyClassification.getPartyClassificationTypeCode()) == PARTYCLASSIFICATIONTYPECODE &&  StringUtils.isNotEmpty(partyClassification.getPartyClassificationValue())) {
                    Map<Integer, String> classificationLookUp = cisReferenceDataUtil.getDepositTakingInstitutionTypeLookUp().stream().filter(o -> o.getCmpnyTpCd() == jurisdiction_src_tp_cd && o.getDtiEntpsTpCd().equals(StringUtils.isNotEmpty(partyClassification.getPartyClassificationValue()) ?Integer.valueOf(partyClassification.getPartyClassificationValue()):INTEGER_ZERO)).collect((Collectors.toMap(DepositTakingInstitutionTypeEntity::getDtiEntpsTpCd, DepositTakingInstitutionTypeEntity::getDtiTpSrcTpCd, (existing, replacement) -> existing)));
                    classification.setPartyClassificationValue(StringUtils.isNotEmpty(partyClassification.getPartyClassificationValue())?classificationLookUp.getOrDefault(Integer.valueOf(partyClassification.getPartyClassificationValue()), STRING_BLANK):STRING_BLANK);

                } else {
                    classification.setPartyClassificationValue(STRING_BLANK);
                }
                classification.setPartyClassificationActiveIndicator(partyClassification.getPartyClassificationActiveIndicator());
                partyClassificationList.add(classification);
            }
        }
        return partyClassificationList;
    }

    private List<OrganisationClassification> getOrganisationClassification(za.co.fnb.cish.fid.common.api.fidmaster.Party party, Integer jurisdiction_src_tp_cd) {
        List<OrganisationClassification> organisationClassificationList = new ArrayList<>();
        if (Objects.nonNull(party.getOrganisation().getOrganisationClassification()) && party.getOrganisation().getOrganisationClassification().size() > 0) {
            for (za.co.fnb.cish.fid.common.api.fidmaster.OrganisationClassification organisationClassification : party.getOrganisation().getOrganisationClassification()) {
                OrganisationClassification orgClass = new OrganisationClassification();
                orgClass.setOrganisationClassificationTypeCode(organisationClassification.getOrganisationClassificationTypeCode());
                orgClass.setOrganisationClassificationAttributeName(organisationClassification.getOrganisationClassificationAttributeName());
                if (StringUtils.isNotEmpty(organisationClassification.getOrganisationClassificationTypeCode()) && Integer.valueOf(organisationClassification.getOrganisationClassificationTypeCode()) == ORGANISATIONCLASSIFICATIONTYPECODE && StringUtils.isNotEmpty(organisationClassification.getOrganisationClassificationValue())) {
                    Map<Integer, Integer> organisationClassLookUp = cisReferenceDataUtil.getIndustrySpecialityTypeLookUp().stream().filter(o -> o.getCmpnyTpCd().equals(jurisdiction_src_tp_cd) && o.getIndstryEntpsTpCd().equals(Integer.valueOf(organisationClassification.getOrganisationClassificationValue()))).collect((Collectors.toMap(IndustrySpecialityType::getIndstryEntpsTpCd, IndustrySpecialityType::getIndstrySrcTpCd, (existing, replacement) -> existing)));
                    orgClass.setOrganisationClassificationValue(StringUtils.isNotEmpty(organisationClassification.getOrganisationClassificationValue())?String.valueOf(organisationClassLookUp.getOrDefault(Integer.valueOf(organisationClassification.getOrganisationClassificationValue()), INTEGER_ZERO)) :STRING_ZERO);
                } else {
                    orgClass.setOrganisationClassificationValue(STRING_ZERO);
                }
                orgClass.setOrganisationClassificationActiveIndicator(organisationClassification.getOrganisationClassificationActiveIndicator());
                organisationClassificationList.add(orgClass);
            }
        }
        return organisationClassificationList;
    }

    @Autowired
    public void setCisReferenceDataUtil(CISReferenceDataUtil cisReferenceDataUtil) {
        this.cisReferenceDataUtil = cisReferenceDataUtil;
    }

}
