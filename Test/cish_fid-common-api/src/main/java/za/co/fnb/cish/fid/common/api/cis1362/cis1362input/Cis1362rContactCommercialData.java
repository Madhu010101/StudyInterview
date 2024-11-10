package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customerContactTitle", "customerContactName", "contactPhoneNumber", "contactFaxNumber",

})
@Generated("jsonschema2pojo")
public class Cis1362rContactCommercialData implements Serializable {

    @JsonProperty("customerContactTitle")
    private String customerContactTitle;

    @JsonProperty("customerContactName")
    private String customerContactName;

    @JsonProperty("contactPhoneNumber")
    private Cis1362rContactPhoneNumber contactPhoneNumber;

    @JsonProperty("contactFaxNumber")
    private Cis1362rContactFaxNumber contactFaxNumber;

    @JsonProperty("customerContactTitle")
    public String getCustomerContactTitle() {
        return customerContactTitle;
    }

    @JsonProperty("customerContactTitle")
    public void setCustomerContactTitle(String customerContactTitle) {
        this.customerContactTitle = customerContactTitle;
    }

    @JsonProperty("customerContactName")
    public String getCustomerContactName() {
        return customerContactName;
    }

    @JsonProperty("customerContactName")
    public void setCustomerContactName(String customerContactName) {
        this.customerContactName = customerContactName;
    }

    @JsonProperty("contactPhoneNumber")
    public Cis1362rContactPhoneNumber getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    @JsonProperty("contactPhoneNumber")
    public void setContactPhoneNumber(Cis1362rContactPhoneNumber contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    @JsonProperty("contactFaxNumber")
    public Cis1362rContactFaxNumber getContactFaxNumber() {
        return contactFaxNumber;
    }

    @JsonProperty("contactFaxNumber")
    public void setContactFaxNumber(Cis1362rContactFaxNumber contactFaxNumber) {
        this.contactFaxNumber = contactFaxNumber;
    }
}
