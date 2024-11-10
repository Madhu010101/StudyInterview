
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
    "customerWorkphoneDiallingCode",
    "customerWorkphoneNumber"
})
@Generated("jsonschema2pojo")
public class Cis1358WorkNumber {

    @JsonProperty("customerWorkphoneDiallingCode")
    private String customerWorkphoneDiallingCode;
    @JsonProperty("customerWorkphoneNumber")
    private String customerWorkphoneNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customerWorkphoneDiallingCode")
    public String getCustomerWorkphoneDiallingCode() {
        return customerWorkphoneDiallingCode;
    }

    @JsonProperty("customerWorkphoneDiallingCode")
    public void setCustomerWorkphoneDiallingCode(String customerWorkphoneDiallingCode) {
        this.customerWorkphoneDiallingCode = customerWorkphoneDiallingCode;
    }

    @JsonProperty("customerWorkphoneNumber")
    public String getCustomerWorkphoneNumber() {
        return customerWorkphoneNumber;
    }

    @JsonProperty("customerWorkphoneNumber")
    public void setCustomerWorkphoneNumber(String customerWorkphoneNumber) {
        this.customerWorkphoneNumber = customerWorkphoneNumber;
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
