package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"bankServicesTable"

})
@Generated("jsonschema2pojo")
public class Cis1362rBankServicesData implements Serializable {


    @JsonProperty("bankServicesTable")
    private List<Cis1362rBankServicesTable> bankServicesTable;


    @JsonProperty("bankServicesTable")
    public List<Cis1362rBankServicesTable> getBankServicesTable() {
        return bankServicesTable;
    }

    @JsonProperty("bankServicesTable")
    public void setBankServicesTable(List<Cis1362rBankServicesTable> bankServicesTable) {
        this.bankServicesTable = bankServicesTable;
    }
}
