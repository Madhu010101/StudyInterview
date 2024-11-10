package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customerWorkphoneDialingCode", "customerWorkphoneNumber"

})
@Generated("jsonschema2pojo")
public class Cis1362rWorkNumber implements Serializable {

    @JsonProperty("customerWorkphoneDialingCode")
    private String customerWorkphoneDialingCode;

    @JsonProperty("customerWorkphoneNumber")
    private String customerWorkphoneNumber;

    @JsonProperty("customerWorkphoneDialingCode")
    public String getCustomerWorkphoneDialingCode() {
        return customerWorkphoneDialingCode;
    }

    @JsonProperty("customerWorkphoneDialingCode")
    public void setCustomerWorkphoneDialingCode(String customerWorkphoneDialingCode) {
        this.customerWorkphoneDialingCode = customerWorkphoneDialingCode;
    }

    @JsonProperty("customerWorkphoneNumber")
    public String getCustomerWorkphoneNumber() {
        return customerWorkphoneNumber;
    }

    @JsonProperty("customerWorkphoneNumber")
    public void setCustomerWorkphoneNumber(String customerWorkphoneNumber) {
        this.customerWorkphoneNumber = customerWorkphoneNumber;
    }
}
