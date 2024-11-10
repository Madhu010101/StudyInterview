package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"customerPreferredMethodOfContact", "homeNumber", "workNumber", "faxNumber",

})
public class CoreEnquirecContactIndividualData implements Serializable {

    @ApiModelProperty(value = " This field states the customers preferred contact method . e.g. 'C' - CELL PHONE \n" + "\n" + "'E' - EMAIL \n" + "\n" + "'P' - POST \n" + "\n" + "'S' - SMS \n" + "\n" + "'T' - TELEPHONE (LAND-LINE)")
    private String customerPreferredMethodOfContact;

    private CoreEnquireHomeNumber homeNumber;

    private CoreEnquireWorkNumber workNumber;

    private CoreEnquireFaxNumber faxNumber;

    public String getCustomerPreferredMethodOfContact() {
        return customerPreferredMethodOfContact;
    }

    public void setCustomerPreferredMethodOfContact(String customerPreferredMethodOfContact) {
        this.customerPreferredMethodOfContact = customerPreferredMethodOfContact;
    }

    public CoreEnquireHomeNumber getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(CoreEnquireHomeNumber homeNumber) {
        this.homeNumber = homeNumber;
    }

    public CoreEnquireWorkNumber getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(CoreEnquireWorkNumber workNumber) {
        this.workNumber = workNumber;
    }

    public CoreEnquireFaxNumber getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(CoreEnquireFaxNumber faxNumber) {
        this.faxNumber = faxNumber;
    }

    @Override
    public String toString() {
        return "CoreEnquirecContactIndividualData{" + "customerPreferredMethodOfContact='" + customerPreferredMethodOfContact + '\'' + ", homeNumber='" + homeNumber + '\'' + ", workNumber='" + workNumber + '\'' + ", faxNumber='" + faxNumber + '\'' + '}';
    }

}
