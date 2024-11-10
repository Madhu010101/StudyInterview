
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
    "customerPreferredMethodOfContact",
    "homeNumber",
    "workNumber",
    "faxNumber"
})
@Generated("jsonschema2pojo")
public class Cis1358ContactIndividualData {

    @JsonProperty("customerPreferredMethodOfContact")
    private String customerPreferredMethodOfContact;
    @JsonProperty("homeNumber")
    private Cis1358HomeNumber homeNumber;
    @JsonProperty("workNumber")
    private Cis1358WorkNumber workNumber;
    @JsonProperty("faxNumber")
    private Cis1358FaxNumber faxNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customerPreferredMethodOfContact")
    public String getCustomerPreferredMethodOfContact() {
        return customerPreferredMethodOfContact;
    }

    @JsonProperty("customerPreferredMethodOfContact")
    public void setCustomerPreferredMethodOfContact(String customerPreferredMethodOfContact) {
        this.customerPreferredMethodOfContact = customerPreferredMethodOfContact;
    }

    @JsonProperty("homeNumber")
    public Cis1358HomeNumber getHomeNumber() {
        return homeNumber;
    }

    @JsonProperty("homeNumber")
    public void setHomeNumber(Cis1358HomeNumber homeNumber) {
        this.homeNumber = homeNumber;
    }

    @JsonProperty("workNumber")
    public Cis1358WorkNumber getWorkNumber() {
        return workNumber;
    }

    @JsonProperty("workNumber")
    public void setWorkNumber(Cis1358WorkNumber workNumber) {
        this.workNumber = workNumber;
    }

    @JsonProperty("faxNumber")
    public Cis1358FaxNumber getFaxNumber() {
        return faxNumber;
    }

    @JsonProperty("faxNumber")
    public void setFaxNumber(Cis1358FaxNumber faxNumber) {
        this.faxNumber = faxNumber;
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
