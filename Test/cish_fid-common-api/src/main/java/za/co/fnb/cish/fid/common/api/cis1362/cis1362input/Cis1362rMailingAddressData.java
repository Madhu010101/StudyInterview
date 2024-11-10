package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"mailingAddressCareOfLine", "mailingAddressStreetLine1", "mailingAddressStreetLine2", "mailingAddressCity", "mailingAddressState", "mailingAddressZipCode", "mailingAddressCountryCode"

})
@Generated("jsonschema2pojo")
public class Cis1362rMailingAddressData implements Serializable {

    @JsonProperty("mailingAddressCareOfLine")
    private String mailingAddressCareOfLine;

    @JsonProperty("mailingAddressStreetLine1")
    private String mailingAddressStreetLine1;

    @JsonProperty("mailingAddressStreetLine2")
    private String mailingAddressStreetLine2;

    @JsonProperty("mailingAddressCity")
    private String mailingAddressCity;

    @JsonProperty("mailingAddressState")
    private String mailingAddressState;

    @JsonProperty("mailingAddressZipCode")
    private String mailingAddressZipCode;

    @JsonProperty("mailingAddressCountryCode")
    private String mailingAddressCountryCode;

    @JsonProperty("mailingAddressCareOfLine")
    public String getMailingAddressCareOfLine() {
        return mailingAddressCareOfLine;
    }

    @JsonProperty("mailingAddressCareOfLine")
    public void setMailingAddressCareOfLine(String mailingAddressCareOfLine) {
        this.mailingAddressCareOfLine = mailingAddressCareOfLine;
    }

    @JsonProperty("mailingAddressStreetLine1")
    public String getMailingAddressStreetLine1() {
        return mailingAddressStreetLine1;
    }

    @JsonProperty("mailingAddressStreetLine1")
    public void setMailingAddressStreetLine1(String mailingAddressStreetLine1) {
        this.mailingAddressStreetLine1 = mailingAddressStreetLine1;
    }

    @JsonProperty("mailingAddressStreetLine2")
    public String getMailingAddressStreetLine2() {
        return mailingAddressStreetLine2;
    }

    @JsonProperty("mailingAddressStreetLine2")
    public void setMailingAddressStreetLine2(String mailingAddressStreetLine2) {
        this.mailingAddressStreetLine2 = mailingAddressStreetLine2;
    }

    @JsonProperty("mailingAddressCity")
    public String getMailingAddressCity() {
        return mailingAddressCity;
    }

    @JsonProperty("mailingAddressCity")
    public void setMailingAddressCity(String mailingAddressCity) {
        this.mailingAddressCity = mailingAddressCity;
    }

    @JsonProperty("mailingAddressState")
    public String getMailingAddressState() {
        return mailingAddressState;
    }

    @JsonProperty("mailingAddressState")
    public void setMailingAddressState(String mailingAddressState) {
        this.mailingAddressState = mailingAddressState;
    }

    @JsonProperty("mailingAddressZipCode")
    public String getMailingAddressZipCode() {
        return mailingAddressZipCode;
    }

    @JsonProperty("mailingAddressZipCode")
    public void setMailingAddressZipCode(String mailingAddressZipCode) {
        this.mailingAddressZipCode = mailingAddressZipCode;
    }

    @JsonProperty("mailingAddressCountryCode")
    public String getMailingAddressCountryCode() {
        return mailingAddressCountryCode;
    }

    @JsonProperty("mailingAddressCountryCode")
    public void setMailingAddressCountryCode(String mailingAddressCountryCode) {
        this.mailingAddressCountryCode = mailingAddressCountryCode;
    }

}
