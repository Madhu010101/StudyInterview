package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerForeignTaxRegulatoryIdentityIssuer",
        "customerForeignTaxRegulatoryIdentityNumber",
        "customerForeignTaxRegulatoryIdentityOccurrence",
        "customerForeignTaxRegulatoryIdentityClass",
        "customerForeignTaxRegulatoryIdentityStatus",
        "customerForeignTaxRegulatoryIdentityExpiryDate",
        "customerForeignTaxRegulatoryIdentityEffectiveDate",
        "customerForeignTaxRegulatoryIdentityType"
})
@Generated("jsonschema2pojo")
public class Cis1356rForeignTaxRegulatorySegment {

    @JsonProperty("customerForeignTaxRegulatoryIdentityType")
    private String customerForeignTaxRegulatoryIdentityType;

    @JsonProperty("customerForeignTaxRegulatoryIdentityNumber")
    private String customerForeignTaxRegulatoryIdentityNumber;

    @JsonProperty("customerForeignTaxRegulatoryIdentityOccurrence")
    private Integer customerForeignTaxRegulatoryIdentityOccurrence;

    @JsonProperty("customerForeignTaxRegulatoryIdentityEffectiveDate")
    private Integer customerForeignTaxRegulatoryIdentityEffectiveDate;

    @JsonProperty("customerForeignTaxRegulatoryIdentityIssuer")
    private String customerForeignTaxRegulatoryIdentityIssuer;

    @JsonProperty("customerForeignTaxRegulatoryIdentityExpiryDate")
    private Integer customerForeignTaxRegulatoryIdentityExpiryDate;

    @JsonProperty("customerForeignTaxRegulatoryIdentityClass")
    private String customerForeignTaxRegulatoryIdentityClass;

    @JsonProperty("customerForeignTaxRegulatoryIdentityStatus")
    private String customerForeignTaxRegulatoryIdentityStatus;

    @JsonProperty("customerForeignTaxRegulatoryIdentityType")
    public String getCustomerForeignTaxRegulatoryIdentityType() {
        return customerForeignTaxRegulatoryIdentityType;
    }

    @JsonProperty("customerForeignTaxRegulatoryIdentityType")
    public void setCustomerForeignTaxRegulatoryIdentityType(String customerForeignTaxRegulatoryIdentityType) {
        this.customerForeignTaxRegulatoryIdentityType = customerForeignTaxRegulatoryIdentityType;
    }

    @JsonProperty("customerForeignTaxRegulatoryIdentityNumber")
    public String getCustomerForeignTaxRegulatoryIdentityNumber() {
        return customerForeignTaxRegulatoryIdentityNumber;
    }

    @JsonProperty("customerForeignTaxRegulatoryIdentityNumber")
    public void setCustomerForeignTaxRegulatoryIdentityNumber(String customerForeignTaxRegulatoryIdentityNumber) {
        this.customerForeignTaxRegulatoryIdentityNumber = customerForeignTaxRegulatoryIdentityNumber;
    }

    @JsonProperty("customerForeignTaxRegulatoryIdentityOccurrence")
    public Integer getCustomerForeignTaxRegulatoryIdentityOccurrence() {
        return customerForeignTaxRegulatoryIdentityOccurrence;
    }

    @JsonProperty("customerForeignTaxRegulatoryIdentityOccurrence")
    public void setCustomerForeignTaxRegulatoryIdentityOccurrence(Integer customerForeignTaxRegulatoryIdentityOccurrence) {
        this.customerForeignTaxRegulatoryIdentityOccurrence = customerForeignTaxRegulatoryIdentityOccurrence;
    }

    @JsonProperty("customerForeignTaxRegulatoryIdentityEffectiveDate")
    public Integer getCustomerForeignTaxRegulatoryIdentityEffectiveDate() {
        return customerForeignTaxRegulatoryIdentityEffectiveDate;
    }

    @JsonProperty("customerForeignTaxRegulatoryIdentityEffectiveDate")
    public void setCustomerForeignTaxRegulatoryIdentityEffectiveDate(Integer customerForeignTaxRegulatoryIdentityEffectiveDate) {
        this.customerForeignTaxRegulatoryIdentityEffectiveDate = customerForeignTaxRegulatoryIdentityEffectiveDate;
    }

    @JsonProperty("customerForeignTaxRegulatoryIdentityIssuer")
    public String getCustomerForeignTaxRegulatoryIdentityIssuer() {
        return customerForeignTaxRegulatoryIdentityIssuer;
    }

    @JsonProperty("customerForeignTaxRegulatoryIdentityIssuer")
    public void setCustomerForeignTaxRegulatoryIdentityIssuer(String customerForeignTaxRegulatoryIdentityIssuer) {
        this.customerForeignTaxRegulatoryIdentityIssuer = customerForeignTaxRegulatoryIdentityIssuer;
    }

    @JsonProperty("customerForeignTaxRegulatoryIdentityExpiryDate")
    public Integer getCustomerForeignTaxRegulatoryIdentityExpiryDate() {
        return customerForeignTaxRegulatoryIdentityExpiryDate;
    }

    @JsonProperty("customerForeignTaxRegulatoryIdentityExpiryDate")
    public void setCustomerForeignTaxRegulatoryIdentityExpiryDate(Integer customerForeignTaxRegulatoryIdentityExpiryDate) {
        this.customerForeignTaxRegulatoryIdentityExpiryDate = customerForeignTaxRegulatoryIdentityExpiryDate;
    }

    @JsonProperty("customerForeignTaxRegulatoryIdentityClass")
    public String getCustomerForeignTaxRegulatoryIdentityClass() {
        return customerForeignTaxRegulatoryIdentityClass;
    }

    @JsonProperty("customerForeignTaxRegulatoryIdentityClass")
    public void setCustomerForeignTaxRegulatoryIdentityClass(String customerForeignTaxRegulatoryIdentityClass) {
        this.customerForeignTaxRegulatoryIdentityClass = customerForeignTaxRegulatoryIdentityClass;
    }

    @JsonProperty("customerForeignTaxRegulatoryIdentityStatus")
    public String getCustomerForeignTaxRegulatoryIdentityStatus() {
        return customerForeignTaxRegulatoryIdentityStatus;
    }

    @JsonProperty("customerForeignTaxRegulatoryIdentityStatus")
    public void setCustomerForeignTaxRegulatoryIdentityStatus(String customerForeignTaxRegulatoryIdentityStatus) {
        this.customerForeignTaxRegulatoryIdentityStatus = customerForeignTaxRegulatoryIdentityStatus;
    }

}
