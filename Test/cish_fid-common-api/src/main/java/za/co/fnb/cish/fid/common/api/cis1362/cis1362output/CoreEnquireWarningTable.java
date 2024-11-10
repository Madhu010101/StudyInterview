package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class CoreEnquireWarningTable implements Serializable {

    @ApiModelProperty(value = "Warning Code.")
    private Integer warningCode;

    @ApiModelProperty(value = "Warning Message.")
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
        return "CoreEnquireWarningTable{" + "warningCode='" + warningCode + '\'' + ", warningMessage='" + warningMessage + '\'' + '}';
    }
}
