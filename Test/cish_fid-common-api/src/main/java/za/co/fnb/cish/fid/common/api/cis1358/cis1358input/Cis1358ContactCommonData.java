
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
    "customerEmailAddress",
    "cellphoneNumber"
})
@Generated("jsonschema2pojo")
public class Cis1358ContactCommonData {

    @JsonProperty("customerEmailAddress")
    private String customerEmailAddress;
    @JsonProperty("cellphoneNumber")
    private Cis1358CellphoneNumber cellphoneNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customerEmailAddress")
    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    @JsonProperty("customerEmailAddress")
    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    @JsonProperty("cellphoneNumber")
    public Cis1358CellphoneNumber getCellphoneNumber() {
        return cellphoneNumber;
    }

    @JsonProperty("cellphoneNumber")
    public void setCellphoneNumber(Cis1358CellphoneNumber cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
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
