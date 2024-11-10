package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonPropertyOrder({"nameSplitData", "customerCountryOfBirth", "customerCountryOfPermanentResidence", "customerCountryOfCitizenship", "customerCountryOfNationality", "dateOfBirth", "customerAge", "customerRace", "customerGender", "customerMaritalStatus", "customerMaritalContract", "customerMaritalConsent", "customerNumberOfDependants", "customerOccupationCode", "customerResidencyStatus", "customerGroupScheme", "customerAnnualIncome", "customerAnnualIncomeCurrency", "customerPropertyBonded", "customerPropertyOwnership", "customerVIPIndicator", "customerVIPCategory", "customerVIPDescription", "customerDateDeceased"

})
public class CoreEnquireDemographicIndividualData implements Serializable {

    private CoreEnquireNameSplitData nameSplitData;

    private String customerCountryOfBirth;

    private String customerCountryOfPermanentResidence;

    private String customerCountryOfCitizenship;

    private String customerCountryOfNationality;

    private Integer dateOfBirth;

    private Integer customerAge;

    private String customerRace;

    private String customerGender;

    private String customerMaritalStatus;

    private String customerMaritalContract;

    private String customerMaritalConsent;


    private Integer customerNumberOfDependants;


    private String customerOccupationCode;


    private String customerResidencyStatus;


    private String customerGroupScheme;


    private Long customerAnnualIncome;

    private String customerAnnualIncomeCurrency;

    private String customerPropertyBonded;

    private String customerPropertyOwnership;

    private String customerVIPIndicator;

    private String customerVIPCategory;

    private String customerVIPDescription;


    private Integer customerDateDeceased;

    public CoreEnquireNameSplitData getNameSplitData() {
        return nameSplitData;
    }

    public void setNameSplitData(CoreEnquireNameSplitData nameSplitData) {
        this.nameSplitData = nameSplitData;
    }

    public String getCustomerCountryOfBirth() {
        return customerCountryOfBirth;
    }

    public void setCustomerCountryOfBirth(String customerCountryOfBirth) {
        this.customerCountryOfBirth = customerCountryOfBirth;
    }

    public String getCustomerCountryOfPermanentResidence() {
        return customerCountryOfPermanentResidence;
    }

    public void setCustomerCountryOfPermanentResidence(String customerCountryOfPermanentResidence) {
        this.customerCountryOfPermanentResidence = customerCountryOfPermanentResidence;
    }

    public String getCustomerCountryOfCitizenship() {
        return customerCountryOfCitizenship;
    }

    public void setCustomerCountryOfCitizenship(String customerCountryOfCitizenship) {
        this.customerCountryOfCitizenship = customerCountryOfCitizenship;
    }

    public String getCustomerCountryOfNationality() {
        return customerCountryOfNationality;
    }

    public void setCustomerCountryOfNationality(String customerCountryOfNationality) {
        this.customerCountryOfNationality = customerCountryOfNationality;
    }

    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Integer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(Integer customerAge) {
        this.customerAge = customerAge;
    }

    public String getCustomerRace() {
        return customerRace;
    }

    public void setCustomerRace(String customerRace) {
        this.customerRace = customerRace;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerMaritalStatus() {
        return customerMaritalStatus;
    }

    public void setCustomerMaritalStatus(String customerMaritalStatus) {
        this.customerMaritalStatus = customerMaritalStatus;
    }

    public String getCustomerMaritalContract() {
        return customerMaritalContract;
    }

    public void setCustomerMaritalContract(String customerMaritalContract) {
        this.customerMaritalContract = customerMaritalContract;
    }

    public String getCustomerMaritalConsent() {
        return customerMaritalConsent;
    }

    public void setCustomerMaritalConsent(String customerMaritalConsent) {
        this.customerMaritalConsent = customerMaritalConsent;
    }

    public Integer getCustomerNumberOfDependants() {
        return customerNumberOfDependants;
    }

    public void setCustomerNumberOfDependants(Integer customerNumberOfDependants) {
        this.customerNumberOfDependants = customerNumberOfDependants;
    }

    public String getCustomerOccupationCode() {
        return customerOccupationCode;
    }

    public void setCustomerOccupationCode(String customerOccupationCode) {
        this.customerOccupationCode = customerOccupationCode;
    }

    public String getCustomerResidencyStatus() {
        return customerResidencyStatus;
    }

    public void setCustomerResidencyStatus(String customerResidencyStatus) {
        this.customerResidencyStatus = customerResidencyStatus;
    }

    public String getCustomerGroupScheme() {
        return customerGroupScheme;
    }

    public void setCustomerGroupScheme(String customerGroupScheme) {
        this.customerGroupScheme = customerGroupScheme;
    }

    public Long getCustomerAnnualIncome() {
        return customerAnnualIncome;
    }

    public void setCustomerAnnualIncome(Long customerAnnualIncome) {
        this.customerAnnualIncome = customerAnnualIncome;
    }

    public String getCustomerAnnualIncomeCurrency() {
        return customerAnnualIncomeCurrency;
    }

    public void setCustomerAnnualIncomeCurrency(String customerAnnualIncomeCurrency) {
        this.customerAnnualIncomeCurrency = customerAnnualIncomeCurrency;
    }

    public String getCustomerPropertyBonded() {
        return customerPropertyBonded;
    }

    public void setCustomerPropertyBonded(String customerPropertyBonded) {
        this.customerPropertyBonded = customerPropertyBonded;
    }

    public String getCustomerPropertyOwnership() {
        return customerPropertyOwnership;
    }

    public void setCustomerPropertyOwnership(String customerPropertyOwnership) {
        this.customerPropertyOwnership = customerPropertyOwnership;
    }

    public String getCustomerVIPIndicator() {
        return customerVIPIndicator;
    }

    public void setCustomerVIPIndicator(String customerVIPIndicator) {
        this.customerVIPIndicator = customerVIPIndicator;
    }

    public String getCustomerVIPCategory() {
        return customerVIPCategory;
    }

    public void setCustomerVIPCategory(String customerVIPCategory) {
        this.customerVIPCategory = customerVIPCategory;
    }

    public String getCustomerVIPDescription() {
        return customerVIPDescription;
    }

    public void setCustomerVIPDescription(String customerVIPDescription) {
        this.customerVIPDescription = customerVIPDescription;
    }

    public Integer getCustomerDateDeceased() {
        return customerDateDeceased;
    }

    public void setCustomerDateDeceased(Integer customerDateDeceased) {
        this.customerDateDeceased = customerDateDeceased;
    }

    @Override
    public String toString() {
        return "CoreEnquireDemographicIndividualData{" + "nameSplitData='" + nameSplitData + '\'' + ", customerCountryOfBirth='" + customerCountryOfBirth + '\'' + ", customerCountryOfPermanentResidence='" + customerCountryOfPermanentResidence + '\'' + ", customerCountryOfCitizenship='" + customerCountryOfCitizenship + '\'' + ", customerCountryOfNationality='" + customerCountryOfNationality + '\'' + ", dateOfBirth='" + dateOfBirth + '\'' + ", customerAge='" + customerAge + '\'' + ", customerRace='" + customerRace + '\'' + ", customerGender='" + customerGender + '\'' + ", customerMaritalStatus='" + customerMaritalStatus + '\'' + ", customerMaritalContract='" + customerMaritalContract + '\'' + ", customerMaritalConsent='" + customerMaritalConsent + '\'' + ", customerNumberOfDependants='" + customerNumberOfDependants + '\'' + ", customerOccupationCode='" + customerOccupationCode + '\'' + ", customerResidencyStatus='" + customerResidencyStatus + '\'' + ", customerGroupScheme='" + customerGroupScheme + '\'' + ", customerAnnualIncome='" + customerAnnualIncome + '\'' + ", customerAnnualIncomeCurrency='" + customerAnnualIncomeCurrency + '\'' + ", customerPropertyBonded='" + customerPropertyBonded + '\'' + ", customerPropertyOwnership='" + customerPropertyOwnership + '\'' + ", customerVIPIndicator='" + customerVIPIndicator + '\'' + ", customerVIPCategory='" + customerVIPCategory + '\'' + ", customerVIPDescription='" + customerVIPDescription + '\'' + ", customerDateDeceased='" + customerDateDeceased + '\'' + '}';
    }

}
