package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerEKycStatus",
        "customerEKycModifyDate"

})
@Generated("jsonschema2pojo")
public class Cis1356rRegulatoryEnquireZosEKYCData {
    @JsonProperty("customerEKycStatus")
    private String customerEKycStatus;

    @JsonProperty("customerEKycModifyDate")
    private Long customerEKycModifyDate;

    @JsonProperty("customerEKycStatus")
    public String getCustomerEKycStatus() {
        return customerEKycStatus;
    }
    @JsonProperty("customerEKycStatus")
    public void setCustomerEKycStatus(String customerEKycStatus) {
        this.customerEKycStatus = customerEKycStatus;
    }
    @JsonProperty("customerEKycModifyDate")
    public Long getCustomerEKycModifyDate() {
        return customerEKycModifyDate;
    }
    @JsonProperty("customerEKycModifyDate")
    public void setCustomerEKycModifyDate(Long customerEKycModifyDate) {
        this.customerEKycModifyDate = customerEKycModifyDate;
    }

    @Override
    public String toString() {
        return "Cis1356rRegulatoryEnquireZosEKYCData{" +
                "customerEKycStatus='" + customerEKycStatus + '\'' +
                ", customerEKycModifyDate='" + customerEKycModifyDate + '\'' +
                '}';
    }

}
