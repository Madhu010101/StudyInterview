package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Identifier {

    @JsonProperty
    private String companyEntpsTypeCode;
    @JsonProperty
    private String identifierEndDate;
    @JsonProperty
    private String identifierEntpsTypeCode;
    @JsonProperty
    private String identifierNumber;
    @JsonProperty
    private String identifierStartDate;
    @JsonProperty
    private String identifierStatusEntpsTypeCode;
    @JsonProperty
    private String identifierSystemEntpsTypeCode;
    @JsonProperty
    private String jurisdictionCountryEntpsCode;
    @JsonProperty
    private Integer jurisdictionId;
    @JsonProperty
    private String roleEntpsTypeCode;
    @JsonProperty
    private String identifierRoleActiveIndicator;

    public String getCompanyEntpsTypeCode() {
        return companyEntpsTypeCode;
    }

    public void setCompanyEntpsTypeCode(String companyEntpsTypeCode) {
        this.companyEntpsTypeCode = companyEntpsTypeCode;
    }

    public String getIdentifierEndDate() {
        return identifierEndDate;
    }

    public void setIdentifierEndDate(String identifierEndDate) {
        this.identifierEndDate = identifierEndDate;
    }

    public String getIdentifierEntpsTypeCode() {
        return identifierEntpsTypeCode;
    }

    public void setIdentifierEntpsTypeCode(String identifierEntpsTypeCode) {
        this.identifierEntpsTypeCode = identifierEntpsTypeCode;
    }

    public String getIdentifierNumber() {
        return identifierNumber;
    }

    public void setIdentifierNumber(String identifierNumber) {
        this.identifierNumber = identifierNumber;
    }

    public String getIdentifierStartDate() {
        return identifierStartDate;
    }

    public void setIdentifierStartDate(String identifierStartDate) {
        this.identifierStartDate = identifierStartDate;
    }

    public String getIdentifierStatusEntpsTypeCode() {
        return identifierStatusEntpsTypeCode;
    }

    public void setIdentifierStatusEntpsTypeCode(String identifierStatusEntpsTypeCode) {
        this.identifierStatusEntpsTypeCode = identifierStatusEntpsTypeCode;
    }

    public String getIdentifierSystemEntpsTypeCode() {
        return identifierSystemEntpsTypeCode;
    }

    public void setIdentifierSystemEntpsTypeCode(String identifierSystemEntpsTypeCode) {
        this.identifierSystemEntpsTypeCode = identifierSystemEntpsTypeCode;
    }

    public String getJurisdictionCountryEntpsCode() {
        return jurisdictionCountryEntpsCode;
    }

    public void setJurisdictionCountryEntpsCode(String jurisdictionCountryEntpsCode) {
        this.jurisdictionCountryEntpsCode = jurisdictionCountryEntpsCode;
    }

    public Integer getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(Integer jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    public String getRoleEntpsTypeCode() {
        return roleEntpsTypeCode;
    }

    public void setRoleEntpsTypeCode(String roleEntpsTypeCode) {
        this.roleEntpsTypeCode = roleEntpsTypeCode;
    }

    public String getIdentifierRoleActiveIndicator() {
        return identifierRoleActiveIndicator;
    }

    public void setIdentifierRoleActiveIndicator(String identifierRoleActiveIndicator) {
        this.identifierRoleActiveIndicator = identifierRoleActiveIndicator;
    }
}
