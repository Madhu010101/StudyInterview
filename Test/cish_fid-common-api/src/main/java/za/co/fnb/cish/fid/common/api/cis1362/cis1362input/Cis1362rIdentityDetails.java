package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"identityTable"

})
@Generated("jsonschema2pojo")
public class Cis1362rIdentityDetails implements Serializable {


    @JsonProperty("identityTable")
    private List<Cis1362rIdentityTable> identityTable;

    @JsonProperty("identityTable")
    public List<Cis1362rIdentityTable> getIdentityTable() {
        return identityTable;
    }

    @JsonProperty("identityTable")
    public void setIdentityTable(List<Cis1362rIdentityTable> identityTable) {
        this.identityTable = identityTable;
    }
}
