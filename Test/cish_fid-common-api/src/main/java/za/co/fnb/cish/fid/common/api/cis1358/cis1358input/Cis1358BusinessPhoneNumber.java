
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
    "customerContactphoneDiallingCode",
    "customerContactphoneNumber"
})
@Generated("jsonschema2pojo")
public class Cis1358BusinessPhoneNumber {

    @JsonProperty("customerContactphoneDiallingCode")
    private String customerContactphoneDiallingCode;
    @JsonProperty("customerContactphoneNumber")
    private String customerContactphoneNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customerContactphoneDiallingCode")
    public String getCustomerContactphoneDiallingCode() {
        return customerContactphoneDiallingCode;
    }

    @JsonProperty("customerContactphoneDiallingCode")
    public void setCustomerContactphoneDiallingCode(String customerContactphoneDiallingCode) {
        this.customerContactphoneDiallingCode = customerContactphoneDiallingCode;
    }

    @JsonProperty("customerContactphoneNumber")
    public String getCustomerContactphoneNumber() {
        return customerContactphoneNumber;
    }

    @JsonProperty("customerContactphoneNumber")
    public void setCustomerContactphoneNumber(String customerContactphoneNumber) {
        this.customerContactphoneNumber = customerContactphoneNumber;
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
