
package za.co.fnb.cish.fid.common.api.cis1359.cis1359output;

import com.fasterxml.jackson.annotation.*;

import jakarta.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "replyCode",
    "details",
    "errorTable"
})
@Generated("jsonschema2pojo")
public class RegMaintnErrors {

    @JsonProperty("replyCode")
    private Integer replyCode;
    @JsonProperty("details")
    private String details;
    @JsonProperty("errorTable")
    private List<RegMaintnErrorTable> errorTable = null;
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
    public List<RegMaintnErrorTable> getErrorTable() {
        return errorTable;
    }

    @JsonProperty("errorTable")
    public void setErrorTable(List<RegMaintnErrorTable> errorTable) {
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
