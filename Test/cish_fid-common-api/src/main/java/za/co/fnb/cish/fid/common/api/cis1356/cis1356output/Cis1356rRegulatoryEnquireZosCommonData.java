package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerScreeningStatus",
        "customerBankDecisionIndicator",
        "customerCRSComplianceIndicator",
        "customerRiskRating",
        "customerPlaceHardHoldIndicator",
        "customerForexBlockIndicator",
        "customerStandardIndustryClassificationCode",
        "customerCROModel",
        "customerRefreshReviewIndicator",
        "customerRefreshStartDate",
        "customerRefreshComplianceIndicator",
        "customerRefreshExpiryDate",
        "customerRiskIndicator",
        "customerRiskReason"

})
@Generated("jsonschema2pojo")
public class Cis1356rRegulatoryEnquireZosCommonData {
    @JsonProperty("customerScreeningStatus")
    private String customerScreeningStatus;

    @JsonProperty("customerBankDecisionIndicator")
    private String customerBankDecisionIndicator;

    @JsonProperty("customerCRSComplianceIndicator")
    private String customerCRSComplianceIndicator;

    @JsonProperty("customerRiskRating")
    private String customerRiskRating;

    @JsonProperty("customerPlaceHardHoldIndicator")
    private String customerPlaceHardHoldIndicator;

    @JsonProperty("customerForexBlockIndicator")
    private String customerForexBlockIndicator;

    @JsonProperty("customerStandardIndustryClassificationCode")
    private String customerStandardIndustryClassificationCode;

    @JsonProperty("customerCROModel")
    private String customerCROModel;

    @JsonProperty("customerRefreshReviewIndicator")
    private String customerRefreshReviewIndicator;

    @JsonProperty("customerRefreshStartDate")
    private Integer customerRefreshStartDate	;

    @JsonProperty("customerRefreshComplianceIndicator")
    private String customerRefreshComplianceIndicator;


    @JsonProperty("customerRefreshExpiryDate")
    private Integer customerRefreshExpiryDate;

    @JsonProperty("customerRiskIndicator")
    private String customerRiskIndicator;

    @JsonProperty("customerRiskReason")
    private Integer customerRiskReason;

    @JsonProperty("customerScreeningStatus")
    public String getCustomerScreeningStatus() {
        return customerScreeningStatus;
    }

    @JsonProperty("customerScreeningStatus")
    public void setCustomerScreeningStatus(String customerScreeningStatus) {
        this.customerScreeningStatus = customerScreeningStatus;
    }

    @JsonProperty("customerBankDecisionIndicator")
    public String getCustomerBankDecisionIndicator() {
        return customerBankDecisionIndicator;
    }

    @JsonProperty("customerBankDecisionIndicator")
    public void setCustomerBankDecisionIndicator(String customerBankDecisionIndicator) {
        this.customerBankDecisionIndicator = customerBankDecisionIndicator;
    }

    @JsonProperty("customerCRSComplianceIndicator")
    public String getCustomerCRSComplianceIndicator() {
        return customerCRSComplianceIndicator;
    }

    @JsonProperty("customerCRSComplianceIndicator")
    public void setCustomerCRSComplianceIndicator(String customerCRSComplianceIndicator) {
        this.customerCRSComplianceIndicator = customerCRSComplianceIndicator;
    }

    @JsonProperty("customerRiskRating")
    public String getCustomerRiskRating() {
        return customerRiskRating;
    }

    @JsonProperty("customerRiskRating")
    public void setCustomerRiskRating(String customerRiskRating) {
        this.customerRiskRating = customerRiskRating;
    }

    @JsonProperty("customerPlaceHardHoldIndicator")
    public String getCustomerPlaceHardHoldIndicator() {
        return customerPlaceHardHoldIndicator;
    }

    @JsonProperty("customerPlaceHardHoldIndicator")
    public void setCustomerPlaceHardHoldIndicator(String customerPlaceHardHoldIndicator) {
        this.customerPlaceHardHoldIndicator = customerPlaceHardHoldIndicator;
    }

    @JsonProperty("customerForexBlockIndicator")
    public String getCustomerForexBlockIndicator() {
        return customerForexBlockIndicator;
    }

    @JsonProperty("customerForexBlockIndicator")
    public void setCustomerForexBlockIndicator(String customerForexBlockIndicator) {
        this.customerForexBlockIndicator = customerForexBlockIndicator;
    }

    @JsonProperty("customerStandardIndustryClassificationCode")
    public String getCustomerStandardIndustryClassificationCode() {
        return customerStandardIndustryClassificationCode;
    }

    @JsonProperty("customerStandardIndustryClassificationCode")
    public void setCustomerStandardIndustryClassificationCode(String customerStandardIndustryClassificationCode) {
        this.customerStandardIndustryClassificationCode = customerStandardIndustryClassificationCode;
    }

    @JsonProperty("customerCROModel")
    public String getCustomerCROModel() {
        return customerCROModel;
    }

    @JsonProperty("customerCROModel")
    public void setCustomerCROModel(String customerCROModel) {
        this.customerCROModel = customerCROModel;
    }

    @JsonProperty("customerRefreshReviewIndicator")
    public String getCustomerRefreshReviewIndicator() {
        return customerRefreshReviewIndicator;
    }

    @JsonProperty("customerRefreshReviewIndicator")
    public void setCustomerRefreshReviewIndicator(String customerRefreshReviewIndicator) {
        this.customerRefreshReviewIndicator = customerRefreshReviewIndicator;
    }

    @JsonProperty("customerRefreshStartDate")
    public Integer getCustomerRefreshStartDate() {
        return customerRefreshStartDate;
    }

    @JsonProperty("customerRefreshStartDate")
    public void setCustomerRefreshStartDate(Integer customerRefreshStartDate) {
        this.customerRefreshStartDate = customerRefreshStartDate;
    }

    @JsonProperty("customerRefreshComplianceIndicator")
    public String getCustomerRefreshComplianceIndicator() {
        return customerRefreshComplianceIndicator;
    }

    @JsonProperty("customerRefreshComplianceIndicator")
    public void setCustomerRefreshComplianceIndicator(String customerRefreshComplianceIndicator) {
        this.customerRefreshComplianceIndicator = customerRefreshComplianceIndicator;
    }

    @JsonProperty("customerRefreshExpiryDate")
    public Integer getCustomerRefreshExpiryDate() {
        return customerRefreshExpiryDate;
    }

    @JsonProperty("customerRefreshExpiryDate")
    public void setCustomerRefreshExpiryDate(Integer customerRefreshExpiryDate) {
        this.customerRefreshExpiryDate = customerRefreshExpiryDate;
    }

    @JsonProperty("customerRiskIndicator")
    public String getCustomerRiskIndicator() {
        return customerRiskIndicator;
    }

    @JsonProperty("customerRiskIndicator")
    public void setCustomerRiskIndicator(String customerRiskIndicator) {
        this.customerRiskIndicator = customerRiskIndicator;
    }

    @JsonProperty("customerRiskReason")
    public Integer getCustomerRiskReason() {
        return customerRiskReason;
    }

    @JsonProperty("customerRiskReason")
    public void setCustomerRiskReason(Integer customerRiskReason) {
        this.customerRiskReason = customerRiskReason;
    }

    @Override
    public String toString() {
        return "Cis1356rRegulatoryEnquireZosCommonData{" +
                "customerScreeningStatus='" + customerScreeningStatus + '\'' +
                ", customerBankDecisionIndicator='" + customerBankDecisionIndicator + '\'' +
                ", customerCRSComplianceIndicator='" + customerCRSComplianceIndicator + '\'' +
                ", customerRiskRating='" + customerRiskRating + '\'' +
                ", customerPlaceHardHoldIndicator='" + customerPlaceHardHoldIndicator + '\'' +
                ", customerForexBlockIndicator='" + customerForexBlockIndicator + '\'' +
                ", customerStandardIndustryClassificationCode='" + customerStandardIndustryClassificationCode + '\'' +
                ", customerCROModel='" + customerCROModel + '\'' +
                ", customerRefreshReviewIndicator='" + customerRefreshReviewIndicator + '\'' +
                ", customerRefreshStartDate='" + customerRefreshStartDate + '\'' +
                ", customerRefreshComplianceIndicator='" + customerRefreshComplianceIndicator + '\'' +
                ", customerRefreshExpiryDate='" + customerRefreshExpiryDate + '\'' +
                ", customerRiskIndicator='" + customerRiskIndicator + '\'' +
                ", customerRiskReason='" + customerRiskReason + '\'' +

                '}';
    }

}
