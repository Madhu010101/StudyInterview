package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"customerContactFaxDialingCode", "customerContactFaxNumber"

})
public class CoreEnquireContactFaxNumber implements Serializable {

    @ApiModelProperty(value = "Contact person's  Fax Area Code. e.g.  '011' ")
    private String customerContactFaxDialingCode;

    @ApiModelProperty(value = "Contact person's fax number. e.g. '4327895' ")
    private String customerContactFaxNumber;

    public String getCustomerContactFaxDialingCode() {
        return customerContactFaxDialingCode;
    }

    public void setCustomerContactFaxDialingCode(String customerContactFaxDialingCode) {
        this.customerContactFaxDialingCode = customerContactFaxDialingCode;
    }

    public String getCustomerContactFaxNumber() {
        return customerContactFaxNumber;
    }

    public void setCustomerContactFaxNumber(String customerContactFaxNumber) {
        this.customerContactFaxNumber = customerContactFaxNumber;
    }

    @Override
    public String toString() {
        return "CoreEnquireContactFaxNumber{" + "customerContactFaxDialingCode='" + customerContactFaxDialingCode + '\'' + "customerContactFaxNumber='" + customerContactFaxNumber + '\'' + '}';
    }

}
