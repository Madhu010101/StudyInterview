package za.co.fnb.cish.fid.common.api.cis1359.cis1359output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "data"
})
@Generated("jsonschema2pojo")
public class Cis1359Output {

    @JsonProperty("data")
    private RegMaintenData data;


    @JsonProperty("data")
    public RegMaintenData getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(RegMaintenData data) {
        this.data = data;
    }


}
