package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"customerContactPhoneDialingCode", "customerContactPhoneNumber"

})
public class CoreEnquireContactPhoneNumber implements Serializable {

    @ApiModelProperty(value = "Contact person's phone code. e.g.  '012'")
    private String customerContactPhoneDialingCode;

    @ApiModelProperty(value = "Contact person's phone number. e.g. '5672345' ")
    private String customerContactPhoneNumber;

    public String getCustomerContactPhoneDialingCode() {
        return customerContactPhoneDialingCode;
    }

    public void setCustomerContactPhoneDialingCode(String customerContactPhoneDialingCode) {
        this.customerContactPhoneDialingCode = customerContactPhoneDialingCode;
    }

    public String getCustomerContactPhoneNumber() {
        return customerContactPhoneNumber;
    }

    public void setCustomerContactPhoneNumber(String customerContactPhoneNumber) {
        this.customerContactPhoneNumber = customerContactPhoneNumber;
    }

    @Override
    public String toString() {
        return "CoreEnquireContactPhoneNumber{" + "customerContactPhoneDialingCode='" + customerContactPhoneDialingCode + '\'' + "customerContactPhoneNumber='" + customerContactPhoneNumber + '\'' + '}';
    }

}
