
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
    "customerControlVerified",
    "customerDepartmentOfTradeAndIndustryCode",
    "customerPrimaryBusiness",
    "customerBeePercent",
    "customerBeeDate",
    "customerBeeLevel",
    "customerBeeAccreditor",
    "customerBusinessRescueIndicator",
    "customerBusinessRescueDate",
    "ifrs9Data"
})
@Generated("jsonschema2pojo")
public class Cis1359RegulatoryCommercial {

    @JsonProperty("customerControlVerified")
    private String customerControlVerified;
    @JsonProperty("customerDepartmentOfTradeAndIndustryCode")
    private String customerDepartmentOfTradeAndIndustryCode;
    @JsonProperty("customerPrimaryBusiness")
    private String customerPrimaryBusiness;
    @JsonProperty("customerBeePercent")
    private Integer customerBeePercent;
    @JsonProperty("customerBeeDate")
    private Integer customerBeeDate;
    @JsonProperty("customerBeeLevel")
    private String customerBeeLevel;
    @JsonProperty("customerBeeAccreditor")
    private String customerBeeAccreditor;
    @JsonProperty("customerBusinessRescueIndicator")
    private String customerBusinessRescueIndicator;
    @JsonProperty("customerBusinessRescueDate")
    private Integer customerBusinessRescueDate;
    @JsonProperty("ifrs9Data")
    private Cis1359Ifrs9Data ifrs9Data;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("customerControlVerified")
    public String getCustomerControlVerified() {
        return customerControlVerified;
    }

    @JsonProperty("customerControlVerified")
    public void setCustomerControlVerified(String customerControlVerified) {
        this.customerControlVerified = customerControlVerified;
    }

    @JsonProperty("customerDepartmentOfTradeAndIndustryCode")
    public String getCustomerDepartmentOfTradeAndIndustryCode() {
        return customerDepartmentOfTradeAndIndustryCode;
    }

    @JsonProperty("customerDepartmentOfTradeAndIndustryCode")
    public void setCustomerDepartmentOfTradeAndIndustryCode(String customerDepartmentOfTradeAndIndustryCode) {
        this.customerDepartmentOfTradeAndIndustryCode = customerDepartmentOfTradeAndIndustryCode;
    }

    @JsonProperty("customerPrimaryBusiness")
    public String getCustomerPrimaryBusiness() {
        return customerPrimaryBusiness;
    }

    @JsonProperty("customerPrimaryBusiness")
    public void setCustomerPrimaryBusiness(String customerPrimaryBusiness) {
        this.customerPrimaryBusiness = customerPrimaryBusiness;
    }

    @JsonProperty("customerBeePercent")
    public Integer getCustomerBeePercent() {
        return customerBeePercent;
    }

    @JsonProperty("customerBeePercent")
    public void setCustomerBeePercent(Integer customerBeePercent) {
        this.customerBeePercent = customerBeePercent;
    }

    @JsonProperty("customerBeeDate")
    public Integer getCustomerBeeDate() {
        return customerBeeDate;
    }

    @JsonProperty("customerBeeDate")
    public void setCustomerBeeDate(Integer customerBeeDate) {
        this.customerBeeDate = customerBeeDate;
    }

    @JsonProperty("customerBeeLevel")
    public String getCustomerBeeLevel() {
        return customerBeeLevel;
    }

    @JsonProperty("customerBeeLevel")
    public void setCustomerBeeLevel(String customerBeeLevel) {
        this.customerBeeLevel = customerBeeLevel;
    }

    @JsonProperty("customerBeeAccreditor")
    public String getCustomerBeeAccreditor() {
        return customerBeeAccreditor;
    }

    @JsonProperty("customerBeeAccreditor")
    public void setCustomerBeeAccreditor(String customerBeeAccreditor) {
        this.customerBeeAccreditor = customerBeeAccreditor;
    }

    @JsonProperty("customerBusinessRescueIndicator")
    public String getCustomerBusinessRescueIndicator() {
        return customerBusinessRescueIndicator;
    }

    @JsonProperty("customerBusinessRescueIndicator")
    public void setCustomerBusinessRescueIndicator(String customerBusinessRescueIndicator) {
        this.customerBusinessRescueIndicator = customerBusinessRescueIndicator;
    }

    @JsonProperty("customerBusinessRescueDate")
    public Integer getCustomerBusinessRescueDate() {
        return customerBusinessRescueDate;
    }

    @JsonProperty("customerBusinessRescueDate")
    public void setCustomerBusinessRescueDate(Integer customerBusinessRescueDate) {
        this.customerBusinessRescueDate = customerBusinessRescueDate;
    }

    @JsonProperty("ifrs9Data")
    public Cis1359Ifrs9Data getIfrs9Data() {
        return ifrs9Data;
    }

    @JsonProperty("ifrs9Data")
    public void setIfrs9Data(Cis1359Ifrs9Data ifrs9Data) {
        this.ifrs9Data = ifrs9Data;
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
