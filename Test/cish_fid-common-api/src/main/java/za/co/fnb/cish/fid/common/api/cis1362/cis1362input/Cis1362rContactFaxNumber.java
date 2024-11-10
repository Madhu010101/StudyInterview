package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customerContactFaxDialingCode", "customerContactFaxNumber"

})
@Generated("jsonschema2pojo")
public class Cis1362rContactFaxNumber implements Serializable {

    @JsonProperty("customerContactFaxDialingCode")
    private String customerContactFaxDialingCode;

    @JsonProperty("customerContactFaxNumber")
    private String customerContactFaxNumber;

    @JsonProperty("customerContactFaxDialingCode")
    public String getCustomerContactFaxDialingCode() {
        return customerContactFaxDialingCode;
    }

    @JsonProperty("customerContactFaxDialingCode")
    public void setCustomerContactFaxDialingCode(String customerContactFaxDialingCode) {
        this.customerContactFaxDialingCode = customerContactFaxDialingCode;
    }

    @JsonProperty("customerContactFaxNumber")
    public String getCustomerContactFaxNumber() {
        return customerContactFaxNumber;
    }

    @JsonProperty("customerContactFaxNumber")
    public void setCustomerContactFaxNumber(String customerContactFaxNumber) {
        this.customerContactFaxNumber = customerContactFaxNumber;
    }

}
