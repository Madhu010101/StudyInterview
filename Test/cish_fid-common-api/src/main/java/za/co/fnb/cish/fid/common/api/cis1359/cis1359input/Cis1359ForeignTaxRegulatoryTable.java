
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
    "foreignTaxRegulatoryIdKey",
    "customerForeignTaxRegulatoryIdentityIssuer",
    "customerForeignTaxRegulatoryIdentityExpiryDate",
    "customerForeignTaxRegulatoryIdentityNumber",
    "customerForeignTaxRegulatoryIdentityClass",
    "customerForeignTaxRegulatoryIdentityStatus"
})
@Generated("jsonschema2pojo")
public class Cis1359ForeignTaxRegulatoryTable {

    @JsonProperty("foreignTaxRegulatoryIdKey")
    private Cis1359ForeignTaxRegulatoryIdKey foreignTaxRegulatoryIdKey;
    @JsonProperty("customerForeignTaxRegulatoryIdentityIssuer")
    private String customerForeignTaxRegulatoryIdentityIssuer;
    @JsonProperty("customerForeignTaxRegulatoryIdentityExpiryDate")
    private Integer customerForeignTaxRegulatoryIdentityExpiryDate;
    @JsonProperty("customerForeignTaxRegulatoryIdentityNumber")
    private String customerForeignTaxRegulatoryIdentityNumber;
    @JsonProperty("customerForeignTaxRegulatoryIdentityClass")
    private String customerForeignTaxRegulatoryIdentityClass;
    @JsonProperty("customerForeignTaxRegulatoryIdentityStatus")
    private String customerForeignTaxRegulatoryIdentityStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("foreignTaxRegulatoryIdKey")
    public Cis1359ForeignTaxRegulatoryIdKey getForeignTaxRegulatoryIdKey() {
        return foreignTaxRegulatoryIdKey;
    }

    @JsonProperty("foreignTaxRegulatoryIdKey")
    public void setForeignTaxRegulatoryIdKey(Cis1359ForeignTaxRegulatoryIdKey foreignTaxRegulatoryIdKey) {
        this.foreignTaxRegulatoryIdKey = foreignTaxRegulatoryIdKey;
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

    @JsonProperty("customerForeignTaxRegulatoryIdentityNumber")
    public String getCustomerForeignTaxRegulatoryIdentityNumber() {
        return customerForeignTaxRegulatoryIdentityNumber;
    }

    @JsonProperty("customerForeignTaxRegulatoryIdentityNumber")
    public void setCustomerForeignTaxRegulatoryIdentityNumber(String customerForeignTaxRegulatoryIdentityNumber) {
        this.customerForeignTaxRegulatoryIdentityNumber = customerForeignTaxRegulatoryIdentityNumber;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
