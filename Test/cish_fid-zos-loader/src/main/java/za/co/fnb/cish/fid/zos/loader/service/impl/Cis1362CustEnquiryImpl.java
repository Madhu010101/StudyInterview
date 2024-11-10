package za.co.fnb.cish.fid.zos.loader.service.impl;

import org.springframework.stereotype.Component;
import za.co.fnb.cish.fid.common.api.cis1362.cis1362input.*;
import za.co.fnb.cish.fid.common.api.cis1362.cis1362output.*;
import za.co.fnb.cish.fid.common.api.fidmaster.FirstIdMasterEntity;
import za.co.fnb.cish.fid.zos.loader.util.Constants;

import java.util.ArrayList;
import java.util.List;

@Component
public class Cis1362CustEnquiryImpl {

    public Cis1362fZosFunctionRequest getCis1362fZosFunctionRequest(FirstIdMasterEntity firstIdMasterEntity, String jurisdictionCountryEntpsCode, Long ucn) {
        Cis1362fZosFunctionRequest cis1362fZosFunctionRequest = new Cis1362fZosFunctionRequest();
        Cis1362fReplyOptions cis1362fReplyOptions = new Cis1362fReplyOptions();

        cis1362fReplyOptions.setGetCustomerAddressData(Constants.YES);
        cis1362fReplyOptions.setGetCustomerBankRelationshipData(Constants.YES);
        cis1362fReplyOptions.setGetCustomerBankServicesData(Constants.YES);
        cis1362fReplyOptions.setGetCustomerContactData(Constants.YES);
        cis1362fReplyOptions.setGetCustomerDemographicData(Constants.YES);
        cis1362fReplyOptions.setGetCustomerEducationData(Constants.YES);
        cis1362fReplyOptions.setGetCustomerIdNumberData(Constants.YES);
        cis1362fReplyOptions.setGetCustomerMarketingConsentData(Constants.YES);

        Cis1362fUcnKey cis1362fUcnKey = new Cis1362fUcnKey();
        cis1362fUcnKey.setCustomerNumber(ucn);
        cis1362fUcnKey.setCustomerCompanyId(Integer.valueOf(jurisdictionCountryEntpsCode));
        // cis1362fUcnKey.setCustomerNumber(150L);
        Cis1362fSearchKeyOption cis1362fSearchKeyOption = new Cis1362fSearchKeyOption();
        cis1362fSearchKeyOption.setUcnKey(cis1362fUcnKey);
        cis1362fZosFunctionRequest.setReplyOptions(cis1362fReplyOptions);
        cis1362fZosFunctionRequest.setSearchKeyOption(cis1362fSearchKeyOption);
        return cis1362fZosFunctionRequest;
    }


    public CoreEnquiryResponse buildCoreEnquireResponse(Cis1362rZosPayloadResponse cis1362rZosPayloadResponse) {
        CoreEnquiryResponse coreEnquiryResponse = new CoreEnquiryResponse();

        CoreEnquireGeneralData coreEnquireGeneralData = new CoreEnquireGeneralData();
        coreEnquireGeneralData.setCustomerCompanyID(cis1362rZosPayloadResponse.getGeneralData().getCustomerCompanyId());
        coreEnquireGeneralData.setCustomerOldUCN(cis1362rZosPayloadResponse.getGeneralData().getCustomerOldNumber());
        coreEnquireGeneralData.setCustomerOldUCNCompanyID(cis1362rZosPayloadResponse.getGeneralData().getCustomerOldCompanyId());
        coreEnquireGeneralData.setCustomerUCN(cis1362rZosPayloadResponse.getGeneralData().getCustomerNumber());

        CoreEnquireDemographicCommonData coreEnquireDemographicCommonData = new CoreEnquireDemographicCommonData();
        coreEnquireDemographicCommonData.setCorrespondenceLanguage(cis1362rZosPayloadResponse.getDemographicCommonData().getCorrespondenceLanguage());
        coreEnquireDemographicCommonData.setCustomerBranch(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerBranch());
        coreEnquireDemographicCommonData.setCustomerClientCustomerNumber(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerClientCustomerNumber());
        coreEnquireDemographicCommonData.setCustomerCUACToken(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerCUACToken());
        coreEnquireDemographicCommonData.setCustomerDateClosed(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerDateClosed());
        coreEnquireDemographicCommonData.setCustomerDateOpened(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerDateOpened());
        coreEnquireDemographicCommonData.setCustomerLastDateMaintain(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerLastDateMaintain());
        coreEnquireDemographicCommonData.setCustomerMainBankIndicator(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerMainBankIndicator());
        coreEnquireDemographicCommonData.setCustomerName(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerName());
        coreEnquireDemographicCommonData.setCustomerName2(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerName2());
        coreEnquireDemographicCommonData.setCustomerPrimaryIdentityCountryIssued(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerPrimaryIdentityCountryIssued());
        coreEnquireDemographicCommonData.setCustomerPrimaryIdentityEffectiveDate(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerPrimaryIdentityEffectiveDate());
        coreEnquireDemographicCommonData.setCustomerPrimaryIdentityExpiryDate(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerPrimaryIdentityExpiryDate());
        coreEnquireDemographicCommonData.setCustomerPrimaryIdentityNumber(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerPrimaryIdentityNumber());
        coreEnquireDemographicCommonData.setCustomerPrimaryIdentityType(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerPrimaryIdentityType());
        coreEnquireDemographicCommonData.setCustomerPrimarySegmentation(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerPrimarySegmentation());
        coreEnquireDemographicCommonData.setCustomerRiskIndicator(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerRiskIndicator());
        coreEnquireDemographicCommonData.setCustomerRiskReason(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerRiskReason());
        coreEnquireDemographicCommonData.setCustomerSecondarySegmentation(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerSecondarySegmentation());
        coreEnquireDemographicCommonData.setCustomerSensitiveFlag(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerSensitiveFlag());
        coreEnquireDemographicCommonData.setCustomerStatus(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerStatus());
        coreEnquireDemographicCommonData.setCustomerTaxReference(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerTaxReference());
        coreEnquireDemographicCommonData.setCustomerType(cis1362rZosPayloadResponse.getDemographicCommonData().getCustomerType());
        coreEnquireDemographicCommonData.setOfficerCodePrimary(cis1362rZosPayloadResponse.getDemographicCommonData().getOfficerCodePrimary());
        coreEnquireDemographicCommonData.setOfficerCodeSecondary(cis1362rZosPayloadResponse.getDemographicCommonData().getOfficerCodeSecondary());

        CoreEnquireNameSplitData coreEnquireNameSplitData = new CoreEnquireNameSplitData();
        coreEnquireNameSplitData.setCustomerNameFirst(cis1362rZosPayloadResponse.getDemographicIndividualData().getNameSplitData().getCustomerNameFirst());
        coreEnquireNameSplitData.setCustomerNameLast(cis1362rZosPayloadResponse.getDemographicIndividualData().getNameSplitData().getCustomerNameLast());
        coreEnquireNameSplitData.setCustomerNameMiddleFifth(cis1362rZosPayloadResponse.getDemographicIndividualData().getNameSplitData().getCustomerNameMiddleFifth());
        coreEnquireNameSplitData.setCustomerNameMiddleFirst(cis1362rZosPayloadResponse.getDemographicIndividualData().getNameSplitData().getCustomerNameMiddleFirst());
        coreEnquireNameSplitData.setCustomerNameMiddleFourth(cis1362rZosPayloadResponse.getDemographicIndividualData().getNameSplitData().getCustomerNameMiddleFourth());
        coreEnquireNameSplitData.setCustomerNameMiddleSecond(cis1362rZosPayloadResponse.getDemographicIndividualData().getNameSplitData().getCustomerNameMiddleSecond());
        coreEnquireNameSplitData.setCustomerNameMiddleThird(cis1362rZosPayloadResponse.getDemographicIndividualData().getNameSplitData().getCustomerNameMiddleThird());
        coreEnquireNameSplitData.setCustomerNameTitle(cis1362rZosPayloadResponse.getDemographicIndividualData().getNameSplitData().getCustomerNameTitle());

        CoreEnquireDemographicIndividualData coreEnquireDemographicIndividualData = new CoreEnquireDemographicIndividualData();
        coreEnquireDemographicIndividualData.setNameSplitData(coreEnquireNameSplitData);
        coreEnquireDemographicIndividualData.setCustomerAge(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerAge());
        coreEnquireDemographicIndividualData.setCustomerAnnualIncome(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerAnnualIncome());
        coreEnquireDemographicIndividualData.setCustomerAnnualIncomeCurrency(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerAnnualIncomeCurrency());
        coreEnquireDemographicIndividualData.setCustomerCountryOfBirth(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerCountryOfBirth());
        coreEnquireDemographicIndividualData.setCustomerCountryOfCitizenship(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerCountryOfCitizenship());
        coreEnquireDemographicIndividualData.setCustomerCountryOfNationality(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerCountryOfNationality());
        coreEnquireDemographicIndividualData.setCustomerCountryOfPermanentResidence(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerCountryOfPermanentResidence());
        coreEnquireDemographicIndividualData.setCustomerDateDeceased(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerDateDeceased());
        coreEnquireDemographicIndividualData.setCustomerGender(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerGender());
        coreEnquireDemographicIndividualData.setCustomerGroupScheme(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerGroupScheme());
        coreEnquireDemographicIndividualData.setCustomerMaritalConsent(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerMaritalConsent());
        coreEnquireDemographicIndividualData.setCustomerMaritalContract(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerMaritalContract());
        coreEnquireDemographicIndividualData.setCustomerMaritalStatus(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerMaritalStatus());
        coreEnquireDemographicIndividualData.setCustomerNumberOfDependants(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerNumberOfDependants());
        coreEnquireDemographicIndividualData.setCustomerOccupationCode(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerOccupationCode());
        coreEnquireDemographicIndividualData.setCustomerPropertyBonded(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerPropertyBonded());
        coreEnquireDemographicIndividualData.setCustomerPropertyOwnership(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerPropertyOwnership());
        coreEnquireDemographicIndividualData.setCustomerRace(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerRace());
        coreEnquireDemographicIndividualData.setCustomerResidencyStatus(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerResidencyStatus());
        coreEnquireDemographicIndividualData.setCustomerVIPCategory(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerVIPCategory());
        coreEnquireDemographicIndividualData.setCustomerVIPDescription(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerVIPDescription());
        coreEnquireDemographicIndividualData.setCustomerVIPIndicator(cis1362rZosPayloadResponse.getDemographicIndividualData().getCustomerVIPIndicator());
        coreEnquireDemographicIndividualData.setDateOfBirth(cis1362rZosPayloadResponse.getDemographicIndividualData().getDateOfBirth());

        CoreEnquireDemographicCommercialData coreEnquireDemographicCommercialData = new CoreEnquireDemographicCommercialData();
        coreEnquireDemographicCommercialData.setCustomerCIBIndicator(cis1362rZosPayloadResponse.getDemographicCommercialData().getCustomerCIBIndicator());
        coreEnquireDemographicCommercialData.setCustomerCountryEstablished(cis1362rZosPayloadResponse.getDemographicCommercialData().getCustomerCountryEstablished());
        coreEnquireDemographicCommercialData.setCustomerCountryHeadOffice(cis1362rZosPayloadResponse.getDemographicCommercialData().getCustomerCountryHeadOffice());
        coreEnquireDemographicCommercialData.setCustomerCountryOfOperation(cis1362rZosPayloadResponse.getDemographicCommercialData().getCustomerCountryOfOperation());
        coreEnquireDemographicCommercialData.setCustomerDateEstablished(cis1362rZosPayloadResponse.getDemographicCommercialData().getCustomerDateEstablished());
        coreEnquireDemographicCommercialData.setCustomerDateOfOperations(cis1362rZosPayloadResponse.getDemographicCommercialData().getCustomerDateOfOperations());
        coreEnquireDemographicCommercialData.setCustomerNumberOfEmployees(cis1362rZosPayloadResponse.getDemographicCommercialData().getCustomerNumberOfEmployees());
        coreEnquireDemographicCommercialData.setCustomerNumberOfSignatories(cis1362rZosPayloadResponse.getDemographicCommercialData().getCustomerNumberOfSignatories());
        coreEnquireDemographicCommercialData.setCustomerSingleMemberEntity(cis1362rZosPayloadResponse.getDemographicCommercialData().getCustomerSingleMemberEntity());
        coreEnquireDemographicCommercialData.setCustomerStateOwnedCompany(cis1362rZosPayloadResponse.getDemographicCommercialData().getCustomerStateOwnedCompany());
        coreEnquireDemographicCommercialData.setCustomerTaxYearEnd(cis1362rZosPayloadResponse.getDemographicCommercialData().getCustomerTaxYearEnd());
        coreEnquireDemographicCommercialData.setCustomerTradingAsName(cis1362rZosPayloadResponse.getDemographicCommercialData().getCustomerTradingAsName());
        coreEnquireDemographicCommercialData.setCustomerTurnoverAmount(cis1362rZosPayloadResponse.getDemographicCommercialData().getCustomerTurnoverAmount());
        coreEnquireDemographicCommercialData.setCustomerTurnoverCode(cis1362rZosPayloadResponse.getDemographicCommercialData().getCustomerTurnoverCode());
        coreEnquireDemographicCommercialData.setCustomerTurnoverCurrency(cis1362rZosPayloadResponse.getDemographicCommercialData().getCustomerTurnoverCurrency());

        CoreEnquireCellphoneNumber coreEnquireCellphoneNumber = new CoreEnquireCellphoneNumber();
        coreEnquireCellphoneNumber.setCustomerCellPhoneDialingCode(cis1362rZosPayloadResponse.getContactCommonData().getCellphoneNumber().getCustomerCellphoneDialingCode());
        coreEnquireCellphoneNumber.setCustomerCellPhoneNumber(cis1362rZosPayloadResponse.getContactCommonData().getCellphoneNumber().getCustomerCellphoneNumber());

        CoreEnquireContactCommonData coreEnquireContactCommonData = new CoreEnquireContactCommonData();
        coreEnquireContactCommonData.setCustomerEmailAddress(cis1362rZosPayloadResponse.getContactCommonData().getCustomerEmailAddress());
        coreEnquireContactCommonData.setCellphoneNumber(coreEnquireCellphoneNumber);

        CoreEnquireHomeNumber coreEnquireHomeNumber = new CoreEnquireHomeNumber();
        coreEnquireHomeNumber.setCustomerHomePhoneDialingCode(cis1362rZosPayloadResponse.getContactIndividualData().getHomeNumber().getCustomerHomephoneDialingCode());
        coreEnquireHomeNumber.setCustomerHomePhoneNumber(cis1362rZosPayloadResponse.getContactIndividualData().getHomeNumber().getCustomerHomephoneNumber());

        CoreEnquireWorkNumber coreEnquireWorkNumber = new CoreEnquireWorkNumber();
        coreEnquireWorkNumber.setCustomerWorkPhoneDialingCode(cis1362rZosPayloadResponse.getContactIndividualData().getWorkNumber().getCustomerWorkphoneDialingCode());
        coreEnquireWorkNumber.setCustomerWorkPhoneNumber(cis1362rZosPayloadResponse.getContactIndividualData().getWorkNumber().getCustomerWorkphoneNumber());

        CoreEnquireFaxNumber coreEnquireFaxNumber = new CoreEnquireFaxNumber();
        coreEnquireFaxNumber.setCustomerFaxPhoneDialingCode(cis1362rZosPayloadResponse.getContactIndividualData().getFaxNumber().getCustomerFaxphoneDialingCode());
        coreEnquireFaxNumber.setCustomerFaxPhoneNumber(cis1362rZosPayloadResponse.getContactIndividualData().getFaxNumber().getCustomerFaxphoneNumber());

        CoreEnquirecContactIndividualData coreEnquirecContactIndividualData = new CoreEnquirecContactIndividualData();
        coreEnquirecContactIndividualData.setCustomerPreferredMethodOfContact(cis1362rZosPayloadResponse.getContactIndividualData().getCustomerPreferredMethodOfContact());
        coreEnquirecContactIndividualData.setHomeNumber(coreEnquireHomeNumber);
        coreEnquirecContactIndividualData.setWorkNumber(coreEnquireWorkNumber);
        coreEnquirecContactIndividualData.setFaxNumber(coreEnquireFaxNumber);

        CoreEnquireContactPhoneNumber coreEnquireContactPhoneNumber = new CoreEnquireContactPhoneNumber();
        coreEnquireContactPhoneNumber.setCustomerContactPhoneDialingCode(cis1362rZosPayloadResponse.getContactCommercialData().getContactPhoneNumber().getCustomerContactphoneDialingCode());
        coreEnquireContactPhoneNumber.setCustomerContactPhoneNumber(cis1362rZosPayloadResponse.getContactCommercialData().getContactPhoneNumber().getCustomerContactphoneNumber());

        CoreEnquireContactFaxNumber coreEnquireContactFaxNumber = new CoreEnquireContactFaxNumber();
        coreEnquireContactFaxNumber.setCustomerContactFaxDialingCode(cis1362rZosPayloadResponse.getContactCommercialData().getContactFaxNumber().getCustomerContactFaxDialingCode());
        coreEnquireContactFaxNumber.setCustomerContactFaxNumber(cis1362rZosPayloadResponse.getContactCommercialData().getContactFaxNumber().getCustomerContactFaxNumber());

        CoreEnquireContactCommercialData coreEnquireContactCommercialData = new CoreEnquireContactCommercialData();
        coreEnquireContactCommercialData.setCustomerContactName(cis1362rZosPayloadResponse.getContactCommercialData().getCustomerContactName());
        coreEnquireContactCommercialData.setCustomerContactTitle(cis1362rZosPayloadResponse.getContactCommercialData().getCustomerContactTitle());
        coreEnquireContactCommercialData.setContactPhoneNumber(coreEnquireContactPhoneNumber);
        coreEnquireContactCommercialData.setContactFaxNumber(coreEnquireContactFaxNumber);

        CoreEnquireResidentialAddressData coreEnquireResidentialAddressData = new CoreEnquireResidentialAddressData();
        coreEnquireResidentialAddressData.setResidentialAddressCareOfLine(cis1362rZosPayloadResponse.getResidentialAddressData().getResidentialAddressCareOfLine());
        coreEnquireResidentialAddressData.setResidentialAddressCity(cis1362rZosPayloadResponse.getResidentialAddressData().getResidentialAddressCity());
        coreEnquireResidentialAddressData.setResidentialAddressCountryCode(cis1362rZosPayloadResponse.getResidentialAddressData().getResidentialAddressCountryCode());
        coreEnquireResidentialAddressData.setResidentialAddressState(cis1362rZosPayloadResponse.getResidentialAddressData().getResidentialAddressState());
        coreEnquireResidentialAddressData.setResidentialAddressStreetLine1(cis1362rZosPayloadResponse.getResidentialAddressData().getResidentialAddressStreetLine1());
        coreEnquireResidentialAddressData.setResidentialAddressStreetLine2(cis1362rZosPayloadResponse.getResidentialAddressData().getResidentialAddressStreetLine2());
        coreEnquireResidentialAddressData.setResidentialAddressZipCode(cis1362rZosPayloadResponse.getResidentialAddressData().getResidentialAddressZipCode());

        CoreEnquireMailingAddressData coreEnquireMailingAddressData = new CoreEnquireMailingAddressData();
        coreEnquireMailingAddressData.setMailingAddressCareOfLine(cis1362rZosPayloadResponse.getMailingAddressData().getMailingAddressCareOfLine());
        coreEnquireMailingAddressData.setMailingAddressCity(cis1362rZosPayloadResponse.getMailingAddressData().getMailingAddressCity());
        coreEnquireMailingAddressData.setMailingAddressCountryCode(cis1362rZosPayloadResponse.getMailingAddressData().getMailingAddressCountryCode());
        coreEnquireMailingAddressData.setMailingAddressState(cis1362rZosPayloadResponse.getMailingAddressData().getMailingAddressState());
        coreEnquireMailingAddressData.setMailingAddressStreetLine1(cis1362rZosPayloadResponse.getMailingAddressData().getMailingAddressStreetLine1());
        coreEnquireMailingAddressData.setMailingAddressStreetLine2(cis1362rZosPayloadResponse.getMailingAddressData().getMailingAddressStreetLine2());
        coreEnquireMailingAddressData.setMailingAddressZipCode(cis1362rZosPayloadResponse.getMailingAddressData().getMailingAddressZipCode());

        CoreEnquireQualificationEmployerDetails coreEnquireQualificationEmployerDetails = new CoreEnquireQualificationEmployerDetails();
        coreEnquireQualificationEmployerDetails.setCustomerDateQualified(cis1362rZosPayloadResponse.getQualificationEmployerDetails().getCustomerDateQualified());
        coreEnquireQualificationEmployerDetails.setCustomerEmployerName(cis1362rZosPayloadResponse.getQualificationEmployerDetails().getCustomerEmployerName());
        coreEnquireQualificationEmployerDetails.setCustomerHighestQualification(cis1362rZosPayloadResponse.getQualificationEmployerDetails().getCustomerHighestQualification());
        coreEnquireQualificationEmployerDetails.setCustomerPeriodEmployed(cis1362rZosPayloadResponse.getQualificationEmployerDetails().getCustomerPeriodEmployed());
        coreEnquireQualificationEmployerDetails.setCustomerProofOfDegree(cis1362rZosPayloadResponse.getQualificationEmployerDetails().getCustomerProofOfDegree());
        coreEnquireQualificationEmployerDetails.setCustomerQualificationDuration(cis1362rZosPayloadResponse.getQualificationEmployerDetails().getCustomerQualificationDuration());
        coreEnquireQualificationEmployerDetails.setCustomerQualificationSpeciality(cis1362rZosPayloadResponse.getQualificationEmployerDetails().getCustomerQualificationSpeciality());
        coreEnquireQualificationEmployerDetails.setCustomerStaffIndicator(cis1362rZosPayloadResponse.getQualificationEmployerDetails().getCustomerStaffIndicator());
        coreEnquireQualificationEmployerDetails.setCustomerStaffNumber(cis1362rZosPayloadResponse.getQualificationEmployerDetails().getCustomerStaffNumber());

        CoreEnquireMarketingCommonData coreEnquireMarketingCommonData = new CoreEnquireMarketingCommonData();
        coreEnquireMarketingCommonData.setCustomerFNBMarketingConsent(cis1362rZosPayloadResponse.getMarketingCommonData().getCustomerFNBMarketingConsent());
        coreEnquireMarketingCommonData.setCustomerFRBMarketingConsent(cis1362rZosPayloadResponse.getMarketingCommonData().getCustomerFRBMarketingConsent());
        coreEnquireMarketingCommonData.setCustomerMarketingViaCell(cis1362rZosPayloadResponse.getMarketingCommonData().getCustomerMarketingViaCell());
        coreEnquireMarketingCommonData.setCustomerMarketingViaEmail(cis1362rZosPayloadResponse.getMarketingCommonData().getCustomerMarketingViaEmail());
        coreEnquireMarketingCommonData.setCustomerMarketingViaPhone(cis1362rZosPayloadResponse.getMarketingCommonData().getCustomerMarketingViaPhone());
        coreEnquireMarketingCommonData.setCustomerMarketingViaPost(cis1362rZosPayloadResponse.getMarketingCommonData().getCustomerMarketingViaPost());
        coreEnquireMarketingCommonData.setCustomerMarketingViaSMS(cis1362rZosPayloadResponse.getMarketingCommonData().getCustomerMarketingViaSMS());
        coreEnquireMarketingCommonData.setCustomerThirdPartyConsent(cis1362rZosPayloadResponse.getMarketingCommonData().getCustomerThirdPartyConsent());


        List<CoreEnquireIdentityTable> coreEnquireIdentityTableList = new ArrayList<>();
        if (cis1362rZosPayloadResponse.getIdentityDetails() != null && cis1362rZosPayloadResponse.getIdentityDetails().getIdentityTable() != null) {
            for (int i = 0; i < cis1362rZosPayloadResponse.getIdentityDetails().getIdentityTable().size(); i++) {
                CoreEnquireIdentityTable coreEnquireIdentityTable = new CoreEnquireIdentityTable();
                coreEnquireIdentityTable.setCustomerIDEffectiveDate(cis1362rZosPayloadResponse.getIdentityDetails().getIdentityTable().get(i).getCustomerIDEffectiveDate());
                coreEnquireIdentityTable.setCustomerIdentityType(cis1362rZosPayloadResponse.getIdentityDetails().getIdentityTable().get(i).getCustomerIdentityType());
                coreEnquireIdentityTable.setCustomerIDExpiryDate(cis1362rZosPayloadResponse.getIdentityDetails().getIdentityTable().get(i).getCustomerIDExpiryDate());
                coreEnquireIdentityTable.setCustomerIDIssuer(cis1362rZosPayloadResponse.getIdentityDetails().getIdentityTable().get(i).getCustomerIDIssuer());
                coreEnquireIdentityTable.setCustomerIDNumber(cis1362rZosPayloadResponse.getIdentityDetails().getIdentityTable().get(i).getCustomerIDNumber());
                coreEnquireIdentityTableList.add(coreEnquireIdentityTable);
            }
        }
        CoreEnquireIdentityDetails coreEnquireIdentityDetails = new CoreEnquireIdentityDetails();
        coreEnquireIdentityDetails.setCustomerIdentityTableCounter(coreEnquireIdentityTableList.size());
        coreEnquireIdentityDetails.setIdentityTable(coreEnquireIdentityTableList);


        List<CoreEnquireBankRelationshipTable> coreEnquireBankRelationshipTableList = new ArrayList<>();
        if (cis1362rZosPayloadResponse.getBankRelationshipData() != null && cis1362rZosPayloadResponse.getBankRelationshipData().getBankRelationshipTable() != null) {
            for (int i = 0; i < cis1362rZosPayloadResponse.getBankRelationshipData().getBankRelationshipTable().size(); i++) {
                CoreEnquireBankRelationshipTable coreEnquireBankRelationshipTable = new CoreEnquireBankRelationshipTable();
                coreEnquireBankRelationshipTable.setCustomerBankRelationship(cis1362rZosPayloadResponse.getBankRelationshipData().getBankRelationshipTable().get(i).getCustomerBankRelationship());
                coreEnquireBankRelationshipTableList.add(coreEnquireBankRelationshipTable);
            }
        }
        CoreEnquireBankRelationshipData coreEnquireBankRelationshipData = new CoreEnquireBankRelationshipData();
        coreEnquireBankRelationshipData.setCustomerNumberOfBankRelationships(coreEnquireBankRelationshipTableList.size());
        coreEnquireBankRelationshipData.setBankRelationshipTable(coreEnquireBankRelationshipTableList);

        List<CoreEnquireBankServicesTable> coreEnquireBankServicesTableList = new ArrayList<>();
        if (cis1362rZosPayloadResponse.getBankServicesData() != null && cis1362rZosPayloadResponse.getBankServicesData().getBankServicesTable() != null) {
            for (int i = 0; i < cis1362rZosPayloadResponse.getBankServicesData().getBankServicesTable().size(); i++) {
                CoreEnquireBankServicesTable coreEnquireBankServicesTable = new CoreEnquireBankServicesTable();
                coreEnquireBankServicesTable.setCustomerBankServices(cis1362rZosPayloadResponse.getBankServicesData().getBankServicesTable().get(i).getCustomerBankServices());
                coreEnquireBankServicesTableList.add(coreEnquireBankServicesTable);
            }
        }
        CoreEnquireBankServicesData coreEnquireBankServicesData = new CoreEnquireBankServicesData();
        coreEnquireBankServicesData.setCustomerNumberOfBankServices(coreEnquireBankServicesTableList.size());
        coreEnquireBankServicesData.setBankServicesTable(coreEnquireBankServicesTableList);

        List<CoreEnquireWarningTable> coreEnquireWarningTableList = new ArrayList<>();
        if (cis1362rZosPayloadResponse.getWarningTable() != null) {
            for (int count = 0; count < cis1362rZosPayloadResponse.getWarningTable().size(); count++) {
                CoreEnquireWarningTable coreEnquireWarningTable = new CoreEnquireWarningTable();
                coreEnquireWarningTable.setWarningCode(cis1362rZosPayloadResponse.getWarningTable().get(count).getWarningCode());
                coreEnquireWarningTable.setWarningMessage(cis1362rZosPayloadResponse.getWarningTable().get(count).getWarningMessage());
                coreEnquireWarningTableList.add(coreEnquireWarningTable);
            }
        }
        coreEnquiryResponse.setCustomerEchoToken(cis1362rZosPayloadResponse.getCustomerEchoToken());
        coreEnquiryResponse.setGeneralData(coreEnquireGeneralData);
        coreEnquiryResponse.setDemographicCommonData(coreEnquireDemographicCommonData);
        coreEnquiryResponse.setDemographicIndividualData(coreEnquireDemographicIndividualData);
        coreEnquiryResponse.setDemographicCommercialData(coreEnquireDemographicCommercialData);
        coreEnquiryResponse.setContactCommonData(coreEnquireContactCommonData);
        coreEnquiryResponse.setContactIndividualData(coreEnquirecContactIndividualData);
        coreEnquiryResponse.setContactCommercialData(coreEnquireContactCommercialData);
        coreEnquiryResponse.setResidentialAddressData(coreEnquireResidentialAddressData);
        coreEnquiryResponse.setMailingAddressData(coreEnquireMailingAddressData);
        coreEnquiryResponse.setQualificationEmployerDetails(coreEnquireQualificationEmployerDetails);
        coreEnquiryResponse.setMarketingCommonData(coreEnquireMarketingCommonData);
        coreEnquiryResponse.setIdentityDetails(coreEnquireIdentityDetails);
        coreEnquiryResponse.setBankRelationshipData(coreEnquireBankRelationshipData);
        coreEnquiryResponse.setBankServicesData(coreEnquireBankServicesData);
        coreEnquiryResponse.setWarningCounter(coreEnquireWarningTableList.size());
        coreEnquiryResponse.setWarningTable(coreEnquireWarningTableList);
        return coreEnquiryResponse;
    }
}
