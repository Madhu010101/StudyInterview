package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerPrimaryKYC",
        "customerPrimaryKYCVerifiedDate"

})
@Generated("jsonschema2pojo")
public class Cis1356rPkiData {
    @JsonProperty("customerPrimaryKYC")
    private String customerPrimaryKYC;

    @JsonProperty("customerPrimaryKYCVerifiedDate")
    private Integer customerPrimaryKYCVerifiedDate;

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

}
