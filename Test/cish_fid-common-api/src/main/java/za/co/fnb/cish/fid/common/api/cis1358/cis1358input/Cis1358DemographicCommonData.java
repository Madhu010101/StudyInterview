
package za.co.fnb.cish.fid.common.api.cis1358.cis1358input;

import java.util.HashMap;
import java.util.Map;
import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customerBranch",
    "customerType",
    "customerCorrespondenceLanguage",
    "customerPrimaryIdentityType",
    "customerPrimaryIdentityNumber",
    "customerPrimaryIdentityCountryIssued",
    "customerPrimaryIdentityEffectiveDate",
    "customerPrimaryIdentityExpiryDate",
    "customerClientCustomerNumber",
    "officerCodePrimary",
    "officerCodeSecondary",
    "customerTaxReference",
    "customerRiskIndicator",
    "customerRiskReason"
})
@Generated("jsonschema2pojo")
public class Cis1358DemographicCommonData {

    @JsonProperty("customerBranch")
    private Integer customerBranch;
    @JsonProperty("customerType")
    private String customerType;
    @JsonProperty("customerCorrespondenceLanguage")
    private String customerCorrespondenceLanguage;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("customerCorrespondenceLanguage")
    public String getCustomerCorrespondenceLanguage() {
        return customerCorrespondenceLanguage;
    }

    @JsonProperty("customerCorrespondenceLanguage")
    public void setCustomerCorrespondenceLanguage(String customerCorrespondenceLanguage) {
        this.customerCorrespondenceLanguage = customerCorrespondenceLanguage;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
