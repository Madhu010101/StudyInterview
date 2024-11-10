package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class EventHeader {
    @JsonProperty
    private String sourceSystemCode;
    @JsonProperty
    private String eventDateTime;
    @JsonProperty
    private String eventAction;
    @JsonProperty
    private String eventArchContext;
    @JsonProperty
    private String eventUUID;
    @JsonProperty
    private List<EventOrigin> eventOrigins;
    @JsonProperty
    private List<Correlation> correlations;


    public String getSourceSystemCode() {
        return sourceSystemCode;
    }

    public void setSourceSystemCode(String sourceSystemCode) {
        this.sourceSystemCode = sourceSystemCode;
    }

    public String getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(String eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public String getEventAction() {
        return eventAction;
    }

    public void setEventAction(String eventAction) {
        this.eventAction = eventAction;
    }

    public String getEventArchContext() {
        return eventArchContext;
    }

    public void setEventArchContext(String eventArchContext) {
        this.eventArchContext = eventArchContext;
    }

    public String getEventUUID() {
        return eventUUID;
    }

    public void setEventUUID(String eventUUID) {
        this.eventUUID = eventUUID;
    }

    public List<EventOrigin> getEventOrigins() {
        return eventOrigins;
    }

    public void setEventOrigins(List<EventOrigin> eventOrigins) {
        this.eventOrigins = eventOrigins;
    }

    public List<Correlation> getCorrelations() {
        return correlations;
    }

    public void setCorrelations(List<Correlation> correlations) {
        this.correlations = correlations;
    }
}
