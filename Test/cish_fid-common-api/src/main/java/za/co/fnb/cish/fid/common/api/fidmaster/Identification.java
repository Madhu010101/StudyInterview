package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Identification {
    @JsonProperty
    private String citizenshipCountryEntpsCode;
    @JsonProperty
    private String identificationBarcodeNumber;
    @JsonProperty
    private String identificationEntpsTypeCode;
    @JsonProperty
    private String identificationExpiryDate;
    @JsonProperty
    private String identificationIssueDate;
    @JsonProperty
    private String identificationIssuerCountryEntpsCode;
    @JsonProperty
    private String identificationIssuerEntpsTypeCode;
    @JsonProperty
    private String identificationNumber;
    @JsonProperty
    private String identificationReferenceNumber;
    @JsonProperty
    private String identificationStatusDate;
    @JsonProperty
    private String identificationStatusEntpsTypeCode;
    @JsonProperty
    private String residencyStatusEntpsTypeCode;
    @JsonProperty
    private String identificationActiveIndicator;
    @JsonProperty
    private String primaryIdentificationIndicator;
    @JsonProperty
    private List<IdentificationName> identificationNames;

    public String getCitizenshipCountryEntpsCode() {
        return citizenshipCountryEntpsCode;
    }

    public void setCitizenshipCountryEntpsCode(String citizenshipCountryEntpsCode) {
        this.citizenshipCountryEntpsCode = citizenshipCountryEntpsCode;
    }

    public String getIdentificationBarcodeNumber() {
        return identificationBarcodeNumber;
    }

    public void setIdentificationBarcodeNumber(String identificationBarcodeNumber) {
        this.identificationBarcodeNumber = identificationBarcodeNumber;
    }

    public String getIdentificationEntpsTypeCode() {
        return identificationEntpsTypeCode;
    }

    public void setIdentificationEntpsTypeCode(String identificationEntpsTypeCode) {
        this.identificationEntpsTypeCode = identificationEntpsTypeCode;
    }

    public String getIdentificationExpiryDate() {
        return identificationExpiryDate;
    }

    public void setIdentificationExpiryDate(String identificationExpiryDate) {
        this.identificationExpiryDate = identificationExpiryDate;
    }

    public String getIdentificationIssueDate() {
        return identificationIssueDate;
    }

    public void setIdentificationIssueDate(String identificationIssueDate) {
        this.identificationIssueDate = identificationIssueDate;
    }

    public String getIdentificationIssuerCountryEntpsCode() {
        return identificationIssuerCountryEntpsCode;
    }

    public void setIdentificationIssuerCountryEntpsCode(String identificationIssuerCountryEntpsCode) {
        this.identificationIssuerCountryEntpsCode = identificationIssuerCountryEntpsCode;
    }

    public String getIdentificationIssuerEntpsTypeCode() {
        return identificationIssuerEntpsTypeCode;
    }

    public void setIdentificationIssuerEntpsTypeCode(String identificationIssuerEntpsTypeCode) {
        this.identificationIssuerEntpsTypeCode = identificationIssuerEntpsTypeCode;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationStatusDate() {
        return identificationStatusDate;
    }

    public void setIdentificationStatusDate(String identificationStatusDate) {
        this.identificationStatusDate = identificationStatusDate;
    }

    public String getIdentificationStatusEntpsTypeCode() {
        return identificationStatusEntpsTypeCode;
    }

    public void setIdentificationStatusEntpsTypeCode(String identificationStatusEntpsTypeCode) {
        this.identificationStatusEntpsTypeCode = identificationStatusEntpsTypeCode;
    }

    public String getResidencyStatusEntpsTypeCode() {
        return residencyStatusEntpsTypeCode;
    }

    public void setResidencyStatusEntpsTypeCode(String residencyStatusEntpsTypeCode) {
        this.residencyStatusEntpsTypeCode = residencyStatusEntpsTypeCode;
    }

    public List<IdentificationName> getIdentificationNames() {
        return identificationNames;
    }

    public void setIdentificationNames(List<IdentificationName> identificationNames) {
        this.identificationNames = identificationNames;
    }

    public String getIdentificationReferenceNumber() {
        return identificationReferenceNumber;
    }

    public void setIdentificationReferenceNumber(String identificationReferenceNumber) {
        this.identificationReferenceNumber = identificationReferenceNumber;
    }

    public String getIdentificationActiveIndicator() {
        return identificationActiveIndicator;
    }

    public void setIdentificationActiveIndicator(String identificationActiveIndicator) {
        this.identificationActiveIndicator = identificationActiveIndicator;
    }

    public String getPrimaryIdentificationIndicator() {
        return primaryIdentificationIndicator;
    }

    public void setPrimaryIdentificationIndicator(String primaryIdentificationIndicator) {
        this.primaryIdentificationIndicator = primaryIdentificationIndicator;
    }
}
