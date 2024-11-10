package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"customerBankRelationship"

})
public class CoreEnquireBankRelationshipTable implements Serializable {
    @ApiModelProperty(value = " Bank Relationships . e.g. SOL, SST ")
    private String customerBankRelationship;

    public String getCustomerBankRelationship() {
        return customerBankRelationship;
    }

    public void setCustomerBankRelationship(String customerBankRelationship) {
        this.customerBankRelationship = customerBankRelationship;
    }

    @Override
    public String toString() {
        return "CoreEnquireBankRelationshipTable{" + "customerBankRelationship='" + customerBankRelationship + '\'' + '}';
    }

}
