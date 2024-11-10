package za.co.fnb.cish.fid.common.api.common;

import za.co.fnb.cish.fid.common.api.cis1358.cis1358output.ErrorTable;

import java.util.List;

public class ZosErrors {

    private Integer replyCode;
    private String details;

    public List<ErrorTable> getErrorTable() {
        return errorTable;
    }

    public void setErrorTable(List<ErrorTable> errorTable) {
        this.errorTable = errorTable;
    }

    private List<ErrorTable> errorTable = null;

    
    public Integer getReplyCode() {
        return replyCode;
    }

    public void setReplyCode(Integer replyCode) {
        this.replyCode = replyCode;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
}
