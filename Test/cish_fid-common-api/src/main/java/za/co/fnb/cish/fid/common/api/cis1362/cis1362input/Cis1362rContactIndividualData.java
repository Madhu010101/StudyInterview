package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customerPreferredMethodOfContact", "homeNumber", "workNumber", "faxNumber",

})
@Generated("jsonschema2pojo")
public class Cis1362rContactIndividualData implements Serializable {

    @JsonProperty("customerPreferredMethodOfContact")
    private String customerPreferredMethodOfContact;

    @JsonProperty("homeNumber")
    private Cis1362rHomeNumber homeNumber;

    @JsonProperty("workNumber")
    private Cis1362rWorkNumber workNumber;

    @JsonProperty("faxNumber")
    private Cis1362rFaxNumber faxNumber;

    @JsonProperty("customerPreferredMethodOfContact")
    public String getCustomerPreferredMethodOfContact() {
        return customerPreferredMethodOfContact;
    }

    @JsonProperty("customerPreferredMethodOfContact")
    public void setCustomerPreferredMethodOfContact(String customerPreferredMethodOfContact) {
        this.customerPreferredMethodOfContact = customerPreferredMethodOfContact;
    }

    @JsonProperty("homeNumber")
    public Cis1362rHomeNumber getHomeNumber() {
        return homeNumber;
    }

    @JsonProperty("homeNumber")
    public void setHomeNumber(Cis1362rHomeNumber homeNumber) {
        this.homeNumber = homeNumber;
    }

    @JsonProperty("workNumber")
    public Cis1362rWorkNumber getWorkNumber() {
        return workNumber;
    }

    @JsonProperty("workNumber")
    public void setWorkNumber(Cis1362rWorkNumber workNumber) {
        this.workNumber = workNumber;
    }

    @JsonProperty("faxNumber")
    public Cis1362rFaxNumber getFaxNumber() {
        return faxNumber;
    }

    @JsonProperty("faxNumber")
    public void setFaxNumber(Cis1362rFaxNumber faxNumber) {
        this.faxNumber = faxNumber;
    }
}
