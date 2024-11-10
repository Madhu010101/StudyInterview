package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;


@JsonPropertyOrder({"customerEchoToken", "generalData", "demographicCommonData", "demographicIndividualData", "demographicCommercialData", "contactCommonData", "contactIndividualData", "contactCommercialData", "residentialAddressData", "mailingAddressData", "qualificationEmployerDetails", "marketingCommonData", "identityDetails", "bankRelationshipData", "bankServicesData", "warningCounter", "warningTable"})

public class CoreEnquiryResponse implements Serializable {


    @ApiModelProperty(value = "Customer Token. e.g. DA56FH6H5H78JU6T")
    private String customerEchoToken;

    private CoreEnquireGeneralData generalData;
    private CoreEnquireDemographicCommonData demographicCommonData;
    private CoreEnquireDemographicIndividualData demographicIndividualData;
    private CoreEnquireDemographicCommercialData demographicCommercialData;
    private CoreEnquireContactCommonData contactCommonData;
    private CoreEnquirecContactIndividualData contactIndividualData;
    private CoreEnquireContactCommercialData contactCommercialData;
    private CoreEnquireResidentialAddressData residentialAddressData;
    private CoreEnquireMailingAddressData mailingAddressData;
    private CoreEnquireQualificationEmployerDetails qualificationEmployerDetails;
    private CoreEnquireMarketingCommonData marketingCommonData;
    private CoreEnquireIdentityDetails identityDetails;
    private CoreEnquireBankRelationshipData bankRelationshipData;
    private CoreEnquireBankServicesData bankServicesData;

    @ApiModelProperty(value = "Warning Counter - occurs 0 - 50. e.g. 050")
    private Integer warningCounter;

    private List<CoreEnquireWarningTable> warningTable;

    public String getCustomerEchoToken() {
        return customerEchoToken;
    }

    public void setCustomerEchoToken(String customerEchoToken) {
        this.customerEchoToken = customerEchoToken;
    }

    public CoreEnquireGeneralData getGeneralData() {
        return generalData;
    }

    public void setGeneralData(CoreEnquireGeneralData generalData) {
        this.generalData = generalData;
    }

    public CoreEnquireDemographicCommonData getDemographicCommonData() {
        return demographicCommonData;
    }

    public void setDemographicCommonData(CoreEnquireDemographicCommonData demographicCommonData) {
        this.demographicCommonData = demographicCommonData;
    }

    public CoreEnquireDemographicIndividualData getDemographicIndividualData() {
        return demographicIndividualData;
    }

    public void setDemographicIndividualData(CoreEnquireDemographicIndividualData demographicIndividualData) {
        this.demographicIndividualData = demographicIndividualData;
    }

    public CoreEnquireDemographicCommercialData getDemographicCommercialData() {
        return demographicCommercialData;
    }

    public void setDemographicCommercialData(CoreEnquireDemographicCommercialData demographicCommercialData) {
        this.demographicCommercialData = demographicCommercialData;
    }

    public CoreEnquireContactCommonData getContactCommonData() {
        return contactCommonData;
    }

    public void setContactCommonData(CoreEnquireContactCommonData contactCommonData) {
        this.contactCommonData = contactCommonData;
    }

    public CoreEnquirecContactIndividualData getContactIndividualData() {
        return contactIndividualData;
    }

    public void setContactIndividualData(CoreEnquirecContactIndividualData contactIndividualData) {
        this.contactIndividualData = contactIndividualData;
    }

    public CoreEnquireContactCommercialData getContactCommercialData() {
        return contactCommercialData;
    }

    public void setContactCommercialData(CoreEnquireContactCommercialData contactCommercialData) {
        this.contactCommercialData = contactCommercialData;
    }

    public CoreEnquireResidentialAddressData getResidentialAddressData() {
        return residentialAddressData;
    }

    public void setResidentialAddressData(CoreEnquireResidentialAddressData residentialAddressData) {
        this.residentialAddressData = residentialAddressData;
    }

    public CoreEnquireMailingAddressData getMailingAddressData() {
        return mailingAddressData;
    }

    public void setMailingAddressData(CoreEnquireMailingAddressData mailingAddressData) {
        this.mailingAddressData = mailingAddressData;
    }

    public CoreEnquireQualificationEmployerDetails getQualificationEmployerDetails() {
        return qualificationEmployerDetails;
    }

    public void setQualificationEmployerDetails(CoreEnquireQualificationEmployerDetails qualificationEmployerDetails) {
        this.qualificationEmployerDetails = qualificationEmployerDetails;
    }

    public CoreEnquireMarketingCommonData getMarketingCommonData() {
        return marketingCommonData;
    }

    public void setMarketingCommonData(CoreEnquireMarketingCommonData marketingCommonData) {
        this.marketingCommonData = marketingCommonData;
    }

    public CoreEnquireIdentityDetails getIdentityDetails() {
        return identityDetails;
    }

    public void setIdentityDetails(CoreEnquireIdentityDetails identityDetails) {
        this.identityDetails = identityDetails;
    }

    public CoreEnquireBankRelationshipData getBankRelationshipData() {
        return bankRelationshipData;
    }

    public void setBankRelationshipData(CoreEnquireBankRelationshipData bankRelationshipData) {
        this.bankRelationshipData = bankRelationshipData;
    }

    public CoreEnquireBankServicesData getBankServicesData() {
        return bankServicesData;
    }

    public void setBankServicesData(CoreEnquireBankServicesData bankServicesData) {
        this.bankServicesData = bankServicesData;
    }

    public Integer getWarningCounter() {
        return warningCounter;
    }

    public void setWarningCounter(Integer warningCounter) {
        this.warningCounter = warningCounter;
    }

    public List<CoreEnquireWarningTable> getWarningTable() {
        return warningTable;
    }

    public void setWarningTable(List<CoreEnquireWarningTable> warningTable) {
        this.warningTable = warningTable;
    }

    @Override
    public String toString() {
        return "CoreEnquiryResponse{" + ", customerEchoToken=" + customerEchoToken + ", generalData=" + generalData + ", demographicCommonData=" + demographicCommonData + ", demographicIndividualData=" + demographicIndividualData + ", demographicCommercialData=" + demographicCommercialData + ", contactCommonData=" + contactCommonData + ", contactIndividualData=" + contactIndividualData + ", contactCommercialData=" + contactCommercialData + ", residentialAddressData=" + residentialAddressData + ", mailingAddressData=" + mailingAddressData + ", qualificationEmployerDetails=" + qualificationEmployerDetails + ", marketingCommonData=" + marketingCommonData + ", identityDetails=" + identityDetails + ", bankRelationshipData=" + bankRelationshipData + ", bankServicesData=" + bankServicesData + ", warningCounter=" + warningCounter + ", warningTable=" + warningTable + '}';
    }
}
