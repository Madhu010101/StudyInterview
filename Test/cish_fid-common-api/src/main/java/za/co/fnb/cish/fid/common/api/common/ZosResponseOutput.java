package za.co.fnb.cish.fid.common.api.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"data"})
@Generated("jsonschema2pojo")
public class ZosResponseOutput {

    @JsonProperty("data")
    private ZosResponseData data;

    @JsonProperty("data")
    public ZosResponseData getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(ZosResponseData data) {
        this.data = data;
    }

}
