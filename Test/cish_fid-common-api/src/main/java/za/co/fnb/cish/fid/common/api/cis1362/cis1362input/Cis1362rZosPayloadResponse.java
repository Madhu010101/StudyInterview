package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"replyCode", "customerEchoToken", "generalData", "demographicCommonData", "demographicIndividualData", "demographicCommercialData", "contactCommonData", "contactIndividualData", "contactCommercialData", "residentialAddressData", "mailingAddressData", "qualificationEmployerDetails", "marketingCommonData", "identityDetails", "bankRelationshipData", "bankServicesData", "warningTable"})

@Generated("jsonschema2pojo")
public class Cis1362rZosPayloadResponse implements Serializable {

    @JsonProperty("replyCode")
    private Integer replyCode;

    @JsonProperty("customerEchoToken")
    private String customerEchoToken;

    @JsonProperty("generalData")
    private Cis1362rGeneralData generalData;

    @JsonProperty("demographicCommonData")
    private Cis1362rDemographicCommonData demographicCommonData;

    @JsonProperty("demographicIndividualData")
    private Cis1362rDemographicIndividualData demographicIndividualData;

    @JsonProperty("demographicCommercialData")
    private Cis1362rDemographicCommercialData demographicCommercialData;

    @JsonProperty("contactCommonData")
    private Cis1362rContactCommonData contactCommonData;

    @JsonProperty("contactIndividualData")
    private Cis1362rContactIndividualData contactIndividualData;

    @JsonProperty("contactCommercialData")
    private Cis1362rContactCommercialData contactCommercialData;

    @JsonProperty("residentialAddressData")
    private Cis1362rResidentialAddressData residentialAddressData;

    @JsonProperty("mailingAddressData")
    private Cis1362rMailingAddressData mailingAddressData;

    @JsonProperty("qualificationEmployerDetails")
    private Cis1362rQualificationEmployerDetails qualificationEmployerDetails;

    @JsonProperty("marketingCommonData")
    private Cis1362rMarketingCommonData marketingCommonData;

    @JsonProperty("identityDetails")
    private Cis1362rIdentityDetails identityDetails;

    @JsonProperty("bankRelationshipData")
    private Cis1362rBankRelationshipData bankRelationshipData;

    @JsonProperty("bankServicesData")
    private Cis1362rBankServicesData bankServicesData;

    @JsonProperty("warningTable")
    private List<Cis1362rWarningTable> warningTable;


    @JsonProperty("replyCode")
    public Integer getReplyCode() {
        return replyCode;
    }


    @JsonProperty("replyCode")
    public void setReplyCode(Integer replyCode) {
        this.replyCode = replyCode;
    }


    @JsonProperty("customerEchoToken")
    public String getCustomerEchoToken() {
        return customerEchoToken;
    }


    @JsonProperty("customerEchoToken")
    public void setCustomerEchoToken(String customerEchoToken) {
        this.customerEchoToken = customerEchoToken;
    }


    @JsonProperty("generalData")
    public Cis1362rGeneralData getGeneralData() {
        return generalData;
    }


    @JsonProperty("generalData")
    public void setGeneralData(Cis1362rGeneralData generalData) {
        this.generalData = generalData;
    }


    @JsonProperty("demographicCommonData")
    public Cis1362rDemographicCommonData getDemographicCommonData() {
        return demographicCommonData;
    }


    @JsonProperty("demographicCommonData")
    public void setDemographicCommonData(Cis1362rDemographicCommonData demographicCommonData) {
        this.demographicCommonData = demographicCommonData;
    }


    @JsonProperty("demographicIndividualData")
    public Cis1362rDemographicIndividualData getDemographicIndividualData() {
        return demographicIndividualData;
    }


    @JsonProperty("demographicIndividualData")
    public void setDemographicIndividualData(Cis1362rDemographicIndividualData demographicIndividualData) {
        this.demographicIndividualData = demographicIndividualData;
    }


    @JsonProperty("demographicCommercialData")
    public Cis1362rDemographicCommercialData getDemographicCommercialData() {
        return demographicCommercialData;
    }


    @JsonProperty("demographicCommercialData")
    public void setDemographicCommercialData(Cis1362rDemographicCommercialData demographicCommercialData) {
        this.demographicCommercialData = demographicCommercialData;
    }


    @JsonProperty("contactCommonData")
    public Cis1362rContactCommonData getContactCommonData() {
        return contactCommonData;
    }


    @JsonProperty("contactCommonData")
    public void setContactCommonData(Cis1362rContactCommonData contactCommonData) {
        this.contactCommonData = contactCommonData;
    }


    @JsonProperty("contactIndividualData")
    public Cis1362rContactIndividualData getContactIndividualData() {
        return contactIndividualData;
    }


    @JsonProperty("contactIndividualData")
    public void setContactIndividualData(Cis1362rContactIndividualData contactIndividualData) {
        this.contactIndividualData = contactIndividualData;
    }


    @JsonProperty("contactCommercialData")
    public Cis1362rContactCommercialData getContactCommercialData() {
        return contactCommercialData;
    }


    @JsonProperty("contactCommercialData")
    public void setContactCommercialData(Cis1362rContactCommercialData contactCommercialData) {
        this.contactCommercialData = contactCommercialData;
    }


    @JsonProperty("residentialAddressData")
    public Cis1362rResidentialAddressData getResidentialAddressData() {
        return residentialAddressData;
    }


    @JsonProperty("residentialAddressData")
    public void setResidentialAddressData(Cis1362rResidentialAddressData residentialAddressData) {
        this.residentialAddressData = residentialAddressData;
    }


    @JsonProperty("mailingAddressData")
    public Cis1362rMailingAddressData getMailingAddressData() {
        return mailingAddressData;
    }


    @JsonProperty("mailingAddressData")
    public void setMailingAddressData(Cis1362rMailingAddressData mailingAddressData) {
        this.mailingAddressData = mailingAddressData;
    }


    @JsonProperty("qualificationEmployerDetails")
    public Cis1362rQualificationEmployerDetails getQualificationEmployerDetails() {
        return qualificationEmployerDetails;
    }


    @JsonProperty("qualificationEmployerDetails")
    public void setQualificationEmployerDetails(Cis1362rQualificationEmployerDetails qualificationEmployerDetails) {
        this.qualificationEmployerDetails = qualificationEmployerDetails;
    }


    @JsonProperty("marketingCommonData")
    public Cis1362rMarketingCommonData getMarketingCommonData() {
        return marketingCommonData;
    }


    @JsonProperty("marketingCommonData")
    public void setMarketingCommonData(Cis1362rMarketingCommonData marketingCommonData) {
        this.marketingCommonData = marketingCommonData;
    }


    @JsonProperty("identityDetails")
    public Cis1362rIdentityDetails getIdentityDetails() {
        return identityDetails;
    }


    @JsonProperty("identityDetails")
    public void setIdentityDetails(Cis1362rIdentityDetails identityDetails) {
        this.identityDetails = identityDetails;
    }


    @JsonProperty("bankRelationshipData")
    public Cis1362rBankRelationshipData getBankRelationshipData() {
        return bankRelationshipData;
    }


    @JsonProperty("bankRelationshipData")
    public void setBankRelationshipData(Cis1362rBankRelationshipData bankRelationshipData) {
        this.bankRelationshipData = bankRelationshipData;
    }


    @JsonProperty("bankServicesData")
    public Cis1362rBankServicesData getBankServicesData() {
        return bankServicesData;
    }


    @JsonProperty("bankServicesData")
    public void setBankServicesData(Cis1362rBankServicesData bankServicesData) {
        this.bankServicesData = bankServicesData;
    }

    @JsonProperty("warningTable")
    public List<Cis1362rWarningTable> getWarningTable() {
        return warningTable;
    }


    @JsonProperty("warningTable")
    public void setWarningTable(List<Cis1362rWarningTable> warningTable) {
        this.warningTable = warningTable;
    }

    @Override
    public String toString() {
        return "payload{" + ", replyCode=" + replyCode + ", customerEchoToken=" + customerEchoToken + ", generalData=" + generalData + ", demographicCommonData=" + demographicCommonData + ", demographicIndividualData=" + demographicIndividualData + ", demographicCommercialData=" + demographicCommercialData + ", contactCommonData=" + contactCommonData + ", contactIndividualData=" + contactIndividualData + ", contactCommercialData=" + contactCommercialData + ", residentialAddressData=" + residentialAddressData + ", mailingAddressData=" + mailingAddressData + ", qualificationEmployerDetails=" + qualificationEmployerDetails + ", marketingCommonData=" + marketingCommonData + ", identityDetails=" + identityDetails + ", bankRelationshipData=" + bankRelationshipData + ", bankServicesData=" + bankServicesData + ", warningTable=" + warningTable + '}';
    }
}
