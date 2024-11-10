package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"nameSplitData", "customerCountryOfBirth", "customerCountryOfPermanentResidence", "customerCountryOfCitizenship", "customerCountryOfNationality", "dateOfBirth", "customerAge", "customerRace", "customerGender", "customerMaritalStatus", "customerMaritalContract", "customerMaritalConsent", "customerNumberOfDependants", "customerOccupationCode", "customerResidencyStatus", "customerGroupScheme", "customerAnnualIncome", "customerAnnualIncomeCurrency", "customerPropertyBonded", "customerPropertyOwnership", "customerVIPIndicator", "customerVIPCategory", "customerVIPDescription", "customerDateDeceased"

})
@Generated("jsonschema2pojo")
public class Cis1362rDemographicIndividualData implements Serializable {

    @JsonProperty("nameSplitData")
    private Cis1362rNameSplitData nameSplitData;

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

    @JsonProperty("customerAge")
    private Integer customerAge;

    @JsonProperty("customerRace")
    private String customerRace;

    @JsonProperty("customerGender")
    private String customerGender;

    @JsonProperty("customerMaritalStatus")
    private String customerMaritalStatus;

    @JsonProperty("customerMaritalContract")
    private String customerMaritalContract;

    @JsonProperty("customerMaritalConsent")
    private String customerMaritalConsent;

    @JsonProperty("customerNumberOfDependants")
    private Integer customerNumberOfDependants;

    @JsonProperty("customerOccupationCode")
    private String customerOccupationCode;

    @JsonProperty("customerResidencyStatus")
    private String customerResidencyStatus;

    @JsonProperty("customerGroupScheme")
    private String customerGroupScheme;

    @JsonProperty("customerAnnualIncome")
    private Long customerAnnualIncome;

    @JsonProperty("customerAnnualIncomeCurrency")
    private String customerAnnualIncomeCurrency;

    @JsonProperty("customerPropertyBonded")
    private String customerPropertyBonded;

    @JsonProperty("customerPropertyOwnership")
    private String customerPropertyOwnership;

    @JsonProperty("customerVIPIndicator")
    private String customerVIPIndicator;

    @JsonProperty("customerVIPCategory")
    private String customerVIPCategory;

    @JsonProperty("customerVIPDescription")
    private String customerVIPDescription;


    @JsonProperty("customerDateDeceased")
    private Integer customerDateDeceased;

    @JsonProperty("nameSplitData")
    public Cis1362rNameSplitData getNameSplitData() {
        return nameSplitData;
    }

    @JsonProperty("nameSplitData")
    public void setNameSplitData(Cis1362rNameSplitData nameSplitData) {
        this.nameSplitData = nameSplitData;
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

    @JsonProperty("customerAge")
    public Integer getCustomerAge() {
        return customerAge;
    }

    @JsonProperty("customerAge")
    public void setCustomerAge(Integer customerAge) {
        this.customerAge = customerAge;
    }

    @JsonProperty("customerRace")
    public String getCustomerRace() {
        return customerRace;
    }

    @JsonProperty("customerRace")
    public void setCustomerRace(String customerRace) {
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

    @JsonProperty("customerNumberOfDependants")
    public Integer getCustomerNumberOfDependants() {
        return customerNumberOfDependants;
    }

    @JsonProperty("customerNumberOfDependants")
    public void setCustomerNumberOfDependants(Integer customerNumberOfDependants) {
        this.customerNumberOfDependants = customerNumberOfDependants;
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

    @JsonProperty("customerAnnualIncomeCurrency")
    public String getCustomerAnnualIncomeCurrency() {
        return customerAnnualIncomeCurrency;
    }

    @JsonProperty("customerAnnualIncomeCurrency")
    public void setCustomerAnnualIncomeCurrency(String customerAnnualIncomeCurrency) {
        this.customerAnnualIncomeCurrency = customerAnnualIncomeCurrency;
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

    @JsonProperty("customerVIPIndicator")
    public String getCustomerVIPIndicator() {
        return customerVIPIndicator;
    }

    @JsonProperty("customerVIPIndicator")
    public void setCustomerVIPIndicator(String customerVIPIndicator) {
        this.customerVIPIndicator = customerVIPIndicator;
    }

    @JsonProperty("customerVIPCategory")
    public String getCustomerVIPCategory() {
        return customerVIPCategory;
    }

    @JsonProperty("customerVIPCategory")
    public void setCustomerVIPCategory(String customerVIPCategory) {
        this.customerVIPCategory = customerVIPCategory;
    }

    @JsonProperty("customerVIPDescription")
    public String getCustomerVIPDescription() {
        return customerVIPDescription;
    }

    @JsonProperty("customerVIPDescription")
    public void setCustomerVIPDescription(String customerVIPDescription) {
        this.customerVIPDescription = customerVIPDescription;
    }

    @JsonProperty("customerDateDeceased")
    public Integer getCustomerDateDeceased() {
        return customerDateDeceased;
    }

    @JsonProperty("customerDateDeceased")
    public void setCustomerDateDeceased(Integer customerDateDeceased) {
        this.customerDateDeceased = customerDateDeceased;
    }

}
