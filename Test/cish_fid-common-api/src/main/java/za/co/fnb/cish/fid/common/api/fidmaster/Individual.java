package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Individual {
    @JsonProperty
    private String birthCityName;
    @JsonProperty
    private String birthCountryEntpsCode;
    @JsonProperty
    private String birthDate;
    @JsonProperty
    private String deceasedDate;
    @JsonProperty
    private String genderEntpsTypeCode;
    @JsonProperty
    private String maritalContractEntpsTypeCode;
    @JsonProperty
    private String maritalStatusEntpsTypeCode;
    @JsonProperty
    private String nationalityCountryEntpsCode;
    @JsonProperty
    private Integer numberOfDependants;
    @JsonProperty
    private String permanentResidenceCountryEntpsCode;
    @JsonProperty
    private String titleEntpsTypeCode;
    @JsonProperty
    private String maritalConsentIndicator;
    @JsonProperty
    private List<Education> educations;
    @JsonProperty
    private List<Employment> employments;

    public String getBirthCityName() {
        return birthCityName;
    }

    public void setBirthCityName(String birthCityName) {
        this.birthCityName = birthCityName;
    }

    public String getBirthCountryEntpsCode() {
        return birthCountryEntpsCode;
    }

    public void setBirthCountryEntpsCode(String birthCountryEntpsCode) {
        this.birthCountryEntpsCode = birthCountryEntpsCode;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDeceasedDate() {
        return deceasedDate;
    }

    public void setDeceasedDate(String deceasedDate) {
        this.deceasedDate = deceasedDate;
    }

    public String getGenderEntpsTypeCode() {
        return genderEntpsTypeCode;
    }

    public void setGenderEntpsTypeCode(String genderEntpsTypeCode) {
        this.genderEntpsTypeCode = genderEntpsTypeCode;
    }

    public String getMaritalContractEntpsTypeCode() {
        return maritalContractEntpsTypeCode;
    }

    public void setMaritalContractEntpsTypeCode(String maritalContractEntpsTypeCode) {
        this.maritalContractEntpsTypeCode = maritalContractEntpsTypeCode;
    }

    public String getMaritalStatusEntpsTypeCode() {
        return maritalStatusEntpsTypeCode;
    }

    public void setMaritalStatusEntpsTypeCode(String maritalStatusEntpsTypeCode) {
        this.maritalStatusEntpsTypeCode = maritalStatusEntpsTypeCode;
    }

    public String getNationalityCountryEntpsCode() {
        return nationalityCountryEntpsCode;
    }

    public void setNationalityCountryEntpsCode(String nationalityCountryEntpsCode) {
        this.nationalityCountryEntpsCode = nationalityCountryEntpsCode;
    }

    public Integer getNumberOfDependants() {
        return numberOfDependants;
    }

    public void setNumberOfDependants(Integer numberOfDependants) {
        this.numberOfDependants = numberOfDependants;
    }

    public String getPermanentResidenceCountryEntpsCode() {
        return permanentResidenceCountryEntpsCode;
    }

    public void setPermanentResidenceCountryEntpsCode(String permanentResidenceCountryEntpsCode) {
        this.permanentResidenceCountryEntpsCode = permanentResidenceCountryEntpsCode;
    }

    public String getTitleEntpsTypeCode() {
        return titleEntpsTypeCode;
    }

    public void setTitleEntpsTypeCode(String titleEntpsTypeCode) {
        this.titleEntpsTypeCode = titleEntpsTypeCode;
    }

    public String getMaritalConsentIndicator() {
        return maritalConsentIndicator;
    }

    public void setMaritalConsentIndicator(String maritalConsentIndicator) {
        this.maritalConsentIndicator = maritalConsentIndicator;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public List<Employment> getEmployments() {
        return employments;
    }

    public void setEmployments(List<Employment> employments) {
        this.employments = employments;
    }
}
