package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customerHomephoneDialingCode", "customerHomephoneNumber"

})
@Generated("jsonschema2pojo")
public class Cis1362rHomeNumber implements Serializable {

    @JsonProperty("customerHomephoneDialingCode")
    private String customerHomephoneDialingCode;

    @JsonProperty("customerHomephoneNumber")
    private String customerHomephoneNumber;

    @JsonProperty("customerHomephoneDialingCode")
    public String getCustomerHomephoneDialingCode() {
        return customerHomephoneDialingCode;
    }

    @JsonProperty("customerHomephoneDialingCode")
    public void setCustomerHomephoneDialingCode(String customerHomephoneDialingCode) {
        this.customerHomephoneDialingCode = customerHomephoneDialingCode;
    }

    @JsonProperty("customerHomephoneNumber")
    public String getCustomerHomephoneNumber() {
        return customerHomephoneNumber;
    }

    @JsonProperty("customerHomephoneNumber")
    public void setCustomerHomephoneNumber(String customerHomephoneNumber) {
        this.customerHomephoneNumber = customerHomephoneNumber;
    }
}
