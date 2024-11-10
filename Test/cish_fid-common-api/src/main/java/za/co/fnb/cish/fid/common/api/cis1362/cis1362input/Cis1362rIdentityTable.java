package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customerIdentityType", "customerIDNumber", "customerIDIssuer", "customerIDEffectiveDate", "customerIDExpiryDate"

})
@Generated("jsonschema2pojo")
public class Cis1362rIdentityTable implements Serializable {

    @JsonProperty("customerIdentityType")
    private String customerIdentityType;

    @JsonProperty("customerIDNumber")
    private String customerIDNumber;

    @JsonProperty("customerIDIssuer")
    private String customerIDIssuer;

    @JsonProperty("customerIDEffectiveDate")
    private Integer customerIDEffectiveDate;

    @JsonProperty("customerIDExpiryDate")
    private Integer customerIDExpiryDate;

    @JsonProperty("customerIdentityType")
    public String getCustomerIdentityType() {
        return customerIdentityType;
    }

    @JsonProperty("customerIdentityType")
    public void setCustomerIdentityType(String customerIdentityType) {
        this.customerIdentityType = customerIdentityType;
    }

    @JsonProperty("customerIDNumber")
    public String getCustomerIDNumber() {
        return customerIDNumber;
    }

    @JsonProperty("customerIDNumber")
    public void setCustomerIDNumber(String customerIDNumber) {
        this.customerIDNumber = customerIDNumber;
    }

    @JsonProperty("customerIDIssuer")
    public String getCustomerIDIssuer() {
        return customerIDIssuer;
    }

    @JsonProperty("customerIDIssuer")
    public void setCustomerIDIssuer(String customerIDIssuer) {
        this.customerIDIssuer = customerIDIssuer;
    }

    @JsonProperty("customerIDEffectiveDate")
    public Integer getCustomerIDEffectiveDate() {
        return customerIDEffectiveDate;
    }

    @JsonProperty("customerIDEffectiveDate")
    public void setCustomerIDEffectiveDate(Integer customerIDEffectiveDate) {
        this.customerIDEffectiveDate = customerIDEffectiveDate;
    }

    @JsonProperty("customerIDExpiryDate")
    public Integer getCustomerIDExpiryDate() {
        return customerIDExpiryDate;
    }

    @JsonProperty("customerIDExpiryDate")
    public void setCustomerIDExpiryDate(Integer customerIDExpiryDate) {
        this.customerIDExpiryDate = customerIDExpiryDate;
    }

}
