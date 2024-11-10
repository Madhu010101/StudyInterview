package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"customerFaxPhoneDialingCode", "customerFaxPhoneNumber"

})
public class CoreEnquireFaxNumber implements Serializable {

    @ApiModelProperty(value = "Fax Area Code. e.g.  '011'")
    private String customerFaxPhoneDialingCode;

    @ApiModelProperty(value = "Fax Number. e.g. '8090909' ")
    private String customerFaxPhoneNumber;

    public String getCustomerFaxPhoneDialingCode() {
        return customerFaxPhoneDialingCode;
    }

    public void setCustomerFaxPhoneDialingCode(String customerFaxPhoneDialingCode) {
        this.customerFaxPhoneDialingCode = customerFaxPhoneDialingCode;
    }

    public String getCustomerFaxPhoneNumber() {
        return customerFaxPhoneNumber;
    }

    public void setCustomerFaxPhoneNumber(String customerFaxPhoneNumber) {
        this.customerFaxPhoneNumber = customerFaxPhoneNumber;
    }

    @Override
    public String toString() {
        return "CoreEnquireFaxNumber{" + "customerFaxPhoneDialingCode='" + customerFaxPhoneDialingCode + '\'' + "customerFaxPhoneNumber='" + customerFaxPhoneNumber + '\'' + '}';
    }

}
