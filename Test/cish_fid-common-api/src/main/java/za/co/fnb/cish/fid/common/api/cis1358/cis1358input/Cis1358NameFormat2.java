
package za.co.fnb.cish.fid.common.api.cis1358.cis1358input;

import java.util.HashMap;
import java.util.Map;
import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customerNameTitle",
    "customerFirstName",
    "customerLastName",
    "customerMiddleNameFirst",
    "customerMiddleNameSecond",
    "customerMiddleNameThird",
    "customerMiddleNameFourth",
    "customerMiddleNameFifth"
})
@Generated("jsonschema2pojo")
public class Cis1358NameFormat2 {

    @JsonProperty("customerNameTitle")
    private String customerNameTitle;
    @JsonProperty("customerFirstName")
    private String customerFirstName;
    @JsonProperty("customerLastName")
    private String customerLastName;
    @JsonProperty("customerMiddleNameFirst")
    private String customerMiddleNameFirst;
    @JsonProperty("customerMiddleNameSecond")
    private String customerMiddleNameSecond;
    @JsonProperty("customerMiddleNameThird")
    private String customerMiddleNameThird;
    @JsonProperty("customerMiddleNameFourth")
    private String customerMiddleNameFourth;
    @JsonProperty("customerMiddleNameFifth")
    private String customerMiddleNameFifth;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customerNameTitle")
    public String getCustomerNameTitle() {
        return customerNameTitle;
    }

    @JsonProperty("customerNameTitle")
    public void setCustomerNameTitle(String customerNameTitle) {
        this.customerNameTitle = customerNameTitle;
    }

    @JsonProperty("customerFirstName")
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    @JsonProperty("customerFirstName")
    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    @JsonProperty("customerLastName")
    public String getCustomerLastName() {
        return customerLastName;
    }

    @JsonProperty("customerLastName")
    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    @JsonProperty("customerMiddleNameFirst")
    public String getCustomerMiddleNameFirst() {
        return customerMiddleNameFirst;
    }

    @JsonProperty("customerMiddleNameFirst")
    public void setCustomerMiddleNameFirst(String customerMiddleNameFirst) {
        this.customerMiddleNameFirst = customerMiddleNameFirst;
    }

    @JsonProperty("customerMiddleNameSecond")
    public String getCustomerMiddleNameSecond() {
        return customerMiddleNameSecond;
    }

    @JsonProperty("customerMiddleNameSecond")
    public void setCustomerMiddleNameSecond(String customerMiddleNameSecond) {
        this.customerMiddleNameSecond = customerMiddleNameSecond;
    }

    @JsonProperty("customerMiddleNameThird")
    public String getCustomerMiddleNameThird() {
        return customerMiddleNameThird;
    }

    @JsonProperty("customerMiddleNameThird")
    public void setCustomerMiddleNameThird(String customerMiddleNameThird) {
        this.customerMiddleNameThird = customerMiddleNameThird;
    }

    @JsonProperty("customerMiddleNameFourth")
    public String getCustomerMiddleNameFourth() {
        return customerMiddleNameFourth;
    }

    @JsonProperty("customerMiddleNameFourth")
    public void setCustomerMiddleNameFourth(String customerMiddleNameFourth) {
        this.customerMiddleNameFourth = customerMiddleNameFourth;
    }

    @JsonProperty("customerMiddleNameFifth")
    public String getCustomerMiddleNameFifth() {
        return customerMiddleNameFifth;
    }

    @JsonProperty("customerMiddleNameFifth")
    public void setCustomerMiddleNameFifth(String customerMiddleNameFifth) {
        this.customerMiddleNameFifth = customerMiddleNameFifth;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
