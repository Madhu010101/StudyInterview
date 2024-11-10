
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
    "errorCode",
    "errorMessage",
    "errorApplId"
})
@Generated("jsonschema2pojo")
public class ErrorTable {

    @JsonProperty("errorCode")
    private Integer errorCode;
    @JsonProperty("errorMessage")
    private String errorMessage;
    @JsonProperty("errorApplId")
    private Integer errorApplId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("errorCode")
    public Integer getErrorCode() {
        return errorCode;
    }

    @JsonProperty("errorCode")
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    @JsonProperty("errorMessage")
    public String getErrorMessage() {
        return errorMessage;
    }

    @JsonProperty("errorMessage")
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @JsonProperty("errorApplId")
    public Integer getErrorApplId() {
        return errorApplId;
    }

    @JsonProperty("errorApplId")
    public void setErrorApplId(Integer errorApplId) {
        this.errorApplId = errorApplId;
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
