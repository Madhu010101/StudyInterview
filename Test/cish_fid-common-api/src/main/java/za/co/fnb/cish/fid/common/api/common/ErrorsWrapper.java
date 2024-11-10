package za.co.fnb.cish.fid.common.api.common;

import java.io.Serializable;

public class ErrorsWrapper implements Serializable {

    private static final long serialVersionUID = 6238709371354934465L;

    private Object data;
    private Errors errors;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }

}
