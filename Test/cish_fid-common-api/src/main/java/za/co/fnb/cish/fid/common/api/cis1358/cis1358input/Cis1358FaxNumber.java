
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
    "customerFaxphoneDiallingCode",
    "customerFaxphoneNumber"
})
@Generated("jsonschema2pojo")
public class Cis1358FaxNumber {

    @JsonProperty("customerFaxphoneDiallingCode")
    private String customerFaxphoneDiallingCode;
    @JsonProperty("customerFaxphoneNumber")
    private String customerFaxphoneNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customerFaxphoneDiallingCode")
    public String getCustomerFaxphoneDiallingCode() {
        return customerFaxphoneDiallingCode;
    }

    @JsonProperty("customerFaxphoneDiallingCode")
    public void setCustomerFaxphoneDiallingCode(String customerFaxphoneDiallingCode) {
        this.customerFaxphoneDiallingCode = customerFaxphoneDiallingCode;
    }

    @JsonProperty("customerFaxphoneNumber")
    public String getCustomerFaxphoneNumber() {
        return customerFaxphoneNumber;
    }

    @JsonProperty("customerFaxphoneNumber")
    public void setCustomerFaxphoneNumber(String customerFaxphoneNumber) {
        this.customerFaxphoneNumber = customerFaxphoneNumber;
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
