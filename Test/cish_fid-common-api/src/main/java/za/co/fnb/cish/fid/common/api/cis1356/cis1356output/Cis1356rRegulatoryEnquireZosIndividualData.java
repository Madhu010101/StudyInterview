package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerForeignTaxRegulatoryCityOfBirth",
        "customerDebtCouncilIndicator"
})
@Generated("jsonschema2pojo")
public class Cis1356rRegulatoryEnquireZosIndividualData {

    @JsonProperty("customerForeignTaxRegulatoryCityOfBirth")
    private String customerForeignTaxRegulatoryCityOfBirth;

    @JsonProperty("customerDebtCouncilIndicator")
    private String customerDebtCouncilIndicator;

    @JsonProperty("customerForeignTaxRegulatoryCityOfBirth")
    public String getCustomerForeignTaxRegulatoryCityOfBirth() {
        return customerForeignTaxRegulatoryCityOfBirth;
    }
    @JsonProperty("customerForeignTaxRegulatoryCityOfBirth")
    public void setCustomerForeignTaxRegulatoryCityOfBirth(String customerForeignTaxRegulatoryCityOfBirth) {
        this.customerForeignTaxRegulatoryCityOfBirth = customerForeignTaxRegulatoryCityOfBirth;
    }

    @JsonProperty("customerDebtCouncilIndicator")
    public String getCustomerDebtCouncilIndicator() {
        return customerDebtCouncilIndicator;
    }

    @JsonProperty("customerDebtCouncilIndicator")
    public void setCustomerDebtCouncilIndicator(String customerDebtCouncilIndicator) {
        this.customerDebtCouncilIndicator = customerDebtCouncilIndicator;
    }

    @Override
    public String toString() {
        return "Cis1356rRegulatoryEnquireZosIndividualData{" +
                "customerForeignTaxRegulatoryCityOfBirth='" + customerForeignTaxRegulatoryCityOfBirth + '\'' +
                ", customerDebtCouncilIndicator='" + customerDebtCouncilIndicator + '\'' +
                '}';
    }

}
