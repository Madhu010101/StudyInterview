package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customerContactphoneDialingCode", "customerContactphoneNumber"

})
@Generated("jsonschema2pojo")
public class Cis1362rContactPhoneNumber implements Serializable {

    @JsonProperty("customerContactphoneDialingCode")
    private String customerContactphoneDialingCode;

    @JsonProperty("customerContactphoneNumber")
    private String customerContactphoneNumber;

    @JsonProperty("customerContactphoneDialingCode")
    public String getCustomerContactphoneDialingCode() {
        return customerContactphoneDialingCode;
    }

    @JsonProperty("customerContactphoneDialingCode")
    public void setCustomerContactphoneDialingCode(String customerContactphoneDialingCode) {
        this.customerContactphoneDialingCode = customerContactphoneDialingCode;
    }

    @JsonProperty("customerContactphoneNumber")
    public String getCustomerContactphoneNumber() {
        return customerContactphoneNumber;
    }

    @JsonProperty("customerContactphoneNumber")
    public void setCustomerContactphoneNumber(String customerContactphoneNumber) {
        this.customerContactphoneNumber = customerContactphoneNumber;
    }
}
