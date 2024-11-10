
package za.co.fnb.cish.fid.common.api.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "traceID"
})
@Generated("jsonschema2pojo")
public class ZosCorrelation {

    @JsonProperty("traceID")
    private String traceID;

    @JsonProperty("traceID")
    public String getTraceID() {
        return traceID;
    }

    @JsonProperty("traceID")
    public void setTraceID(String traceID) {
        this.traceID = traceID;
    }

}
