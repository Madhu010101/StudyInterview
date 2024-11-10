package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@JsonPropertyOrder({"customerNumberOfBankServices", "bankServicesTable"

})
public class CoreEnquireBankServicesData implements Serializable {
    @ApiModelProperty(value = " ID table counter . e.g. 4")
    private Integer customerNumberOfBankServices;

    private List<CoreEnquireBankServicesTable> bankServicesTable;


    public Integer getCustomerNumberOfBankServices() {
        return customerNumberOfBankServices;
    }

    public void setCustomerNumberOfBankServices(Integer customerNumberOfBankServices) {
        this.customerNumberOfBankServices = customerNumberOfBankServices;
    }

    public List<CoreEnquireBankServicesTable> getBankServicesTable() {
        return bankServicesTable;
    }

    public void setBankServicesTable(List<CoreEnquireBankServicesTable> bankServicesTable) {
        this.bankServicesTable = bankServicesTable;
    }

    @Override
    public String toString() {
        return "CoreEnquireBankServicesData{" + "customerNumberOfBankServices='" + customerNumberOfBankServices + '\'' + ", bankServicesTable='" + bankServicesTable + '\'' + '}';
    }

}
