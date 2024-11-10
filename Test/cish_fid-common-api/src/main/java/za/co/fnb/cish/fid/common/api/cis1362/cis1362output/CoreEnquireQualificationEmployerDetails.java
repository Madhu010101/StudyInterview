package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"customerEmployerName", "customerPeriodEmployed", "customerHighestQualification", "customerQualificationSpeciality", "customerDateQualified", "customerQualificationDuration", "customerProofOfDegree", "customerStaffIndicator", "customerStaffNumber"

})
public class CoreEnquireQualificationEmployerDetails implements Serializable {
    @ApiModelProperty(value = "The name of the company where the customer works. e.g. 'MS Trading'")
    private String customerEmployerName;

    @ApiModelProperty(value = "The duration, in months, which the customer has been employed by their current employer. e.g. 099 ")
    private Integer customerPeriodEmployed;

    @ApiModelProperty(value = " The highest educational qualification which the customer has officially received. e.g.   'G12'\n" + "Consult CII for full list ")
    private String customerHighestQualification;

    @ApiModelProperty(value = " The field of study in which the customer obtained their highest qualification.. e.g. 'ENG'\n" + "Consult iCustomer for full list  ")
    private String customerQualificationSpeciality;

    @ApiModelProperty(value = "The date on which the customer obtained their highest qualification. CCYYMMDD. e.g. 20080705 ")
    private Integer customerDateQualified;


    @ApiModelProperty(value = "Qualification duration in years. e.g. 3 ")
    private Integer customerQualificationDuration;


    @ApiModelProperty(value = " This field captures the answer to: Has the customer got proof that their highest qualification has been obtained?. e.g.  'True' or 'False' ")
    private String customerProofOfDegree;


    @ApiModelProperty(value = " Are you a staff member of FRG. e.g. 'True' or 'False' ")
    private String customerStaffIndicator;


    @ApiModelProperty(value = " The customer's FirstRand Group employee number. e.g. 'F0168677' ")
    private String customerStaffNumber;


    public String getCustomerEmployerName() {
        return customerEmployerName;
    }

    public void setCustomerEmployerName(String customerEmployerName) {
        this.customerEmployerName = customerEmployerName;
    }

    public Integer getCustomerPeriodEmployed() {
        return customerPeriodEmployed;
    }

    public void setCustomerPeriodEmployed(Integer customerPeriodEmployed) {
        this.customerPeriodEmployed = customerPeriodEmployed;
    }

    public String getCustomerHighestQualification() {
        return customerHighestQualification;
    }

    public void setCustomerHighestQualification(String customerHighestQualification) {
        this.customerHighestQualification = customerHighestQualification;
    }

    public String getCustomerQualificationSpeciality() {
        return customerQualificationSpeciality;
    }

    public void setCustomerQualificationSpeciality(String customerQualificationSpeciality) {
        this.customerQualificationSpeciality = customerQualificationSpeciality;
    }

    public Integer getCustomerDateQualified() {
        return customerDateQualified;
    }

    public void setCustomerDateQualified(Integer customerDateQualified) {
        this.customerDateQualified = customerDateQualified;
    }

    public Integer getCustomerQualificationDuration() {
        return customerQualificationDuration;
    }

    public void setCustomerQualificationDuration(Integer customerQualificationDuration) {
        this.customerQualificationDuration = customerQualificationDuration;
    }

    public String getCustomerProofOfDegree() {
        return customerProofOfDegree;
    }

    public void setCustomerProofOfDegree(String customerProofOfDegree) {
        this.customerProofOfDegree = customerProofOfDegree;
    }

    public String getCustomerStaffIndicator() {
        return customerStaffIndicator;
    }

    public void setCustomerStaffIndicator(String customerStaffIndicator) {
        this.customerStaffIndicator = customerStaffIndicator;
    }

    public String getCustomerStaffNumber() {
        return customerStaffNumber;
    }

    public void setCustomerStaffNumber(String customerStaffNumber) {
        this.customerStaffNumber = customerStaffNumber;
    }

    @Override
    public String toString() {
        return "CoreEnquireQualificationEmployerDetails{" + "customerEmployerName='" + customerEmployerName + '\'' + "customerPeriodEmployed='" + customerPeriodEmployed + '\'' + "customerHighestQualification='" + customerHighestQualification + '\'' + "customerQualificationSpeciality='" + customerQualificationSpeciality + '\'' + "customerDateQualified='" + customerDateQualified + '\'' + "customerQualificationDuration='" + customerQualificationDuration + '\'' + "customerProofOfDegree='" + customerProofOfDegree + '\'' + "customerStaffIndicator='" + customerStaffIndicator + '\'' + "customerStaffNumber='" + customerStaffNumber + '\'' + '}';
    }

}
