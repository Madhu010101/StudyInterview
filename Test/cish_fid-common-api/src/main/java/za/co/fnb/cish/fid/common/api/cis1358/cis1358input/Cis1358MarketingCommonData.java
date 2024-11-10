
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
    "customerFNBMarketingConsent",
    "customerFRBMarketingConsent",
    "customerThirdPartyConsent",
    "customerMarketingViaCell",
    "customerMarketingViaPhone",
    "customerMarketingViaSMS",
    "customerMarketingViaEmail",
    "customerMarketingViaPost"
})
@Generated("jsonschema2pojo")
public class Cis1358MarketingCommonData {

    @JsonProperty("customerFNBMarketingConsent")
    private String customerFNBMarketingConsent;
    @JsonProperty("customerFRBMarketingConsent")
    private String customerFRBMarketingConsent;
    @JsonProperty("customerThirdPartyConsent")
    private String customerThirdPartyConsent;
    @JsonProperty("customerMarketingViaCell")
    private String customerMarketingViaCell;
    @JsonProperty("customerMarketingViaPhone")
    private String customerMarketingViaPhone;
    @JsonProperty("customerMarketingViaSMS")
    private String customerMarketingViaSMS;
    @JsonProperty("customerMarketingViaEmail")
    private String customerMarketingViaEmail;
    @JsonProperty("customerMarketingViaPost")
    private String customerMarketingViaPost;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customerFNBMarketingConsent")
    public String getCustomerFNBMarketingConsent() {
        return customerFNBMarketingConsent;
    }

    @JsonProperty("customerFNBMarketingConsent")
    public void setCustomerFNBMarketingConsent(String customerFNBMarketingConsent) {
        this.customerFNBMarketingConsent = customerFNBMarketingConsent;
    }

    @JsonProperty("customerFRBMarketingConsent")
    public String getCustomerFRBMarketingConsent() {
        return customerFRBMarketingConsent;
    }

    @JsonProperty("customerFRBMarketingConsent")
    public void setCustomerFRBMarketingConsent(String customerFRBMarketingConsent) {
        this.customerFRBMarketingConsent = customerFRBMarketingConsent;
    }

    @JsonProperty("customerThirdPartyConsent")
    public String getCustomerThirdPartyConsent() {
        return customerThirdPartyConsent;
    }

    @JsonProperty("customerThirdPartyConsent")
    public void setCustomerThirdPartyConsent(String customerThirdPartyConsent) {
        this.customerThirdPartyConsent = customerThirdPartyConsent;
    }

    @JsonProperty("customerMarketingViaCell")
    public String getCustomerMarketingViaCell() {
        return customerMarketingViaCell;
    }

    @JsonProperty("customerMarketingViaCell")
    public void setCustomerMarketingViaCell(String customerMarketingViaCell) {
        this.customerMarketingViaCell = customerMarketingViaCell;
    }

    @JsonProperty("customerMarketingViaPhone")
    public String getCustomerMarketingViaPhone() {
        return customerMarketingViaPhone;
    }

    @JsonProperty("customerMarketingViaPhone")
    public void setCustomerMarketingViaPhone(String customerMarketingViaPhone) {
        this.customerMarketingViaPhone = customerMarketingViaPhone;
    }

    @JsonProperty("customerMarketingViaSMS")
    public String getCustomerMarketingViaSMS() {
        return customerMarketingViaSMS;
    }

    @JsonProperty("customerMarketingViaSMS")
    public void setCustomerMarketingViaSMS(String customerMarketingViaSMS) {
        this.customerMarketingViaSMS = customerMarketingViaSMS;
    }

    @JsonProperty("customerMarketingViaEmail")
    public String getCustomerMarketingViaEmail() {
        return customerMarketingViaEmail;
    }

    @JsonProperty("customerMarketingViaEmail")
    public void setCustomerMarketingViaEmail(String customerMarketingViaEmail) {
        this.customerMarketingViaEmail = customerMarketingViaEmail;
    }

    @JsonProperty("customerMarketingViaPost")
    public String getCustomerMarketingViaPost() {
        return customerMarketingViaPost;
    }

    @JsonProperty("customerMarketingViaPost")
    public void setCustomerMarketingViaPost(String customerMarketingViaPost) {
        this.customerMarketingViaPost = customerMarketingViaPost;
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
