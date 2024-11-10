package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Key {

    @JsonProperty
    private String keyCompanyEntpsTypeCode;
    @JsonProperty
    private String keyIdentifierEntpsTypeCode;
    @JsonProperty
    private Integer keyIdentifierJurisdictionId;
    @JsonProperty
    private String keyIdentifierNumber;
    @JsonProperty
    private String keyIdentifierSystemEntpsTypeCode;
    @JsonProperty
    private String keyJurisdictionCountryEntpsCode;

    public String getKeyCompanyEntpsTypeCode() {
        return keyCompanyEntpsTypeCode;
    }

    public void setKeyCompanyEntpsTypeCode(String keyCompanyEntpsTypeCode) {
        this.keyCompanyEntpsTypeCode = keyCompanyEntpsTypeCode;
    }

    public String getKeyIdentifierEntpsTypeCode() {
        return keyIdentifierEntpsTypeCode;
    }

    public void setKeyIdentifierEntpsTypeCode(String keyIdentifierEntpsTypeCode) {
        this.keyIdentifierEntpsTypeCode = keyIdentifierEntpsTypeCode;
    }

    public Integer getKeyIdentifierJurisdictionId() {
        return keyIdentifierJurisdictionId;
    }

    public void setKeyIdentifierJurisdictionId(Integer keyIdentifierJurisdictionId) {
        this.keyIdentifierJurisdictionId = keyIdentifierJurisdictionId;
    }

    public String getKeyIdentifierNumber() {
        return keyIdentifierNumber;
    }

    public void setKeyIdentifierNumber(String keyIdentifierNumber) {
        this.keyIdentifierNumber = keyIdentifierNumber;
    }

    public String getKeyIdentifierSystemEntpsTypeCode() {
        return keyIdentifierSystemEntpsTypeCode;
    }

    public void setKeyIdentifierSystemEntpsTypeCode(String keyIdentifierSystemEntpsTypeCode) {
        this.keyIdentifierSystemEntpsTypeCode = keyIdentifierSystemEntpsTypeCode;
    }

    public String getKeyJurisdictionCountryEntpsCode() {
        return keyJurisdictionCountryEntpsCode;
    }

    public void setKeyJurisdictionCountryEntpsCode(String keyJurisdictionCountryEntpsCode) {
        this.keyJurisdictionCountryEntpsCode = keyJurisdictionCountryEntpsCode;
    }
}
