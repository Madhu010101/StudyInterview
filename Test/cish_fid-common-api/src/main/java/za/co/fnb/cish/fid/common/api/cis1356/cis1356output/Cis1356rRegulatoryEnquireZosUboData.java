package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerUBOStatus",
        "customerUBOModifyDate"

})
@Generated("jsonschema2pojo")
public class Cis1356rRegulatoryEnquireZosUboData {
    @JsonProperty("customerUBOStatus")
    private String customerUBOStatus;

    @JsonProperty("customerUBOModifyDate")
    private Integer customerUBOModifyDate;

    @JsonProperty("customerUBOStatus")
    public String getCustomerUBOStatus() {
        return customerUBOStatus;
    }
    @JsonProperty("customerUBOStatus")
    public void setCustomerUBOStatus(String customerUBOStatus) {
        this.customerUBOStatus = customerUBOStatus;
    }
    @JsonProperty("customerUBOModifyDate")
    public Integer getCustomerUBOModifyDate() {
        return customerUBOModifyDate;
    }
    @JsonProperty("customerUBOModifyDate")
    public void setCustomerUBOModifyDate(Integer customerUBOModifyDate) {
        this.customerUBOModifyDate = customerUBOModifyDate;
    }

    @Override
    public String toString() {
        return "Cis1356rRegulatoryEnquireZosUboData{" +
                "customerUBOStatus='" + customerUBOStatus + '\'' +
                ", customerUBOModifyDate='" + customerUBOModifyDate + '\'' +
                '}';
    }

}
