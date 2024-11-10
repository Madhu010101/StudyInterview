package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerAKycStatus",
        "customerAKycModifyDate"

})
@Generated("jsonschema2pojo")
public class Cis1356rRegulatoryEnquireZosAKIData {
    @JsonProperty("customerAKycStatus")
    private String customerAKycStatus;

    @JsonProperty("customerAKycModifyDate")
    private Integer customerAKycModifyDate;

    @JsonProperty("customerAKycStatus")
    public String getCustomerAKycStatus() {
        return customerAKycStatus;
    }
    @JsonProperty("customerAKycStatus")
    public void setCustomerAKycStatus(String customerAKycStatus) {
        this.customerAKycStatus = customerAKycStatus;
    }
    @JsonProperty("customerAKycModifyDate")
    public Integer getCustomerAKycModifyDate() {
        return customerAKycModifyDate;
    }
    @JsonProperty("customerAKycModifyDate")
    public void setCustomerAKycModifyDate(Integer customerAKycModifyDate) {
        this.customerAKycModifyDate = customerAKycModifyDate;
    }

    @Override
    public String toString() {
        return "Cis1356rRegulatoryEnquireZosAKIData{" +
                "customerAKycStatus='" + customerAKycStatus + '\'' +
                ", customerAKycModifyDate='" + customerAKycModifyDate + '\'' +
                '}';
    }

}
