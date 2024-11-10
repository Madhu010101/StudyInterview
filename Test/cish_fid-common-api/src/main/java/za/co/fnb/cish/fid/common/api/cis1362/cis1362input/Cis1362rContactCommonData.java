package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customerEmailAddress", "cellphoneNumber"

})
@Generated("jsonschema2pojo")
public class Cis1362rContactCommonData implements Serializable {

    @JsonProperty("customerEmailAddress")
    private String customerEmailAddress;

    @JsonProperty("cellphoneNumber")
    private Cis1362rCellphoneNumber cellphoneNumber;

    @JsonProperty("customerEmailAddress")
    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    @JsonProperty("customerEmailAddress")
    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    @JsonProperty("cellphoneNumber")
    public Cis1362rCellphoneNumber getCellphoneNumber() {
        return cellphoneNumber;
    }

    @JsonProperty("cellphoneNumber")
    public void setCellphoneNumber(Cis1362rCellphoneNumber cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }
}
