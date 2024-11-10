package za.co.fnb.cish.fid.common.api.common;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ServiceError implements Serializable {

    private static final long serialVersionUID = 1029850562439556639L;

    private Date timestamp;
    private Integer status;
    private String error;
    private List<String> messageList;    
    private String path;

    public ServiceError(Date timestamp, Integer status, String error, List<String> messageList, String path) {
        super();
        this.timestamp = timestamp;    
        this.status = status;
        this.error = error;
        this.messageList = messageList;
        this.path = path;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<String> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<String> messageList) {
        this.messageList = messageList;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
