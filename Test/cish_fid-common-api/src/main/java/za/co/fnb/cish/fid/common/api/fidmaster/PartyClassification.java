package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PartyClassification {

    @JsonProperty
    private String partyClassificationTypeCode;
    @JsonProperty
    private String partyClassificationAttributeName;
    @JsonProperty
    private String partyClassificationValue;
    @JsonProperty
    private String partyClassificationActiveIndicator;

    public String getPartyClassificationTypeCode() {
        return partyClassificationTypeCode;
    }

    public void setPartyClassificationTypeCode(String partyClassificationTypeCode) {
        this.partyClassificationTypeCode = partyClassificationTypeCode;
    }

    public String getPartyClassificationAttributeName() {
        return partyClassificationAttributeName;
    }

    public void setPartyClassificationAttributeName(String partyClassificationAttributeName) {
        this.partyClassificationAttributeName = partyClassificationAttributeName;
    }

    public String getPartyClassificationValue() {
        return partyClassificationValue;
    }

    public void setPartyClassificationValue(String partyClassificationValue) {
        this.partyClassificationValue = partyClassificationValue;
    }

    public String getPartyClassificationActiveIndicator() {
        return partyClassificationActiveIndicator;
    }

    public void setPartyClassificationActiveIndicator(String partyClassificationActiveIndicator) {
        this.partyClassificationActiveIndicator = partyClassificationActiveIndicator;
    }
}
