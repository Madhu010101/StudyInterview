package za.co.fnb.cish.fid.common.api.exception;

import za.co.fnb.cish.fid.common.api.cis1358.cis1358output.ErrorTable;

import java.util.List;

public class ZosErrorException extends FidServiceException {

    private Integer code;
    private String details;
    private List<ErrorTable> errorTable = null;
    
    public ZosErrorException() {
    }

    public ZosErrorException(String message) {
        super(message);
    }

    public ZosErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZosErrorException(Throwable cause,String pMessageId) {
        super(cause,pMessageId);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDetails() {
        return details;
    }

    public List<ErrorTable> getErrorTable() {
        return errorTable;
    }

    public void setErrorTable(List<ErrorTable> errorTable) {
        this.errorTable = errorTable;
    }

    public void setDetails(String details) {
        this.details = details;
    }


}
