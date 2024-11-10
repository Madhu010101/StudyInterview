
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
    "customerForgeinTaxRegulatoryCityOfBirth",
    "customerDebtCouncilIndicator"
})
@Generated("jsonschema2pojo")
public class Cis1359RegulatoryIndividual {

    @JsonProperty("customerForgeinTaxRegulatoryCityOfBirth")
    private String customerForgeinTaxRegulatoryCityOfBirth;
    @JsonProperty("customerDebtCouncilIndicator")
    private String customerDebtCouncilIndicator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("customerForgeinTaxRegulatoryCityOfBirth")
    public String getCustomerForgeinTaxRegulatoryCityOfBirth() {
        return customerForgeinTaxRegulatoryCityOfBirth;
    }

    @JsonProperty("customerForgeinTaxRegulatoryCityOfBirth")
    public void setCustomerForgeinTaxRegulatoryCityOfBirth(String customerForgeinTaxRegulatoryCityOfBirth) {
        this.customerForgeinTaxRegulatoryCityOfBirth = customerForgeinTaxRegulatoryCityOfBirth;
    }

    @JsonProperty("customerDebtCouncilIndicator")
    public String getCustomerDebtCouncilIndicator() {
        return customerDebtCouncilIndicator;
    }

    @JsonProperty("customerDebtCouncilIndicator")
    public void setCustomerDebtCouncilIndicator(String customerDebtCouncilIndicator) {
        this.customerDebtCouncilIndicator = customerDebtCouncilIndicator;
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
