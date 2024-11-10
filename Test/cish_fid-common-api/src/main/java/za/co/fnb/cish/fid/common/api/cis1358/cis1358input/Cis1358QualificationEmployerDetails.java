
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
    "customerEmployerName",
    "customerPeriodEmployed",
    "customerHighestQualification",
    "customerQualificationSpecialty",
    "customerDateQualified",
    "customerQualificationDuration",
    "customerProofOfDegree"
})
@Generated("jsonschema2pojo")
public class Cis1358QualificationEmployerDetails {

    @JsonProperty("customerEmployerName")
    private String customerEmployerName;
    @JsonProperty("customerPeriodEmployed")
    private Integer customerPeriodEmployed;
    @JsonProperty("customerHighestQualification")
    private String customerHighestQualification;
    @JsonProperty("customerQualificationSpecialty")
    private String customerQualificationSpecialty;
    @JsonProperty("customerDateQualified")
    private Integer customerDateQualified;
    @JsonProperty("customerQualificationDuration")
    private Integer customerQualificationDuration;
    @JsonProperty("customerProofOfDegree")
    private String customerProofOfDegree;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customerEmployerName")
    public String getCustomerEmployerName() {
        return customerEmployerName;
    }

    @JsonProperty("customerEmployerName")
    public void setCustomerEmployerName(String customerEmployerName) {
        this.customerEmployerName = customerEmployerName;
    }

    @JsonProperty("customerPeriodEmployed")
    public Integer getCustomerPeriodEmployed() {
        return customerPeriodEmployed;
    }

    @JsonProperty("customerPeriodEmployed")
    public void setCustomerPeriodEmployed(Integer customerPeriodEmployed) {
        this.customerPeriodEmployed = customerPeriodEmployed;
    }

    @JsonProperty("customerHighestQualification")
    public String getCustomerHighestQualification() {
        return customerHighestQualification;
    }

    @JsonProperty("customerHighestQualification")
    public void setCustomerHighestQualification(String customerHighestQualification) {
        this.customerHighestQualification = customerHighestQualification;
    }

    @JsonProperty("customerQualificationSpecialty")
    public String getCustomerQualificationSpecialty() {
        return customerQualificationSpecialty;
    }

    @JsonProperty("customerQualificationSpecialty")
    public void setCustomerQualificationSpecialty(String customerQualificationSpecialty) {
        this.customerQualificationSpecialty = customerQualificationSpecialty;
    }

    @JsonProperty("customerDateQualified")
    public Integer getCustomerDateQualified() {
        return customerDateQualified;
    }

    @JsonProperty("customerDateQualified")
    public void setCustomerDateQualified(Integer customerDateQualified) {
        this.customerDateQualified = customerDateQualified;
    }

    @JsonProperty("customerQualificationDuration")
    public Integer getCustomerQualificationDuration() {
        return customerQualificationDuration;
    }

    @JsonProperty("customerQualificationDuration")
    public void setCustomerQualificationDuration(Integer customerQualificationDuration) {
        this.customerQualificationDuration = customerQualificationDuration;
    }

    @JsonProperty("customerProofOfDegree")
    public String getCustomerProofOfDegree() {
        return customerProofOfDegree;
    }

    @JsonProperty("customerProofOfDegree")
    public void setCustomerProofOfDegree(String customerProofOfDegree) {
        this.customerProofOfDegree = customerProofOfDegree;
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
