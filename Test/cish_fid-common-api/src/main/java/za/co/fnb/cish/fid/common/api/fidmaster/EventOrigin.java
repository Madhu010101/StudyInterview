package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventOrigin {

    @JsonProperty
    private String eventOriginType;
    @JsonProperty
    private String eventOriginSourceSystemCode;
    @JsonProperty
    private String eventOriginName;

    public String getEventOriginType() {
        return eventOriginType;
    }

    public void setEventOriginType(String eventOriginType) {
        this.eventOriginType = eventOriginType;
    }

    public String getEventOriginSourceSystemCode() {
        return eventOriginSourceSystemCode;
    }

    public void setEventOriginSourceSystemCode(String eventOriginSourceSystemCode) {
        this.eventOriginSourceSystemCode = eventOriginSourceSystemCode;
    }

    public String getEventOriginName() {
        return eventOriginName;
    }

    public void setEventOriginName(String eventOriginName) {
        this.eventOriginName = eventOriginName;
    }
}
