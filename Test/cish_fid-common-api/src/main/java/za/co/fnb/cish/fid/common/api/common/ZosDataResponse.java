package za.co.fnb.cish.fid.common.api.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ZosDataResponse {
    @JsonProperty("correlation")
    private ZosCorrelation correlation;

    @JsonProperty("payload")
    private Object payload;

    @JsonProperty("correlation")
    public ZosCorrelation getCorrelation() {
        return correlation;
    }

    @JsonProperty("correlation")
    public void setCorrelation(ZosCorrelation correlation) {
        this.correlation = correlation;
    }
    @JsonProperty("payload")
    public Object getPayload() {
        return payload;
    }
    @JsonProperty("payload")
    public void setPayload(Object payload) {
        this.payload = payload;
    }
}
