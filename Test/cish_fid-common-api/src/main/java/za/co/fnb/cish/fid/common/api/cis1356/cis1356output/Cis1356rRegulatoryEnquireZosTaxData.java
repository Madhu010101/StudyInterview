package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerForeignTaxIndicator",
        "customerSelfCertificationEffectiveDate",
        "customerSelfCertificationExpiryDate",
        "foreignTaxRegulatorySegment"
})
@Generated("jsonschema2pojo")
public class Cis1356rRegulatoryEnquireZosTaxData {

    @JsonProperty("customerForeignTaxIndicator")
    private String customerForeignTaxIndicator;

    @JsonProperty("customerSelfCertificationEffectiveDate")
    private Integer customerSelfCertificationEffectiveDate;

    @JsonProperty("customerSelfCertificationExpiryDate")
    private Integer customerSelfCertificationExpiryDate;

    @JsonProperty("foreignTaxRegulatorySegment")
    private List<Cis1356rForeignTaxRegulatorySegment> foreignTaxRegulatorySegment;

    @JsonProperty("customerForeignTaxIndicator")
    public String getCustomerForeignTaxIndicator() {
        return customerForeignTaxIndicator;
    }

    @JsonProperty("customerForeignTaxIndicator")
    public void setCustomerForeignTaxIndicator(String customerForeignTaxIndicator) {
        this.customerForeignTaxIndicator = customerForeignTaxIndicator;
    }

    @JsonProperty("customerSelfCertificationEffectiveDate")
    public Integer getCustomerSelfCertificationEffectiveDate() {
        return customerSelfCertificationEffectiveDate;
    }

    @JsonProperty("customerSelfCertificationEffectiveDate")
    public void setCustomerSelfCertificationEffectiveDate(Integer customerSelfCertificationEffectiveDate) {
        this.customerSelfCertificationEffectiveDate = customerSelfCertificationEffectiveDate;
    }

    @JsonProperty("customerSelfCertificationExpiryDate")
    public Integer getCustomerSelfCertificationExpiryDate() {
        return customerSelfCertificationExpiryDate;
    }

    @JsonProperty("customerSelfCertificationExpiryDate")
    public void setCustomerSelfCertificationExpiryDate(Integer customerSelfCertificationExpiryDate) {
        this.customerSelfCertificationExpiryDate = customerSelfCertificationExpiryDate;
    }

    public List<Cis1356rForeignTaxRegulatorySegment> getForeignTaxRegulatorySegment() {
        return foreignTaxRegulatorySegment;
    }

    public void setForeignTaxRegulatorySegment(List<Cis1356rForeignTaxRegulatorySegment> foreignTaxRegulatorySegment) {
        this.foreignTaxRegulatorySegment = foreignTaxRegulatorySegment;
    }
}
