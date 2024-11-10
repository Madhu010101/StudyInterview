package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.Valid;


import java.io.Serializable;


public class CoreEnquiryRequestWrapper implements Serializable {

    private static final long serialVersionUID = 564734599255390191L;

    @ApiModelProperty(name = "data", required = true)
    @Valid
    private CoreEnquiryRequest data = new CoreEnquiryRequest();

    public CoreEnquiryRequest getData() {
        return data;
    }

    public void setData(CoreEnquiryRequest data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CoreEnquiryRequestWrapper{" + "data=" + data + '}';
    }

}
