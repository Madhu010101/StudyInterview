package za.co.fnb.cish.fid.common.api.common;

import java.io.Serializable;

public class Errors implements Serializable {

    private static final long serialVersionUID = 6391987824534728167L;

    private Integer code;
    private String source;
    private String details;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String reference) {
        this.source = reference;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Erorrs{" + "code='" + code + '\'' + ", source='" + source + '\'' + ", details='" + details + '\'' + '}';
    }
}
