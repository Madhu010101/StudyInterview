package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerControlVerified",
        "customerDepartmentOfTradeAndIndustryCode",
        "customerPrimaryBusiness",
        "customerBEEPercent",
        "customerBeeDate",
        "customerBeeLevel",
        "customerBeeAccreditor",
        "customerBusinessRescueIndicator",
        "customerBusinessRescueDate",
        "customerEntityStatus",
        "customerEntityDate",
        "customerBusinessIndustryClassificationCode"

})
@Generated("jsonschema2pojo")
public class Cis1356rRegulatoryEnquireZosCommercialData {


    @JsonProperty("customerControlVerified")
    private String customerControlVerified;

    @JsonProperty("customerDepartmentOfTradeAndIndustryCode")
    private String customerDepartmentOfTradeAndIndustryCode;

    @JsonProperty("customerPrimaryBusiness")
    private String customerPrimaryBusiness;

    @JsonProperty("customerBEEPercent")
    private Integer customerBEEPercent;

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

    @JsonProperty("customerEntityStatus")
    private String customerEntityStatus;

    @JsonProperty("customerEntityDate")
    private Integer customerEntityDate;

    @JsonProperty("customerBusinessIndustryClassificationCode")
    private Integer customerBusinessIndustryClassificationCode;

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

    @JsonProperty("customerBEEPercent")
    public Integer getCustomerBEEPercent() {
        return customerBEEPercent;
    }

    @JsonProperty("customerBEEPercent")
    public void setCustomerBEEPercent(Integer customerBEEPercent) {
        this.customerBEEPercent = customerBEEPercent;
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

    @JsonProperty("customerEntityStatus")
    public String getCustomerEntityStatus() {
        return customerEntityStatus;
    }

    @JsonProperty("customerEntityStatus")
    public void setCustomerEntityStatus(String customerEntityStatus) {
        this.customerEntityStatus = customerEntityStatus;
    }

    @JsonProperty("customerEntityDate")
    public Integer getCustomerEntityDate() {
        return customerEntityDate;
    }

    @JsonProperty("customerEntityDate")
    public void setCustomerEntityDate(Integer customerEntityDate) {
        this.customerEntityDate = customerEntityDate;
    }

    @JsonProperty("customerBusinessIndustryClassificationCode")
    public Integer getCustomerBusinessIndustryClassificationCode() {
        return customerBusinessIndustryClassificationCode;
    }

    @JsonProperty("customerBusinessIndustryClassificationCode")
    public void setCustomerBusinessIndustryClassificationCode(Integer customerBusinessIndustryClassificationCode) {
        this.customerBusinessIndustryClassificationCode = customerBusinessIndustryClassificationCode;
    }

    @Override
    public String toString() {
        return "Cis1356rRegulatoryEnquireZosCommercialData{" +
                "customerControlVerified='" + customerControlVerified + '\'' +
                ", customerDepartmentOfTradeAndIndustryCode='" + customerDepartmentOfTradeAndIndustryCode + '\'' +
                ", customerPrimaryBusiness='" + customerPrimaryBusiness + '\'' +
                ", customerBEEPercent='" + customerBEEPercent + '\'' +
                ", customerBeeDate='" + customerBeeDate + '\'' +
                ", customerBeeLevel='" + customerBeeLevel + '\'' +
                ", customerBeeAccreditor='" + customerBeeAccreditor + '\'' +
                ", customerBusinessRescueIndicator='" + customerBusinessRescueIndicator + '\'' +
                ", customerBusinessRescueDate='" + customerBusinessRescueDate + '\'' +
                ", customerEntityStatus='" + customerEntityStatus + '\'' +
                ", customerEntityDate='" + customerEntityDate + '\'' +
                ", customerBusinessIndustryClassificationCode='" + customerBusinessIndustryClassificationCode + '\'' +

                '}';
    }

}
