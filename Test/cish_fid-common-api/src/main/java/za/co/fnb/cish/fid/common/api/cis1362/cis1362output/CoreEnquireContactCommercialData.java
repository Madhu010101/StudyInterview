package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"customerContactTitle", "customerContactName", "contactPhoneNumber", "contactFaxNumber",

})
public class CoreEnquireContactCommercialData implements Serializable {

    @ApiModelProperty(value = " Business Contact Title. This field is only applicable for juristic. . e.g. 'Manager' ")
    private String customerContactTitle;

    @ApiModelProperty(value = " Business Contact Name. This field is only applicable for juristic. . e.g. 'Mr Snoek'")
    private String customerContactName;

    private CoreEnquireContactPhoneNumber contactPhoneNumber;

    private CoreEnquireContactFaxNumber contactFaxNumber;

    public String getCustomerContactTitle() {
        return customerContactTitle;
    }

    public void setCustomerContactTitle(String customerContactTitle) {
        this.customerContactTitle = customerContactTitle;
    }

    public String getCustomerContactName() {
        return customerContactName;
    }

    public void setCustomerContactName(String customerContactName) {
        this.customerContactName = customerContactName;
    }

    public CoreEnquireContactPhoneNumber getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(CoreEnquireContactPhoneNumber contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public CoreEnquireContactFaxNumber getContactFaxNumber() {
        return contactFaxNumber;
    }

    public void setContactFaxNumber(CoreEnquireContactFaxNumber contactFaxNumber) {
        this.contactFaxNumber = contactFaxNumber;
    }

    @Override
    public String toString() {
        return "CoreEnquireContactCommercialData{" + "customerContactTitle='" + customerContactTitle + '\'' + ", customerContactName='" + customerContactName + '\'' + ", contactPhoneNumber='" + contactPhoneNumber + '\'' + ", contactFaxNumber='" + contactFaxNumber + '\'' + '}';
    }

}
