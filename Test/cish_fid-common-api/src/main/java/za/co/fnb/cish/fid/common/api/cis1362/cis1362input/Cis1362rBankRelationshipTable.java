package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customerBankRelationship"

})
@Generated("jsonschema2pojo")
public class Cis1362rBankRelationshipTable implements Serializable {

    @JsonProperty("customerBankRelationship")
    private String customerBankRelationship;

    @JsonProperty("customerBankRelationship")
    public String getCustomerBankRelationship() {
        return customerBankRelationship;
    }

    @JsonProperty("customerBankRelationship")
    public void setCustomerBankRelationship(String customerBankRelationship) {
        this.customerBankRelationship = customerBankRelationship;
    }

}
