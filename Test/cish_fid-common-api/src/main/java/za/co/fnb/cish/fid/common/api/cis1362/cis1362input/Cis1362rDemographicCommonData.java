package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customerBranch", "customerType", "customerStatus", "correspondenceLanguage", "customerName", "customerName2", "customerPrimaryIdentityType", "customerPrimaryIdentityNumber", "customerPrimaryIdentityCountryIssued", "customerPrimaryIdentityEffectiveDate", "customerPrimaryIdentityExpiryDate", "customerClientCustomerNumber", "officerCodePrimary", "officerCodeSecondary", "customerTaxReference", "customerRiskIndicator", "customerRiskReason", "customerCUACToken", "customerDateOpened", "customerDateClosed", "customerLastDateMaintain", "customerPrimarySegmentation", "customerSecondarySegmentation", "customerMainBankIndicator", "customerSensitiveFlag"

})
@Generated("jsonschema2pojo")
public class Cis1362rDemographicCommonData implements Serializable {

    @JsonProperty("customerBranch")
    private Integer customerBranch;

    @JsonProperty("customerType")
    private String customerType;

    @JsonProperty("customerStatus")
    private String customerStatus;

    @JsonProperty("correspondenceLanguage")
    private String correspondenceLanguage;

    @JsonProperty("customerName")
    private String customerName;

    @JsonProperty("customerName2")
    private String customerName2;

    @JsonProperty("customerPrimaryIdentityType")
    private String customerPrimaryIdentityType;

    @JsonProperty("customerPrimaryIdentityNumber")
    private String customerPrimaryIdentityNumber;

    @JsonProperty("customerPrimaryIdentityCountryIssued")
    private String customerPrimaryIdentityCountryIssued;

    @JsonProperty("customerPrimaryIdentityEffectiveDate")
    private Integer customerPrimaryIdentityEffectiveDate;

    @JsonProperty("customerPrimaryIdentityExpiryDate")
    private Integer customerPrimaryIdentityExpiryDate;

    @JsonProperty("customerClientCustomerNumber")
    private String customerClientCustomerNumber;

    @JsonProperty("officerCodePrimary")
    private String officerCodePrimary;

    @JsonProperty("officerCodeSecondary")
    private String officerCodeSecondary;

    @JsonProperty("customerTaxReference")
    private String customerTaxReference;

    @JsonProperty("customerRiskIndicator")
    private String customerRiskIndicator;

    @JsonProperty("customerRiskReason")
    private Integer customerRiskReason;

    @JsonProperty("customerCUACToken")
    private String customerCUACToken;

    @JsonProperty("customerDateOpened")
    private Integer customerDateOpened;

    @JsonProperty("customerDateClosed")
    private Integer customerDateClosed;

    @JsonProperty("customerLastDateMaintain")
    private Integer customerLastDateMaintain;

    @JsonProperty("customerPrimarySegmentation")
    private String customerPrimarySegmentation;

    @JsonProperty("customerSecondarySegmentation")
    private String customerSecondarySegmentation;

    @JsonProperty("customerMainBankIndicator")
    private String customerMainBankIndicator;

    @JsonProperty("customerSensitiveFlag")
    private String customerSensitiveFlag;

    @JsonProperty("customerBranch")
    public Integer getCustomerBranch() {
        return customerBranch;
    }

    @JsonProperty("customerBranch")
    public void setCustomerBranch(Integer customerBranch) {
        this.customerBranch = customerBranch;
    }

    @JsonProperty("customerType")
    public String getCustomerType() {
        return customerType;
    }

    @JsonProperty("customerType")
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @JsonProperty("customerStatus")
    public String getCustomerStatus() {
        return customerStatus;
    }

    @JsonProperty("customerStatus")
    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    @JsonProperty("correspondenceLanguage")
    public String getCorrespondenceLanguage() {
        return correspondenceLanguage;
    }

    @JsonProperty("correspondenceLanguage")
    public void setCorrespondenceLanguage(String correspondenceLanguage) {
        this.correspondenceLanguage = correspondenceLanguage;
    }

    @JsonProperty("customerName")
    public String getCustomerName() {
        return customerName;
    }

    @JsonProperty("customerName")
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @JsonProperty("customerName2")
    public String getCustomerName2() {
        return customerName2;
    }

    @JsonProperty("customerName2")
    public void setCustomerName2(String customerName2) {
        this.customerName2 = customerName2;
    }

    @JsonProperty("customerPrimaryIdentityType")
    public String getCustomerPrimaryIdentityType() {
        return customerPrimaryIdentityType;
    }

    @JsonProperty("customerPrimaryIdentityType")
    public void setCustomerPrimaryIdentityType(String customerPrimaryIdentityType) {
        this.customerPrimaryIdentityType = customerPrimaryIdentityType;
    }

    @JsonProperty("customerPrimaryIdentityNumber")
    public String getCustomerPrimaryIdentityNumber() {
        return customerPrimaryIdentityNumber;
    }

    @JsonProperty("customerPrimaryIdentityNumber")
    public void setCustomerPrimaryIdentityNumber(String customerPrimaryIdentityNumber) {
        this.customerPrimaryIdentityNumber = customerPrimaryIdentityNumber;
    }

    @JsonProperty("customerPrimaryIdentityCountryIssued")
    public String getCustomerPrimaryIdentityCountryIssued() {
        return customerPrimaryIdentityCountryIssued;
    }

    @JsonProperty("customerPrimaryIdentityCountryIssued")
    public void setCustomerPrimaryIdentityCountryIssued(String customerPrimaryIdentityCountryIssued) {
        this.customerPrimaryIdentityCountryIssued = customerPrimaryIdentityCountryIssued;
    }

    @JsonProperty("customerPrimaryIdentityEffectiveDate")
    public Integer getCustomerPrimaryIdentityEffectiveDate() {
        return customerPrimaryIdentityEffectiveDate;
    }

    @JsonProperty("customerPrimaryIdentityEffectiveDate")
    public void setCustomerPrimaryIdentityEffectiveDate(Integer customerPrimaryIdentityEffectiveDate) {
        this.customerPrimaryIdentityEffectiveDate = customerPrimaryIdentityEffectiveDate;
    }

    @JsonProperty("customerPrimaryIdentityExpiryDate")
    public Integer getCustomerPrimaryIdentityExpiryDate() {
        return customerPrimaryIdentityExpiryDate;
    }

    @JsonProperty("customerPrimaryIdentityExpiryDate")
    public void setCustomerPrimaryIdentityExpiryDate(Integer customerPrimaryIdentityExpiryDate) {
        this.customerPrimaryIdentityExpiryDate = customerPrimaryIdentityExpiryDate;
    }

    @JsonProperty("customerClientCustomerNumber")
    public String getCustomerClientCustomerNumber() {
        return customerClientCustomerNumber;
    }

    @JsonProperty("customerClientCustomerNumber")
    public void setCustomerClientCustomerNumber(String customerClientCustomerNumber) {
        this.customerClientCustomerNumber = customerClientCustomerNumber;
    }

    @JsonProperty("officerCodePrimary")
    public String getOfficerCodePrimary() {
        return officerCodePrimary;
    }

    @JsonProperty("officerCodePrimary")
    public void setOfficerCodePrimary(String officerCodePrimary) {
        this.officerCodePrimary = officerCodePrimary;
    }

    @JsonProperty("officerCodeSecondary")
    public String getOfficerCodeSecondary() {
        return officerCodeSecondary;
    }

    @JsonProperty("officerCodeSecondary")
    public void setOfficerCodeSecondary(String officerCodeSecondary) {
        this.officerCodeSecondary = officerCodeSecondary;
    }

    @JsonProperty("customerTaxReference")
    public String getCustomerTaxReference() {
        return customerTaxReference;
    }

    @JsonProperty("customerTaxReference")
    public void setCustomerTaxReference(String customerTaxReference) {
        this.customerTaxReference = customerTaxReference;
    }

    @JsonProperty("customerRiskIndicator")
    public String getCustomerRiskIndicator() {
        return customerRiskIndicator;
    }

    @JsonProperty("customerRiskIndicator")
    public void setCustomerRiskIndicator(String customerRiskIndicator) {
        this.customerRiskIndicator = customerRiskIndicator;
    }

    @JsonProperty("customerRiskReason")
    public Integer getCustomerRiskReason() {
        return customerRiskReason;
    }

    @JsonProperty("customerRiskReason")
    public void setCustomerRiskReason(Integer customerRiskReason) {
        this.customerRiskReason = customerRiskReason;
    }

    @JsonProperty("customerCUACToken")
    public String getCustomerCUACToken() {
        return customerCUACToken;
    }

    @JsonProperty("customerCUACToken")
    public void setCustomerCUACToken(String customerCUACToken) {
        this.customerCUACToken = customerCUACToken;
    }

    @JsonProperty("customerDateOpened")
    public Integer getCustomerDateOpened() {
        return customerDateOpened;
    }

    @JsonProperty("customerDateOpened")
    public void setCustomerDateOpened(Integer customerDateOpened) {
        this.customerDateOpened = customerDateOpened;
    }

    @JsonProperty("customerDateClosed")
    public Integer getCustomerDateClosed() {
        return customerDateClosed;
    }

    @JsonProperty("customerDateClosed")
    public void setCustomerDateClosed(Integer customerDateClosed) {
        this.customerDateClosed = customerDateClosed;
    }

    @JsonProperty("customerLastDateMaintain")
    public Integer getCustomerLastDateMaintain() {
        return customerLastDateMaintain;
    }

    @JsonProperty("customerLastDateMaintain")
    public void setCustomerLastDateMaintain(Integer customerLastDateMaintain) {
        this.customerLastDateMaintain = customerLastDateMaintain;
    }

    @JsonProperty("customerPrimarySegmentation")
    public String getCustomerPrimarySegmentation() {
        return customerPrimarySegmentation;
    }

    @JsonProperty("customerPrimarySegmentation")
    public void setCustomerPrimarySegmentation(String customerPrimarySegmentation) {
        this.customerPrimarySegmentation = customerPrimarySegmentation;
    }

    @JsonProperty("customerSecondarySegmentation")
    public String getCustomerSecondarySegmentation() {
        return customerSecondarySegmentation;
    }


    @JsonProperty("customerSecondarySegmentation")
    public void setCustomerSecondarySegmentation(String customerSecondarySegmentation) {
        this.customerSecondarySegmentation = customerSecondarySegmentation;
    }

    @JsonProperty("customerMainBankIndicator")
    public String getCustomerMainBankIndicator() {
        return customerMainBankIndicator;
    }


    @JsonProperty("customerMainBankIndicator")
    public void setCustomerMainBankIndicator(String customerMainBankIndicator) {
        this.customerMainBankIndicator = customerMainBankIndicator;
    }

    @JsonProperty("customerSensitiveFlag")
    public String getCustomerSensitiveFlag() {
        return customerSensitiveFlag;
    }

    @JsonProperty("customerSensitiveFlag")
    public void setCustomerSensitiveFlag(String customerSensitiveFlag) {
        this.customerSensitiveFlag = customerSensitiveFlag;
    }


}
