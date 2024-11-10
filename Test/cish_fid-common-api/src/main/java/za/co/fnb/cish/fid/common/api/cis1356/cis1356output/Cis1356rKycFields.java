package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerKycAddressVerified",
        "customerKycIdentityVerified"

})
@Generated("jsonschema2pojo")
public class Cis1356rKycFields {
    @JsonProperty("customerKycAddressVerified")
    private String customerKycAddressVerified;

    @JsonProperty("customerKycIdentityVerified")
    private String customerKycIdentityVerified;

    public String getCustomerKycAddressVerified() {
        return customerKycAddressVerified;
    }

    public void setCustomerKycAddressVerified(String customerKycAddressVerified) {
        this.customerKycAddressVerified = customerKycAddressVerified;
    }

    public String getCustomerKycIdentityVerified() {
        return customerKycIdentityVerified;
    }

    public void setCustomerKycIdentityVerified(String customerKycIdentityVerified) {
        this.customerKycIdentityVerified = customerKycIdentityVerified;
    }
}
