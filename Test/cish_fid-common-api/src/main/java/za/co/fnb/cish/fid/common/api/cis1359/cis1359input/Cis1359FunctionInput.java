
package za.co.fnb.cish.fid.common.api.cis1359.cis1359input;

import java.util.LinkedHashMap;
import java.util.Map;
import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import za.co.fnb.cish.fid.common.api.common.ZosFunctionRequest;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "inputKey",
    "customerEchoToken",
    "regulatoryInput"
})
@Generated("jsonschema2pojo")
public class Cis1359FunctionInput extends ZosFunctionRequest {

    @JsonProperty("inputKey")
    private Cis1359InputKey inputKey;
    @JsonProperty("customerEchoToken")
    private String customerEchoToken;
    @JsonProperty("regulatoryInput")
    private Cis1359RegulatoryInput regulatoryInput;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("inputKey")
    public Cis1359InputKey getInputKey() {
        return inputKey;
    }

    @JsonProperty("inputKey")
    public void setInputKey(Cis1359InputKey inputKey) {
        this.inputKey = inputKey;
    }

    @JsonProperty("customerEchoToken")
    public String getCustomerEchoToken() {
        return customerEchoToken;
    }

    @JsonProperty("customerEchoToken")
    public void setCustomerEchoToken(String customerEchoToken) {
        this.customerEchoToken = customerEchoToken;
    }

    @JsonProperty("regulatoryInput")
    public Cis1359RegulatoryInput getRegulatoryInput() {
        return regulatoryInput;
    }

    @JsonProperty("regulatoryInput")
    public void setRegulatoryInput(Cis1359RegulatoryInput regulatoryInput) {
        this.regulatoryInput = regulatoryInput;
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
