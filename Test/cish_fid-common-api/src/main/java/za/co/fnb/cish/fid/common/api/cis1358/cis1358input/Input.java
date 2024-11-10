
package za.co.fnb.cish.fid.common.api.cis1358.cis1358input;

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
    "headerInput",
    "functionInput"
})
@Generated("jsonschema2pojo")
public class Input {

    @JsonProperty("headerInput")
    private HeaderInput headerInput;
    @JsonProperty("functionInput")
    private Cis1358FunctionRequest functionInput;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("headerInput")
    public HeaderInput getHeaderInput() {
        return headerInput;
    }

    @JsonProperty("headerInput")
    public void setHeaderInput(HeaderInput headerInput) {
        this.headerInput = headerInput;
    }

    @JsonProperty("functionInput")
    public Cis1358FunctionRequest getFunctionInput() {
        return functionInput;
    }

    @JsonProperty("functionInput")
    public void setFunctionInput(Cis1358FunctionRequest functionInput) {
        this.functionInput = functionInput;
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
