
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
    "customerCreditHighRisk",
    "customerCreditHighRiskDate",
    "customerDistressedRestructureIndicator",
    "customerDistressedRestructureDate",
    "customerEntityStatus",
    "customerEntityStatusDate"
})
@Generated("jsonschema2pojo")
public class Cis1359Ifrs9Data {

    @JsonProperty("customerCreditHighRisk")
    private String customerCreditHighRisk;
    @JsonProperty("customerCreditHighRiskDate")
    private Integer customerCreditHighRiskDate;
    @JsonProperty("customerDistressedRestructureIndicator")
    private String customerDistressedRestructureIndicator;
    @JsonProperty("customerDistressedRestructureDate")
    private Integer customerDistressedRestructureDate;
    @JsonProperty("customerEntityStatus")
    private String customerEntityStatus;
    @JsonProperty("customerEntityStatusDate")
    private Integer customerEntityStatusDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("customerCreditHighRisk")
    public String getCustomerCreditHighRisk() {
        return customerCreditHighRisk;
    }

    @JsonProperty("customerCreditHighRisk")
    public void setCustomerCreditHighRisk(String customerCreditHighRisk) {
        this.customerCreditHighRisk = customerCreditHighRisk;
    }

    @JsonProperty("customerCreditHighRiskDate")
    public Integer getCustomerCreditHighRiskDate() {
        return customerCreditHighRiskDate;
    }

    @JsonProperty("customerCreditHighRiskDate")
    public void setCustomerCreditHighRiskDate(Integer customerCreditHighRiskDate) {
        this.customerCreditHighRiskDate = customerCreditHighRiskDate;
    }

    @JsonProperty("customerDistressedRestructureIndicator")
    public String getCustomerDistressedRestructureIndicator() {
        return customerDistressedRestructureIndicator;
    }

    @JsonProperty("customerDistressedRestructureIndicator")
    public void setCustomerDistressedRestructureIndicator(String customerDistressedRestructureIndicator) {
        this.customerDistressedRestructureIndicator = customerDistressedRestructureIndicator;
    }

    @JsonProperty("customerDistressedRestructureDate")
    public Integer getCustomerDistressedRestructureDate() {
        return customerDistressedRestructureDate;
    }

    @JsonProperty("customerDistressedRestructureDate")
    public void setCustomerDistressedRestructureDate(Integer customerDistressedRestructureDate) {
        this.customerDistressedRestructureDate = customerDistressedRestructureDate;
    }

    @JsonProperty("customerEntityStatus")
    public String getCustomerEntityStatus() {
        return customerEntityStatus;
    }

    @JsonProperty("customerEntityStatus")
    public void setCustomerEntityStatus(String customerEntityStatus) {
        this.customerEntityStatus = customerEntityStatus;
    }

    @JsonProperty("customerEntityStatusDate")
    public Integer getCustomerEntityStatusDate() {
        return customerEntityStatusDate;
    }

    @JsonProperty("customerEntityStatusDate")
    public void setCustomerEntityStatusDate(Integer customerEntityStatusDate) {
        this.customerEntityStatusDate = customerEntityStatusDate;
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
