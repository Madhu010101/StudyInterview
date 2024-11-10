package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customerFaxphoneDialingCode", "customerFaxphoneNumber"

})
@Generated("jsonschema2pojo")
public class Cis1362rFaxNumber implements Serializable {


    @JsonProperty("customerFaxphoneDialingCode")
    private String customerFaxphoneDialingCode;

    @JsonProperty("customerFaxphoneNumber")
    private String customerFaxphoneNumber;

    @JsonProperty("customerFaxphoneDialingCode")
    public String getCustomerFaxphoneDialingCode() {
        return customerFaxphoneDialingCode;
    }

    @JsonProperty("customerFaxphoneDialingCode")
    public void setCustomerFaxphoneDialingCode(String customerFaxphoneDialingCode) {
        this.customerFaxphoneDialingCode = customerFaxphoneDialingCode;
    }

    @JsonProperty("customerFaxphoneNumber")
    public String getCustomerFaxphoneNumber() {
        return customerFaxphoneNumber;
    }

    @JsonProperty("customerFaxphoneNumber")
    public void setCustomerFaxphoneNumber(String customerFaxphoneNumber) {
        this.customerFaxphoneNumber = customerFaxphoneNumber;
    }
}
