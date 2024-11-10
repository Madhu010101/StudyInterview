package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "warningCode",
        "warningMessage"
})

@Generated("jsonschema2pojo")
public class Cis1356rRegulatoryEnquireZosWarningTable {

    @JsonProperty("warningCode")
    private Integer warningCode;

    @JsonProperty("warningMessage")
    private String warningMessage;


    public Integer getWarningCode() {
        return warningCode;
    }

    public void setWarningCode(Integer warningCode) {
        this.warningCode = warningCode;
    }

    public String getWarningMessage() {
        return warningMessage;
    }

    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }

    @Override
    public String toString() {
        return "Cis1356rRegulatoryEnquireZosWarningTable{" +
                "warningCode='" + warningCode + '\'' +
                ", warningMessage='" + warningMessage + '\'' +
                '}';
    }
}
