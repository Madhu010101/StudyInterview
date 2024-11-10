package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerPoiStatus",
        "customerPoiDate",
        "customerPoaStatus",
        "customerPoaDate"

})
@Generated("jsonschema2pojo")
public class Cis1356rRegulatoryEnquireZosIndividualCustomerPayload {

    @JsonProperty("customerPoiStatus")
    private String customerPoiStatus;

    @JsonProperty("customerPoiDate")
    private Integer customerPoiDate;

    @JsonProperty("customerPoaStatus")
    private String customerPoaStatus;

    @JsonProperty("customerPoaDate")
    private Integer customerPoaDate;

    @JsonProperty("customerPoiStatus")
    public String getCustomerPoiStatus() {
        return customerPoiStatus;
    }

    @JsonProperty("customerPoiStatus")
    public void setCustomerPoiStatus(String customerPoiStatus) {
        this.customerPoiStatus = customerPoiStatus;
    }

    @JsonProperty("customerPoiDate")
    public Integer getCustomerPoiDate() {
        return customerPoiDate;
    }

    @JsonProperty("customerPoiDate")
    public void setCustomerPoiDate(Integer customerPoiDate) {
        this.customerPoiDate = customerPoiDate;
    }

    @JsonProperty("customerPoaStatus")
    public String getCustomerPoaStatus() {
        return customerPoaStatus;
    }

    @JsonProperty("customerPoaStatus")
    public void setCustomerPoaStatus(String customerPoaStatus) {
        this.customerPoaStatus = customerPoaStatus;
    }

    @JsonProperty("customerPoaDate")
    public Integer getCustomerPoaDate() {
        return customerPoaDate;
    }


    @JsonProperty("customerPoaDate")
    public void setCustomerPoaDate(Integer customerPoaDate) {
        this.customerPoaDate = customerPoaDate;
    }

}
