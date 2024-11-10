package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TakeOnAttribute {

    @JsonProperty
    private String attributeName;
    @JsonProperty
    private String attributeValue;

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }
}
