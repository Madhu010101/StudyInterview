package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"customerEmailAddress", "cellphoneNumber"

})
public class CoreEnquireContactCommonData implements Serializable {

    @ApiModelProperty(value = " Customer's email address. e.g.  'terr@hhh.co.za' ")
    private String customerEmailAddress;

    private CoreEnquireCellphoneNumber cellphoneNumber;

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public CoreEnquireCellphoneNumber getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(CoreEnquireCellphoneNumber cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    @Override
    public String toString() {
        return "CoreEnquireContactCommonData{" + "customerEmailAddress='" + customerEmailAddress + '\'' + ", cellphoneNumber='" + cellphoneNumber + '\'' + '}';
    }

}
