package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"customerHomePhoneDialingCode", "customerHomePhoneNumber"

})
public class CoreEnquireHomeNumber implements Serializable {

    @ApiModelProperty(value = "Home Area Code. e.g.  '011'")
    private String customerHomePhoneDialingCode;

    @ApiModelProperty(value = "Home Number. e.g. '8090909' ")
    private String customerHomePhoneNumber;

    public String getCustomerHomePhoneDialingCode() {
        return customerHomePhoneDialingCode;
    }

    public void setCustomerHomePhoneDialingCode(String customerHomePhoneDialingCode) {
        this.customerHomePhoneDialingCode = customerHomePhoneDialingCode;
    }

    public String getCustomerHomePhoneNumber() {
        return customerHomePhoneNumber;
    }

    public void setCustomerHomePhoneNumber(String customerHomePhoneNumber) {
        this.customerHomePhoneNumber = customerHomePhoneNumber;
    }

    @Override
    public String toString() {
        return "CoreEnquireHomeNumber{" + "customerHomePhoneDialingCode='" + customerHomePhoneDialingCode + '\'' + "customerHomePhoneNumber='" + customerHomePhoneNumber + '\'' + '}';
    }

}
