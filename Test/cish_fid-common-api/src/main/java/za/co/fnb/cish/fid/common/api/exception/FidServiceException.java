package za.co.fnb.cish.fid.common.api.exception;

public class FidServiceException extends Exception {

    private static final long serialVersionUID = 7804521521599787528L;
    private String messageId;
    
    public FidServiceException() {
    }

    public FidServiceException(String message) {
        super(message);
    }

    public FidServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public FidServiceException(Throwable cause,String pMessageId) {
        super(cause);
        this.messageId = pMessageId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String pMessageId) {
        this.messageId = pMessageId;
    }

}
