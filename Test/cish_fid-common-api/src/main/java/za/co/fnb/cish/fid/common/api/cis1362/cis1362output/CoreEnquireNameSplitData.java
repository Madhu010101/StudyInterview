package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"customerNameTitle", "customerNameFirst", "customerNameLast", "customerNameMiddleFirst", "customerNameMiddleSecond", "customerNameMiddleThird", "customerNameMiddleFourth", "customerNameMiddleFifth"


})
public class CoreEnquireNameSplitData implements Serializable {
    @ApiModelProperty(value = " Title of customer. e.g. 'MR'")
    private String customerNameTitle;

    @ApiModelProperty(value = " Customers first name. e.g. 'Joe'")
    private String customerNameFirst;

    @ApiModelProperty(value = " Customers last name. e.g.  'Smith' ")
    private String customerNameLast;

    @ApiModelProperty(value = " Customers middle name 1. e.g. 'Stephan' ")
    private String customerNameMiddleFirst;

    @ApiModelProperty(value = " Customers middle name 2. e.g. 'Stephan' ")
    private String customerNameMiddleSecond;

    @ApiModelProperty(value = " Customers middle name 3. e.g. 'Stephan' ")
    private String customerNameMiddleThird;

    @ApiModelProperty(value = " Customers middle name 4. e.g. 'Stephan' ")
    private String customerNameMiddleFourth;

    @ApiModelProperty(value = " Customers middle name 5. e.g. 'Stephan' ")
    private String customerNameMiddleFifth;

    public String getCustomerNameTitle() {
        return customerNameTitle;
    }

    public void setCustomerNameTitle(String customerNameTitle) {
        this.customerNameTitle = customerNameTitle;
    }

    public String getCustomerNameFirst() {
        return customerNameFirst;
    }

    public void setCustomerNameFirst(String customerNameFirst) {
        this.customerNameFirst = customerNameFirst;
    }

    public String getCustomerNameLast() {
        return customerNameLast;
    }

    public void setCustomerNameLast(String customerNameLast) {
        this.customerNameLast = customerNameLast;
    }

    public String getCustomerNameMiddleFirst() {
        return customerNameMiddleFirst;
    }

    public void setCustomerNameMiddleFirst(String customerNameMiddleFirst) {
        this.customerNameMiddleFirst = customerNameMiddleFirst;
    }

    public String getCustomerNameMiddleSecond() {
        return customerNameMiddleSecond;
    }

    public void setCustomerNameMiddleSecond(String customerNameMiddleSecond) {
        this.customerNameMiddleSecond = customerNameMiddleSecond;
    }

    public String getCustomerNameMiddleThird() {
        return customerNameMiddleThird;
    }

    public void setCustomerNameMiddleThird(String customerNameMiddleThird) {
        this.customerNameMiddleThird = customerNameMiddleThird;
    }

    public String getCustomerNameMiddleFourth() {
        return customerNameMiddleFourth;
    }

    public void setCustomerNameMiddleFourth(String customerNameMiddleFourth) {
        this.customerNameMiddleFourth = customerNameMiddleFourth;
    }

    public String getCustomerNameMiddleFifth() {
        return customerNameMiddleFifth;
    }

    public void setCustomerNameMiddleFifth(String customerNameMiddleFifth) {
        this.customerNameMiddleFifth = customerNameMiddleFifth;
    }

    @Override
    public String toString() {
        return "CoreEnquireNameSplitData{" + "customerNameTitle='" + customerNameTitle + '\'' + "customerNameFirst='" + customerNameFirst + '\'' + "customerNameLast='" + customerNameLast + '\'' + "customerNameMiddleFirst='" + customerNameMiddleFirst + '\'' + "customerNameMiddleSecond='" + customerNameMiddleSecond + '\'' + "customerNameMiddleThird='" + customerNameMiddleThird + '\'' + "customerNameMiddleFourth='" + customerNameMiddleFourth + '\'' + "customerNameMiddleFifth='" + customerNameMiddleFifth + '\'' + '}';
    }

}
