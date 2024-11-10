package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customerCellphoneDialingCode", "customerCellphoneNumber"})
@Generated("jsonschema2pojo")
public class Cis1362rCellphoneNumber implements Serializable {

    @JsonProperty("customerCellphoneDialingCode")
    private String customerCellphoneDialingCode;

    @JsonProperty("customerCellphoneNumber")
    private String customerCellphoneNumber;

    @JsonProperty("customerCellphoneDialingCode")
    public String getCustomerCellphoneDialingCode() {
        return customerCellphoneDialingCode;
    }

    @JsonProperty("customerCellphoneDialingCode")
    public void setCustomerCellphoneDialingCode(String customerCellphoneDialingCode) {
        this.customerCellphoneDialingCode = customerCellphoneDialingCode;
    }

    @JsonProperty("customerCellphoneNumber")
    public String getCustomerCellphoneNumber() {
        return customerCellphoneNumber;
    }

    @JsonProperty("customerCellphoneNumber")
    public void setCustomerCellphoneNumber(String customerCellphoneNumber) {
        this.customerCellphoneNumber = customerCellphoneNumber;
    }
}
