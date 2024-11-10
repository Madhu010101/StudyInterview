package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"customerBranch", "customerType", "customerStatus", "correspondenceLanguage", "customerName", "customerName2", "customerPrimaryIdentityType", "customerPrimaryIdentityNumber", "customerPrimaryIdentityCountryIssued", "customerPrimaryIdentityEffectiveDate", "customerPrimaryIdentityExpiryDate", "customerClientCustomerNumber", "officerCodePrimary", "officerCodeSecondary", "customerTaxReference", "customerRiskIndicator", "customerRiskReason", "customerCUACToken", "customerDateOpened", "customerDateClosed", "customerLastDateMaintain", "customerPrimarySegmentation", "customerSecondarySegmentation", "customerMainBankIndicator", "customerSensitiveFlag"

})
public class CoreEnquireDemographicCommonData implements Serializable {
    @ApiModelProperty(value = "Branch number . e.g.  05798 ")
    private Integer customerBranch;

    @ApiModelProperty(value = "Customer Type. e.g. 01.")
    private String customerType;

    @ApiModelProperty(value = "Customer status . e.g. '01' – Active\n" + "\n" + "'02' – Closed / In-active\n" + "\n" + "'03' – Purgeable ")
    private String customerStatus;

    @ApiModelProperty(value = "The chosen language the customer prefers correspondence to take place in.  e.g. e.g. ENG - English, AFR - Afrikaans, ZUL - Zulu")
    private String correspondenceLanguage;

    @ApiModelProperty(value = "Customer title, first name, initials and surname for individuals\n" + "Full business name with leading asterisk . e.g. 'Mr Joe M K Kops' or '*Pep Store'")
    private String customerName;

    @ApiModelProperty(value = "Customer's middle names for individual or continuation of business name . e.g.  'Mandy King' ")
    private String customerName2;

    @ApiModelProperty(value = "Type of registration for juristic entity. . e.g. 'COREG'\n" + "\n" + "Contact CII for full list ")
    private String customerPrimaryIdentityType;

    @ApiModelProperty(value = "Registration number for juristic entity. . e.g. '2001/232323/23' ")
    private String customerPrimaryIdentityNumber;

    @ApiModelProperty(value = "The country the ID was issued in . e.g.  'ZA'")
    private String customerPrimaryIdentityCountryIssued;

    @ApiModelProperty(value = "The date the ID was effective from . e.g. 20091012\n" + "\n" + "Format: CCYYMMDD ")
    private Integer customerPrimaryIdentityEffectiveDate;

    @ApiModelProperty(value = "The date the ID will expire on .e.g. 20090104 \n" + "\n" + "Format: CCYYMMDD ")
    private Integer customerPrimaryIdentityExpiryDate;

    @ApiModelProperty(value = "The client customer number . e.g. '09127643587676764' ")
    private String customerClientCustomerNumber;


    @ApiModelProperty(value = "Officer code 1 of the customer . e.g. 'A0009' ")
    private String officerCodePrimary;


    @ApiModelProperty(value = "Officer code 2 of the customer . e.g. 'SS449'")
    private String officerCodeSecondary;


    @ApiModelProperty(value = "Received of revenue tax reference number. e.g. 128571088291")
    private String customerTaxReference;


    @ApiModelProperty(value = "Customer risk Indicator. e.g.  '1'")
    private String customerRiskIndicator;


    @ApiModelProperty(value = "Customer risk reason. e.g.  003 ")
    private Integer customerRiskReason;

    @ApiModelProperty(value = "The date and time stamp when last an account was linked to the customer or the account status has changed. e.g.  '12456790ghyt54ku8' ")
    private String customerCUACToken;

    @ApiModelProperty(value = "Customer date opened Format CCYYMMDD e.g. 20080909\n" + "\n" + "Format CCYYMMDD")
    private Integer customerDateOpened;

    @ApiModelProperty(value = "Customer date closed Format CCYYMMDD. e.g. 20091010\n" + "\n" + "Format CCYYMMDD")
    private Integer customerDateClosed;

    @ApiModelProperty(value = "Customer last date maintained Format CCYYMMDD. e.g. 20091010\n" + "\n" + "Format CCYYMMDD")
    private Integer customerLastDateMaintain;

    @ApiModelProperty(value = "Customer's primary segmentation code as specified on PCD 77820 (key = PRM). e.g. 'WHO'")
    private String customerPrimarySegmentation;

    @ApiModelProperty(value = "Customer's secondary segmentation code as specified on PCD 77820 (key=SUB). e.g. 'WHO'")
    private String customerSecondarySegmentation;


    @ApiModelProperty(value = "Main banked indicator. e.g. 00 - Main Banked\n" + "\n" + "01 - Not Main Banked\n" + "\n" + "99 - Main Banked not available in stand-in")
    private String customerMainBankIndicator;


    @ApiModelProperty(value = "Sensitive Customer Flag. e.g.  'Y' or 'N'")
    private String customerSensitiveFlag;


    public Integer getCustomerBranch() {
        return customerBranch;
    }

    public void setCustomerBranch(Integer customerBranch) {
        this.customerBranch = customerBranch;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public String getCorrespondenceLanguage() {
        return correspondenceLanguage;
    }

    public void setCorrespondenceLanguage(String correspondenceLanguage) {
        this.correspondenceLanguage = correspondenceLanguage;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName2() {
        return customerName2;
    }

    public void setCustomerName2(String customerName2) {
        this.customerName2 = customerName2;
    }

    public String getCustomerPrimaryIdentityType() {
        return customerPrimaryIdentityType;
    }

    public void setCustomerPrimaryIdentityType(String customerPrimaryIdentityType) {
        this.customerPrimaryIdentityType = customerPrimaryIdentityType;
    }

    public String getCustomerPrimaryIdentityNumber() {
        return customerPrimaryIdentityNumber;
    }

    public void setCustomerPrimaryIdentityNumber(String customerPrimaryIdentityNumber) {
        this.customerPrimaryIdentityNumber = customerPrimaryIdentityNumber;
    }

    public String getCustomerPrimaryIdentityCountryIssued() {
        return customerPrimaryIdentityCountryIssued;
    }

    public void setCustomerPrimaryIdentityCountryIssued(String customerPrimaryIdentityCountryIssued) {
        this.customerPrimaryIdentityCountryIssued = customerPrimaryIdentityCountryIssued;
    }

    public Integer getCustomerPrimaryIdentityEffectiveDate() {
        return customerPrimaryIdentityEffectiveDate;
    }

    public void setCustomerPrimaryIdentityEffectiveDate(Integer customerPrimaryIdentityEffectiveDate) {
        this.customerPrimaryIdentityEffectiveDate = customerPrimaryIdentityEffectiveDate;
    }

    public Integer getCustomerPrimaryIdentityExpiryDate() {
        return customerPrimaryIdentityExpiryDate;
    }

    public void setCustomerPrimaryIdentityExpiryDate(Integer customerPrimaryIdentityExpiryDate) {
        this.customerPrimaryIdentityExpiryDate = customerPrimaryIdentityExpiryDate;
    }

    public String getCustomerClientCustomerNumber() {
        return customerClientCustomerNumber;
    }

    public void setCustomerClientCustomerNumber(String customerClientCustomerNumber) {
        this.customerClientCustomerNumber = customerClientCustomerNumber;
    }

    public String getOfficerCodePrimary() {
        return officerCodePrimary;
    }

    public void setOfficerCodePrimary(String officerCodePrimary) {
        this.officerCodePrimary = officerCodePrimary;
    }

    public String getOfficerCodeSecondary() {
        return officerCodeSecondary;
    }

    public void setOfficerCodeSecondary(String officerCodeSecondary) {
        this.officerCodeSecondary = officerCodeSecondary;
    }

    public String getCustomerTaxReference() {
        return customerTaxReference;
    }

    public void setCustomerTaxReference(String customerTaxReference) {
        this.customerTaxReference = customerTaxReference;
    }

    public String getCustomerRiskIndicator() {
        return customerRiskIndicator;
    }

    public void setCustomerRiskIndicator(String customerRiskIndicator) {
        this.customerRiskIndicator = customerRiskIndicator;
    }

    public Integer getCustomerRiskReason() {
        return customerRiskReason;
    }

    public void setCustomerRiskReason(Integer customerRiskReason) {
        this.customerRiskReason = customerRiskReason;
    }

    public String getCustomerCUACToken() {
        return customerCUACToken;
    }

    public void setCustomerCUACToken(String customerCUACToken) {
        this.customerCUACToken = customerCUACToken;
    }

    public Integer getCustomerDateOpened() {
        return customerDateOpened;
    }

    public void setCustomerDateOpened(Integer customerDateOpened) {
        this.customerDateOpened = customerDateOpened;
    }

    public Integer getCustomerDateClosed() {
        return customerDateClosed;
    }

    public void setCustomerDateClosed(Integer customerDateClosed) {
        this.customerDateClosed = customerDateClosed;
    }

    public Integer getCustomerLastDateMaintain() {
        return customerLastDateMaintain;
    }

    public void setCustomerLastDateMaintain(Integer customerLastDateMaintain) {
        this.customerLastDateMaintain = customerLastDateMaintain;
    }

    public String getCustomerPrimarySegmentation() {
        return customerPrimarySegmentation;
    }

    public void setCustomerPrimarySegmentation(String customerPrimarySegmentation) {
        this.customerPrimarySegmentation = customerPrimarySegmentation;
    }

    public String getCustomerSecondarySegmentation() {
        return customerSecondarySegmentation;
    }

    public void setCustomerSecondarySegmentation(String customerSecondarySegmentation) {
        this.customerSecondarySegmentation = customerSecondarySegmentation;
    }

    public String getCustomerMainBankIndicator() {
        return customerMainBankIndicator;
    }

    public void setCustomerMainBankIndicator(String customerMainBankIndicator) {
        this.customerMainBankIndicator = customerMainBankIndicator;
    }

    public String getCustomerSensitiveFlag() {
        return customerSensitiveFlag;
    }

    public void setCustomerSensitiveFlag(String customerSensitiveFlag) {
        this.customerSensitiveFlag = customerSensitiveFlag;
    }

    @Override
    public String toString() {
        return "CoreEnquireDemographicCommonData{" + "customerBranch='" + customerBranch + '\'' + ", customerType='" + customerType + '\'' + ", customerStatus='" + customerStatus + '\'' + ", correspondenceLanguage='" + correspondenceLanguage + '\'' + ", customerName='" + customerName + '\'' + ", customerName2='" + customerName2 + '\'' + ", customerPrimaryIdentityType='" + customerPrimaryIdentityType + '\'' + ", customerPrimaryIdentityNumber='" + customerPrimaryIdentityNumber + '\'' + ", customerPrimaryIdentityCountryIssued='" + customerPrimaryIdentityCountryIssued + '\'' + ", customerPrimaryIdentityEffectiveDate='" + customerPrimaryIdentityEffectiveDate + '\'' + ", customerPrimaryIdentityExpiryDate='" + customerPrimaryIdentityExpiryDate + '\'' + ", customerClientCustomerNumber='" + customerClientCustomerNumber + '\'' + ", officerCodePrimary='" + officerCodePrimary + '\'' + ", officerCodeSecondary='" + officerCodeSecondary + '\'' + ", customerTaxReference='" + customerTaxReference + '\'' + ", customerRiskIndicator='" + customerRiskIndicator + '\'' + ", customerRiskReason='" + customerRiskReason + '\'' + ", customerCUACToken='" + customerCUACToken + '\'' + ", customerDateOpened='" + customerDateOpened + '\'' + ", customerDateClosed='" + customerDateClosed + '\'' + ", customerLastDateMaintain='" + customerLastDateMaintain + '\'' + ", customerPrimarySegmentation='" + customerPrimarySegmentation + '\'' + ", customerSecondarySegmentation='" + customerSecondarySegmentation + '\'' + ", customerMainBankIndicator='" + customerMainBankIndicator + '\'' + ", customerSensitiveFlag='" + customerSensitiveFlag + '\'' + '}';
    }

}
