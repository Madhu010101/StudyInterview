
package za.co.fnb.cish.fid.common.api.cis1359.cis1359output;

import com.fasterxml.jackson.annotation.*;

import jakarta.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "traceID"
})
@Generated("jsonschema2pojo")
public class RegMaintenCorrelation {

    @JsonProperty("traceID")
    private String traceID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("traceID")
    public String getTraceID() {
        return traceID;
    }

    @JsonProperty("traceID")
    public void setTraceID(String traceID) {
        this.traceID = traceID;
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
