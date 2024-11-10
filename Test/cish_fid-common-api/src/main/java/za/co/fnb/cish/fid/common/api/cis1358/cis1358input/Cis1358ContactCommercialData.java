
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
    "customerContactTitle",
    "customerContactName",
    "businessPhoneNumber",
    "businessFaxNumber"
})
@Generated("jsonschema2pojo")
public class Cis1358ContactCommercialData {

    @JsonProperty("customerContactTitle")
    private String customerContactTitle;
    @JsonProperty("customerContactName")
    private String customerContactName;
    @JsonProperty("businessPhoneNumber")
    private Cis1358BusinessPhoneNumber businessPhoneNumber;
    @JsonProperty("businessFaxNumber")
    private Cis1358BusinessFaxNumber businessFaxNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customerContactTitle")
    public String getCustomerContactTitle() {
        return customerContactTitle;
    }

    @JsonProperty("customerContactTitle")
    public void setCustomerContactTitle(String customerContactTitle) {
        this.customerContactTitle = customerContactTitle;
    }

    @JsonProperty("customerContactName")
    public String getCustomerContactName() {
        return customerContactName;
    }

    @JsonProperty("customerContactName")
    public void setCustomerContactName(String customerContactName) {
        this.customerContactName = customerContactName;
    }

    @JsonProperty("businessPhoneNumber")
    public Cis1358BusinessPhoneNumber getBusinessPhoneNumber() {
        return businessPhoneNumber;
    }

    @JsonProperty("businessPhoneNumber")
    public void setBusinessPhoneNumber(Cis1358BusinessPhoneNumber businessPhoneNumber) {
        this.businessPhoneNumber = businessPhoneNumber;
    }

    @JsonProperty("businessFaxNumber")
    public Cis1358BusinessFaxNumber getBusinessFaxNumber() {
        return businessFaxNumber;
    }

    @JsonProperty("businessFaxNumber")
    public void setBusinessFaxNumber(Cis1358BusinessFaxNumber businessFaxNumber) {
        this.businessFaxNumber = businessFaxNumber;
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
