
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
    "customerForeignTaxRegulatoryIdentityType",
    "customerForeignTaxRegulatoryIdentityOccurrence",
    "customerForeignTaxRegulatoryIdentityEffectiveDate"
})
@Generated("jsonschema2pojo")
public class Cis1359ForeignTaxRegulatoryIdKey {

    @JsonProperty("customerForeignTaxRegulatoryIdentityType")
    private String customerForeignTaxRegulatoryIdentityType;
    @JsonProperty("customerForeignTaxRegulatoryIdentityOccurrence")
    private Integer customerForeignTaxRegulatoryIdentityOccurrence;
    @JsonProperty("customerForeignTaxRegulatoryIdentityEffectiveDate")
    private Integer customerForeignTaxRegulatoryIdentityEffectiveDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("customerForeignTaxRegulatoryIdentityType")
    public String getCustomerForeignTaxRegulatoryIdentityType() {
        return customerForeignTaxRegulatoryIdentityType;
    }

    @JsonProperty("customerForeignTaxRegulatoryIdentityType")
    public void setCustomerForeignTaxRegulatoryIdentityType(String customerForeignTaxRegulatoryIdentityType) {
        this.customerForeignTaxRegulatoryIdentityType = customerForeignTaxRegulatoryIdentityType;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
