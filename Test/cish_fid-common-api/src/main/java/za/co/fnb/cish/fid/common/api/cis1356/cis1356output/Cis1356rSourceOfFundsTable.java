package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Cis1356rSourceOfFundsTable {


    @JsonProperty("sourceOfFundsItem")
    private List<Cis1356rSourceOfFundsItem> sourceOfFundsItem ;

    public List<Cis1356rSourceOfFundsItem> getSourceOfFundsItem() {
        return sourceOfFundsItem;
    }

    public void setSourceOfFundsItem(List<Cis1356rSourceOfFundsItem> sourceOfFundsItem) {
        this.sourceOfFundsItem = sourceOfFundsItem;
    }

}
