package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customerEmployerName", "customerPeriodEmployed", "customerHighestQualification", "customerQualificationSpeciality", "customerDateQualified", "customerQualificationDuration", "customerProofOfDegree", "customerStaffIndicator", "customerStaffNumber"

})
@Generated("jsonschema2pojo")
public class Cis1362rQualificationEmployerDetails implements Serializable {

    @JsonProperty("customerEmployerName")
    private String customerEmployerName;

    @JsonProperty("customerPeriodEmployed")
    private Integer customerPeriodEmployed;

    @JsonProperty("customerHighestQualification")
    private String customerHighestQualification;

    @JsonProperty("customerQualificationSpeciality")
    private String customerQualificationSpeciality;

    @JsonProperty("customerDateQualified")
    private Integer customerDateQualified;

    @JsonProperty("customerQualificationDuration")
    private Integer customerQualificationDuration;

    @JsonProperty("customerProofOfDegree")
    private String customerProofOfDegree;

    @JsonProperty("customerStaffIndicator")
    private String customerStaffIndicator;

    @JsonProperty("customerStaffNumber")
    private String customerStaffNumber;

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

    @JsonProperty("customerQualificationSpeciality")
    public String getCustomerQualificationSpeciality() {
        return customerQualificationSpeciality;
    }

    @JsonProperty("customerQualificationSpeciality")
    public void setCustomerQualificationSpeciality(String customerQualificationSpeciality) {
        this.customerQualificationSpeciality = customerQualificationSpeciality;
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

    @JsonProperty("customerStaffIndicator")
    public String getCustomerStaffIndicator() {
        return customerStaffIndicator;
    }

    @JsonProperty("customerStaffIndicator")
    public void setCustomerStaffIndicator(String customerStaffIndicator) {
        this.customerStaffIndicator = customerStaffIndicator;
    }

    @JsonProperty("customerStaffNumber")
    public String getCustomerStaffNumber() {
        return customerStaffNumber;
    }

    @JsonProperty("customerStaffNumber")
    public void setCustomerStaffNumber(String customerStaffNumber) {
        this.customerStaffNumber = customerStaffNumber;
    }


}
