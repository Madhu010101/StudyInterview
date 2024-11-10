
package za.co.fnb.cish.fid.common.api.cis1359.cis1359output;

import com.fasterxml.jackson.annotation.*;

import jakarta.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "output"
})
@Generated("jsonschema2pojo")
public class RegMaintenanceError {

    @JsonProperty("output")
    private Cis1359Output output;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("output")
    public Cis1359Output getOutput() {
        return output;
    }

    @JsonProperty("output")
    public void setOutput(Cis1359Output output) {
        this.output = output;
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
