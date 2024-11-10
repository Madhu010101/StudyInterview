package za.co.fnb.cish.fid.common.api.cis1359.cis1359output;

import com.fasterxml.jackson.annotation.*;

import jakarta.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"correlation", "payload"})
@Generated("jsonschema2pojo")
public class RegMaintenData {

    @JsonProperty("correlation")
    private RegMaintenCorrelation correlation;
    @JsonProperty("payload")
    private Cis1359ZosPayloadResponse payload;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("correlation")
    public RegMaintenCorrelation getCorrelation() {
        return correlation;
    }

    @JsonProperty("correlation")
    public void setCorrelation(RegMaintenCorrelation correlation) {
        this.correlation = correlation;
    }

    @JsonProperty("payload")
    public Cis1359ZosPayloadResponse getPayload() {
        return payload;
    }

    @JsonProperty("payload")
    public void setPayload(Cis1359ZosPayloadResponse payload) {
        this.payload = payload;
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
