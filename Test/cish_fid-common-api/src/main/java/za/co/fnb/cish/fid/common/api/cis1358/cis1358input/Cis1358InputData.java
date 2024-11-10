
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
    "customerCompanyId",
    "customerNumber",
    "customerEchoToken"
})
@Generated("jsonschema2pojo")
public class Cis1358InputData {

    @JsonProperty("customerCompanyId")
    private Integer customerCompanyId;
    @JsonProperty("customerNumber")
    private Long customerNumber;
    @JsonProperty("customerEchoToken")
    private String customerEchoToken;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customerCompanyId")
    public Integer getCustomerCompanyId() {
        return customerCompanyId;
    }

    @JsonProperty("customerCompanyId")
    public void setCustomerCompanyId(Integer customerCompanyId) {
        this.customerCompanyId = customerCompanyId;
    }

    @JsonProperty("customerNumber")
    public Long getCustomerNumber() {
        return customerNumber;
    }

    @JsonProperty("customerNumber")
    public void setCustomerNumber(Long customerNumber) {
        this.customerNumber = customerNumber;
    }

    @JsonProperty("customerEchoToken")
    public String getCustomerEchoToken() {
        return customerEchoToken;
    }

    @JsonProperty("customerEchoToken")
    public void setCustomerEchoToken(String customerEchoToken) {
        this.customerEchoToken = customerEchoToken;
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
