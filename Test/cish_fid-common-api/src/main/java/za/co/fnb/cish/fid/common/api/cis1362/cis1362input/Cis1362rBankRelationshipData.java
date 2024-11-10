package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"bankRelationshipTable"

})
@Generated("jsonschema2pojo")
public class Cis1362rBankRelationshipData implements Serializable {


    @JsonProperty("bankRelationshipTable")
    private List<Cis1362rBankRelationshipTable> bankRelationshipTable;

    @JsonProperty("bankRelationshipTable")
    public List<Cis1362rBankRelationshipTable> getBankRelationshipTable() {
        return bankRelationshipTable;
    }

    @JsonProperty("bankRelationshipTable")
    public void setBankRelationshipTable(List<Cis1362rBankRelationshipTable> bankRelationshipTable) {
        this.bankRelationshipTable = bankRelationshipTable;
    }
}
