package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DigitalAddress {

    @JsonProperty
    private String digitalAddress;
    @JsonProperty
    private String digitalAddressEntpsTypeCode;

    public String getDigitalAddress() {
        return digitalAddress;
    }

    public void setDigitalAddress(String digitalAddress) {
        this.digitalAddress = digitalAddress;
    }

    public String getDigitalAddressEntpsTypeCode() {
        return digitalAddressEntpsTypeCode;
    }

    public void setDigitalAddressEntpsTypeCode(String digitalAddressEntpsTypeCode) {
        this.digitalAddressEntpsTypeCode = digitalAddressEntpsTypeCode;
    }
}
