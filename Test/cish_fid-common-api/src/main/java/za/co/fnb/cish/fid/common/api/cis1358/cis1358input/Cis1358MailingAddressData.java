
package za.co.fnb.cish.fid.common.api.cis1358.cis1358input;

import java.util.HashMap;
import java.util.Map;
import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mailingAddressCareOfLine",
    "mailingAddressStreetLine1",
    "mailingAddressStreetLine2",
    "mailingAddressCity",
    "mailingAddressState",
    "mailingAddressZipCode",
    "mailingAddressCountryCode"
})
@Generated("jsonschema2pojo")
public class Cis1358MailingAddressData {

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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
