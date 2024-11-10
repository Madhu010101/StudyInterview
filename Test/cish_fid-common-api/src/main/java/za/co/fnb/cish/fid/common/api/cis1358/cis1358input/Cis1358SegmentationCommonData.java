
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
    "customerPrimarySegmentation",
    "customerSecondarySegmentation"
})
@Generated("jsonschema2pojo")
public class Cis1358SegmentationCommonData {

    @JsonProperty("customerPrimarySegmentation")
    private String customerPrimarySegmentation;
    @JsonProperty("customerSecondarySegmentation")
    private String customerSecondarySegmentation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customerPrimarySegmentation")
    public String getCustomerPrimarySegmentation() {
        return customerPrimarySegmentation;
    }

    @JsonProperty("customerPrimarySegmentation")
    public void setCustomerPrimarySegmentation(String customerPrimarySegmentation) {
        this.customerPrimarySegmentation = customerPrimarySegmentation;
    }

    @JsonProperty("customerSecondarySegmentation")
    public String getCustomerSecondarySegmentation() {
        return customerSecondarySegmentation;
    }

    @JsonProperty("customerSecondarySegmentation")
    public void setCustomerSecondarySegmentation(String customerSecondarySegmentation) {
        this.customerSecondarySegmentation = customerSecondarySegmentation;
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
