package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customerOldCompanyId", "customerOldNumber", "customerCompanyId", "customerNumber"

})
@Generated("jsonschema2pojo")
public class Cis1362rGeneralData implements Serializable {
    @JsonProperty("customerOldCompanyId")
    private Integer customerOldCompanyId;

    @JsonProperty("customerOldNumber")
    private Long customerOldNumber;

    @JsonProperty("customerCompanyId")
    private Integer customerCompanyId;

    @JsonProperty("customerNumber")
    private Long customerNumber;

    @JsonProperty("customerOldCompanyId")
    public Integer getCustomerOldCompanyId() {
        return customerOldCompanyId;
    }

    @JsonProperty("customerOldCompanyId")
    public void setCustomerOldCompanyId(Integer customerOldCompanyId) {
        this.customerOldCompanyId = customerOldCompanyId;
    }

    @JsonProperty("customerOldNumber")
    public Long getCustomerOldNumber() {
        return customerOldNumber;
    }

    @JsonProperty("customerOldNumber")
    public void setCustomerOldNumber(Long customerOldNumber) {
        this.customerOldNumber = customerOldNumber;
    }

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
