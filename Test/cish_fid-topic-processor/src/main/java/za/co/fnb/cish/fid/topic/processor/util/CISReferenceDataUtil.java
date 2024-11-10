package za.co.fnb.cish.fid.topic.processor.util;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.fnb.cish.fid.repo.model.*;
import za.co.fnb.cish.fid.repo.repository.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static za.co.fnb.cish.fid.topic.processor.util.Constants.INTEGER_NEGATIVE_ONE;
import static za.co.fnb.cish.fid.topic.processor.util.Constants.STRING_NEGATIVE_ONE;

@Component("CISReferenceDataUtil")
public class CISReferenceDataUtil {

    public static final String ENTPSSYSTEMTYPECODE = "CIS";
    public static final String HYPHEN = "-";
    private CountryRepository countryRepository;
    private EthnicGroupTypeRepository ethnicGroupTypeRepository;
    private GenderTypeRepository genderTypeRepository;
    private IdentificationTypeRepository identificationTypeRepository;
    private IdentifierTypeRepository identifierTypeRepository;
    private LanguageTypeRepository languageTypeRepository;
    private MaritalContractTypeRepository maritalContractTypeRepository;
    private MaritalStatusTypeRepository maritalStatusTypeRepository;
    private OccupationTypeRepository occupationTypeRepository;
    private OrganisationSizeTypeRepository organisationSizeTypeRepository;
    private OrganisationStatusTypeRepository organisationStatusTypeRepository;
    private PartystatustypeRepository partystatustypeRepository;
    private PartytypeRepository partytypeRepository;
    private ResidencyStatusTypeRepository residencyStatusTypeRepository;
    private RoletypeRepository roletypeRepository;
    private TitleTypeRepository titleTypeRepository;
    private TurnoverTypeRepository turnoverTypeRepository;
    private IdentifierStatusRepository identifierStatusRepository;
    private KycStatusTypeRepository kycStatusTypeRepository;
    private SegmentationTypeRepository segmentationTypeRepository;
    private ForeignTaxLiabilityTypeRepository foreignTaxLiabilityTypeRepository;
    private BankDecisionIndicatorRepository bankDecisionIndicatorRepository;
    private BusinessRescueIndicatorRepository businessRescueIndicatorRepository;
    private DebtCounsellingIndicatorRepository debtCounsellingIndicatorRepository;
    private DepositTakingInstitutionTypeRepository depositTakingInstitutionTypeRepository;
    private IndustryCategoryTypeRepository industryCategoryTypeRepository;
    private SicTypeRepository sicTypeRepository;
    private LocationTypeRepository locationTypeRepository;
    private MethodOfContactRepository methodOfContactRepository;
    private GeoAddressTypeRepository geoAddressTypeRepository;
    private TelephoneAddressTypeRepository telephoneAddressTypeRepository;
    private PartyStatureTypeRepository partyStatureTypeRepository;
    private SanctionScreeningStatusRepository sanctionScreeningStatusRepository;
    private PropertyOwnershipTypeRepository propertyOwnershipTypeRepository;
    private PropertyBondedIndicatorRepository propertyBondedIndicatorRepository;
    private OrganisationTypeRepository organisationTypeRepository;
    private JurisdictionRepository jurisdictionRepository;
    private SourceOfFundRepository sourceOfFundRepository;
    private PartyLocationRelationshipRepository partyLocationRelationshipRepository;
    private StateProvinceRepository stateProvinceRepository;
    private HighestQualificationTypeRepository highestQualificationTypeRepository;
    private QualificationSpecialityTypeRepository qualificationSpecialityTypeRepository;
    private IndustrySpecialityTypeRepository industrySpecialityTypeRepository;
    private EmploymentStatusTypeRepository employmentStatusTypeRepository;
    private Map<Integer, String> identifierTypeLookUp;
    private Map<Integer, Integer> partyTypeLookUp;
    private Map<Integer, String> languageTypeLookUp;
    private Map<String, Integer> partyStatusTypeLookUp;
    private Map<String, Integer> roleTypeLookUp;
    private Map<Integer, String> identificationTypeLookUp;
    private Map<Integer, String> countryLookUp;
    private Map<Integer, String> titleTypeLookUp;
    private Map<Integer, String> genderTypeLookUp;
    private Map<Integer, Integer> ethnicGroupTypeLookUp;
    private Map<Integer, String> maritalStatusTypeLookUp;
    private Map<Integer, String> maritalContractTypeLookUp;
    private Map<Integer, String> occupationTypeLookUp;
    private Map<Integer, String> organisationStatusTypeLookUp;
    private Map<String, Integer> organisationSizeTypeLookUp;
    private Map<Integer, Integer> identifierStatusTypeLookUp;
    private Map<String, Integer> kycStatusTypeLookUp;
    private Map<String, Integer> segmentationTypeLookUp;
    private Map<String, Integer> foreignTaxLiabilityTypeLookUp;
    private Map<String, Integer> bankDecisionIndicatorLookUp;
    private Map<String, Integer> businessRescueIndicatorLookUp;
    private Map<String, Integer> debtCounsellingIndicatorLookUp;
    private Map<String, Integer> industryCategoryTypeLookUp;
    private Map<String, Integer> sicTypeLookUp;
    private Map<String, Integer> locationTypeLookUp;
    private Map<String, Integer> methodOfContactLookUp;
    private Map<String, Integer> geoAddressTypeLookUp;
    private Map<Integer, String> telephoneAddressTypeLookUp;
    private Map<String, Integer> partyStatureTypeLookUp;
    private Map<Integer, Integer> sanctionScreenStatusLookUp;
    private Map<String, Integer> propertyOwnershipTypeLookUp;
    private Map<String, Integer> propertyBondedIndicatorLookUp;
    private List<OrganisationTypeEntity> organisationTypeLookUp;

    private Map<Integer, String> jurisdictionLookUp;

    private Map<String, String> jurisdictionCountryLookUp;
    private Map<String, Integer> jurisdictionCompanyLookUp;
    private Map<Integer, String> sourceOfFundLookUp;
    private Map<Integer, String> partyLocationRelationshipLookUp;
    private Map<String, String> stateProvinceLookUp;
    private Map<Integer, String> highestQualificationTypeLookUp;
    private Map<Integer, String> qualificationSpecialityTypeLookUp;
    private OrgCategoryTypeRepository orgCategoryTypeRepository;


    private List<SourceOfFundEntity> sofLookup;

    private List<JurisdictionEntity> jurisdictionNewLookUp;

    private List<MaritalStatusTypeEntity> maritalStatusLookUp;

    private List<MaritalContractTypeEntity> maritalContractLookUp;

    private List<OccupationTypeEntity> occupationLookUp;

    private List<OrganisationTypeEntity> organisationLookUp;

    private List<OrganisationStatusTypeEntity> organisationStatusLookUp;

    private List<PartyLocationRelationshipEntity> partyLocationRelationshipNewLookUp;

    private List<LanguageTypeEntity> languageLookUp;

    private List<IdentificationTypeEntity> identificationLookUp;

    private List<IndustrySpecialityType> industrySpecialityTypeLookUp;

    private List<DepositTakingInstitutionTypeEntity> depositTakingInstitutionTypeLookUp;
    private List<ResidencyStatusTypeEntity> residencyStatusTypeLookUp;
    private List<OrgCategoryTypeEntity> orgCategoryLookUp;
    private List<EmploymentStatusTypeEntity> employmentStatusTypeLookUp;
    private List<TurnoverTypeEntity> turnoverTypeLookUp;

    @PostConstruct
    public void getAllEntities() {

        identificationTypeLookUp = identifierTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(IdentifierTypeEntity::getIdfrTpCd, IdentifierTypeEntity::getIdfrSrcTpCd, (existing, replacement) -> existing)));
        identificationTypeLookUp.put(INTEGER_NEGATIVE_ONE, null);
        partyTypeLookUp = partytypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(PartytypeEntity::getPartyEntpsTpCd, PartytypeEntity::getPartySrcTpCd, (existing, replacement) -> existing)));
        partyTypeLookUp.put(INTEGER_NEGATIVE_ONE, null);
        languageTypeLookUp = languageTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(LanguageTypeEntity::getLngEntpsTpCd, LanguageTypeEntity::getLngSrcTpCd, (existing, replacement) -> existing)));
        languageTypeLookUp.put(INTEGER_NEGATIVE_ONE, null);

        partyStatusTypeLookUp = partystatustypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(PartystatustypeEntity::getPartySttsSrcTpCd, PartystatustypeEntity::getPartySttsEntpsTpCd, (existing, replacement) -> existing)));
        partyStatusTypeLookUp.put(null, INTEGER_NEGATIVE_ONE);
        partyStatusTypeLookUp.put("", INTEGER_NEGATIVE_ONE);
        roleTypeLookUp = roletypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(p -> (p.getCmpnyTpCd() + HYPHEN + Integer.valueOf(p.getPartyRoleSrcTpCd())), RoletypeEntity::getPartyRoleEntpsTpCd, (existing, replacement) -> existing)));
        roleTypeLookUp.put(null, INTEGER_NEGATIVE_ONE);
        roleTypeLookUp.put("", INTEGER_NEGATIVE_ONE);
        identificationTypeLookUp = identificationTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(IdentificationTypeEntity::getIdfctnEntpsTpCd, IdentificationTypeEntity::getIdfctnSrcTpCd, (existing, replacement) -> existing)));
        identificationTypeLookUp.put(INTEGER_NEGATIVE_ONE, null);
        titleTypeLookUp = titleTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(TitleTypeEntity::getTtleEntpsTpCd, TitleTypeEntity::getTtleSrcTpCd, (existing, replacement) -> existing)));
        titleTypeLookUp.put(INTEGER_NEGATIVE_ONE, null);
        genderTypeLookUp = genderTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(GenderTypeEntity::getGndrEntpsTpCd, GenderTypeEntity::getGndrSrcTpCd)));
        genderTypeLookUp.put(INTEGER_NEGATIVE_ONE, null);
        ethnicGroupTypeLookUp = ethnicGroupTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(EthnicGroupTypeEntity::getEthnicGrpSrcTpCd, EthnicGroupTypeEntity::getEthnicGrpEntpsTpCd, (existing, replacement) -> existing)));
        ethnicGroupTypeLookUp.put(null, INTEGER_NEGATIVE_ONE);
        maritalStatusTypeLookUp = maritalStatusTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(MaritalStatusTypeEntity::getMrtlSttsEntpsTpCd, MaritalStatusTypeEntity::getMrtlSttsSrcTpCd, (existing, replacement) -> existing)));
        maritalStatusTypeLookUp.put(INTEGER_NEGATIVE_ONE, null);

        maritalContractTypeLookUp = maritalContractTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(MaritalContractTypeEntity::getMrtlCntrctEntpsTpCd, MaritalContractTypeEntity::getMrtlCntrctSrcTpCd, (existing, replacement) -> existing)));
        maritalContractTypeLookUp.put(INTEGER_NEGATIVE_ONE, null);

        occupationTypeLookUp = occupationTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(OccupationTypeEntity::getOcptnEntpsTpCd, OccupationTypeEntity::getOcptnSrcTpCd, (existing, replacement) -> existing)));
        occupationTypeLookUp.put(INTEGER_NEGATIVE_ONE, null);
        organisationStatusTypeLookUp = organisationStatusTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(OrganisationStatusTypeEntity::getOrgSttsEntpsTpCd, OrganisationStatusTypeEntity::getOrgSttsSrcTpCd, (existing, replacement) -> existing)));
        organisationStatusTypeLookUp.put(INTEGER_NEGATIVE_ONE, null);
/*        turnoverTypeLookUp = turnoverTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(p -> (p.getCmpnyTpCd() + HYPHEN + p.getTnvrSrcTpCd()), TurnoverTypeEntity::getTnvrEntpsTpCd)));
        turnoverTypeLookUp.put(null, INTEGER_NEGATIVE_ONE);
        turnoverTypeLookUp.put("", INTEGER_NEGATIVE_ONE);*/
        organisationSizeTypeLookUp = organisationSizeTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(OrganisationSizeTypeEntity::getOrgSizeSrcTpCd, OrganisationSizeTypeEntity::getOrgSizeEntpsTpCd, (existing, replacement) -> existing)));
        organisationSizeTypeLookUp.put(null, INTEGER_NEGATIVE_ONE);
        organisationSizeTypeLookUp.put("", INTEGER_NEGATIVE_ONE);
        identifierStatusTypeLookUp = identifierStatusRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect(Collectors.toMap(IdentifierStatusEntity::getIdfrSttsEntpsTpCd, IdentifierStatusEntity::getIdfrSttsEntpsTpCd, (existing, replacement) -> existing));
        identifierStatusTypeLookUp.put(null, INTEGER_NEGATIVE_ONE);

        kycStatusTypeLookUp = kycStatusTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(KycStatusTypeEntity::getKycSttsSrcTpCd, KycStatusTypeEntity::getKycSttsEntpsTpCd, (existing, replacement) -> existing)));
        kycStatusTypeLookUp.put(null, INTEGER_NEGATIVE_ONE);
        kycStatusTypeLookUp.put("", INTEGER_NEGATIVE_ONE);
        segmentationTypeLookUp = segmentationTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(p -> (p.getCmpnyTpCd()) + HYPHEN + p.getSgmtnSrcTpCd(), SegmentationTypeEntity::getSgmtnEntpsTpCd, (existing, replacement) -> existing)));
        segmentationTypeLookUp.put(null, INTEGER_NEGATIVE_ONE);
        segmentationTypeLookUp.put("", INTEGER_NEGATIVE_ONE);
        foreignTaxLiabilityTypeLookUp = foreignTaxLiabilityTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(ForeignTaxLiabilityTypeEntity::getFrgnTaxLbltySrcTpCd, ForeignTaxLiabilityTypeEntity::getFrgnTaxLbltyEntpsTpCd)));
        foreignTaxLiabilityTypeLookUp.put(null, INTEGER_NEGATIVE_ONE);
        foreignTaxLiabilityTypeLookUp.put("", INTEGER_NEGATIVE_ONE);

        bankDecisionIndicatorLookUp = bankDecisionIndicatorRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(BankDecisionIndicatorEntity::getBnkDcsnSrcTpCd, BankDecisionIndicatorEntity::getBnkDcsnSrcEntpsTpCd, (existing, replacement) -> existing)));
        bankDecisionIndicatorLookUp.put(null, INTEGER_NEGATIVE_ONE);
        bankDecisionIndicatorLookUp.put("", INTEGER_NEGATIVE_ONE);

        businessRescueIndicatorLookUp = businessRescueIndicatorRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(BusinessRescueIndicatorEntity::getFinSttsSrcTpCd, BusinessRescueIndicatorEntity::getFinSttsEntpsTpCd)));
        businessRescueIndicatorLookUp.put(null, INTEGER_NEGATIVE_ONE);
        businessRescueIndicatorLookUp.put("", INTEGER_NEGATIVE_ONE);

        debtCounsellingIndicatorLookUp = debtCounsellingIndicatorRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(DebtCounsellingIndicatorEntity::getFinSttsSrcTpCd, DebtCounsellingIndicatorEntity::getFinSttsEntpsTpCd)));
        debtCounsellingIndicatorLookUp.put(null, INTEGER_NEGATIVE_ONE);
        debtCounsellingIndicatorLookUp.put("", INTEGER_NEGATIVE_ONE);

        industryCategoryTypeLookUp = industryCategoryTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(IndustryCategoryTypeEntity::getIndstryCatSrcTpCd, IndustryCategoryTypeEntity::getIndstryCatEntpsTpCd)));
        industryCategoryTypeLookUp.put(null, INTEGER_NEGATIVE_ONE);
        industryCategoryTypeLookUp.put("", INTEGER_NEGATIVE_ONE);

        methodOfContactLookUp = methodOfContactRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(MethodOfContactEntity::getMthdOfCntctSrcTpCd, MethodOfContactEntity::getMthdOfCntctEntpsTpCd, (existing, replace) -> existing)));
        methodOfContactLookUp.put(null, INTEGER_NEGATIVE_ONE);
        methodOfContactLookUp.put("", INTEGER_NEGATIVE_ONE);

        sanctionScreenStatusLookUp = sanctionScreeningStatusRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(SanctionScreeningStatusEntity::getSanctnSrcTpCd, SanctionScreeningStatusEntity::getSanctnEntpsTpCd, (existing, replacement) -> existing)));
        sanctionScreenStatusLookUp.put(null, INTEGER_NEGATIVE_ONE);

        propertyOwnershipTypeLookUp = propertyOwnershipTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(PropertyOwnershipTypeEntity::getPropOwnrshpSrcTpCd, PropertyOwnershipTypeEntity::getPropOwnrshpEntpsTpCd, (existing, replacement) -> existing)));
        propertyOwnershipTypeLookUp.put(null, INTEGER_NEGATIVE_ONE);
        propertyOwnershipTypeLookUp.put("", INTEGER_NEGATIVE_ONE);

        propertyBondedIndicatorLookUp = propertyBondedIndicatorRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(PropertyBondedIndicatorEntity::getPropBndSrcTpCd, PropertyBondedIndicatorEntity::getPropBndEntpsTpCd)));
        propertyBondedIndicatorLookUp.put(null, INTEGER_NEGATIVE_ONE);
        propertyBondedIndicatorLookUp.put("", INTEGER_NEGATIVE_ONE);

        stateProvinceLookUp = stateProvinceRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect(Collectors.toMap(StateProvinceEntity::getStateEntpsTpCd, StateProvinceEntity::getStateTpDesc));

//        organisationTypeLookUp = organisationTypeRepository.findAll().stream().collect((Collectors.toMap(OrganisationTypeEntity::getOrgEntpsTpCd, OrganisationTypeEntity::getOrgCatTpCd, (existing, replacement) -> existing)));
//        organisationTypeLookUp.put(INTEGER_NEGATIVE_ONE, null);

        highestQualificationTypeLookUp = highestQualificationTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(HighestQualificationTypeEntity::getHghstEduLvlTpCd, HighestQualificationTypeEntity::getSrcCd, (existing, replacement) -> existing)));
        highestQualificationTypeLookUp.put(INTEGER_NEGATIVE_ONE, null);


        qualificationSpecialityTypeLookUp = qualificationSpecialityTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect(Collectors.toMap(QualificationSpecialityTypeEntity::getQualSpcltyTpCd, QualificationSpecialityTypeEntity::getSrcCd));
        qualificationSpecialityTypeLookUp.put(INTEGER_NEGATIVE_ONE, null);


        partyLocationRelationshipLookUp = partyLocationRelationshipRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect(Collectors.toMap(PartyLocationRelationshipEntity::getPartyLocRltnpEntpsTpCd, PartyLocationRelationshipEntity::getPartyLocRltnpSrcTpCd, (existing, replacement) -> existing));
        partyLocationRelationshipLookUp.put(INTEGER_NEGATIVE_ONE, null);

        countryLookUp = countryRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(CountryEntity::getEdwCntryCd, CountryEntity::getCntryCd)));
        countryLookUp.put(INTEGER_NEGATIVE_ONE, null);

        sourceOfFundLookUp = sourceOfFundRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(SourceOfFundEntity::getPartyFundEntpsTpCd, SourceOfFundEntity::getPartyFundSrcTpCd, (existing, replacement) -> existing)));
        sourceOfFundLookUp.put(INTEGER_NEGATIVE_ONE, null);

        jurisdictionLookUp = jurisdictionRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(JurisdictionEntity::getJurisdictionId, JurisdictionEntity::getJrsdctnSrcTpCd)));
        jurisdictionLookUp.put(INTEGER_NEGATIVE_ONE, null);

        jurisdictionCountryLookUp = jurisdictionRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(JurisdictionEntity::getJrsdctnSrcTpCd, JurisdictionEntity::getCntryCd)));
        jurisdictionCountryLookUp.put(null, STRING_NEGATIVE_ONE);
        jurisdictionCountryLookUp.put("", STRING_NEGATIVE_ONE);

        jurisdictionCompanyLookUp = jurisdictionRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(JurisdictionEntity::getJrsdctnSrcTpCd, JurisdictionEntity::getCompTpCd)));
        jurisdictionCompanyLookUp.put(null, INTEGER_NEGATIVE_ONE);
        jurisdictionCompanyLookUp.put("", INTEGER_NEGATIVE_ONE);
        identifierTypeLookUp = identifierTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE).stream().collect((Collectors.toMap(IdentifierTypeEntity::getIdfrTpCd, IdentifierTypeEntity::getIdfrSrcTpCd, (existing, replacement) -> existing)));
        identifierTypeLookUp.put(INTEGER_NEGATIVE_ONE, null);
        sofLookup = sourceOfFundRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE);
        jurisdictionNewLookUp = jurisdictionRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE);
        maritalStatusLookUp = maritalStatusTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE);
        maritalContractLookUp = maritalContractTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE);
        occupationLookUp = occupationTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE);
        organisationLookUp = organisationTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE);
        organisationTypeLookUp = organisationTypeRepository.findAll();
        organisationStatusLookUp = organisationStatusTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE);
        partyLocationRelationshipNewLookUp = partyLocationRelationshipRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE);
        languageLookUp = languageTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE);
        identificationLookUp = identificationTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE);
        industrySpecialityTypeLookUp = industrySpecialityTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE);
        depositTakingInstitutionTypeLookUp = depositTakingInstitutionTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE);
        residencyStatusTypeLookUp = residencyStatusTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE);
        orgCategoryLookUp = orgCategoryTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE);
        employmentStatusTypeLookUp = employmentStatusTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE);
        turnoverTypeLookUp = turnoverTypeRepository.findByStmTpCd(ENTPSSYSTEMTYPECODE);
    }

    public List<SourceOfFundEntity> getSofLookup() {
        return sofLookup;
    }

    public List<JurisdictionEntity> getJurisdictionNewLookUp() {
        return jurisdictionNewLookUp;
    }

    public List<MaritalStatusTypeEntity> getMaritalStatusLookUp() {
        return maritalStatusLookUp;
    }

    public List<MaritalContractTypeEntity> getMaritalContractLookUp() {
        return maritalContractLookUp;
    }

    public List<OccupationTypeEntity> getOccupationLookUp() {
        return occupationLookUp;
    }

    public List<OrganisationTypeEntity> getOrganisationLookUp() {
        return organisationLookUp;
    }

    public List<OrganisationStatusTypeEntity> getOrganisationStatusLookUp() {
        return organisationStatusLookUp;
    }

    public List<PartyLocationRelationshipEntity> getPartyLocationRelationshipNewLookUp() {
        return partyLocationRelationshipNewLookUp;
    }

    public List<IdentificationTypeEntity> getIdentificationLookUp() {
        return identificationLookUp;
    }

    public List<LanguageTypeEntity> getLanguageLookUp() {
        return languageLookUp;
    }

    public Map<Integer, String> getIdentifierTypeLookUp() {
        return identifierTypeLookUp;
    }


    public Map<Integer, Integer> getPartyTypeLookUp() {
        return partyTypeLookUp;
    }

    public Map<Integer, String> getLanguageTypeLookUp() {
        return languageTypeLookUp;
    }

    public Map<String, Integer> getPartyStatusTypeLookUp() {
        return partyStatusTypeLookUp;
    }

    public Map<String, Integer> getRoleTypeLookUp() {
        return roleTypeLookUp;
    }

    public Map<Integer, String> getIdentificationTypeLookUp() {
        return identificationTypeLookUp;
    }

    public Map<Integer, String> getCountryLookUp() {
        return countryLookUp;
    }

    public Map<Integer, String> getTitleTypeLookUp() {
        return titleTypeLookUp;
    }

    public List<ResidencyStatusTypeEntity> getResidencyStatusTypeLookUp() {
        return residencyStatusTypeLookUp;
    }

    public Map<Integer, String> getGenderTypeLookUp() {
        return genderTypeLookUp;
    }

    public Map<Integer, Integer> getEthnicGroupTypeLookUp() {
        return ethnicGroupTypeLookUp;
    }

    public Map<Integer, String> getMaritalStatusTypeLookUp() {
        return maritalStatusTypeLookUp;
    }


    public Map<Integer, String> getMaritalContractTypeLookUp() {
        return maritalContractTypeLookUp;
    }

    public Map<Integer, String> getOccupationTypeLookUp() {
        return occupationTypeLookUp;
    }

    public Map<Integer, String> getOrganisationStatusTypeLookUp() {
        return organisationStatusTypeLookUp;
    }


    public Map<String, Integer> getOrganisationSizeTypeLookUp() {
        return organisationSizeTypeLookUp;
    }

    public Map<Integer, Integer> getIdentifierStatusTypeLookUp() {
        return identifierStatusTypeLookUp;
    }

    public Map<String, Integer> getKycStatusTypeLookUp() {
        return kycStatusTypeLookUp;
    }

    public Map<String, Integer> getSegmentationTypeLookUp() {
        return segmentationTypeLookUp;
    }

    public Map<String, Integer> getForeignTaxLiabilityTypeLookUp() {
        return foreignTaxLiabilityTypeLookUp;
    }

    public Map<String, Integer> getBankDecisionIndicatorLookUp() {
        return bankDecisionIndicatorLookUp;
    }

    public Map<String, Integer> getBusinessRescueIndicatorLookUp() {
        return businessRescueIndicatorLookUp;
    }

    public Map<String, Integer> getDebtCounsellingIndicatorLookUp() {
        return debtCounsellingIndicatorLookUp;
    }

/*    public Map<String, Integer> getDepositTakingInstitutionTypeLookUp() {
        return depositTakingInstitutionTypeLookUp;
    }*/

    public Map<String, Integer> getIndustryCategoryTypeLookUp() {
        return industryCategoryTypeLookUp;
    }

    public Map<String, Integer> getSicTypeLookUp() {
        return sicTypeLookUp;
    }

    public Map<String, Integer> getLocationTypeLookUp() {
        return locationTypeLookUp;
    }

    public Map<String, Integer> getMethodOfContactLookUp() {
        return methodOfContactLookUp;
    }

    public Map<String, Integer> getGeoAddressTypeLookUp() {
        return geoAddressTypeLookUp;
    }

    public Map<Integer, String> getTelephoneAddressTypeLookUp() {
        return telephoneAddressTypeLookUp;
    }

    public Map<String, Integer> getPartyStatureTypeLookUp() {
        return partyStatureTypeLookUp;
    }

    public Map<Integer, Integer> getSanctionScreenStatusLookUp() {
        return sanctionScreenStatusLookUp;
    }

    public Map<String, Integer> getPropertyOwnershipTypeLookUp() {
        return propertyOwnershipTypeLookUp;
    }

    public Map<String, Integer> getPropertyBondedIndicatorLookUp() {
        return propertyBondedIndicatorLookUp;
    }

    public List<OrganisationTypeEntity> getOrganisationTypeLookUp() {
        return organisationTypeLookUp;
    }

    public Map<Integer, String> getJurisdictionLookUp() {
        return jurisdictionLookUp;
    }

    public Map<String, String> getJurisdictionCountryLookUp() {
        return jurisdictionCountryLookUp;
    }

    public Map<String, Integer> getJurisdictionCompanyLookUp() {
        return jurisdictionCompanyLookUp;
    }

    public Map<Integer, String> getSourceOfFundLookUp() {
        return sourceOfFundLookUp;
    }

    public Map<Integer, String> getPartyLocationRelationshipLookUp() {
        return partyLocationRelationshipLookUp;
    }

    public Map<String, String> getStateProvinceLookUp() {
        return stateProvinceLookUp;
    }

    public Map<Integer, String> getHighestQualificationTypeLookUp() {
        return highestQualificationTypeLookUp;
    }

    public Map<Integer, String> getQualificationSpecialityTypeLookUp() {
        return qualificationSpecialityTypeLookUp;
    }

    public List<OrgCategoryTypeEntity> getCategoryLookUp() {
        return orgCategoryLookUp;
    }

    @Autowired
    public void setCountryRepository(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Autowired
    public void setEthnicGroupTypeRepository(EthnicGroupTypeRepository ethnicGroupTypeRepository) {
        this.ethnicGroupTypeRepository = ethnicGroupTypeRepository;
    }

    @Autowired
    public void setGenderTypeRepository(GenderTypeRepository genderTypeRepository) {
        this.genderTypeRepository = genderTypeRepository;
    }

    @Autowired
    public void setIdentificationTypeRepository(IdentificationTypeRepository identificationTypeRepository) {
        this.identificationTypeRepository = identificationTypeRepository;
    }

    @Autowired
    public void setIdentifierTypeRepository(IdentifierTypeRepository identifierTypeRepository) {
        this.identifierTypeRepository = identifierTypeRepository;
    }

    @Autowired
    public void setJurisdictionRepository(JurisdictionRepository jurisdictionRepository) {
        this.jurisdictionRepository = jurisdictionRepository;
    }

    @Autowired
    public void setLanguageTypeRepository(LanguageTypeRepository languageTypeRepository) {
        this.languageTypeRepository = languageTypeRepository;
    }

    @Autowired
    public void setMaritalContractTypeRepository(MaritalContractTypeRepository maritalContractTypeRepository) {
        this.maritalContractTypeRepository = maritalContractTypeRepository;
    }

    @Autowired
    public void setMaritalStatusTypeRepository(MaritalStatusTypeRepository maritalStatusTypeRepository) {
        this.maritalStatusTypeRepository = maritalStatusTypeRepository;
    }

    @Autowired
    public void setOccupationTypeRepository(OccupationTypeRepository occupationTypeRepository) {
        this.occupationTypeRepository = occupationTypeRepository;
    }

    @Autowired
    public void setOrganisationSizeTypeRepository(OrganisationSizeTypeRepository organisationSizeTypeRepository) {
        this.organisationSizeTypeRepository = organisationSizeTypeRepository;
    }

    @Autowired
    public void setOrganisationStatusTypeRepository(OrganisationStatusTypeRepository organisationStatusTypeRepository) {
        this.organisationStatusTypeRepository = organisationStatusTypeRepository;
    }

    @Autowired
    public void setPartystatustypeRepository(PartystatustypeRepository partystatustypeRepository) {
        this.partystatustypeRepository = partystatustypeRepository;
    }

    @Autowired
    public void setPartytypeRepository(PartytypeRepository partytypeRepository) {
        this.partytypeRepository = partytypeRepository;
    }

    @Autowired
    public void setResidencyStatusTypeRepository(ResidencyStatusTypeRepository residencyStatusTypeRepository) {
        this.residencyStatusTypeRepository = residencyStatusTypeRepository;
    }

    @Autowired
    public void setRoletypeRepository(RoletypeRepository roletypeRepository) {
        this.roletypeRepository = roletypeRepository;
    }

    @Autowired
    public void setTitleTypeRepository(TitleTypeRepository titleTypeRepository) {
        this.titleTypeRepository = titleTypeRepository;
    }

    @Autowired
    public void setTurnoverTypeRepository(TurnoverTypeRepository turnoverTypeRepository) {
        this.turnoverTypeRepository = turnoverTypeRepository;
    }

    @Autowired
    public void setIdentifierStatusTypeRepository(IdentifierStatusRepository identifierStatusRepository) {
        this.identifierStatusRepository = identifierStatusRepository;
    }

    @Autowired
    public void setKycStatusTypeRepository(KycStatusTypeRepository kycStatusTypeRepository) {
        this.kycStatusTypeRepository = kycStatusTypeRepository;
    }

    @Autowired
    public void setSegmentationTypeRepository(SegmentationTypeRepository segmentationTypeRepository) {
        this.segmentationTypeRepository = segmentationTypeRepository;
    }

    @Autowired
    public void setForeignTaxLiabilityTypeRepository(ForeignTaxLiabilityTypeRepository foreignTaxLiabilityTypeRepository) {
        this.foreignTaxLiabilityTypeRepository = foreignTaxLiabilityTypeRepository;
    }

    @Autowired
    public void setBankDecisionIndicatorRepository(BankDecisionIndicatorRepository bankDecisionIndicatorRepository) {
        this.bankDecisionIndicatorRepository = bankDecisionIndicatorRepository;
    }

    @Autowired
    public void setBusinessRescueIndicatorRepository(BusinessRescueIndicatorRepository businessRescueIndicatorRepository) {
        this.businessRescueIndicatorRepository = businessRescueIndicatorRepository;
    }

    @Autowired
    public void setDebtCounsellingIndicatorRepository(DebtCounsellingIndicatorRepository debtCounsellingIndicatorRepository) {
        this.debtCounsellingIndicatorRepository = debtCounsellingIndicatorRepository;
    }

    @Autowired
    public void setDepositTakingInstitutionTypeRepository(DepositTakingInstitutionTypeRepository depositTakingInstitutionTypeRepository) {
        this.depositTakingInstitutionTypeRepository = depositTakingInstitutionTypeRepository;
    }

    @Autowired
    public void setIndustryCategoryTypeRepository(IndustryCategoryTypeRepository industryCategoryTypeRepository) {
        this.industryCategoryTypeRepository = industryCategoryTypeRepository;
    }

    @Autowired
    public void setSicTypeRepository(SicTypeRepository sicTypeRepository) {
        this.sicTypeRepository = sicTypeRepository;
    }

    @Autowired
    public void setLocationTypeRepository(LocationTypeRepository locationTypeRepository) {
        this.locationTypeRepository = locationTypeRepository;
    }

    @Autowired
    public void setMethodOfContactRepository(MethodOfContactRepository methodOfContactRepository) {
        this.methodOfContactRepository = methodOfContactRepository;
    }

    @Autowired
    public void setSourceOfFundRepository(SourceOfFundRepository sourceOfFundRepository) {
        this.sourceOfFundRepository = sourceOfFundRepository;
    }

    @Autowired
    public void setGeoAddressTypeRepository(GeoAddressTypeRepository geoAddressTypeRepository) {
        this.geoAddressTypeRepository = geoAddressTypeRepository;
    }

    @Autowired
    public void setPartyLocationRelationshipRepository(PartyLocationRelationshipRepository partyLocationRelationshipRepository) {
        this.partyLocationRelationshipRepository = partyLocationRelationshipRepository;
    }

    @Autowired
    public void setStateProvinceRepository(StateProvinceRepository stateProvinceRepository) {
        this.stateProvinceRepository = stateProvinceRepository;
    }

    @Autowired
    public void setTelephoneAddressTypeRepository(TelephoneAddressTypeRepository telephoneAddressTypeRepository) {
        this.telephoneAddressTypeRepository = telephoneAddressTypeRepository;
    }

    @Autowired
    public void setSanctionScreeningStatusRepository(SanctionScreeningStatusRepository sanctionScreeningStatusRepository) {
        this.sanctionScreeningStatusRepository = sanctionScreeningStatusRepository;
    }

    @Autowired
    public void setPropertyOwnershipTypeRepository(PropertyOwnershipTypeRepository propertyOwnershipTypeRepository) {
        this.propertyOwnershipTypeRepository = propertyOwnershipTypeRepository;
    }

    @Autowired
    public void setPropertyBondedIndicatorRepository(PropertyBondedIndicatorRepository propertyBondedIndicatorRepository) {
        this.propertyBondedIndicatorRepository = propertyBondedIndicatorRepository;
    }

    @Autowired
    public void setOrganisationTypeRepository(OrganisationTypeRepository organisationTypeRepository) {
        this.organisationTypeRepository = organisationTypeRepository;
    }

    @Autowired
    public void setHighestQualificationTypeRepository(HighestQualificationTypeRepository highestQualificationTypeRepository) {
        this.highestQualificationTypeRepository = highestQualificationTypeRepository;
    }

    @Autowired
    public void setQualificationSpecialityTypeRepository(QualificationSpecialityTypeRepository qualificationSpecialityTypeRepository) {
        this.qualificationSpecialityTypeRepository = qualificationSpecialityTypeRepository;
    }

    @Autowired
    public void setIndustrySpecialityTypeRepository(IndustrySpecialityTypeRepository industrySpecialityTypeRepository) {
        this.industrySpecialityTypeRepository = industrySpecialityTypeRepository;
    }

    @Autowired
    public List<IndustrySpecialityType> getIndustrySpecialityTypeLookUp() {
        return industrySpecialityTypeLookUp;
    }

    @Autowired
    public List<DepositTakingInstitutionTypeEntity> getDepositTakingInstitutionTypeLookUp() {
        return depositTakingInstitutionTypeLookUp;
    }

    @Autowired
    public void setOrgCatRepository(OrgCategoryTypeRepository orgCategoryTypeRepository) {
        this.orgCategoryTypeRepository = orgCategoryTypeRepository;
    }

    @Autowired
    public List<EmploymentStatusTypeEntity> getEmploymentStatusTypeLookUp() {
        return employmentStatusTypeLookUp;
    }

    @Autowired
    public void setEmploymentStatusTypeRepository(EmploymentStatusTypeRepository employmentStatusTypeRepository) {
        this.employmentStatusTypeRepository = employmentStatusTypeRepository;
    }

    @Autowired
    public List<TurnoverTypeEntity> getTurnoverTypeLookUp() {
        return turnoverTypeLookUp;
    }
}
