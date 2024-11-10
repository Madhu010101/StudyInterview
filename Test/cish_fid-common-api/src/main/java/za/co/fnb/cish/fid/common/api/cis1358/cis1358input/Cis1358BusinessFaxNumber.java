
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
    "customerBusinessphoneDiallingCode",
    "customerBusinessphoneNumber"
})
@Generated("jsonschema2pojo")
public class Cis1358BusinessFaxNumber {

    @JsonProperty("customerBusinessphoneDiallingCode")
    private String customerBusinessphoneDiallingCode;
    @JsonProperty("customerBusinessphoneNumber")
    private String customerBusinessphoneNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customerBusinessphoneDiallingCode")
    public String getCustomerBusinessphoneDiallingCode() {
        return customerBusinessphoneDiallingCode;
    }

    @JsonProperty("customerBusinessphoneDiallingCode")
    public void setCustomerBusinessphoneDiallingCode(String customerBusinessphoneDiallingCode) {
        this.customerBusinessphoneDiallingCode = customerBusinessphoneDiallingCode;
    }

    @JsonProperty("customerBusinessphoneNumber")
    public String getCustomerBusinessphoneNumber() {
        return customerBusinessphoneNumber;
    }

    @JsonProperty("customerBusinessphoneNumber")
    public void setCustomerBusinessphoneNumber(String customerBusinessphoneNumber) {
        this.customerBusinessphoneNumber = customerBusinessphoneNumber;
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
