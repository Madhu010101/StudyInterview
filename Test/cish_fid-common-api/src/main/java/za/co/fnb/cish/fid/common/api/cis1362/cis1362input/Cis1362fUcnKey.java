package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Cis1362fUcnKey {
    @JsonProperty("customerCompanyId")
    private Integer customerCompanyId;

    @JsonProperty("customerNumber")
    private Long customerNumber;

    @JsonProperty("customerCompanyId")
    public Integer getCustomerCompanyId() {
        return customerCompanyId;
    }

    @JsonProperty("customerCompanyId")
    public void setCustomerCompanyId(Integer customerCompanyId) {
        this.customerCompanyId = customerCompanyId;
    }

    @JsonProperty("customerNumber")
    public Long getCustomerNumber() {
        return customerNumber;
    }

    @JsonProperty("customerNumber")
    public void setCustomerNumber(Long customerNumber) {
        this.customerNumber = customerNumber;
    }
}
