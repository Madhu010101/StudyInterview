
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
    "sourceOfFundsData",
    "customerForeignTaxIndicator",
    "customerSelfCertificationIndicator",
    "foreignTaxRegulatoryData",
    "customerPrimaryKYC",
    "customerPrimaryKYCVerifiedDate",
    "customerPrimaryKYCAddressVerified",
    "customerPrimaryKYCIdentityVerified",
    "customerRiskIndicator",
    "customerRiskReason",
    "customerScreeningStatus",
    "customerBankDecisionIndicator",
    "customerRiskRating",
    "customerForexBlockIndicator",
    "customerBusinessIndustryClassificationCode",
    "customerCROModel",
    "customerRefreshReviewIndicator",
    "customerRefreshStartDate",
    "customerRefreshComplianceIndicator",
    "regulatoryIndividual",
    "regulatoryCommercial"
})
@Generated("jsonschema2pojo")
public class Cis1359RegulatoryInput {

    @JsonProperty("sourceOfFundsData")
    private Cis1359SourceOfFundsData sourceOfFundsData;
    @JsonProperty("customerForeignTaxIndicator")
    private String customerForeignTaxIndicator;
    @JsonProperty("customerSelfCertificationIndicator")
    private String customerSelfCertificationIndicator;
    @JsonProperty("foreignTaxRegulatoryData")
    private Cis1359ForeignTaxRegulatoryData foreignTaxRegulatoryData;
    @JsonProperty("customerPrimaryKYC")
    private String customerPrimaryKYC;
    @JsonProperty("customerPrimaryKYCVerifiedDate")
    private Integer customerPrimaryKYCVerifiedDate;
    @JsonProperty("customerPrimaryKYCAddressVerified")
    private String customerPrimaryKYCAddressVerified;
    @JsonProperty("customerPrimaryKYCIdentityVerified")
    private String customerPrimaryKYCIdentityVerified;
    @JsonProperty("customerRiskIndicator")
    private String customerRiskIndicator;
    @JsonProperty("customerRiskReason")
    private Integer customerRiskReason;
    @JsonProperty("customerScreeningStatus")
    private String customerScreeningStatus;
    @JsonProperty("customerBankDecisionIndicator")
    private String customerBankDecisionIndicator;
    @JsonProperty("customerRiskRating")
    private String customerRiskRating;
    @JsonProperty("customerForexBlockIndicator")
    private String customerForexBlockIndicator;
    @JsonProperty("customerBusinessIndustryClassificationCode")
    private Integer customerBusinessIndustryClassificationCode;
    @JsonProperty("customerCROModel")
    private String customerCROModel;
    @JsonProperty("customerRefreshReviewIndicator")
    private String customerRefreshReviewIndicator;
    @JsonProperty("customerRefreshStartDate")
    private Integer customerRefreshStartDate;
    @JsonProperty("customerRefreshComplianceIndicator")
    private String customerRefreshComplianceIndicator;
    @JsonProperty("regulatoryIndividual")
    private Cis1359RegulatoryIndividual regulatoryIndividual;
    @JsonProperty("regulatoryCommercial")
    private Cis1359RegulatoryCommercial regulatoryCommercial;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("sourceOfFundsData")
    public Cis1359SourceOfFundsData getSourceOfFundsData() {
        return sourceOfFundsData;
    }

    @JsonProperty("sourceOfFundsData")
    public void setSourceOfFundsData(Cis1359SourceOfFundsData sourceOfFundsData) {
        this.sourceOfFundsData = sourceOfFundsData;
    }

    @JsonProperty("customerForeignTaxIndicator")
    public String getCustomerForeignTaxIndicator() {
        return customerForeignTaxIndicator;
    }

    @JsonProperty("customerForeignTaxIndicator")
    public void setCustomerForeignTaxIndicator(String customerForeignTaxIndicator) {
        this.customerForeignTaxIndicator = customerForeignTaxIndicator;
    }

    @JsonProperty("customerSelfCertificationIndicator")
    public String getCustomerSelfCertificationIndicator() {
        return customerSelfCertificationIndicator;
    }

    @JsonProperty("customerSelfCertificationIndicator")
    public void setCustomerSelfCertificationIndicator(String customerSelfCertificationIndicator) {
        this.customerSelfCertificationIndicator = customerSelfCertificationIndicator;
    }

    @JsonProperty("foreignTaxRegulatoryData")
    public Cis1359ForeignTaxRegulatoryData getForeignTaxRegulatoryData() {
        return foreignTaxRegulatoryData;
    }

    @JsonProperty("foreignTaxRegulatoryData")
    public void setForeignTaxRegulatoryData(Cis1359ForeignTaxRegulatoryData foreignTaxRegulatoryData) {
        this.foreignTaxRegulatoryData = foreignTaxRegulatoryData;
    }

    @JsonProperty("customerPrimaryKYC")
    public String getCustomerPrimaryKYC() {
        return customerPrimaryKYC;
    }

    @JsonProperty("customerPrimaryKYC")
    public void setCustomerPrimaryKYC(String customerPrimaryKYC) {
        this.customerPrimaryKYC = customerPrimaryKYC;
    }

    @JsonProperty("customerPrimaryKYCVerifiedDate")
    public Integer getCustomerPrimaryKYCVerifiedDate() {
        return customerPrimaryKYCVerifiedDate;
    }

    @JsonProperty("customerPrimaryKYCVerifiedDate")
    public void setCustomerPrimaryKYCVerifiedDate(Integer customerPrimaryKYCVerifiedDate) {
        this.customerPrimaryKYCVerifiedDate = customerPrimaryKYCVerifiedDate;
    }

    @JsonProperty("customerPrimaryKYCAddressVerified")
    public String getCustomerPrimaryKYCAddressVerified() {
        return customerPrimaryKYCAddressVerified;
    }

    @JsonProperty("customerPrimaryKYCAddressVerified")
    public void setCustomerPrimaryKYCAddressVerified(String customerPrimaryKYCAddressVerified) {
        this.customerPrimaryKYCAddressVerified = customerPrimaryKYCAddressVerified;
    }

    @JsonProperty("customerPrimaryKYCIdentityVerified")
    public String getCustomerPrimaryKYCIdentityVerified() {
        return customerPrimaryKYCIdentityVerified;
    }

    @JsonProperty("customerPrimaryKYCIdentityVerified")
    public void setCustomerPrimaryKYCIdentityVerified(String customerPrimaryKYCIdentityVerified) {
        this.customerPrimaryKYCIdentityVerified = customerPrimaryKYCIdentityVerified;
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

    @JsonProperty("customerRiskRating")
    public String getCustomerRiskRating() {
        return customerRiskRating;
    }

    @JsonProperty("customerRiskRating")
    public void setCustomerRiskRating(String customerRiskRating) {
        this.customerRiskRating = customerRiskRating;
    }

    @JsonProperty("customerForexBlockIndicator")
    public String getCustomerForexBlockIndicator() {
        return customerForexBlockIndicator;
    }

    @JsonProperty("customerForexBlockIndicator")
    public void setCustomerForexBlockIndicator(String customerForexBlockIndicator) {
        this.customerForexBlockIndicator = customerForexBlockIndicator;
    }

    @JsonProperty("customerBusinessIndustryClassificationCode")
    public Integer getCustomerBusinessIndustryClassificationCode() {
        return customerBusinessIndustryClassificationCode;
    }

    @JsonProperty("customerBusinessIndustryClassificationCode")
    public void setCustomerBusinessIndustryClassificationCode(Integer customerBusinessIndustryClassificationCode) {
        this.customerBusinessIndustryClassificationCode = customerBusinessIndustryClassificationCode;
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

    @JsonProperty("regulatoryIndividual")
    public Cis1359RegulatoryIndividual getRegulatoryIndividual() {
        return regulatoryIndividual;
    }

    @JsonProperty("regulatoryIndividual")
    public void setRegulatoryIndividual(Cis1359RegulatoryIndividual regulatoryIndividual) {
        this.regulatoryIndividual = regulatoryIndividual;
    }

    @JsonProperty("regulatoryCommercial")
    public Cis1359RegulatoryCommercial getRegulatoryCommercial() {
        return regulatoryCommercial;
    }

    @JsonProperty("regulatoryCommercial")
    public void setRegulatoryCommercial(Cis1359RegulatoryCommercial regulatoryCommercial) {
        this.regulatoryCommercial = regulatoryCommercial;
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
