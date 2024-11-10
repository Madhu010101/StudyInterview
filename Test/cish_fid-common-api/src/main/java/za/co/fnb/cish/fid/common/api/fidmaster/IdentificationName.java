package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IdentificationName {
    @JsonProperty
    private String identificationNameValue;
    @JsonProperty
    private String nameEntpsTypeCode;
    @JsonProperty
    private String identificationNameAttributeName;

    public String getIdentificationNameValue() {
        return identificationNameValue;
    }

    public void setIdentificationNameValue(String identificationNameValue) {
        this.identificationNameValue = identificationNameValue;
    }

    public String getNameEntpsTypeCode() {
        return nameEntpsTypeCode;
    }

    public void setNameEntpsTypeCode(String nameEntpsTypeCode) {
        this.nameEntpsTypeCode = nameEntpsTypeCode;
    }

    public String getIdentificationNameAttributeName() {
        return identificationNameAttributeName;
    }

    public void setIdentificationNameAttributeName(String identificationNameAttributeName) {
        this.identificationNameAttributeName = identificationNameAttributeName;
    }
}
