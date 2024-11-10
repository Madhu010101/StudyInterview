package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"customerOldUCNCompanyID", "customerOldUCN", "customerCompanyID", "customerUCN"

})
public class CoreEnquireGeneralData implements Serializable {
    @ApiModelProperty(value = " The previous Company ID for this Customer if a Customer combine took place. e.g. 25 ")
    private Integer customerOldUCNCompanyID;

    @ApiModelProperty(value = " The pervious Customer UCN for this Customer if a Customer combine took place. e.g. 56565656 ")
    private Long customerOldUCN;

    @ApiModelProperty(value = " The unique company code which identifies which Hogan company the customer maintains a relationship with. e.g.  15 ")
    private Integer customerCompanyID;

    @ApiModelProperty(value = "The customer unique customer number. e.g. 56565656 ")
    private Long customerUCN;

    public Integer getCustomerOldUCNCompanyID() {
        return customerOldUCNCompanyID;
    }

    public void setCustomerOldUCNCompanyID(Integer customerOldUCNCompanyID) {
        this.customerOldUCNCompanyID = customerOldUCNCompanyID;
    }

    public Long getCustomerOldUCN() {
        return customerOldUCN;
    }

    public void setCustomerOldUCN(Long customerOldUCN) {
        this.customerOldUCN = customerOldUCN;
    }

    public Integer getCustomerCompanyID() {
        return customerCompanyID;
    }

    public void setCustomerCompanyID(Integer customerCompanyID) {
        this.customerCompanyID = customerCompanyID;
    }

    public Long getCustomerUCN() {
        return customerUCN;
    }

    public void setCustomerUCN(Long customerUCN) {
        this.customerUCN = customerUCN;
    }

    @Override
    public String toString() {
        return "CoreEnquireGeneralData{" + "customerOldUCNCompanyID='" + customerOldUCNCompanyID + '\'' + "customerOldUCN='" + customerOldUCN + '\'' + "customerCompanyID='" + customerCompanyID + '\'' + "customerUCN='" + customerUCN + '\'' + '}';
    }

}
