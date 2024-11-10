package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@JsonPropertyOrder({"customerNumberOfBankRelationships", "bankRelationshipTable"

})
public class CoreEnquireBankRelationshipData implements Serializable {
    private static final long serialVersionUID = 6236709371354934965L;

    @ApiModelProperty(value = " ID table counter . e.g. 2")
    private Integer customerNumberOfBankRelationships;

    private List<CoreEnquireBankRelationshipTable> bankRelationshipTable;

    public Integer getCustomerNumberOfBankRelationships() {
        return customerNumberOfBankRelationships;
    }

    public void setCustomerNumberOfBankRelationships(Integer customerNumberOfBankRelationships) {
        this.customerNumberOfBankRelationships = customerNumberOfBankRelationships;
    }

    public List<CoreEnquireBankRelationshipTable> getBankRelationshipTable() {
        return bankRelationshipTable;
    }

    public void setBankRelationshipTable(List<CoreEnquireBankRelationshipTable> bankRelationshipTable) {
        this.bankRelationshipTable = bankRelationshipTable;
    }

    @Override
    public String toString() {
        return "CoreEnquireBankRelationshipData{" + "customerNumberOfBankRelationships='" + customerNumberOfBankRelationships + '\'' + ", bankRelationshipTable='" + bankRelationshipTable + '\'' + '}';
    }

}
