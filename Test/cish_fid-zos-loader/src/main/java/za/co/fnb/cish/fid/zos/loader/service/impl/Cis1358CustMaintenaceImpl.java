package za.co.fnb.cish.fid.zos.loader.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import za.co.fnb.cish.fid.common.api.cis1358.cis1358input.*;
import za.co.fnb.cish.fid.common.api.cis1362.cis1362output.CoreEnquireDemographicIndividualData;
import za.co.fnb.cish.fid.common.api.cis1362.cis1362output.CoreEnquireNameSplitData;
import za.co.fnb.cish.fid.common.api.cis1362.cis1362output.CoreEnquiryResponse;
import za.co.fnb.cish.fid.common.api.cis1362.cis1362output.CoreEnquiryResponseWrapper;
import za.co.fnb.cish.fid.common.api.fidmaster.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import static za.co.fnb.cish.fid.zos.loader.util.Constants.*;

@Component
public class Cis1358CustMaintenaceImpl {


    public Cis1358FunctionRequest getCis1358fZosFunctionRequest(FirstIdMasterEntity firstIdMasterEntity, CoreEnquiryResponseWrapper coreEnquiryResponseWrapper, String jurisdictionCountryEntpsCode, Long ucn) {
        Cis1358FunctionRequest cis1358FunctionRequest = new Cis1358FunctionRequest();
        Cis1358ResidentialAddressData residentialAddressData = new Cis1358ResidentialAddressData();
        Cis1358MailingAddressData mailingAddressData = new Cis1358MailingAddressData();
        Cis1358DemographicCommonData demographicCommonData = new Cis1358DemographicCommonData();
        Cis1358DemographicIndividualData cis1358DemoIndvllData = new Cis1358DemographicIndividualData();
        Cis1358DemographicCommercialData cis1358DemoCommerclData = new Cis1358DemographicCommercialData();
        Cis1358ContactCommonData cis1358ContactCommonData = new Cis1358ContactCommonData();
        Cis1358CellphoneNumber cis1358CellphoneNumber = new Cis1358CellphoneNumber();
        Cis1358ContactIndividualData cis1358ContactIndividualData = new Cis1358ContactIndividualData();
        Cis1358ContactCommercialData cis1358ContactCommercialData = new Cis1358ContactCommercialData();
        Cis1358QualificationEmployerDetails cis1358QualificationEmployerDetails = new Cis1358QualificationEmployerDetails();
        Cis1358MarketingCommonData cis1358MarketingCommonData = new Cis1358MarketingCommonData();
        Cis1358SegmentationCommonData cis1358SegmentationCommonData = new Cis1358SegmentationCommonData();
        Cis1358BusinessPhoneNumber cis1358BusinessPhoneNumber = new Cis1358BusinessPhoneNumber();

        Party party = firstIdMasterEntity.getParty();
        List<Identification> idList = party.getIdentifications();
        List<Identification> identificationsList = new ArrayList<Identification>();
        String taxRef = null;
        String vatReg = null;

        identificationsList = idList.stream().filter(obj -> (StringUtils.isNotEmpty(obj.getPrimaryIdentificationIndicator()) && obj.getPrimaryIdentificationIndicator().equalsIgnoreCase(YES))).findFirst().stream().collect(Collectors.toList());
        if (identificationsList.size() <= 0 && Integer.valueOf(party.getPartyEntpsTypeCode()).equals(IND)) {
            identificationsList = idList.stream().filter(obj -> (StringUtils.isEmpty(obj.getIdentificationActiveIndicator()) || obj.getIdentificationActiveIndicator().equalsIgnoreCase(YES)) && StringUtils.isNotEmpty(obj.getIdentificationEntpsTypeCode()) && StringUtils.isNotEmpty(obj.getResidencyStatusEntpsTypeCode()) && !(obj.getResidencyStatusEntpsTypeCode().equalsIgnoreCase("-1")) && StringUtils.isNotEmpty(obj.getCitizenshipCountryEntpsCode()) && !(obj.getCitizenshipCountryEntpsCode().equalsIgnoreCase("-1"))).findFirst().stream().collect(Collectors.toList());
        } else if (identificationsList.size() <= 0 && Integer.valueOf(party.getPartyEntpsTypeCode()).equals(ORG)) {
            identificationsList = idList.stream().filter(obj -> (StringUtils.isEmpty(obj.getIdentificationActiveIndicator()) || obj.getIdentificationActiveIndicator().equalsIgnoreCase(YES)) && StringUtils.isNotEmpty(obj.getIdentificationEntpsTypeCode())).findFirst().stream().collect(Collectors.toList());
        }
        taxRef = getTaxRef(idList);
        vatReg = getVat(idList);
        Individual individual = party.getIndividual();
        Organisation organisation = party.getOrganisation();

        List<Location> cis1358location = firstIdMasterEntity.getParty().getLocations();
        CoreEnquiryResponse coreEnquiryResponse = coreEnquiryResponseWrapper.getData();

        AtomicReference<String> partyName = new AtomicReference<>(null);
        AtomicReference<String> middleName = new AtomicReference<>(null);
        partyName.set("");
        middleName.set("");

        if (Objects.nonNull(cis1358location)) {
            cis1358location.stream().forEach(location -> {
                List<EmailAddress> emailAddressList = location.getEmailAddresses();
                List<TelephonicAddress> telephonicAddressList = new ArrayList<TelephonicAddress>();
                if ((location.getLocationUseEntpsTypeCode().equalsIgnoreCase(RESIDENTIAL)) && (StringUtils.isEmpty(location.getLocationActiveIndicator()) || location.getLocationActiveIndicator().equalsIgnoreCase(YES))) {
                    List<GeographicalAddress> geographicalAddress = location.getGeographicAddresses();

                    //residential address
                    //geographicalAddress = geographicalAddress.stream().filter(address -> address.getAddressEntpsTypeCode().equalsIgnoreCase("CR")).collect(Collectors.toList());
                    if (Objects.nonNull(geographicalAddress)) {
                        geographicalAddress.stream().forEach(address -> {
                            residentialAddressData.setResidentialAddressCareOfLine(StringUtils.isNotEmpty(address.getAddressLine1()) ? address.getAddressLine1() : EMPTYSTR);
                            residentialAddressData.setResidentialAddressStreetLine1((StringUtils.isNotEmpty(address.getAddressLine2()) && (!address.getAddressLine2().trim().isEmpty())) ? address.getAddressLine2() : (Objects.nonNull(address.getSuburbName()) ? address.getSuburbName() : EMPTYSTR));
                            residentialAddressData.setResidentialAddressStreetLine2(StringUtils.isNotEmpty(address.getSuburbName()) ? address.getSuburbName() : EMPTYSTR);
                            residentialAddressData.setResidentialAddressState(StringUtils.isNotEmpty(address.getStateDistrictProvinceName()) ? address.getStateDistrictProvinceName() : EMPTYSTR);
                            residentialAddressData.setResidentialAddressCity(StringUtils.isNotEmpty(address.getCityName()) ? address.getCityName() : null);
                            residentialAddressData.setResidentialAddressCountryCode(StringUtils.isNotEmpty(address.getCountryEntpsCode()) ? address.getCountryEntpsCode() : null);
                            residentialAddressData.setResidentialAddressZipCode(StringUtils.isNotEmpty(address.getPostalAreaNumber()) ? address.getPostalAreaNumber() : null);


                            mailingAddressData.setMailingAddressCareOfLine(StringUtils.isNotEmpty(address.getAddressLine1()) ? address.getAddressLine1() : EMPTYSTR);
                            mailingAddressData.setMailingAddressCity(StringUtils.isNotEmpty(address.getCityName()) ? address.getCityName() : null);
                            mailingAddressData.setMailingAddressState(StringUtils.isNotEmpty(address.getStateDistrictProvinceName()) ? address.getStateDistrictProvinceName() : EMPTYSTR);
                            mailingAddressData.setMailingAddressStreetLine1((StringUtils.isNotEmpty(address.getAddressLine2()) && (!address.getAddressLine2().trim().isEmpty())) ? address.getAddressLine2() : (Objects.nonNull(address.getSuburbName()) ? address.getSuburbName() : EMPTYSTR));
                            mailingAddressData.setMailingAddressStreetLine2(StringUtils.isNotEmpty(address.getSuburbName()) ? address.getSuburbName() : EMPTYSTR);
                            mailingAddressData.setMailingAddressCountryCode(StringUtils.isNotEmpty(address.getCountryEntpsCode()) ? address.getCountryEntpsCode() : null);
                            mailingAddressData.setMailingAddressZipCode(StringUtils.isNotEmpty(address.getPostalAreaNumber()) ? address.getPostalAreaNumber() : null);
                        });
                    }
                }
                // contactCommercialData telephonicAddress
                if ((StringUtils.isNotEmpty(location.getLocationEntpsTypeCode()) && Integer.valueOf(location.getLocationEntpsTypeCode()).equals(2) && location.getLocationUseEntpsTypeCode().equalsIgnoreCase(CELL)) && (StringUtils.isEmpty(location.getLocationActiveIndicator()) || location.getLocationActiveIndicator().equalsIgnoreCase(YES))) {
                    telephonicAddressList = location.getTelephonicAddresses();
                    if (StringUtils.isNotEmpty(party.getPartyEntpsTypeCode()) && Integer.valueOf(party.getPartyEntpsTypeCode()).equals(ORG) && Objects.nonNull(telephonicAddressList)) {
                        telephonicAddressList.stream().forEach(telephonicAddress -> {

                            cis1358CellphoneNumber.setCustomerCellphoneDiallingCode(Objects.nonNull(telephonicAddress.getTelephoneCountryDailCode()) ? telephonicAddress.getTelephoneCountryDailCode() : null);
                            cis1358CellphoneNumber.setCustomerCellphoneNumber(Objects.nonNull(telephonicAddress.getTelephoneNumber()) ? telephonicAddress.getTelephoneNumber() : null);
                            cis1358ContactCommonData.setCellphoneNumber(cis1358CellphoneNumber);
                        });
                    } else if (StringUtils.isNotEmpty(party.getPartyEntpsTypeCode()) && Integer.valueOf(party.getPartyEntpsTypeCode()).equals(IND) && Objects.nonNull(telephonicAddressList)) {
                        if (Objects.nonNull(telephonicAddressList)) {
                            telephonicAddressList.stream().forEach(telephonicAddress -> {

                                cis1358CellphoneNumber.setCustomerCellphoneDiallingCode(Objects.nonNull(telephonicAddress.getTelephoneCountryDailCode()) ? telephonicAddress.getTelephoneCountryDailCode() : null);
                                cis1358CellphoneNumber.setCustomerCellphoneNumber(Objects.nonNull(telephonicAddress.getTelephoneNumber()) ? telephonicAddress.getTelephoneNumber() : null);
                                cis1358ContactCommonData.setCellphoneNumber(cis1358CellphoneNumber);
                            });
                        }
                    }

                }
                if ((StringUtils.isNotEmpty(location.getLocationEntpsTypeCode()) && Integer.valueOf(location.getLocationEntpsTypeCode()).equals(2) && location.getLocationUseEntpsTypeCode().equalsIgnoreCase(BUS)) && (StringUtils.isEmpty(location.getLocationActiveIndicator()) || location.getLocationActiveIndicator().equalsIgnoreCase(YES))) {
                    telephonicAddressList = location.getTelephonicAddresses();
                    if (StringUtils.isNotEmpty(party.getPartyEntpsTypeCode()) && Integer.valueOf(party.getPartyEntpsTypeCode()).equals(ORG) && Objects.nonNull(telephonicAddressList)) {
                        telephonicAddressList.stream().forEach(telephonicAddress -> {

                            cis1358BusinessPhoneNumber.setCustomerContactphoneDiallingCode(Objects.nonNull(telephonicAddress.getTelephoneCountryDailCode()) ? telephonicAddress.getTelephoneCountryDailCode() : null);
                            cis1358BusinessPhoneNumber.setCustomerContactphoneNumber(Objects.nonNull(telephonicAddress.getTelephoneNumber()) ? telephonicAddress.getTelephoneNumber() : null);

                            cis1358ContactCommercialData.setBusinessPhoneNumber(cis1358BusinessPhoneNumber);
                            //   cis1358CellphoneNumber.setCustomerCellphoneNumber(Objects.nonNull(telephonicAddress.getTelephoneNumber()) ? telephonicAddress.getTelephoneNumber() : null);
                            //  cis1358CellphoneNumber.setCustomerCellphoneDiallingCode(Objects.nonNull(telephonicAddress.getTelephoneCountryDailCode()) ? telephonicAddress.getTelephoneCountryDailCode() : null);
                        });
                    }

                }

                // contactCommonData --email
                if (StringUtils.isNotEmpty(location.getLocationEntpsTypeCode()) && Integer.valueOf(location.getLocationEntpsTypeCode()).equals(EMAIL) && ((StringUtils.isEmpty(location.getLocationActiveIndicator()) || location.getLocationActiveIndicator().equalsIgnoreCase(YES)))) {
                    if (Objects.nonNull(emailAddressList)) {
                        emailAddressList.stream().forEach(emailAddress -> {
                            cis1358ContactCommonData.setCustomerEmailAddress(Objects.nonNull(emailAddress.getEmailAddress()) ? emailAddress.getEmailAddress() : null);
                        });
                    }
                }
            });


        }

        //demographicCommonData
        //identification fidObejct
        if (Objects.nonNull(identificationsList) && identificationsList.size() > 0) {
            identificationsList.stream().forEach(identification -> {
                demographicCommonData.setCustomerPrimaryIdentityType(Objects.nonNull(identification.getIdentificationEntpsTypeCode()) ? identification.getIdentificationEntpsTypeCode() : null);
                demographicCommonData.setCustomerPrimaryIdentityCountryIssued(Objects.nonNull(identification.getIdentificationIssuerCountryEntpsCode()) ? identification.getIdentificationIssuerCountryEntpsCode() : null);
                demographicCommonData.setCustomerPrimaryIdentityEffectiveDate(Objects.nonNull(identification.getIdentificationIssueDate()) ? Integer.valueOf(identification.getIdentificationIssueDate()) : 0);
                demographicCommonData.setCustomerPrimaryIdentityExpiryDate(Objects.nonNull(identification.getIdentificationExpiryDate()) ? Integer.valueOf(identification.getIdentificationExpiryDate()) : 0);
                demographicCommonData.setCustomerPrimaryIdentityNumber(Objects.nonNull(identification.getIdentificationNumber()) ? identification.getIdentificationNumber() : null);
            });
        } else {
            demographicCommonData.setCustomerPrimaryIdentityType(coreEnquiryResponse.getDemographicCommonData().getCustomerPrimaryIdentityType());
            demographicCommonData.setCustomerPrimaryIdentityCountryIssued(coreEnquiryResponse.getDemographicCommonData().getCustomerPrimaryIdentityCountryIssued());
            demographicCommonData.setCustomerPrimaryIdentityEffectiveDate(coreEnquiryResponse.getDemographicCommonData().getCustomerPrimaryIdentityEffectiveDate());
            demographicCommonData.setCustomerPrimaryIdentityExpiryDate(coreEnquiryResponse.getDemographicCommonData().getCustomerPrimaryIdentityExpiryDate());
            demographicCommonData.setCustomerPrimaryIdentityNumber(coreEnquiryResponse.getDemographicCommonData().getCustomerPrimaryIdentityNumber());

        }
        if (StringUtils.isNotEmpty(party.getPartyEntpsTypeCode()) && Integer.valueOf(party.getPartyEntpsTypeCode()).equals(ORG)) {
            demographicCommonData.setCustomerType(Objects.nonNull(party.getOrganisation()) && StringUtils.isNotEmpty(party.getOrganisation().getOrganisationEntpsTypeCode()) ? party.getOrganisation().getOrganisationEntpsTypeCode() : coreEnquiryResponse.getDemographicCommonData().getCustomerType());
            demographicCommonData.setCustomerTaxReference(Objects.nonNull(coreEnquiryResponse.getDemographicCommonData().getCustomerTaxReference()) ? coreEnquiryResponse.getDemographicCommonData().getCustomerTaxReference() : null);
        } else if (StringUtils.isNotEmpty(party.getPartyEntpsTypeCode()) && Integer.valueOf(party.getPartyEntpsTypeCode()).equals(IND)) {
            demographicCommonData.setCustomerType(Objects.nonNull(coreEnquiryResponse.getDemographicCommonData()) && Objects.nonNull(coreEnquiryResponse.getDemographicCommonData().getCustomerType()) ? coreEnquiryResponse.getDemographicCommonData().getCustomerType() : null);
            demographicCommonData.setCustomerTaxReference(StringUtils.isNotEmpty(taxRef) ? taxRef : (Objects.nonNull(coreEnquiryResponse.getDemographicCommonData().getCustomerTaxReference()) ? coreEnquiryResponse.getDemographicCommonData().getCustomerTaxReference() : null));
        }
        if (Objects.nonNull(coreEnquiryResponse.getDemographicCommonData())) {
            demographicCommonData.setCustomerBranch(Objects.nonNull(coreEnquiryResponse.getDemographicCommonData().getCustomerBranch()) ? coreEnquiryResponse.getDemographicCommonData().getCustomerBranch() : null);
            demographicCommonData.setCustomerCorrespondenceLanguage(StringUtils.isNotEmpty(party.getCorrespondenceLanguageEntpsTypeCode()) ? party.getCorrespondenceLanguageEntpsTypeCode() : EMPTYSTR);
            demographicCommonData.setCustomerClientCustomerNumber(Objects.nonNull(coreEnquiryResponse.getDemographicCommonData().getCustomerClientCustomerNumber()) ? coreEnquiryResponse.getDemographicCommonData().getCustomerClientCustomerNumber() : null);
            demographicCommonData.setOfficerCodePrimary(Objects.nonNull(coreEnquiryResponse.getDemographicCommonData().getOfficerCodePrimary()) ? coreEnquiryResponse.getDemographicCommonData().getOfficerCodePrimary() : null);
            demographicCommonData.setOfficerCodeSecondary(Objects.nonNull(coreEnquiryResponse.getDemographicCommonData().getOfficerCodeSecondary()) ? coreEnquiryResponse.getDemographicCommonData().getOfficerCodeSecondary() : null);
            // demographicCommonData.setCustomerTaxReference(Objects.nonNull(coreEnquiryResponse.getDemographicCommonData().getCustomerTaxReference()) ? coreEnquiryResponse.getDemographicCommonData().getCustomerTaxReference() : null);
            demographicCommonData.setCustomerRiskIndicator(Objects.nonNull(coreEnquiryResponse.getDemographicCommonData().getCustomerRiskIndicator()) ? coreEnquiryResponse.getDemographicCommonData().getCustomerRiskIndicator() : null);
            demographicCommonData.setCustomerRiskReason(Objects.nonNull(coreEnquiryResponse.getDemographicCommonData().getCustomerRiskReason()) ? coreEnquiryResponse.getDemographicCommonData().getCustomerRiskReason() : null);
        }

        //demographicIndividualData
        //individual fidObject
        cis1358DemoIndvllData.setCustomerCountryOfBirth(Objects.nonNull(individual.getBirthCountryEntpsCode()) ? individual.getBirthCountryEntpsCode() : null);
        cis1358DemoIndvllData.setCustomerCountryOfPermanentResidence(Objects.nonNull(individual.getPermanentResidenceCountryEntpsCode()) ? individual.getPermanentResidenceCountryEntpsCode() : null);
        identificationsList.stream().forEach(identification -> {
            if (StringUtils.isNotEmpty(party.getPartyEntpsTypeCode()) && Integer.valueOf(party.getPartyEntpsTypeCode()).equals(IND)) {
                cis1358DemoIndvllData.setCustomerCountryOfCitizenship(Objects.nonNull(identification.getCitizenshipCountryEntpsCode()) ? identification.getCitizenshipCountryEntpsCode() : null);
                cis1358DemoIndvllData.setCustomerResidencyStatus(Objects.nonNull(identification.getResidencyStatusEntpsTypeCode()) ? identification.getResidencyStatusEntpsTypeCode() : null);


                if (Objects.nonNull(identification.getIdentificationNames()) && identification.getIdentificationNames().size() > 0) {

                    Map<String, String> names = individualName(identification.getIdentificationNames(), party, coreEnquiryResponse);
                    partyName.set(names.get("nameOne").replaceAll(REGIX, SPACE));
                    middleName.set(names.get("nameTwo").replaceAll(REGIX, SPACE));

                }

            }
        });
        if (StringUtils.isNotEmpty(party.getPartyEntpsTypeCode()) && Integer.valueOf(party.getPartyEntpsTypeCode()).equals(ORG)) {
//            partyName.set(Objects.nonNull(party.getName()) ? party.getName() : null);
//            middleName.set("");
            if (Objects.nonNull(coreEnquiryResponse.getDemographicIndividualData())) {
                cis1358DemoIndvllData.setCustomerCountryOfCitizenship(Objects.nonNull(coreEnquiryResponse.getDemographicIndividualData().getCustomerCountryOfCitizenship()) ? coreEnquiryResponse.getDemographicIndividualData().getCustomerCountryOfCitizenship() : null);
                cis1358DemoIndvllData.setCustomerResidencyStatus(Objects.nonNull(coreEnquiryResponse.getDemographicIndividualData().getCustomerResidencyStatus()) ? coreEnquiryResponse.getDemographicIndividualData().getCustomerResidencyStatus() : null);

            }
        }


        cis1358DemoIndvllData.setCustomerCountryOfNationality(Objects.nonNull(individual.getNationalityCountryEntpsCode()) ? individual.getNationalityCountryEntpsCode() : null);
        cis1358DemoIndvllData.setDateOfBirth(Objects.nonNull(individual.getBirthDate()) ? Integer.valueOf(individual.getBirthDate()) : 0);
        cis1358DemoIndvllData.setCustomerDateDeceased(Objects.nonNull(individual.getDeceasedDate()) ? Integer.valueOf(individual.getDeceasedDate()) : 0);

        cis1358DemoIndvllData.setCustomerGender(StringUtils.isNotEmpty(individual.getGenderEntpsTypeCode()) ? individual.getGenderEntpsTypeCode() : EMPTYSTR);
        cis1358DemoIndvllData.setCustomerMaritalStatus(StringUtils.isNotEmpty(individual.getMaritalStatusEntpsTypeCode()) ? individual.getMaritalStatusEntpsTypeCode() : EMPTYSTR);
        cis1358DemoIndvllData.setCustomerMaritalContract(StringUtils.isNotEmpty(individual.getMaritalContractEntpsTypeCode()) ? individual.getMaritalContractEntpsTypeCode() : EMPTYSTR);
        cis1358DemoIndvllData.setCustomerMaritalConsent(StringUtils.isNotEmpty(individual.getMaritalConsentIndicator()) ? individual.getMaritalConsentIndicator() : EMPTYSTR);
        cis1358DemoIndvllData.setCustomerNumberOfDependents(Objects.nonNull(individual.getNumberOfDependants()) ? individual.getNumberOfDependants() : 0);
        //Employments


        if (Objects.nonNull(individual.getEmployments())) {
            List<Employment> employments = individual.getEmployments().stream().filter(employment -> ((StringUtils.isEmpty(employment.getPrimaryEmploymentIndicator()) || employment.getPrimaryEmploymentIndicator().equalsIgnoreCase(YES)) && (StringUtils.isEmpty(employment.getEmploymentActiveIndicator()) || employment.getEmploymentActiveIndicator().equalsIgnoreCase(YES)))).collect(Collectors.toList());
            employments.stream().forEach(employment -> {
                cis1358DemoIndvllData.setCustomerOccupationCode(StringUtils.isNotEmpty(employment.getOccupationEntpsTypeCode()) ? employment.getOccupationEntpsTypeCode() : EMPTYSTR);
                cis1358DemoIndvllData.setCustomerAnnualIncome(Objects.nonNull(employment.getAnnualGrossIncomeAmount()) ? (long) employment.getAnnualGrossIncomeAmount() : null);
            });
        }


        if (Objects.nonNull(coreEnquiryResponse.getDemographicIndividualData()) && Objects.nonNull(coreEnquiryResponse.getDemographicIndividualData().getNameSplitData())) {
            CoreEnquireDemographicIndividualData cis1362demoIndvldata = coreEnquiryResponse.getDemographicIndividualData();
            CoreEnquireNameSplitData cis1362NameSplitData = coreEnquiryResponse.getDemographicIndividualData().getNameSplitData();
            Cis1358NameFormat1 cis1358NameFormat1 = new Cis1358NameFormat1();
            Cis1358NameFormat2 cis1358NameFormat2 = new Cis1358NameFormat2();


            if (StringUtils.isNotEmpty(party.getPartyEntpsTypeCode()) && Integer.valueOf(party.getPartyEntpsTypeCode()).equals(IND)) {
                cis1358NameFormat1.setCustomerFullName(((Objects.nonNull(partyName) && partyName.toString().length() > 0)) ? String.valueOf(partyName) : StringUtils.isNotEmpty(coreEnquiryResponse.getDemographicCommonData().getCustomerName()) ? coreEnquiryResponse.getDemographicCommonData().getCustomerName() : EMPTYSTR);
                cis1358NameFormat1.setCustomerMiddleNames(((Objects.nonNull(middleName) && middleName.toString().length() > 0)) ? String.valueOf(middleName) : StringUtils.isNotEmpty(coreEnquiryResponse.getDemographicCommonData().getCustomerName2()) ? coreEnquiryResponse.getDemographicCommonData().getCustomerName2() : EMPTYSTR);
            }
            cis1358NameFormat2.setCustomerNameTitle(Objects.nonNull(party.getIndividual()) && (StringUtils.isNotEmpty(party.getIndividual().getTitleEntpsTypeCode()) && !NEGATIVE_LIST.contains(party.getIndividual().getTitleEntpsTypeCode())) ? party.getIndividual().getTitleEntpsTypeCode() : cis1362NameSplitData.getCustomerNameTitle());
            //cis1358NameFormat2.setCustomerNameTitle(Objects.nonNull(cis1362NameSplitData.getCustomerNameTitle()) ? cis1362NameSplitData.getCustomerNameTitle() : null);
            cis1358NameFormat2.setCustomerFirstName(Objects.nonNull(cis1362NameSplitData.getCustomerNameFirst()) ? cis1362NameSplitData.getCustomerNameFirst() : null);
            cis1358NameFormat2.setCustomerLastName(Objects.nonNull(cis1362NameSplitData.getCustomerNameLast()) ? cis1362NameSplitData.getCustomerNameLast() : null);
            cis1358NameFormat2.setCustomerMiddleNameFirst(Objects.nonNull(cis1362NameSplitData.getCustomerNameMiddleFirst()) ? cis1362NameSplitData.getCustomerNameMiddleFirst() : null);
            cis1358NameFormat2.setCustomerMiddleNameSecond(Objects.nonNull(cis1362NameSplitData.getCustomerNameMiddleSecond()) ? cis1362NameSplitData.getCustomerNameMiddleSecond() : null);
            cis1358NameFormat2.setCustomerMiddleNameThird(Objects.nonNull(cis1362NameSplitData.getCustomerNameMiddleThird()) ? cis1362NameSplitData.getCustomerNameMiddleThird() : null);
            cis1358NameFormat2.setCustomerMiddleNameFourth(Objects.nonNull(cis1362NameSplitData.getCustomerNameMiddleFourth()) ? cis1362NameSplitData.getCustomerNameMiddleFourth() : null);
            cis1358NameFormat2.setCustomerMiddleNameFifth(Objects.nonNull(cis1362NameSplitData.getCustomerNameMiddleFifth()) ? cis1362NameSplitData.getCustomerNameMiddleFifth() : null);

            cis1358DemoIndvllData.setCustomerRace((Objects.nonNull(cis1362demoIndvldata.getCustomerRace()) && (!cis1362demoIndvldata.getCustomerRace().trim().isEmpty())) ? Integer.valueOf(cis1362demoIndvldata.getCustomerRace()) : null);

            cis1358DemoIndvllData.setCustomerGroupScheme(Objects.nonNull(cis1362demoIndvldata.getCustomerGroupScheme()) ? cis1362demoIndvldata.getCustomerGroupScheme() : null);
            cis1358DemoIndvllData.setCustomerPropertyBonded(Objects.nonNull(cis1362demoIndvldata.getCustomerPropertyBonded()) ? cis1362demoIndvldata.getCustomerPropertyBonded() : null);
            cis1358DemoIndvllData.setCustomerPropertyOwnership(Objects.nonNull(cis1362demoIndvldata.getCustomerPropertyOwnership()) ? cis1362demoIndvldata.getCustomerPropertyOwnership() : null);
            cis1358DemoIndvllData.setCustomerVipIndicator(Objects.nonNull(cis1362demoIndvldata.getCustomerVIPIndicator()) ? cis1362demoIndvldata.getCustomerVIPIndicator() : null);
            cis1358DemoIndvllData.setCustomerVipCategory(Objects.nonNull(cis1362demoIndvldata.getCustomerVIPCategory()) ? cis1362demoIndvldata.getCustomerVIPCategory() : null);
            //not fount in cis1362
            if (Objects.nonNull(coreEnquiryResponse.getDemographicCommonData())) {
                cis1358DemoIndvllData.setCustomerSensitiveFlag(Objects.nonNull(coreEnquiryResponse.getDemographicCommonData().getCustomerSensitiveFlag()) ? coreEnquiryResponse.getDemographicCommonData().getCustomerSensitiveFlag() : null);
            }
            //not fount in cis1362
            cis1358DemoIndvllData.setNameFormat1(cis1358NameFormat1);
            cis1358DemoIndvllData.setNameFormat2(cis1358NameFormat2);
        }

        //demographicCommercialData
        //organisation fidObejct
        if (Objects.nonNull(organisation)) {
            cis1358DemoCommerclData.setCustomerTradingAsName(StringUtils.isNotEmpty(organisation.getTradingName()) ? organisation.getTradingName() : EMPTYSTR);
            cis1358DemoCommerclData.setCustomerTaxYearEnd(Objects.nonNull(organisation.getTaxYearEndMonth()) ? organisation.getTaxYearEndMonth() : null);
            cis1358DemoCommerclData.setCustomerDateEstablished(Objects.nonNull(organisation.getEstablishedDate()) ? Integer.valueOf(organisation.getEstablishedDate()) : null);
            cis1358DemoCommerclData.setCustomerDateOfOperation(Objects.nonNull(organisation.getOperationStartDate()) ? Integer.valueOf(organisation.getOperationStartDate()) : null);
            cis1358DemoCommerclData.setCustomerCountryEstablished(Objects.nonNull(organisation.getEstablishedCountryEntpsCode()) ? organisation.getEstablishedCountryEntpsCode() : null);
            cis1358DemoCommerclData.setCustomerStateOwnedCompany(StringUtils.isNotEmpty(organisation.getStateOwnedCompanyIndicator()) ? organisation.getStateOwnedCompanyIndicator() : EMPTYSTR);
            cis1358DemoCommerclData.setCustomerCountryOfOperation(Objects.nonNull(organisation.getOperationCountryEntpsCode()) ? organisation.getOperationCountryEntpsCode() : null);
            cis1358DemoCommerclData.setCustomerCountryHeadOffice(StringUtils.isNotEmpty(organisation.getRegisteredHeadOfficeCountryEntpsCode()) ? organisation.getRegisteredHeadOfficeCountryEntpsCode() : EMPTYSTR);
            cis1358DemoCommerclData.setCustomerTurnoverCode((Objects.nonNull(organisation.getAnnualTurnoverAmount()) && organisation.getAnnualTurnoverAmount() > 0) ? String.format("%02d", organisation.getAnnualTurnoverAmount().intValue()) : coreEnquiryResponse.getDemographicCommercialData().getCustomerTurnoverCode());
        }

        //cis1358DemoCommerclData
        if (StringUtils.isNotEmpty(party.getPartyEntpsTypeCode()) && Integer.valueOf(party.getPartyEntpsTypeCode()).equals(ORG)) {
            // if (Objects.nonNull(coreEnquiryResponse.getDemographicCommonData())) {
            List orgName = organisationName(party.getName());
            cis1358DemoCommerclData.setCustomerName(Objects.nonNull(orgName) && Objects.nonNull(orgName.get(0)) ? (String) orgName.get(0) : Objects.nonNull(coreEnquiryResponse.getDemographicCommonData().getCustomerName()) ? coreEnquiryResponse.getDemographicCommonData().getCustomerName() : null);
            cis1358DemoCommerclData.setCustomerName2(Objects.nonNull(orgName) && Objects.nonNull(orgName.get(0)) && (Objects.nonNull(orgName.get(1))) ? (String) orgName.get(1) : Objects.nonNull(coreEnquiryResponse.getDemographicCommonData().getCustomerName2()) ? coreEnquiryResponse.getDemographicCommonData().getCustomerName2() : null);
            cis1358DemoCommerclData.setCustomerVATRegistrationNumber("");
        } else {
            cis1358DemoCommerclData.setCustomerName(Objects.nonNull(coreEnquiryResponse.getDemographicCommonData()) && Objects.nonNull(coreEnquiryResponse.getDemographicCommonData().getCustomerName()) ? coreEnquiryResponse.getDemographicCommonData().getCustomerName() : null);
            cis1358DemoCommerclData.setCustomerName2(Objects.nonNull(coreEnquiryResponse.getDemographicCommonData()) && Objects.nonNull(coreEnquiryResponse.getDemographicCommonData().getCustomerName2()) ? coreEnquiryResponse.getDemographicCommonData().getCustomerName2() : null);
            cis1358DemoCommerclData.setCustomerVATRegistrationNumber(vatReg);
        }
        if (Objects.nonNull(coreEnquiryResponse.getDemographicCommercialData())) {
            cis1358DemoCommerclData.setCustomerNumberOfEmployees(Objects.nonNull(coreEnquiryResponse.getDemographicCommercialData().getCustomerNumberOfEmployees()) ? coreEnquiryResponse.getDemographicCommercialData().getCustomerNumberOfEmployees() : null);
            cis1358DemoCommerclData.setCustomerTurnoverAmount(Objects.nonNull(coreEnquiryResponse.getDemographicCommercialData().getCustomerTurnoverAmount()) ? coreEnquiryResponse.getDemographicCommercialData().getCustomerTurnoverAmount() : null);
            cis1358DemoCommerclData.setCustomerNumberOfSignatories(Objects.nonNull(coreEnquiryResponse.getDemographicCommercialData().getCustomerNumberOfSignatories()) ? coreEnquiryResponse.getDemographicCommercialData().getCustomerNumberOfSignatories() : null);
            cis1358DemoCommerclData.setCustomerCIBindicator(Objects.nonNull(coreEnquiryResponse.getDemographicCommercialData().getCustomerCIBIndicator()) ? coreEnquiryResponse.getDemographicCommercialData().getCustomerCIBIndicator() : null);
            //cis1358DemoCommerclData.setCustomerVATRegistrationNumber("");
        }

        //contactIndividualData
        if (Objects.nonNull(coreEnquiryResponse.getContactIndividualData())) {
            Cis1358HomeNumber cis1358HomeNumber = new Cis1358HomeNumber();
            Cis1358WorkNumber cis1358WorkNumber = new Cis1358WorkNumber();
            Cis1358FaxNumber cis1358FaxNumber = new Cis1358FaxNumber();
            cis1358ContactIndividualData.setCustomerPreferredMethodOfContact(Objects.nonNull(coreEnquiryResponse.getContactIndividualData().getCustomerPreferredMethodOfContact()) ? coreEnquiryResponse.getContactIndividualData().getCustomerPreferredMethodOfContact() : null);
            cis1358HomeNumber.setCustomerHomephoneNumber(Objects.nonNull(coreEnquiryResponse.getContactIndividualData().getHomeNumber().getCustomerHomePhoneNumber()) ? coreEnquiryResponse.getContactIndividualData().getHomeNumber().getCustomerHomePhoneNumber() : null);
            cis1358HomeNumber.setCustomerHomephoneDiallingCode(Objects.nonNull(coreEnquiryResponse.getContactIndividualData().getHomeNumber().getCustomerHomePhoneDialingCode()) ? coreEnquiryResponse.getContactIndividualData().getHomeNumber().getCustomerHomePhoneDialingCode() : null);
            cis1358WorkNumber.setCustomerWorkphoneNumber(Objects.nonNull(coreEnquiryResponse.getContactIndividualData().getWorkNumber().getCustomerWorkPhoneNumber()) ? coreEnquiryResponse.getContactIndividualData().getWorkNumber().getCustomerWorkPhoneNumber() : null);
            cis1358WorkNumber.setCustomerWorkphoneDiallingCode(Objects.nonNull(coreEnquiryResponse.getContactIndividualData().getWorkNumber().getCustomerWorkPhoneDialingCode()) ? coreEnquiryResponse.getContactIndividualData().getWorkNumber().getCustomerWorkPhoneDialingCode() : null);
            cis1358FaxNumber.setCustomerFaxphoneNumber(Objects.nonNull(coreEnquiryResponse.getContactIndividualData().getFaxNumber().getCustomerFaxPhoneNumber()) ? coreEnquiryResponse.getContactIndividualData().getFaxNumber().getCustomerFaxPhoneNumber() : null);
            cis1358FaxNumber.setCustomerFaxphoneDiallingCode(Objects.nonNull(coreEnquiryResponse.getContactIndividualData().getFaxNumber().getCustomerFaxPhoneNumber()) ? coreEnquiryResponse.getContactIndividualData().getFaxNumber().getCustomerFaxPhoneDialingCode() : null);
            cis1358ContactIndividualData.setHomeNumber(cis1358HomeNumber);
            cis1358ContactIndividualData.setWorkNumber(cis1358WorkNumber);
            cis1358ContactIndividualData.setFaxNumber(cis1358FaxNumber);

        }
        //ContactCommercialData
        if (Objects.nonNull(coreEnquiryResponse.getContactCommercialData())) {
            Cis1358BusinessFaxNumber cis1358BusinessFaxNumber = new Cis1358BusinessFaxNumber();
            if (Objects.nonNull(coreEnquiryResponse.getContactCommercialData().getContactFaxNumber())) {
                cis1358BusinessFaxNumber.setCustomerBusinessphoneNumber(Objects.nonNull(coreEnquiryResponse.getContactCommercialData().getContactFaxNumber().getCustomerContactFaxNumber()) ? coreEnquiryResponse.getContactCommercialData().getContactFaxNumber().getCustomerContactFaxNumber() : null);
                cis1358BusinessFaxNumber.setCustomerBusinessphoneDiallingCode(Objects.nonNull(coreEnquiryResponse.getContactCommercialData().getContactFaxNumber().getCustomerContactFaxDialingCode()) ? coreEnquiryResponse.getContactCommercialData().getContactFaxNumber().getCustomerContactFaxDialingCode() : null);
            }

            cis1358ContactCommercialData.setCustomerContactName(Objects.nonNull(coreEnquiryResponse.getContactCommercialData().getCustomerContactName()) ? coreEnquiryResponse.getContactCommercialData().getCustomerContactName() : null);
            cis1358ContactCommercialData.setCustomerContactTitle(Objects.nonNull(coreEnquiryResponse.getContactCommercialData().getCustomerContactTitle()) ? coreEnquiryResponse.getContactCommercialData().getCustomerContactTitle() : null);
            // cis1358ContactCommercialData.setBusinessPhoneNumber(cis1358BusinessPhoneNumber);
            cis1358ContactCommercialData.setBusinessFaxNumber(cis1358BusinessFaxNumber);
        }

        //QualificationEmployerDetails
        //employment
        if (Objects.nonNull(individual.getEmployments())) {
            List<Employment> employments = individual.getEmployments().stream().filter(employment -> ((StringUtils.isEmpty(employment.getPrimaryEmploymentIndicator()) || employment.getPrimaryEmploymentIndicator().equalsIgnoreCase(YES)) && (StringUtils.isEmpty(employment.getEmploymentActiveIndicator()) || employment.getEmploymentActiveIndicator().equalsIgnoreCase(YES)))).collect(Collectors.toList());
            employments.stream().forEach(employment -> {
                cis1358QualificationEmployerDetails.setCustomerEmployerName(StringUtils.isNotEmpty(employment.getEmployerName()) ? employment.getEmployerName() : EMPTYSTR);
                if (Objects.nonNull(employment.getEmploymentStartDate()) && !employment.getEmploymentStartDate().isEmpty()) {
                    cis1358QualificationEmployerDetails.setCustomerPeriodEmployed(Integer.valueOf(employment.getEmploymentStartDate()));
                } else {
                    cis1358QualificationEmployerDetails.setCustomerPeriodEmployed(Objects.nonNull(coreEnquiryResponse.getQualificationEmployerDetails().getCustomerPeriodEmployed()) ? coreEnquiryResponse.getQualificationEmployerDetails().getCustomerPeriodEmployed() : null);
                }

            });
        } else {
            cis1358QualificationEmployerDetails.setCustomerPeriodEmployed(Objects.nonNull(coreEnquiryResponse.getQualificationEmployerDetails().getCustomerPeriodEmployed()) ? coreEnquiryResponse.getQualificationEmployerDetails().getCustomerPeriodEmployed() : null);
        }

        //education
        if (Objects.nonNull(individual.getEducations())) {

            List<Education> educations = individual.getEducations().stream().filter(education -> (StringUtils.isEmpty(education.getEducationActiveIndicator()) || education.getEducationActiveIndicator().equalsIgnoreCase(YES))).collect(Collectors.toList());
            educations.stream().forEach(education -> {
                cis1358QualificationEmployerDetails.setCustomerHighestQualification(StringUtils.isNotEmpty(education.getHighestQualificationEntpsTypeCode()) ? education.getHighestQualificationEntpsTypeCode() : EMPTYSTR);
                cis1358QualificationEmployerDetails.setCustomerDateQualified(Objects.nonNull(education.getQualificationDate()) ? Integer.valueOf(education.getQualificationDate()) : INTEGER_ZERO);
                cis1358QualificationEmployerDetails.setCustomerQualificationSpecialty(StringUtils.isNotEmpty(education.getQualificationSpecialityEntpsTypeCode()) ? education.getQualificationSpecialityEntpsTypeCode() : EMPTYSTR);
                cis1358QualificationEmployerDetails.setCustomerProofOfDegree(StringUtils.isNotEmpty(education.getQualificationProofIndicator()) ? education.getQualificationProofIndicator() : EMPTYSTR);

            });
        }
        if (Objects.nonNull(coreEnquiryResponse.getQualificationEmployerDetails())) {
            cis1358QualificationEmployerDetails.setCustomerQualificationDuration(Objects.nonNull(coreEnquiryResponse.getQualificationEmployerDetails().getCustomerQualificationDuration()) ? coreEnquiryResponse.getQualificationEmployerDetails().getCustomerQualificationDuration() : null);
        }

        //marketingCommonData
        if (Objects.nonNull(coreEnquiryResponse.getMarketingCommonData())) {
            cis1358MarketingCommonData.setCustomerFNBMarketingConsent(Objects.nonNull(coreEnquiryResponse.getMarketingCommonData().getCustomerFNBMarketingConsent()) ? coreEnquiryResponse.getMarketingCommonData().getCustomerFNBMarketingConsent() : null);
            cis1358MarketingCommonData.setCustomerFRBMarketingConsent(Objects.nonNull(coreEnquiryResponse.getMarketingCommonData().getCustomerFRBMarketingConsent()) ? coreEnquiryResponse.getMarketingCommonData().getCustomerFRBMarketingConsent() : null);
            cis1358MarketingCommonData.setCustomerThirdPartyConsent(Objects.nonNull(coreEnquiryResponse.getMarketingCommonData().getCustomerThirdPartyConsent()) ? coreEnquiryResponse.getMarketingCommonData().getCustomerThirdPartyConsent() : null);
            cis1358MarketingCommonData.setCustomerMarketingViaCell(Objects.nonNull(coreEnquiryResponse.getMarketingCommonData().getCustomerMarketingViaCell()) ? coreEnquiryResponse.getMarketingCommonData().getCustomerMarketingViaCell() : null);
            cis1358MarketingCommonData.setCustomerMarketingViaPhone(Objects.nonNull(coreEnquiryResponse.getMarketingCommonData().getCustomerMarketingViaPhone()) ? coreEnquiryResponse.getMarketingCommonData().getCustomerMarketingViaPhone() : null);
            cis1358MarketingCommonData.setCustomerMarketingViaSMS(Objects.nonNull(coreEnquiryResponse.getMarketingCommonData().getCustomerMarketingViaSMS()) ? coreEnquiryResponse.getMarketingCommonData().getCustomerMarketingViaSMS() : null);
            cis1358MarketingCommonData.setCustomerMarketingViaEmail(Objects.nonNull(coreEnquiryResponse.getMarketingCommonData().getCustomerMarketingViaEmail()) ? coreEnquiryResponse.getMarketingCommonData().getCustomerMarketingViaEmail() : null);
            cis1358MarketingCommonData.setCustomerMarketingViaPost(Objects.nonNull(coreEnquiryResponse.getMarketingCommonData().getCustomerMarketingViaPost()) ? coreEnquiryResponse.getMarketingCommonData().getCustomerMarketingViaPost() : null);
        }

        //segmentationCommonData
        if (Objects.nonNull(coreEnquiryResponse.getDemographicCommonData())) {
            cis1358SegmentationCommonData.setCustomerPrimarySegmentation(Objects.nonNull(coreEnquiryResponse.getDemographicCommonData().getCustomerPrimarySegmentation()) ? coreEnquiryResponse.getDemographicCommonData().getCustomerPrimarySegmentation() : null);
            cis1358SegmentationCommonData.setCustomerSecondarySegmentation(Objects.nonNull(coreEnquiryResponse.getDemographicCommonData().getCustomerSecondarySegmentation()) ? coreEnquiryResponse.getDemographicCommonData().getCustomerPrimarySegmentation() : null);
        }


        //Input data
        Cis1358InputData cis1358InputData = new Cis1358InputData();
        cis1358InputData.setCustomerNumber(ucn);
        cis1358InputData.setCustomerCompanyId(Integer.valueOf(jurisdictionCountryEntpsCode));
        cis1358InputData.setCustomerEchoToken(Objects.nonNull(coreEnquiryResponseWrapper.getData()) ? coreEnquiryResponseWrapper.getData().getCustomerEchoToken() : null);
        cis1358FunctionRequest.setInputData(cis1358InputData);
        cis1358FunctionRequest.setDemographicCommonData(demographicCommonData);
        cis1358FunctionRequest.setDemographicIndividualData(cis1358DemoIndvllData);
        cis1358FunctionRequest.setDemographicCommercialData(cis1358DemoCommerclData);
        cis1358FunctionRequest.setContactCommonData(cis1358ContactCommonData);
        cis1358FunctionRequest.setContactIndividualData(cis1358ContactIndividualData);
        cis1358FunctionRequest.setContactCommercialData(cis1358ContactCommercialData);
        cis1358FunctionRequest.setResidentialAddressData(residentialAddressData);
        cis1358FunctionRequest.setMailingAddressData(mailingAddressData);
        cis1358FunctionRequest.setQualificationEmployerDetails(cis1358QualificationEmployerDetails);
        cis1358FunctionRequest.setMarketingCommonData(cis1358MarketingCommonData);
        cis1358FunctionRequest.setSegmentationCommonData(cis1358SegmentationCommonData);


        return cis1358FunctionRequest;
    }

    private String getTaxRef(List<Identification> idList) {
        List<Identification> taxRefList = new ArrayList<Identification>();
        taxRefList = idList.stream().filter(obj -> (StringUtils.isEmpty(obj.getIdentificationActiveIndicator()) || obj.getIdentificationActiveIndicator().equalsIgnoreCase(YES)) && StringUtils.isNotEmpty(obj.getIdentificationEntpsTypeCode()) && obj.getIdentificationEntpsTypeCode().equalsIgnoreCase(TAXREF)).findFirst().stream().toList();
        taxRefList = taxRefList.size() <= 0 ? (idList.stream().filter(obj -> (StringUtils.isEmpty(obj.getIdentificationActiveIndicator()) || obj.getIdentificationActiveIndicator().equalsIgnoreCase(YES)) && StringUtils.isNotEmpty(obj.getIdentificationEntpsTypeCode()) && obj.getIdentificationEntpsTypeCode().equalsIgnoreCase(TIN)).findFirst().stream().toList()) : taxRefList;
        return taxRefList.size() > 0 ? (taxRefList.stream().filter(obj -> StringUtils.isNotEmpty(obj.getIdentificationNumber())).findFirst().get().getIdentificationNumber()) : EMPTYSTR;
    }

    private String getVat(List<Identification> idList) {
        String vatRg = null;
        vatRg = idList.stream().filter(obj -> (StringUtils.isNotEmpty(obj.getIdentificationActiveIndicator()) || obj.getIdentificationActiveIndicator().equalsIgnoreCase(YES)) && StringUtils.isNotEmpty(obj.getIdentificationEntpsTypeCode()) && obj.getIdentificationEntpsTypeCode().equalsIgnoreCase(VATREG)).map(obj -> obj.getIdentificationNumber()).filter(id -> StringUtils.isNotEmpty(id)).findFirst().orElse(EMPTYSTR);
        return StringUtils.isNotEmpty(vatRg) ? vatRg : EMPTYSTR;
    }

    private List organisationName(String partyName) {

        List name = null;
        int length = 0;
        if (StringUtils.isNotEmpty(partyName) && partyName.length() > 40) {
            name = new ArrayList<>();
            length = partyName.length();
            name.add(0, partyName.substring(0, 39));
            String nameTwo = partyName.substring(40, length);
            name.add(1, nameTwo.length() > 40 ? nameTwo.substring(0, 39) : nameTwo);
        } else if (StringUtils.isNotEmpty(partyName) && partyName.length() <= 40) {
            name = new ArrayList<>();
            length = partyName.length();
            name.add(0, partyName.substring(0, length));
            name.add(1, "");
        }
        return name;
    }

    private Map<String, String> individualName(List<IdentificationName> identificationName, Party party, CoreEnquiryResponse coreEnquiryResponse) {

        String firstName = null;
        String middleName = null;
        String surName = null;
        String deriveInitial = null;
        CoreEnquireNameSplitData cis1362NameSplitData = coreEnquiryResponse.getDemographicIndividualData().getNameSplitData();
        Map<String, String> partyname = new HashMap<>();
        firstName = identificationName.stream().filter(i -> i.getIdentificationNameAttributeName().equalsIgnoreCase("firstName")).map(i -> i.getIdentificationNameValue()).filter(x -> x != null).findFirst().orElse(EMPTYSTR);
        middleName = identificationName.stream().filter(i -> i.getIdentificationNameAttributeName().equalsIgnoreCase("middleNames")).map(i -> i.getIdentificationNameValue()).filter(a -> a != null).collect(Collectors.joining(SPACE));
        surName = identificationName.stream().filter(i -> i.getIdentificationNameAttributeName().equalsIgnoreCase("surName")).map(i -> i.getIdentificationNameValue()).filter(x -> x != null).findFirst().orElse(EMPTYSTR);
        List<String> initial = Arrays.stream(middleName.replaceAll(REGIX, SPACE).split(SPACE)).toList();
        deriveInitial = (initial.stream().filter(i -> i.length() > 0).map(i -> i.charAt(0) + SPACE).collect(Collectors.joining()));

        String title = (StringUtils.isNotEmpty(party.getIndividual().getTitleEntpsTypeCode()) && !NEGATIVE_LIST.contains(party.getIndividual().getTitleEntpsTypeCode())) ? party.getIndividual().getTitleEntpsTypeCode() : StringUtils.isNotEmpty(cis1362NameSplitData.getCustomerNameTitle()) ? cis1362NameSplitData.getCustomerNameTitle() : EMPTYSTR;
        //   checkNname(title,firstName,middleName,surName,deriveInitial);
        //String nameOne = StringUtils.isNotEmpty((title + SPACE + firstName + SPACE + deriveInitial + SPACE + surName)) ? ((title + SPACE + firstName + SPACE + deriveInitial + SPACE + surName).length() > 40 ? (title + SPACE + firstName + SPACE + deriveInitial + SPACE + surName).substring(0, 39) : (title + SPACE + firstName + SPACE + deriveInitial + SPACE + surName)) : "";
        String nameOne = StringUtils.isNotEmpty((title + SPACE + firstName + SPACE + deriveInitial + SPACE + surName)) && !(((firstName != null) ? firstName : "") + SPACE + ((deriveInitial != null) ? deriveInitial : EMPTYSTR) + SPACE + ((surName != null) ? surName : EMPTYSTR)).isBlank() ? ((title + SPACE + firstName + SPACE + deriveInitial + SPACE + surName).length() > 40 ? (title + SPACE + firstName + SPACE + deriveInitial + SPACE + surName).substring(0, 39) : (title + SPACE + firstName + SPACE + deriveInitial + SPACE + surName)) : EMPTYSTR;
        String nameTwo = StringUtils.isNotEmpty("" + middleName) ? (middleName.length() > 40 ? middleName.substring(0, 39) : middleName) : "";

        partyname.put("nameOne", nameOne.length() > 0 ? nameOne.trim() : nameOne);
        partyname.put("nameTwo", nameTwo.length() > 0 ? nameTwo.trim() : nameTwo);

        return partyname;


    }


}