package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TelephonicAddress {
    @JsonProperty
    private String telephoneAreaDailCode;
    @JsonProperty
    private String telephoneCountryDailCode;
    @JsonProperty
    private String telephoneEntpsTypeCode;
    @JsonProperty
    private String telephoneExtensionNumber;
    @JsonProperty
    private String telephoneFullNumber;
    @JsonProperty
    private String telephoneNumber;

    public String getTelephoneAreaDailCode() {
        return telephoneAreaDailCode;
    }

    public void setTelephoneAreaDailCode(String telephoneAreaDailCode) {
        this.telephoneAreaDailCode = telephoneAreaDailCode;
    }

    public String getTelephoneCountryDailCode() {
        return telephoneCountryDailCode;
    }

    public void setTelephoneCountryDailCode(String telephoneCountryDailCode) {
        this.telephoneCountryDailCode = telephoneCountryDailCode;
    }

    public String getTelephoneEntpsTypeCode() {
        return telephoneEntpsTypeCode;
    }

    public void setTelephoneEntpsTypeCode(String telephoneEntpsTypeCode) {
        this.telephoneEntpsTypeCode = telephoneEntpsTypeCode;
    }

    public String getTelephoneExtensionNumber() {
        return telephoneExtensionNumber;
    }

    public void setTelephoneExtensionNumber(String telephoneExtensionNumber) {
        this.telephoneExtensionNumber = telephoneExtensionNumber;
    }

    public String getTelephoneFullNumber() {
        return telephoneFullNumber;
    }

    public void setTelephoneFullNumber(String telephoneFullNumber) {
        this.telephoneFullNumber = telephoneFullNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
