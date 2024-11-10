package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerCreditHighRisk",
        "customerCreditHighRiskDate",
        "customerDistressedRestructureIndicator",
        "customerDistressedRestructureDate"

})

@Generated("jsonschema2pojo")
public class Cis1356rRegulatoryEnquireZosIfrs9CommercialData {

    @JsonProperty("customerCreditHighRisk")
    private String customerCreditHighRisk;

    @JsonProperty("customerCreditHighRiskDate")
    private Integer customerCreditHighRiskDate;

    @JsonProperty("customerDistressedRestructureIndicator")
    private String customerDistressedRestructureIndicator;

    @JsonProperty("customerDistressedRestructureDate")
    private Integer customerDistressedRestructureDate;


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

    @Override
    public String toString() {
        return "Cis1356rRegulatoryEnquireZosIfrs9CommercialData{" +
                "customerCreditHighRisk='" + customerCreditHighRisk + '\'' +
                ", customerCreditHighRiskDate='" + customerCreditHighRiskDate + '\'' +
                ", customerDistressedRestructureIndicator='" + customerDistressedRestructureIndicator + '\'' +
                ", customerDistressedRestructureDate='" + customerDistressedRestructureDate + '\'' +
                '}';
    }

}
