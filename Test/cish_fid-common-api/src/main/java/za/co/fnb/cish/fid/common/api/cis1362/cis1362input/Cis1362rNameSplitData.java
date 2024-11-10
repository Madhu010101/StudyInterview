package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customerNameTitle", "customerNameFirst", "customerNameLast", "customerNameMiddleFirst", "customerNameMiddleSecond", "customerNameMiddleThird", "customerNameMiddleFourth", "customerNameMiddleFifth"


})
@Generated("jsonschema2pojo")
public class Cis1362rNameSplitData implements Serializable {

    @JsonProperty("customerNameTitle")
    private String customerNameTitle;

    @JsonProperty("customerNameFirst")
    private String customerNameFirst;

    @JsonProperty("customerNameLast")
    private String customerNameLast;

    @JsonProperty("customerNameMiddleFirst")
    private String customerNameMiddleFirst;

    @JsonProperty("customerNameMiddleSecond")
    private String customerNameMiddleSecond;

    @JsonProperty("customerNameMiddleThird")
    private String customerNameMiddleThird;

    @JsonProperty("customerNameMiddleFourth")
    private String customerNameMiddleFourth;

    @JsonProperty("customerNameMiddleFifth")
    private String customerNameMiddleFifth;

    @JsonProperty("customerNameTitle")
    public String getCustomerNameTitle() {
        return customerNameTitle;
    }

    @JsonProperty("customerNameTitle")
    public void setCustomerNameTitle(String customerNameTitle) {
        this.customerNameTitle = customerNameTitle;
    }

    @JsonProperty("customerNameFirst")
    public String getCustomerNameFirst() {
        return customerNameFirst;
    }

    @JsonProperty("customerNameFirst")
    public void setCustomerNameFirst(String customerNameFirst) {
        this.customerNameFirst = customerNameFirst;
    }

    @JsonProperty("customerNameLast")
    public String getCustomerNameLast() {
        return customerNameLast;
    }

    @JsonProperty("customerNameLast")
    public void setCustomerNameLast(String customerNameLast) {
        this.customerNameLast = customerNameLast;
    }

    @JsonProperty("customerNameMiddleFirst")
    public String getCustomerNameMiddleFirst() {
        return customerNameMiddleFirst;
    }

    @JsonProperty("customerNameMiddleFirst")
    public void setCustomerNameMiddleFirst(String customerNameMiddleFirst) {
        this.customerNameMiddleFirst = customerNameMiddleFirst;
    }

    @JsonProperty("customerNameMiddleSecond")
    public String getCustomerNameMiddleSecond() {
        return customerNameMiddleSecond;
    }

    @JsonProperty("customerNameMiddleSecond")
    public void setCustomerNameMiddleSecond(String customerNameMiddleSecond) {
        this.customerNameMiddleSecond = customerNameMiddleSecond;
    }

    @JsonProperty("customerNameMiddleThird")
    public String getCustomerNameMiddleThird() {
        return customerNameMiddleThird;
    }

    @JsonProperty("customerNameMiddleThird")
    public void setCustomerNameMiddleThird(String customerNameMiddleThird) {
        this.customerNameMiddleThird = customerNameMiddleThird;
    }

    @JsonProperty("customerNameMiddleFourth")
    public String getCustomerNameMiddleFourth() {
        return customerNameMiddleFourth;
    }

    @JsonProperty("customerNameMiddleFourth")
    public void setCustomerNameMiddleFourth(String customerNameMiddleFourth) {
        this.customerNameMiddleFourth = customerNameMiddleFourth;
    }

    @JsonProperty("customerNameMiddleFifth")
    public String getCustomerNameMiddleFifth() {
        return customerNameMiddleFifth;
    }

    @JsonProperty("customerNameMiddleFifth")
    public void setCustomerNameMiddleFifth(String customerNameMiddleFifth) {
        this.customerNameMiddleFifth = customerNameMiddleFifth;
    }
}
