package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.annotation.Generated;


import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customerBankServices"

})
@Generated("jsonschema2pojo")
public class Cis1362rBankServicesTable implements Serializable {

    @JsonProperty("customerBankServices")
    private String customerBankServices;

    @JsonProperty("customerBankServices")
    public String getCustomerBankServices() {
        return customerBankServices;
    }

    @JsonProperty("customerBankServices")
    public void setCustomerBankServices(String customerBankServices) {
        this.customerBankServices = customerBankServices;
    }


}
