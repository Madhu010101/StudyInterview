package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import org.springframework.validation.Errors;

import java.io.Serializable;


public class CoreEnquiryResponseWrapper implements Serializable {

    private static final long serialVersionUID = 6236699371354934465L;

    private CoreEnquiryResponse data;
    private Errors errors;

    public CoreEnquiryResponse getData() {
        return data;
    }

    public void setData(CoreEnquiryResponse data) {
        this.data = data;
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }
}
