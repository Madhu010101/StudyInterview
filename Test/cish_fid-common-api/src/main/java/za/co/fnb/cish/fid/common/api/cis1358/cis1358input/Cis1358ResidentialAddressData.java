
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
    "residentialAddressCareOfLine",
    "residentialAddressStreetLine1",
    "residentialAddressStreetLine2",
    "residentialAddressCity",
    "residentialAddressState",
    "residentialAddressZipCode",
    "residentialAddressCountryCode"
})
@Generated("jsonschema2pojo")
public class Cis1358ResidentialAddressData {

    @JsonProperty("residentialAddressCareOfLine")
    private String residentialAddressCareOfLine;
    @JsonProperty("residentialAddressStreetLine1")
    private String residentialAddressStreetLine1;
    @JsonProperty("residentialAddressStreetLine2")
    private String residentialAddressStreetLine2;
    @JsonProperty("residentialAddressCity")
    private String residentialAddressCity;
    @JsonProperty("residentialAddressState")
    private String residentialAddressState;
    @JsonProperty("residentialAddressZipCode")
    private String residentialAddressZipCode;
    @JsonProperty("residentialAddressCountryCode")
    private String residentialAddressCountryCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("residentialAddressCareOfLine")
    public String getResidentialAddressCareOfLine() {
        return residentialAddressCareOfLine;
    }

    @JsonProperty("residentialAddressCareOfLine")
    public void setResidentialAddressCareOfLine(String residentialAddressCareOfLine) {
        this.residentialAddressCareOfLine = residentialAddressCareOfLine;
    }

    @JsonProperty("residentialAddressStreetLine1")
    public String getResidentialAddressStreetLine1() {
        return residentialAddressStreetLine1;
    }

    @JsonProperty("residentialAddressStreetLine1")
    public void setResidentialAddressStreetLine1(String residentialAddressStreetLine1) {
        this.residentialAddressStreetLine1 = residentialAddressStreetLine1;
    }

    @JsonProperty("residentialAddressStreetLine2")
    public String getResidentialAddressStreetLine2() {
        return residentialAddressStreetLine2;
    }

    @JsonProperty("residentialAddressStreetLine2")
    public void setResidentialAddressStreetLine2(String residentialAddressStreetLine2) {
        this.residentialAddressStreetLine2 = residentialAddressStreetLine2;
    }

    @JsonProperty("residentialAddressCity")
    public String getResidentialAddressCity() {
        return residentialAddressCity;
    }

    @JsonProperty("residentialAddressCity")
    public void setResidentialAddressCity(String residentialAddressCity) {
        this.residentialAddressCity = residentialAddressCity;
    }

    @JsonProperty("residentialAddressState")
    public String getResidentialAddressState() {
        return residentialAddressState;
    }

    @JsonProperty("residentialAddressState")
    public void setResidentialAddressState(String residentialAddressState) {
        this.residentialAddressState = residentialAddressState;
    }

    @JsonProperty("residentialAddressZipCode")
    public String getResidentialAddressZipCode() {
        return residentialAddressZipCode;
    }

    @JsonProperty("residentialAddressZipCode")
    public void setResidentialAddressZipCode(String residentialAddressZipCode) {
        this.residentialAddressZipCode = residentialAddressZipCode;
    }

    @JsonProperty("residentialAddressCountryCode")
    public String getResidentialAddressCountryCode() {
        return residentialAddressCountryCode;
    }

    @JsonProperty("residentialAddressCountryCode")
    public void setResidentialAddressCountryCode(String residentialAddressCountryCode) {
        this.residentialAddressCountryCode = residentialAddressCountryCode;
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
