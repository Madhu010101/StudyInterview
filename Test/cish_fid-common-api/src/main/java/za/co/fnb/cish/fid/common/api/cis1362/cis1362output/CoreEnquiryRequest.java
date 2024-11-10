package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.*;


import java.io.Serializable;

public class CoreEnquiryRequest implements Serializable {

    private static final long serialVersionUID = 564734599705390191L;

    @ApiModelProperty(value = "The unique company code which identifies which Hogan company the customer maintains a relationship with. Both old and new Company ID can be used. e.g. 15", required = true)
    @PositiveOrZero(message = "can not be negative")
    @Max(value = 9999)
    @NotNull(message = "field is mandatory")
    private Integer companyID;


    @ApiModelProperty(value = "The customer unique customer number. Both old and new UCN can be used.. e.g. 62232123432", required = true)
    @PositiveOrZero(message = "can not be negative")
    @NotNull(message = "field is mandatory")
    private Long customerUCN;

    @Size(min = 1, max = 8)
    //@NotNull(message = "field is mandatory")
    @ApiModelProperty(value = "Channel ID or Employee number of person/process making the change for record purposes. e.g. F2323232")
    private String operatorID;

    @Size(min = 1, max = 1)
    @NotNull(message = "field is mandatory")
    @ApiModelProperty(value = "This field indicates if the customer demographic data should be returned. e.g. 'Y' (Yes) or 'N' (No) If Y demographic details will be returned")
    private String returnDemographics;

    @Size(min = 1, max = 1)
    @NotNull(message = "field is mandatory")
    @ApiModelProperty(value = "This field indicates if the customer contact data should be returned. e.g. 'Y' (Yes) or 'N' (No)\n" + "\n" + "If Y Contact details will be returned")
    private String returnContact;

    @Size(min = 1, max = 1)
    @NotNull(message = "field is mandatory")
    @ApiModelProperty(value = "This field indicates if the customer address data should be returned. e.g. 'Y' (Yes) or 'N' (No)\n" + "\n" + "If Y Address details will be returned")
    private String returnAddress;

    @Size(min = 1, max = 1)
    @NotNull(message = "field is mandatory")
    @ApiModelProperty(value = "This field indicates if the customer qualifications and employment data should be returned. e.g. 'Y' (Yes) or 'N' (No)\n" + "\n" + "If Y Education information will be returned")
    private String returnEducation;


    @Size(min = 1, max = 1)
    @NotNull(message = "field is mandatory")
    @ApiModelProperty(value = "This field indicates if the customer consent indicators data should be returned. e.g. 'Y' (Yes) or 'N' (No)\n" + "\n" + "If Y Consent information will be returned")
    private String returnConsent;

    @Size(min = 1, max = 1)
    @NotNull(message = "field is mandatory")
    @ApiModelProperty(value = "This field indicates if the customer ID numbers table should be returned. e.g. 'Y' (Yes) or 'N' (No)\n" + "\n" + "If Y ID Numbers will be returned")
    private String returnIdNumbers;

    @Size(min = 1, max = 1)
    @NotNull(message = "field is mandatory")
    @ApiModelProperty(value = "This field indicates if the customer bank relationship details should be returned. e.g 'Y' (Yes) or 'N' (No)\n" + "\n" + "If Y Bank Relationships will be returned")
    private String returnBankRelationships;

    @Size(min = 1, max = 1)
    @NotNull(message = "field is mandatory")
    @ApiModelProperty(value = "This field indicates if the customer bank services should be returned.  e.g 'Y' (Yes) or 'N' (No)\n" + "\n" + "If Y Bank Services will be returned")
    private String returnBankServices;

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public Long getCustomerUCN() {
        return customerUCN;
    }

    public void setCustomerUCN(Long customerUCN) {
        this.customerUCN = customerUCN;
    }

    public String getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(String operatorID) {
        this.operatorID = operatorID;
    }

    public String getReturnDemographics() {
        return returnDemographics;
    }

    public void setReturnDemographics(String returnDemographics) {
        this.returnDemographics = returnDemographics;
    }

    public String getReturnContact() {
        return returnContact;
    }

    public void setReturnContact(String returnContact) {
        this.returnContact = returnContact;
    }

    public String getReturnAddress() {
        return returnAddress;
    }

    public void setReturnAddress(String returnAddress) {
        this.returnAddress = returnAddress;
    }

    public String getReturnEducation() {
        return returnEducation;
    }

    public void setReturnEducation(String returnEducation) {
        this.returnEducation = returnEducation;
    }

    public String getReturnConsent() {
        return returnConsent;
    }

    public void setReturnConsent(String returnConsent) {
        this.returnConsent = returnConsent;
    }

    public String getReturnIdNumbers() {
        return returnIdNumbers;
    }

    public void setReturnIdNumbers(String returnIdNumbers) {
        this.returnIdNumbers = returnIdNumbers;
    }

    public String getReturnBankRelationships() {
        return returnBankRelationships;
    }

    public void setReturnBankRelationships(String returnBankRelationships) {
        this.returnBankRelationships = returnBankRelationships;
    }

    public String getReturnBankServices() {
        return returnBankServices;
    }

    public void setReturnBankServices(String returnBankServices) {
        this.returnBankServices = returnBankServices;
    }

    @Override
    public String toString() {
        return "CoreEnquiryRequest{" + "companyID=" + companyID + ", customerUCN=" + customerUCN + ", operatorID='" + operatorID + '\'' + ", returnDemographics='" + returnDemographics + '\'' + ", returnContact='" + returnContact + '\'' + ", returnAddress='" + returnAddress + '\'' + ", returnEducation='" + returnEducation + '\'' + ", returnConsent='" + returnConsent + '\'' + ", returnIdNumbers='" + returnIdNumbers + '\'' + ", returnBankRelationships='" + returnBankRelationships + '\'' + ", returnBankServices='" + returnBankServices + '\'' + '}';
    }

}
