package za.co.fnb.cish.fid.monitoring.util;

public class CSVItem {

    private String id;
    private String queueName;
    private String error;
    private String action;
    private String failureDetails;
    private String message;

    private String keyIdentifierNum;
    private String errorDesc;
    private String date;
    private long eventId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getFailureDetails() {
        return failureDetails;
    }

    public void setFailureDetails(String failureDetails) {
        this.failureDetails = failureDetails;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getKeyIdentifierNum () {
        return keyIdentifierNum;
    }

    public void setKeyIdentifierNum (String keyIdentifierNum) {
        this.keyIdentifierNum = keyIdentifierNum;
    }

    public String getErrorDesc () {
        return errorDesc;
    }

    public void setErrorDesc (String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public String getDate () {
        return date;
    }

    public void setDate (String date) {
        this.date = date;
    }

    public long getEventId () {
        return eventId;
    }

    public void setEventId (long eventId) {
        this.eventId = eventId;
    }

    public String[] toArray() {
        String[] record = {String.valueOf(id), queueName, error, action, failureDetails, message};
        return record;
    }
}
