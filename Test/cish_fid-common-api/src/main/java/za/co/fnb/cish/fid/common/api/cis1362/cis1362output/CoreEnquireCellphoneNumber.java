package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"customerCellPhoneDialingCode", "customerCellPhoneNumber"

})
public class CoreEnquireCellphoneNumber implements Serializable {

    @ApiModelProperty(value = "Cell Code. e.g.  '082' ")
    private String customerCellPhoneDialingCode;

    @ApiModelProperty(value = "Cell Number. e.g. '8090909' ")
    private String customerCellPhoneNumber;

    public String getCustomerCellPhoneDialingCode() {
        return customerCellPhoneDialingCode;
    }

    public void setCustomerCellPhoneDialingCode(String customerCellPhoneDialingCode) {
        this.customerCellPhoneDialingCode = customerCellPhoneDialingCode;
    }

    public String getCustomerCellPhoneNumber() {
        return customerCellPhoneNumber;
    }

    public void setCustomerCellPhoneNumber(String customerCellPhoneNumber) {
        this.customerCellPhoneNumber = customerCellPhoneNumber;
    }

    @Override
    public String toString() {
        return "CoreEnquireCellphoneNumber{" + "customerCellPhoneDialingCode='" + customerCellPhoneDialingCode + '\'' + "customerCellPhoneNumber='" + customerCellPhoneNumber + '\'' + '}';
    }

}
