
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
    "customerHomephoneDiallingCode",
    "customerHomephoneNumber"
})
@Generated("jsonschema2pojo")
public class Cis1358HomeNumber {

    @JsonProperty("customerHomephoneDiallingCode")
    private String customerHomephoneDiallingCode;
    @JsonProperty("customerHomephoneNumber")
    private String customerHomephoneNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customerHomephoneDiallingCode")
    public String getCustomerHomephoneDiallingCode() {
        return customerHomephoneDiallingCode;
    }

    @JsonProperty("customerHomephoneDiallingCode")
    public void setCustomerHomephoneDiallingCode(String customerHomephoneDiallingCode) {
        this.customerHomephoneDiallingCode = customerHomephoneDiallingCode;
    }

    @JsonProperty("customerHomephoneNumber")
    public String getCustomerHomephoneNumber() {
        return customerHomephoneNumber;
    }

    @JsonProperty("customerHomephoneNumber")
    public void setCustomerHomephoneNumber(String customerHomephoneNumber) {
        this.customerHomephoneNumber = customerHomephoneNumber;
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
