package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Container {
    @JsonProperty
    private String containerEntpsTypeCode;
    @JsonProperty
    private String containerStatusEntpsTypeCode;
    @JsonProperty
    private String containerOperatingEntpsTypeCode;

    public String getContainerEntpsTypeCode() {
        return containerEntpsTypeCode;
    }

    public void setContainerEntpsTypeCode(String containerEntpsTypeCode) {
        this.containerEntpsTypeCode = containerEntpsTypeCode;
    }

    public String getContainerStatusEntpsTypeCode() {
        return containerStatusEntpsTypeCode;
    }

    public void setContainerStatusEntpsTypeCode(String containerStatusEntpsTypeCode) {
        this.containerStatusEntpsTypeCode = containerStatusEntpsTypeCode;
    }

    public String getContainerOperatingEntpsTypeCode() {
        return containerOperatingEntpsTypeCode;
    }

    public void setContainerOperatingEntpsTypeCode(String containerOperatingEntpsTypeCode) {
        this.containerOperatingEntpsTypeCode = containerOperatingEntpsTypeCode;
    }
}
