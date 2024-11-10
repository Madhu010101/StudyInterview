
package za.co.fnb.cish.fid.common.api.cis1358.cis1358output;

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
    "warningCode",
    "warningMessage"
})
@Generated("jsonschema2pojo")
public class WarningTable {

    @JsonProperty("warningCode")
    private Integer warningCode;
    @JsonProperty("warningMessage")
    private String warningMessage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("warningCode")
    public Integer getWarningCode() {
        return warningCode;
    }

    @JsonProperty("warningCode")
    public void setWarningCode(Integer warningCode) {
        this.warningCode = warningCode;
    }

    @JsonProperty("warningMessage")
    public String getWarningMessage() {
        return warningMessage;
    }

    @JsonProperty("warningMessage")
    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
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
