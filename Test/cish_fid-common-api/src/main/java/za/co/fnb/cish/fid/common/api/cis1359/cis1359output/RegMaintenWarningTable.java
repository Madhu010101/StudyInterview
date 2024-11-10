
package za.co.fnb.cish.fid.common.api.cis1359.cis1359output;

import com.fasterxml.jackson.annotation.*;

import jakarta.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "warningCode",
    "warningMessage"
})
@Generated("jsonschema2pojo")
public class RegMaintenWarningTable {

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
