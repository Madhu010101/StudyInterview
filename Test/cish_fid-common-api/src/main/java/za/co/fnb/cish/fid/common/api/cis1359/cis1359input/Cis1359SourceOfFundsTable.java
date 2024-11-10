
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
    "customerSourceOfFundsCode"
})
@Generated("jsonschema2pojo")
public class Cis1359SourceOfFundsTable {

    @JsonProperty("customerSourceOfFundsCode")
    private String customerSourceOfFundsCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("customerSourceOfFundsCode")
    public String getCustomerSourceOfFundsCode() {
        return customerSourceOfFundsCode;
    }

    @JsonProperty("customerSourceOfFundsCode")
    public void setCustomerSourceOfFundsCode(String customerSourceOfFundsCode) {
        this.customerSourceOfFundsCode = customerSourceOfFundsCode;
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
