
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
    "customerCellphoneDiallingCode",
    "customerCellphoneNumber"
})
@Generated("jsonschema2pojo")
public class Cis1358CellphoneNumber {

    @JsonProperty("customerCellphoneDiallingCode")
    private String customerCellphoneDiallingCode;
    @JsonProperty("customerCellphoneNumber")
    private String customerCellphoneNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customerCellphoneDiallingCode")
    public String getCustomerCellphoneDiallingCode() {
        return customerCellphoneDiallingCode;
    }

    @JsonProperty("customerCellphoneDiallingCode")
    public void setCustomerCellphoneDiallingCode(String customerCellphoneDiallingCode) {
        this.customerCellphoneDiallingCode = customerCellphoneDiallingCode;
    }

    @JsonProperty("customerCellphoneNumber")
    public String getCustomerCellphoneNumber() {
        return customerCellphoneNumber;
    }

    @JsonProperty("customerCellphoneNumber")
    public void setCustomerCellphoneNumber(String customerCellphoneNumber) {
        this.customerCellphoneNumber = customerCellphoneNumber;
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
