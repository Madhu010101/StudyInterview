package za.co.fnb.cish.fid.common.api.common;

public class ZosOutputError {

    private ZosDataError data;
    private ZosErrors errors;

    public ZosDataError getData() {
        return data;
    }

    public void setData(ZosDataError data) {
        this.data = data;
    }

    public ZosErrors getErrors() {
        return errors;
    }

    public void setErrors(ZosErrors errors) {
        this.errors = errors;
    }

}
