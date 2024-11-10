package za.co.fnb.cish.fid.common.api.cis1358.cis1358output;

import com.fasterxml.jackson.annotation.*;

import jakarta.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"correlation", "payload"})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("correlation")
    private Correlation correlation;
    @JsonProperty("payload")
    private Cis1358ZosPayloadResponse payload;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("correlation")
    public Correlation getCorrelation() {
        return correlation;
    }

    @JsonProperty("correlation")
    public void setCorrelation(Correlation correlation) {
        this.correlation = correlation;
    }

    @JsonProperty("payload")
    public Cis1358ZosPayloadResponse getPayload() {
        return payload;
    }

    @JsonProperty("payload")
    public void setPayload(Cis1358ZosPayloadResponse payload) {
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
