
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
    "customerFullName",
    "customerMiddleNames"
})
@Generated("jsonschema2pojo")
public class Cis1358NameFormat1 {

    @JsonProperty("customerFullName")
    private String customerFullName;
    @JsonProperty("customerMiddleNames")
    private String customerMiddleNames;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customerFullName")
    public String getCustomerFullName() {
        return customerFullName;
    }

    @JsonProperty("customerFullName")
    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }

    @JsonProperty("customerMiddleNames")
    public String getCustomerMiddleNames() {
        return customerMiddleNames;
    }

    @JsonProperty("customerMiddleNames")
    public void setCustomerMiddleNames(String customerMiddleNames) {
        this.customerMiddleNames = customerMiddleNames;
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
