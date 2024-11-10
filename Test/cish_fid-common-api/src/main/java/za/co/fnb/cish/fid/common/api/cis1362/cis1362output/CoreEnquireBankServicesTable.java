package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"customerBankServices"

})
public class CoreEnquireBankServicesTable implements Serializable {
    @ApiModelProperty(value = " Bank Services ")
    private String customerBankServices;


    public String getCustomerBankServices() {
        return customerBankServices;
    }

    public void setCustomerBankServices(String customerBankServices) {
        this.customerBankServices = customerBankServices;
    }

    @Override
    public String toString() {
        return "CoreEnquireBankServicesTable{" + "customerBankServices='" + customerBankServices + '\'' + '}';
    }

}
