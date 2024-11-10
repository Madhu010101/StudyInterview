package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"warningCode", "warningMessage"

})
@Generated("jsonschema2pojo")

public class Cis1362rWarningTable implements Serializable {

    @JsonProperty("warningCode")
    private Integer warningCode;

    @JsonProperty("warningMessage")
    private String warningMessage;

    @JsonProperty("warningCode")
    public Integer getWarningCode() {
        return warningCode;
    }

    @JsonProperty("warningCode")
    public void setWarningCode(Integer warningCode) {
        this.warningCode = warningCode;
    }

    @JsonProperty("warningMessage")
    public String getWarningMessage() {
        return warningMessage;
    }

    @JsonProperty("warningMessage")
    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }
}
