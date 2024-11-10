
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
    "nameFormat1",
    "nameFormat2",
    "customerCountryOfBirth",
    "customerCountryOfPermanentResidence",
    "customerCountryOfCitizenship",
    "customerCountryOfNationality",
    "dateOfBirth",
    "customerDateDeceased",
    "customerRace",
    "customerGender",
    "customerMaritalStatus",
    "customerMaritalContract",
    "customerMaritalConsent",
    "customerNumberOfDependents",
    "customerOccupationCode",
    "customerResidencyStatus",
    "customerGroupScheme",
    "customerAnnualIncome",
    "customerPropertyBonded",
    "customerPropertyOwnership",
    "customerVipIndicator",
    "customerVipCategory",
    "customerSensitiveFlag"
})
@Generated("jsonschema2pojo")
public class Cis1358DemographicIndividualData {

    @JsonProperty("nameFormat1")
    private Cis1358NameFormat1 nameFormat1;
    @JsonProperty("nameFormat2")
    private Cis1358NameFormat2 nameFormat2;
    @JsonProperty("customerCountryOfBirth")
    private String customerCountryOfBirth;
    @JsonProperty("customerCountryOfPermanentResidence")
    private String customerCountryOfPermanentResidence;
    @JsonProperty("customerCountryOfCitizenship")
    private String customerCountryOfCitizenship;
    @JsonProperty("customerCountryOfNationality")
    private String customerCountryOfNationality;
    @JsonProperty("dateOfBirth")
    private Integer dateOfBirth;
    @JsonProperty("customerDateDeceased")
    private Integer customerDateDeceased;
    @JsonProperty("customerRace")
    private Integer customerRace;
    @JsonProperty("customerGender")
    private String customerGender;
    @JsonProperty("customerMaritalStatus")
    private String customerMaritalStatus;
    @JsonProperty("customerMaritalContract")
    private String customerMaritalContract;
    @JsonProperty("customerMaritalConsent")
    private String customerMaritalConsent;
    @JsonProperty("customerNumberOfDependents")
    private Integer customerNumberOfDependents;
    @JsonProperty("customerOccupationCode")
    private String customerOccupationCode;
    @JsonProperty("customerResidencyStatus")
    private String customerResidencyStatus;
    @JsonProperty("customerGroupScheme")
    private String customerGroupScheme;
    @JsonProperty("customerAnnualIncome")
    private Long customerAnnualIncome;
    @JsonProperty("customerPropertyBonded")
    private String customerPropertyBonded;
    @JsonProperty("customerPropertyOwnership")
    private String customerPropertyOwnership;
    @JsonProperty("customerVipIndicator")
    private String customerVipIndicator;
    @JsonProperty("customerVipCategory")
    private String customerVipCategory;
    @JsonProperty("customerSensitiveFlag")
    private String customerSensitiveFlag;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nameFormat1")
    public Cis1358NameFormat1 getNameFormat1() {
        return nameFormat1;
    }

    @JsonProperty("nameFormat1")
    public void setNameFormat1(Cis1358NameFormat1 nameFormat1) {
        this.nameFormat1 = nameFormat1;
    }

    @JsonProperty("nameFormat2")
    public Cis1358NameFormat2 getNameFormat2() {
        return nameFormat2;
    }

    @JsonProperty("nameFormat2")
    public void setNameFormat2(Cis1358NameFormat2 nameFormat2) {
        this.nameFormat2 = nameFormat2;
    }

    @JsonProperty("customerCountryOfBirth")
    public String getCustomerCountryOfBirth() {
        return customerCountryOfBirth;
    }

    @JsonProperty("customerCountryOfBirth")
    public void setCustomerCountryOfBirth(String customerCountryOfBirth) {
        this.customerCountryOfBirth = customerCountryOfBirth;
    }

    @JsonProperty("customerCountryOfPermanentResidence")
    public String getCustomerCountryOfPermanentResidence() {
        return customerCountryOfPermanentResidence;
    }

    @JsonProperty("customerCountryOfPermanentResidence")
    public void setCustomerCountryOfPermanentResidence(String customerCountryOfPermanentResidence) {
        this.customerCountryOfPermanentResidence = customerCountryOfPermanentResidence;
    }

    @JsonProperty("customerCountryOfCitizenship")
    public String getCustomerCountryOfCitizenship() {
        return customerCountryOfCitizenship;
    }

    @JsonProperty("customerCountryOfCitizenship")
    public void setCustomerCountryOfCitizenship(String customerCountryOfCitizenship) {
        this.customerCountryOfCitizenship = customerCountryOfCitizenship;
    }

    @JsonProperty("customerCountryOfNationality")
    public String getCustomerCountryOfNationality() {
        return customerCountryOfNationality;
    }

    @JsonProperty("customerCountryOfNationality")
    public void setCustomerCountryOfNationality(String customerCountryOfNationality) {
        this.customerCountryOfNationality = customerCountryOfNationality;
    }

    @JsonProperty("dateOfBirth")
    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(Integer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonProperty("customerDateDeceased")
    public Integer getCustomerDateDeceased() {
        return customerDateDeceased;
    }

    @JsonProperty("customerDateDeceased")
    public void setCustomerDateDeceased(Integer customerDateDeceased) {
        this.customerDateDeceased = customerDateDeceased;
    }

    @JsonProperty("customerRace")
    public Integer getCustomerRace() {
        return customerRace;
    }

    @JsonProperty("customerRace")
    public void setCustomerRace(Integer customerRace) {
        this.customerRace = customerRace;
    }

    @JsonProperty("customerGender")
    public String getCustomerGender() {
        return customerGender;
    }

    @JsonProperty("customerGender")
    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    @JsonProperty("customerMaritalStatus")
    public String getCustomerMaritalStatus() {
        return customerMaritalStatus;
    }

    @JsonProperty("customerMaritalStatus")
    public void setCustomerMaritalStatus(String customerMaritalStatus) {
        this.customerMaritalStatus = customerMaritalStatus;
    }

    @JsonProperty("customerMaritalContract")
    public String getCustomerMaritalContract() {
        return customerMaritalContract;
    }

    @JsonProperty("customerMaritalContract")
    public void setCustomerMaritalContract(String customerMaritalContract) {
        this.customerMaritalContract = customerMaritalContract;
    }

    @JsonProperty("customerMaritalConsent")
    public String getCustomerMaritalConsent() {
        return customerMaritalConsent;
    }

    @JsonProperty("customerMaritalConsent")
    public void setCustomerMaritalConsent(String customerMaritalConsent) {
        this.customerMaritalConsent = customerMaritalConsent;
    }

    @JsonProperty("customerNumberOfDependents")
    public Integer getCustomerNumberOfDependents() {
        return customerNumberOfDependents;
    }

    @JsonProperty("customerNumberOfDependents")
    public void setCustomerNumberOfDependents(Integer customerNumberOfDependents) {
        this.customerNumberOfDependents = customerNumberOfDependents;
    }

    @JsonProperty("customerOccupationCode")
    public String getCustomerOccupationCode() {
        return customerOccupationCode;
    }

    @JsonProperty("customerOccupationCode")
    public void setCustomerOccupationCode(String customerOccupationCode) {
        this.customerOccupationCode = customerOccupationCode;
    }

    @JsonProperty("customerResidencyStatus")
    public String getCustomerResidencyStatus() {
        return customerResidencyStatus;
    }

    @JsonProperty("customerResidencyStatus")
    public void setCustomerResidencyStatus(String customerResidencyStatus) {
        this.customerResidencyStatus = customerResidencyStatus;
    }

    @JsonProperty("customerGroupScheme")
    public String getCustomerGroupScheme() {
        return customerGroupScheme;
    }

    @JsonProperty("customerGroupScheme")
    public void setCustomerGroupScheme(String customerGroupScheme) {
        this.customerGroupScheme = customerGroupScheme;
    }

    @JsonProperty("customerAnnualIncome")
    public Long getCustomerAnnualIncome() {
        return customerAnnualIncome;
    }

    @JsonProperty("customerAnnualIncome")
    public void setCustomerAnnualIncome(Long customerAnnualIncome) {
        this.customerAnnualIncome = customerAnnualIncome;
    }

    @JsonProperty("customerPropertyBonded")
    public String getCustomerPropertyBonded() {
        return customerPropertyBonded;
    }

    @JsonProperty("customerPropertyBonded")
    public void setCustomerPropertyBonded(String customerPropertyBonded) {
        this.customerPropertyBonded = customerPropertyBonded;
    }

    @JsonProperty("customerPropertyOwnership")
    public String getCustomerPropertyOwnership() {
        return customerPropertyOwnership;
    }

    @JsonProperty("customerPropertyOwnership")
    public void setCustomerPropertyOwnership(String customerPropertyOwnership) {
        this.customerPropertyOwnership = customerPropertyOwnership;
    }

    @JsonProperty("customerVipIndicator")
    public String getCustomerVipIndicator() {
        return customerVipIndicator;
    }

    @JsonProperty("customerVipIndicator")
    public void setCustomerVipIndicator(String customerVipIndicator) {
        this.customerVipIndicator = customerVipIndicator;
    }

    @JsonProperty("customerVipCategory")
    public String getCustomerVipCategory() {
        return customerVipCategory;
    }

    @JsonProperty("customerVipCategory")
    public void setCustomerVipCategory(String customerVipCategory) {
        this.customerVipCategory = customerVipCategory;
    }

    @JsonProperty("customerSensitiveFlag")
    public String getCustomerSensitiveFlag() {
        return customerSensitiveFlag;
    }

    @JsonProperty("customerSensitiveFlag")
    public void setCustomerSensitiveFlag(String customerSensitiveFlag) {
        this.customerSensitiveFlag = customerSensitiveFlag;
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
