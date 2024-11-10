package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "sourceOfFundsTable"
})
@Generated("jsonschema2pojo")
public class Cis1356rRegulatoryEnquireZosSourceofFundInfo {

    Cis1356rSourceOfFundsTable sourceOfFundsTable;


    public Cis1356rSourceOfFundsTable getSourceOfFundsTable() {
        return sourceOfFundsTable;
    }

    public void setSourceOfFundsTable(Cis1356rSourceOfFundsTable sourceOfFundsTable) {
        this.sourceOfFundsTable = sourceOfFundsTable;
    }

    @Override
    public String toString() {
        return "Cis1356rRegulatoryEnquireZosSourceofFundInfo{" +
                "sourceOfFundsTable='" + sourceOfFundsTable + '\'' +
                '}';
    }

}
