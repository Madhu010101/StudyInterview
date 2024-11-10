package za.co.fnb.cish.fid.zos.loader.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import za.co.fnb.cish.fid.common.api.cis1356.cis1356output.Cis1356rForeignTaxRegulatorySegment;
import za.co.fnb.cish.fid.common.api.cis1356.cis1356output.Cis1356rZosPayloadResponse;
import za.co.fnb.cish.fid.common.api.cis1359.cis1359input.*;
import za.co.fnb.cish.fid.common.api.fidmaster.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static za.co.fnb.cish.fid.zos.loader.util.Constants.YES;

@Component
public class Cis1359RegMaintenaceImpl {


    public Cis1359FunctionInput getCis1359fRegMaintnRequest(FirstIdMasterEntity firstIdMasterEntity, Cis1356rZosPayloadResponse regEnqryResponse, String jurisdictionCountryEntpsCode, Long ucn) {
        Cis1359FunctionInput cis1359FunctionInput = new Cis1359FunctionInput();
        Cis1359InputKey inputKey = new Cis1359InputKey();


        Party party = firstIdMasterEntity.getParty();
        List<PartyClassification> partyClass = (Objects.nonNull(party.getPartyClassification()) && party.getPartyClassification().size() > 0) ? (party.getPartyClassification()) : null;

        Organisation organisation = party.getOrganisation();
        List<SourceOfFunds> fidSourceOfFund = Objects.nonNull(party.getSourcesOfFunds()) ? party.getSourcesOfFunds() : null;
        List<Cis1359SourceOfFundsTable> cis1359SourceOfFundsList = new ArrayList<Cis1359SourceOfFundsTable>();


        Cis1359RegulatoryInput cis1359RegulatoryInput = new Cis1359RegulatoryInput();
        Cis1359SourceOfFundsData sourceOfFundsData = new Cis1359SourceOfFundsData();

        Cis1359ForeignTaxRegulatoryData cis1359ForeignTaxRegulatoryData = new Cis1359ForeignTaxRegulatoryData();
        List<Cis1359ForeignTaxRegulatoryTable> cis1359ForeignTaxRegulatoryTable = new ArrayList<>();
        Cis1359RegulatoryIndividual regulatoryIndividual = new Cis1359RegulatoryIndividual();
        Cis1359RegulatoryCommercial regulatoryCommercial = new Cis1359RegulatoryCommercial();
        Cis1359Ifrs9Data cis1359Ifrs9Data = new Cis1359Ifrs9Data();

        if (Objects.nonNull(regEnqryResponse)) {
            cis1359FunctionInput.setCustomerEchoToken(Objects.nonNull(regEnqryResponse.getCustomerEchoToken()) ? regEnqryResponse.getCustomerEchoToken() : null);
            inputKey.setCustomerCompanyId(Integer.valueOf(jurisdictionCountryEntpsCode));
            inputKey.setCustomerNumber(ucn);
        }

        // sourceOfFundsData
        List<SourceOfFunds> sourceOfFunds = fidSourceOfFund.stream().filter(sf -> (StringUtils.isEmpty(sf.getSourceOfFundsActiveIndicator()) || sf.getSourceOfFundsActiveIndicator().equalsIgnoreCase(YES))).collect(Collectors.toList());
        sourceOfFunds.forEach(fidSof -> {
            Cis1359SourceOfFundsTable cis1359SourceOfFundsTable = new Cis1359SourceOfFundsTable();
            cis1359SourceOfFundsTable.setCustomerSourceOfFundsCode(fidSof.getSourceOfFundsEntpsTypeCode());
            cis1359SourceOfFundsList.add(cis1359SourceOfFundsTable);
        });
        sourceOfFundsData.setSourceOfFundsTable(cis1359SourceOfFundsList);

        //partyClassificationValue
        if (Objects.nonNull(partyClass)) {
            List<PartyClassification> partyClassifications = partyClass.stream().filter(pc -> (StringUtils.isEmpty(pc.getPartyClassificationActiveIndicator()) || pc.getPartyClassificationActiveIndicator().equalsIgnoreCase(YES))).collect(Collectors.toList());
            partyClassifications.forEach(pc -> {
                regulatoryCommercial.setCustomerDepartmentOfTradeAndIndustryCode(pc.getPartyClassificationValue());
            });
        }

        //organisationClassificationValue
        if (Objects.nonNull(organisation) && Objects.nonNull(organisation.getOrganisationClassification()) && organisation.getOrganisationClassification().size() > 0) {
            // List<OrganisationClassification> orgClass = (Objects.nonNull(organisation.getOrganisationClassification()) && organisation.getOrganisationClassification().size() > 0) ? (organisation.getOrganisationClassification()) : null;
            List<OrganisationClassification> orgClassifications = organisation.getOrganisationClassification().stream().filter(oc -> (StringUtils.isEmpty(oc.getOrganisationClassificationActiveIndicator()) || oc.getOrganisationClassificationActiveIndicator().equalsIgnoreCase(YES))).collect(Collectors.toList());
            if (Objects.nonNull(orgClassifications)) {
                orgClassifications.forEach(oc -> {
                    if (oc.getOrganisationClassificationTypeCode().equalsIgnoreCase("2")) {
                        cis1359RegulatoryInput.setCustomerBusinessIndustryClassificationCode(Integer.valueOf(oc.getOrganisationClassificationValue()));
                    }
                });
            }
        }
        List<Cis1356rForeignTaxRegulatorySegment> regEnqTaxSeg = regEnqryResponse.getForeignTaxRegulatoryCommonData().getForeignTaxRegulatorySegment();
        if (Objects.nonNull(regEnqTaxSeg)) {
            regEnqTaxSeg.stream().forEach(regEnqTaxSegmt -> {
                Cis1359ForeignTaxRegulatoryTable cis1359FtregulatoryTable = new Cis1359ForeignTaxRegulatoryTable();

                //foreignTaxRegulatoryIdKey,foreignTaxRegulatoryData
                Cis1359ForeignTaxRegulatoryIdKey cis1359ForeignTaxRegulatoryIdKey = new Cis1359ForeignTaxRegulatoryIdKey();
                cis1359ForeignTaxRegulatoryIdKey.setCustomerForeignTaxRegulatoryIdentityType(Objects.nonNull(regEnqTaxSegmt.getCustomerForeignTaxRegulatoryIdentityType()) ? regEnqTaxSegmt.getCustomerForeignTaxRegulatoryIdentityType() : null);
                cis1359ForeignTaxRegulatoryIdKey.setCustomerForeignTaxRegulatoryIdentityOccurrence(Objects.nonNull(regEnqTaxSegmt.getCustomerForeignTaxRegulatoryIdentityOccurrence()) ? regEnqTaxSegmt.getCustomerForeignTaxRegulatoryIdentityOccurrence() : null);
                cis1359ForeignTaxRegulatoryIdKey.setCustomerForeignTaxRegulatoryIdentityEffectiveDate(Objects.nonNull(regEnqTaxSegmt.getCustomerForeignTaxRegulatoryIdentityEffectiveDate()) ? regEnqTaxSegmt.getCustomerForeignTaxRegulatoryIdentityEffectiveDate() : null);
                //foreignTaxRegulatoryTable
                cis1359FtregulatoryTable.setCustomerForeignTaxRegulatoryIdentityIssuer(Objects.nonNull(regEnqTaxSegmt.getCustomerForeignTaxRegulatoryIdentityIssuer()) ? regEnqTaxSegmt.getCustomerForeignTaxRegulatoryIdentityIssuer() : null);
                cis1359FtregulatoryTable.setCustomerForeignTaxRegulatoryIdentityExpiryDate(Objects.nonNull(regEnqTaxSegmt.getCustomerForeignTaxRegulatoryIdentityExpiryDate()) ? regEnqTaxSegmt.getCustomerForeignTaxRegulatoryIdentityExpiryDate() : null);
                cis1359FtregulatoryTable.setCustomerForeignTaxRegulatoryIdentityNumber(Objects.nonNull(regEnqTaxSegmt.getCustomerForeignTaxRegulatoryIdentityNumber()) ? regEnqTaxSegmt.getCustomerForeignTaxRegulatoryIdentityNumber() : null);
                cis1359FtregulatoryTable.setCustomerForeignTaxRegulatoryIdentityClass(Objects.nonNull(regEnqTaxSegmt.getCustomerForeignTaxRegulatoryIdentityClass()) ? regEnqTaxSegmt.getCustomerForeignTaxRegulatoryIdentityClass() : null);
                cis1359FtregulatoryTable.setCustomerForeignTaxRegulatoryIdentityStatus(Objects.nonNull(regEnqTaxSegmt.getCustomerForeignTaxRegulatoryIdentityStatus()) ? regEnqTaxSegmt.getCustomerForeignTaxRegulatoryIdentityStatus() : null);

                cis1359ForeignTaxRegulatoryTable.add(cis1359FtregulatoryTable);
            });
        }
        cis1359ForeignTaxRegulatoryData.setForeignTaxRegulatoryTable(cis1359ForeignTaxRegulatoryTable);

        //regulatoryIndividual
        regulatoryIndividual.setCustomerForgeinTaxRegulatoryCityOfBirth(Objects.nonNull(regEnqryResponse.getGeneralIndividualData().getCustomerForeignTaxRegulatoryCityOfBirth()) ? regEnqryResponse.getGeneralIndividualData().getCustomerForeignTaxRegulatoryCityOfBirth() : null);
        regulatoryIndividual.setCustomerDebtCouncilIndicator(Objects.nonNull(regEnqryResponse.getGeneralIndividualData().getCustomerDebtCouncilIndicator()) ? regEnqryResponse.getGeneralIndividualData().getCustomerDebtCouncilIndicator() : null);


        //regulatoryCommercial
        regulatoryCommercial.setCustomerPrimaryBusiness(Objects.nonNull(regEnqryResponse.getGeneralCommercialData().getCustomerPrimaryBusiness()) ? regEnqryResponse.getGeneralCommercialData().getCustomerPrimaryBusiness() : null);
        regulatoryCommercial.setCustomerBeeAccreditor(Objects.nonNull(regEnqryResponse.getGeneralCommercialData().getCustomerBeeAccreditor()) ? regEnqryResponse.getGeneralCommercialData().getCustomerBeeAccreditor() : null);
        regulatoryCommercial.setCustomerBeePercent(Objects.nonNull(regEnqryResponse.getGeneralCommercialData().getCustomerBEEPercent()) ? regEnqryResponse.getGeneralCommercialData().getCustomerBEEPercent() : null);
        regulatoryCommercial.setCustomerBeeLevel(Objects.nonNull(regEnqryResponse.getGeneralCommercialData().getCustomerBeeLevel()) ? regEnqryResponse.getGeneralCommercialData().getCustomerBeeLevel() : null);
        regulatoryCommercial.setCustomerBeeDate(Objects.nonNull(regEnqryResponse.getGeneralCommercialData().getCustomerBeeDate()) ? regEnqryResponse.getGeneralCommercialData().getCustomerBeeDate() : null);
        regulatoryCommercial.setCustomerBusinessRescueIndicator(Objects.nonNull(regEnqryResponse.getGeneralCommercialData().getCustomerBusinessRescueIndicator()) ? regEnqryResponse.getGeneralCommercialData().getCustomerBusinessRescueIndicator() : null);
        regulatoryCommercial.setCustomerControlVerified(Objects.nonNull(regEnqryResponse.getGeneralCommercialData().getCustomerControlVerified()) ? regEnqryResponse.getGeneralCommercialData().getCustomerControlVerified() : null);
        //   regulatoryCommercial.setCustomerDepartmentOfTradeAndIndustryCode(Objects.nonNull(regEnqryResponse.getGeneralCommercialData().getCustomerDepartmentOfTradeAndIndustryCode()) ? regEnqryResponse.getGeneralCommercialData().getCustomerDepartmentOfTradeAndIndustryCode() : null);

        //ifrs9Data
        cis1359Ifrs9Data.setCustomerCreditHighRisk(Objects.nonNull(regEnqryResponse.getIfrs9CommercialData().getCustomerCreditHighRisk()) ? regEnqryResponse.getIfrs9CommercialData().getCustomerCreditHighRisk() : null);
        cis1359Ifrs9Data.setCustomerCreditHighRiskDate(Objects.nonNull(regEnqryResponse.getIfrs9CommercialData().getCustomerCreditHighRiskDate()) ? regEnqryResponse.getIfrs9CommercialData().getCustomerCreditHighRiskDate() : null);
        cis1359Ifrs9Data.setCustomerDistressedRestructureIndicator(Objects.nonNull(regEnqryResponse.getIfrs9CommercialData().getCustomerDistressedRestructureIndicator()) ? regEnqryResponse.getIfrs9CommercialData().getCustomerDistressedRestructureIndicator() : null);
        cis1359Ifrs9Data.setCustomerDistressedRestructureDate(Objects.nonNull(regEnqryResponse.getIfrs9CommercialData().getCustomerDistressedRestructureDate()) ? regEnqryResponse.getIfrs9CommercialData().getCustomerDistressedRestructureDate() : null);
        cis1359Ifrs9Data.setCustomerEntityStatus(Objects.nonNull(regEnqryResponse.getGeneralCommercialData().getCustomerEntityStatus()) ? regEnqryResponse.getGeneralCommercialData().getCustomerEntityStatus() : null);
        cis1359Ifrs9Data.setCustomerEntityStatusDate(Objects.nonNull(regEnqryResponse.getGeneralCommercialData().getCustomerEntityDate()) ? regEnqryResponse.getGeneralCommercialData().getCustomerEntityDate() : null);

        regulatoryCommercial.setIfrs9Data(cis1359Ifrs9Data);


        cis1359RegulatoryInput.setCustomerForeignTaxIndicator(Objects.nonNull(regEnqryResponse.getForeignTaxRegulatoryCommonData().getCustomerForeignTaxIndicator()) ? regEnqryResponse.getForeignTaxRegulatoryCommonData().getCustomerForeignTaxIndicator() : null);
        cis1359RegulatoryInput.setCustomerSelfCertificationIndicator("");
        if (Objects.nonNull(regEnqryResponse.getKycCommonData()) && Objects.nonNull(regEnqryResponse.getKycCommonData().getPkiData())) {
            cis1359RegulatoryInput.setCustomerPrimaryKYC(Objects.nonNull(regEnqryResponse.getKycCommonData().getPkiData().getCustomerPrimaryKYC()) ? regEnqryResponse.getKycCommonData().getPkiData().getCustomerPrimaryKYC() : null);
            cis1359RegulatoryInput.setCustomerPrimaryKYCVerifiedDate(Objects.nonNull(regEnqryResponse.getKycCommonData().getPkiData().getCustomerPrimaryKYCVerifiedDate()) ? regEnqryResponse.getKycCommonData().getPkiData().getCustomerPrimaryKYCVerifiedDate() : null);
        }
        if (Objects.nonNull(regEnqryResponse.getKycCommonData()) && Objects.nonNull(regEnqryResponse.getKycCommonData().getKycFields())) {
            cis1359RegulatoryInput.setCustomerPrimaryKYCAddressVerified(Objects.nonNull(regEnqryResponse.getKycCommonData().getKycFields().getCustomerKycAddressVerified()) ? regEnqryResponse.getKycCommonData().getKycFields().getCustomerKycAddressVerified() : null);
            cis1359RegulatoryInput.setCustomerPrimaryKYCIdentityVerified(Objects.nonNull(regEnqryResponse.getKycCommonData().getKycFields().getCustomerKycIdentityVerified()) ? regEnqryResponse.getKycCommonData().getKycFields().getCustomerKycIdentityVerified() : null);
        }
        if (Objects.nonNull(regEnqryResponse.getGeneralCommonData())) {
            cis1359RegulatoryInput.setCustomerRiskIndicator(Objects.nonNull(regEnqryResponse.getGeneralCommonData().getCustomerRiskIndicator()) ? regEnqryResponse.getGeneralCommonData().getCustomerRiskIndicator() : null);
            cis1359RegulatoryInput.setCustomerRiskReason(Objects.nonNull(regEnqryResponse.getGeneralCommonData().getCustomerRiskReason()) ? regEnqryResponse.getGeneralCommonData().getCustomerRiskReason() : null);
            cis1359RegulatoryInput.setCustomerScreeningStatus(Objects.nonNull(regEnqryResponse.getGeneralCommonData().getCustomerScreeningStatus()) ? regEnqryResponse.getGeneralCommonData().getCustomerScreeningStatus() : null);
            cis1359RegulatoryInput.setCustomerBankDecisionIndicator(Objects.nonNull(regEnqryResponse.getGeneralCommonData().getCustomerBankDecisionIndicator()) ? regEnqryResponse.getGeneralCommonData().getCustomerBankDecisionIndicator() : null);

            cis1359RegulatoryInput.setCustomerRiskRating(Objects.nonNull(regEnqryResponse.getGeneralCommonData().getCustomerRiskRating()) ? regEnqryResponse.getGeneralCommonData().getCustomerRiskRating() : null);
            cis1359RegulatoryInput.setCustomerForexBlockIndicator(Objects.nonNull(regEnqryResponse.getGeneralCommonData().getCustomerForexBlockIndicator()) ? regEnqryResponse.getGeneralCommonData().getCustomerBankDecisionIndicator() : null);

          /*  if (Objects.nonNull(regEnqryResponse.getGeneralCommercialData())) {
                cis1359RegulatoryInput.setCustomerBusinessIndustryClassificationCode(Objects.nonNull(regEnqryResponse.getGeneralCommercialData().getCustomerBusinessIndustryClassificationCode()) ? regEnqryResponse.getGeneralCommercialData().getCustomerBusinessIndustryClassificationCode() : null);
            }*/

            cis1359RegulatoryInput.setCustomerCROModel(Objects.nonNull(regEnqryResponse.getGeneralCommonData().getCustomerCROModel()) ? regEnqryResponse.getGeneralCommonData().getCustomerCROModel() : null);
            cis1359RegulatoryInput.setCustomerRefreshReviewIndicator(Objects.nonNull(regEnqryResponse.getGeneralCommonData().getCustomerRefreshReviewIndicator()) ? regEnqryResponse.getGeneralCommonData().getCustomerRefreshReviewIndicator() : null);
            cis1359RegulatoryInput.setCustomerRefreshStartDate(Objects.nonNull(regEnqryResponse.getGeneralCommonData().getCustomerRefreshStartDate()) ? regEnqryResponse.getGeneralCommonData().getCustomerRefreshStartDate() : null);
            cis1359RegulatoryInput.setCustomerRefreshComplianceIndicator(Objects.nonNull(regEnqryResponse.getGeneralCommonData().getCustomerRefreshComplianceIndicator()) ? regEnqryResponse.getGeneralCommonData().getCustomerRefreshComplianceIndicator() : null);
        }

        cis1359RegulatoryInput.setForeignTaxRegulatoryData(cis1359ForeignTaxRegulatoryData);
        cis1359RegulatoryInput.setRegulatoryIndividual(regulatoryIndividual);
        cis1359RegulatoryInput.setRegulatoryCommercial(regulatoryCommercial);
        cis1359RegulatoryInput.setSourceOfFundsData(sourceOfFundsData);
        cis1359FunctionInput.setInputKey(inputKey);
        cis1359FunctionInput.setRegulatoryInput(cis1359RegulatoryInput);
        return cis1359FunctionInput;
    }

}
