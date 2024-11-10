package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"customerWorkPhoneDialingCode", "customerWorkPhoneNumber"

})
public class CoreEnquireWorkNumber implements Serializable {

    @ApiModelProperty(value = "Work Area Code. e.g.  '011'")
    private String customerWorkPhoneDialingCode;

    @ApiModelProperty(value = "Work Number. e.g. '8090909' ")
    private String customerWorkPhoneNumber;

    public String getCustomerWorkPhoneDialingCode() {
        return customerWorkPhoneDialingCode;
    }

    public void setCustomerWorkPhoneDialingCode(String customerWorkPhoneDialingCode) {
        this.customerWorkPhoneDialingCode = customerWorkPhoneDialingCode;
    }

    public String getCustomerWorkPhoneNumber() {
        return customerWorkPhoneNumber;
    }

    public void setCustomerWorkPhoneNumber(String customerWorkPhoneNumber) {
        this.customerWorkPhoneNumber = customerWorkPhoneNumber;
    }

    @Override
    public String toString() {
        return "CoreEnquireWorkNumber{" + "customerWorkPhoneDialingCode='" + customerWorkPhoneDialingCode + '\'' + "customerWorkPhoneNumber='" + customerWorkPhoneNumber + '\'' + '}';
    }

}
