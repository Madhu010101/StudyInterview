package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"customerIdentityType", "customerIDNumber", "customerIDIssuer", "customerIDEffectiveDate", "customerIDExpiryDate"

})
public class CoreEnquireIdentityTable implements Serializable {
    @ApiModelProperty(value = " Customer ID Type. e.g. RSAID' OR 'COREG' Contact CII for the full list ")
    private String customerIdentityType;

    @ApiModelProperty(value = " Customer ID Number. e.g. '89090912456767' ")
    private String customerIDNumber;

    @ApiModelProperty(value = " Country where the ID issued. e.g.  'ZA' ")
    private String customerIDIssuer;

    @ApiModelProperty(value = "ID effective date. e.g. 20170101- CCYYMMDD  ")
    private Integer customerIDEffectiveDate;

    @ApiModelProperty(value = "ID expiry date. e.g. 20170101- CCYYMMDD ")
    private Integer customerIDExpiryDate;

    public String getCustomerIdentityType() {
        return customerIdentityType;
    }

    public void setCustomerIdentityType(String customerIdentityType) {
        this.customerIdentityType = customerIdentityType;
    }

    public String getCustomerIDNumber() {
        return customerIDNumber;
    }

    public void setCustomerIDNumber(String customerIDNumber) {
        this.customerIDNumber = customerIDNumber;
    }

    public String getCustomerIDIssuer() {
        return customerIDIssuer;
    }

    public void setCustomerIDIssuer(String customerIDIssuer) {
        this.customerIDIssuer = customerIDIssuer;
    }

    public Integer getCustomerIDEffectiveDate() {
        return customerIDEffectiveDate;
    }

    public void setCustomerIDEffectiveDate(Integer customerIDEffectiveDate) {
        this.customerIDEffectiveDate = customerIDEffectiveDate;
    }

    public Integer getCustomerIDExpiryDate() {
        return customerIDExpiryDate;
    }

    public void setCustomerIDExpiryDate(Integer customerIDExpiryDate) {
        this.customerIDExpiryDate = customerIDExpiryDate;
    }

    @Override
    public String toString() {
        return "CoreEnquireIdentityTable{" + "customerIdentityType='" + customerIdentityType + '\'' + "customerIDNumber='" + customerIDNumber + '\'' + "customerIDIssuer='" + customerIDIssuer + '\'' + "customerIDEffectiveDate='" + customerIDEffectiveDate + '\'' + "customerIDExpiryDate='" + customerIDExpiryDate + '\'' + '}';
    }

}
