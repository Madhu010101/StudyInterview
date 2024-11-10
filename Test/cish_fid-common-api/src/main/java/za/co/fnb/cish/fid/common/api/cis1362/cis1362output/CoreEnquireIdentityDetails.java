package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@JsonPropertyOrder({"customerIdentityTableCounter", "identityTable"

})
public class CoreEnquireIdentityDetails implements Serializable {
    @ApiModelProperty(value = " ID table counter . e.g. 01")
    private Integer customerIdentityTableCounter;

    private List<CoreEnquireIdentityTable> identityTable;

    public Integer getCustomerIdentityTableCounter() {
        return customerIdentityTableCounter;
    }

    public void setCustomerIdentityTableCounter(Integer customerIdentityTableCounter) {
        this.customerIdentityTableCounter = customerIdentityTableCounter;
    }

    public List<CoreEnquireIdentityTable> getIdentityTable() {
        return identityTable;
    }

    public void setIdentityTable(List<CoreEnquireIdentityTable> identityTable) {
        this.identityTable = identityTable;
    }

    @Override
    public String toString() {
        return "CoreEnquireIdentityDetails{" + "customerIdentityTableCounter='" + customerIdentityTableCounter + '\'' + ", identityTable='" + identityTable + '\'' + '}';
    }

}
