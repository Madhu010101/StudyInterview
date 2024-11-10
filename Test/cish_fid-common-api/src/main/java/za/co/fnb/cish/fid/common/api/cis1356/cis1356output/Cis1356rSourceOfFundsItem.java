package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cis1356rSourceOfFundsItem {

    @JsonProperty("customerSourceOfFundsCode")
    private String customerSourceOfFundsCode;

    @JsonProperty("customerSourceOfFundsDescription")
    private String customerSourceOfFundsDescription;

    @JsonProperty("customerSourceOfFundsDate")
    private Integer customerSourceOfFundsDate;

    @JsonProperty("customerSourceOfFundsCode")
    public String getCustomerSourceOfFundsCode() {
        return customerSourceOfFundsCode;
    }
    @JsonProperty("customerSourceOfFundsCode")
    public void setCustomerSourceOfFundsCode(String customerSourceOfFundsCode) {
        this.customerSourceOfFundsCode = customerSourceOfFundsCode;
    }
    @JsonProperty("customerSourceOfFundsDescription")
    public String getCustomerSourceOfFundsDescription() {
        return customerSourceOfFundsDescription;
    }
    @JsonProperty("customerSourceOfFundsDescription")
    public void setCustomerSourceOfFundsDescription(String customerSourceOfFundsDescription) {
        this.customerSourceOfFundsDescription = customerSourceOfFundsDescription;
    }
    @JsonProperty("customerSourceOfFundsDate")
    public Integer getCustomerSourceOfFundsDate() {
        return customerSourceOfFundsDate;
    }
    @JsonProperty("customerSourceOfFundsDate")
    public void setCustomerSourceOfFundsDate(Integer customerSourceOfFundsDate) {
        this.customerSourceOfFundsDate = customerSourceOfFundsDate;
    }

}
