
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "stubName",
    "branch",
    "terminal",
    "operatorID",
    "originatingChannel"
})
@Generated("jsonschema2pojo")
public class Cis1359HeaderInput {

    @JsonProperty("stubName")
    private String stubName;
    @JsonProperty("branch")
    private Integer branch;
    @JsonProperty("terminal")
    private Integer terminal;
    @JsonProperty("operatorID")
    private String operatorID;
    @JsonProperty("originatingChannel")
    private String originatingChannel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("stubName")
    public String getStubName() {
        return stubName;
    }

    @JsonProperty("stubName")
    public void setStubName(String stubName) {
        this.stubName = stubName;
    }

    @JsonProperty("branch")
    public Integer getBranch() {
        return branch;
    }

    @JsonProperty("branch")
    public void setBranch(Integer branch) {
        this.branch = branch;
    }

    @JsonProperty("terminal")
    public Integer getTerminal() {
        return terminal;
    }

    @JsonProperty("terminal")
    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    @JsonProperty("operatorID")
    public String getOperatorID() {
        return operatorID;
    }

    @JsonProperty("operatorID")
    public void setOperatorID(String operatorID) {
        this.operatorID = operatorID;
    }

    @JsonProperty("originatingChannel")
    public String getOriginatingChannel() {
        return originatingChannel;
    }

    @JsonProperty("originatingChannel")
    public void setOriginatingChannel(String originatingChannel) {
        this.originatingChannel = originatingChannel;
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
