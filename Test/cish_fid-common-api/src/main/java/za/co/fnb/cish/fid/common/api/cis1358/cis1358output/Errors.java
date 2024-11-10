
package za.co.fnb.cish.fid.common.api.cis1358.cis1358output;

import java.util.HashMap;
import java.util.List;
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
    "replyCode",
    "details",
    "errorTable"
})
@Generated("jsonschema2pojo")
public class Errors {

    @JsonProperty("replyCode")
    private Integer replyCode;
    @JsonProperty("details")
    private String details;
    @JsonProperty("errorTable")
    private List<ErrorTable> errorTable = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("replyCode")
    public Integer getReplyCode() {
        return replyCode;
    }

    @JsonProperty("replyCode")
    public void setReplyCode(Integer replyCode) {
        this.replyCode = replyCode;
    }

    @JsonProperty("details")
    public String getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(String details) {
        this.details = details;
    }

    @JsonProperty("errorTable")
    public List<ErrorTable> getErrorTable() {
        return errorTable;
    }

    @JsonProperty("errorTable")
    public void setErrorTable(List<ErrorTable> errorTable) {
        this.errorTable = errorTable;
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
