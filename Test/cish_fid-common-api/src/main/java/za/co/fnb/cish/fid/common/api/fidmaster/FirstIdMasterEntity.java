package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FirstIdMasterEntity {

    @JsonProperty
    private EventHeader eventHeader;
    @JsonProperty
    private Key key;
    @JsonProperty
    private Party party;
    public FirstIdMasterEntity() {
    }

    public EventHeader getEventHeader() {
        return eventHeader;
    }

    public void setEventHeader(EventHeader eventHeader) {
        this.eventHeader = eventHeader;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }
}
