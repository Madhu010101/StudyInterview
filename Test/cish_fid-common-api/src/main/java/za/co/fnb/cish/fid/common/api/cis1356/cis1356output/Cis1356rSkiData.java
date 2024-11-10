package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerSecondaryKYCVerified",
        "customerSecondaryKYCVerifiedDate"

})
@Generated("jsonschema2pojo")
public class Cis1356rSkiData {

    @JsonProperty("customerSecondaryKYCVerified")
    private String customerSecondaryKYCVerified;

    @JsonProperty("customerSecondaryKYCVerifiedDate")
    private Integer customerSecondaryKYCVerifiedDate;

    @JsonProperty("customerSecondaryKYCVerified")
    public String getCustomerSecondaryKYCVerified() {
        return customerSecondaryKYCVerified;
    }
    @JsonProperty("customerSecondaryKYCVerified")
    public void setCustomerSecondaryKYCVerified(String customerSecondaryKYCVerified) {
        this.customerSecondaryKYCVerified = customerSecondaryKYCVerified;
    }
    @JsonProperty("customerSecondaryKYCVerifiedDate")
    public Integer getCustomerSecondaryKYCVerifiedDate() {
        return customerSecondaryKYCVerifiedDate;
    }
    @JsonProperty("customerSecondaryKYCVerifiedDate")
    public void setCustomerSecondaryKYCVerifiedDate(Integer customerSecondaryKYCVerifiedDate) {
        this.customerSecondaryKYCVerifiedDate = customerSecondaryKYCVerifiedDate;
    }

}
