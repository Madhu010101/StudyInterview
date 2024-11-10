package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Organisation {
    @JsonProperty
    private String establishedCountryEntpsCode;
    @JsonProperty
    private String establishedDate;
    @JsonProperty
    private String legalResponsibilityIndicator;
    @JsonProperty
    private String operationCountryEntpsCode;
    @JsonProperty
    private String operationStartDate;
    @JsonProperty
    private String organisationEntpsTypeCode;
    @JsonProperty
    private String organisationStatusDate;
    @JsonProperty
    private String organisationStatusEntpsTypeCode;
    @JsonProperty
    private String registeredHeadOfficeCountryEntpsCode;
    @JsonProperty
    private String stateOwnedCompanyIndicator;
    @JsonProperty
    private Integer taxYearEndMonth;
    @JsonProperty
    private String tradingName;
    @JsonProperty
    private List<OrganisationClassification> organisationClassifications;
    @JsonProperty
    private Double annualTurnoverAmount;

    public String getEstablishedCountryEntpsCode() {
        return establishedCountryEntpsCode;
    }

    public void setEstablishedCountryEntpsCode(String establishedCountryEntpsCode) {
        this.establishedCountryEntpsCode = establishedCountryEntpsCode;
    }

    public String getEstablishedDate() {
        return establishedDate;
    }

    public void setEstablishedDate(String establishedDate) {
        this.establishedDate = establishedDate;
    }

    public String getLegalResponsibilityIndicator() {
        return legalResponsibilityIndicator;
    }

    public void setLegalResponsibilityIndicator(String legalResponsibilityIndicator) {
        this.legalResponsibilityIndicator = legalResponsibilityIndicator;
    }

    public String getOperationCountryEntpsCode() {
        return operationCountryEntpsCode;
    }

    public void setOperationCountryEntpsCode(String operationCountryEntpsCode) {
        this.operationCountryEntpsCode = operationCountryEntpsCode;
    }

    public String getOperationStartDate() {
        return operationStartDate;
    }

    public void setOperationStartDate(String operationStartDate) {
        this.operationStartDate = operationStartDate;
    }

    public String getOrganisationEntpsTypeCode() {
        return organisationEntpsTypeCode;
    }

    public void setOrganisationEntpsTypeCode(String organisationEntpsTypeCode) {
        this.organisationEntpsTypeCode = organisationEntpsTypeCode;
    }

    public String getOrganisationStatusDate() {
        return organisationStatusDate;
    }

    public void setOrganisationStatusDate(String organisationStatusDate) {
        this.organisationStatusDate = organisationStatusDate;
    }

    public String getOrganisationStatusEntpsTypeCode() {
        return organisationStatusEntpsTypeCode;
    }

    public void setOrganisationStatusEntpsTypeCode(String organisationStatusEntpsTypeCode) {
        this.organisationStatusEntpsTypeCode = organisationStatusEntpsTypeCode;
    }

    public String getRegisteredHeadOfficeCountryEntpsCode() {
        return registeredHeadOfficeCountryEntpsCode;
    }

    public void setRegisteredHeadOfficeCountryEntpsCode(String registeredHeadOfficeCountryEntpsCode) {
        this.registeredHeadOfficeCountryEntpsCode = registeredHeadOfficeCountryEntpsCode;
    }

    public String getStateOwnedCompanyIndicator() {
        return stateOwnedCompanyIndicator;
    }

    public void setStateOwnedCompanyIndicator(String stateOwnedCompanyIndicator) {
        this.stateOwnedCompanyIndicator = stateOwnedCompanyIndicator;
    }

    public Integer getTaxYearEndMonth() {
        return taxYearEndMonth;
    }

    public void setTaxYearEndMonth(Integer taxYearEndMonth) {
        this.taxYearEndMonth = taxYearEndMonth;
    }

    public String getTradingName() {
        return tradingName;
    }

    public void setTradingName(String tradingName) {
        this.tradingName = tradingName;
    }

    public List<OrganisationClassification> getOrganisationClassification() {
        return organisationClassifications;
    }

    public void setOrganisationClassification(List<OrganisationClassification> organisationClassification) {
        this.organisationClassifications = organisationClassification;
    }

    public List<OrganisationClassification> getOrganisationClassifications() {
        return organisationClassifications;
    }

    public void setOrganisationClassifications(List<OrganisationClassification> organisationClassifications) {
        this.organisationClassifications = organisationClassifications;
    }

    public Double getAnnualTurnoverAmount() {
        return annualTurnoverAmount;
    }

    public void setAnnualTurnoverAmount(Double annualTurnoverAmount) {
        this.annualTurnoverAmount = annualTurnoverAmount;
    }
}
