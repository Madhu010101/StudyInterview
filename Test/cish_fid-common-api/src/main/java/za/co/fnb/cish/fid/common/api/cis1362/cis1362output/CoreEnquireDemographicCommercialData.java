package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"customerTradingAsName", "customerTaxYearEnd", "customerCountryEstablished", "customerCountryOfOperation", "customerCountryHeadOffice", "customerStateOwnedCompany", "customerNumberOfEmployees", "customerDateEstablished", "customerDateOfOperations", "customerTurnoverCode", "customerTurnoverAmount", "customerTurnoverCurrency", "customerNumberOfSignatories", "customerSingleMemberEntity", "customerCIBIndicator"})
public class CoreEnquireDemographicCommercialData implements Serializable {
    @ApiModelProperty(value = "Company trading as name . e.g.  'CLOTHING CO' ")
    private String customerTradingAsName;

    @ApiModelProperty(value = "The tax year end month. e.g. 2.")
    private Integer customerTaxYearEnd;

    @ApiModelProperty(value = "Country business established This field is only applicable to juristic . e.g. 'ZA' ")
    private String customerCountryEstablished;

    @ApiModelProperty(value = "Country of operation This field is only applicable to juristic.  e.g. 'ZA'")
    private String customerCountryOfOperation;

    @ApiModelProperty(value = "Country of head office This field is only applicable to juristic . e.g. 'ZA'")
    private String customerCountryHeadOffice;

    @ApiModelProperty(value = "State owner company indicator This field is only applicable to juristic. e.g. 'True' or 'False' ")
    private String customerStateOwnedCompany;

    @ApiModelProperty(value = "Number of employees . e.g. 'A' - 0 to 10\n" + "'B' - 11 to 50\n" + "\n" + "'C' - 51 to 100\n" + "\n" + "'D' - 101 to 500\n" + "\n" + "'E' - 501 to 2000\n" + "\n" + "'F' - 2001 +")
    private String customerNumberOfEmployees;

    @ApiModelProperty(value = "Date business established . e.g. 20090909\n" + "\n" + "Format: CCYYMMDD")
    private Integer customerDateEstablished;

    @ApiModelProperty(value = "Date business started operating  . e.g. 20100909\n" + "\n" + "Format: CCYYMMDD ")
    private Integer customerDateOfOperations;

    @ApiModelProperty(value = "Company turnover . e.g . '01'  Contact CII for the full list")
    private String customerTurnoverCode;

    @ApiModelProperty(value = "Company turn over amount. only values up to 9 digits are valid .e.g ''910049900'/max value '999999999' ")
    private Integer customerTurnoverAmount;

    @ApiModelProperty(value = "This attribute included for future use and will represent the currency specified by the turnover. . e.g. Will currently always be blank ")
    private String customerTurnoverCurrency;


    @ApiModelProperty(value = "Number of signatories . e.g. '003' ")
    private Integer customerNumberOfSignatories;


    @ApiModelProperty(value = "This field indicates if the juristic company is a single member entity . e.g.  'True' or 'False' ")
    private String customerSingleMemberEntity;


    @ApiModelProperty(value = "Is this entity a Corporate Customer. e.g.  'True' or 'False'")
    private String customerCIBIndicator;

    public String getCustomerTradingAsName() {
        return customerTradingAsName;
    }

    public void setCustomerTradingAsName(String customerTradingAsName) {
        this.customerTradingAsName = customerTradingAsName;
    }

    public Integer getCustomerTaxYearEnd() {
        return customerTaxYearEnd;
    }

    public void setCustomerTaxYearEnd(Integer customerTaxYearEnd) {
        this.customerTaxYearEnd = customerTaxYearEnd;
    }

    public String getCustomerCountryEstablished() {
        return customerCountryEstablished;
    }

    public void setCustomerCountryEstablished(String customerCountryEstablished) {
        this.customerCountryEstablished = customerCountryEstablished;
    }

    public String getCustomerCountryOfOperation() {
        return customerCountryOfOperation;
    }

    public void setCustomerCountryOfOperation(String customerCountryOfOperation) {
        this.customerCountryOfOperation = customerCountryOfOperation;
    }

    public String getCustomerCountryHeadOffice() {
        return customerCountryHeadOffice;
    }

    public void setCustomerCountryHeadOffice(String customerCountryHeadOffice) {
        this.customerCountryHeadOffice = customerCountryHeadOffice;
    }

    public String getCustomerStateOwnedCompany() {
        return customerStateOwnedCompany;
    }

    public void setCustomerStateOwnedCompany(String customerStateOwnedCompany) {
        this.customerStateOwnedCompany = customerStateOwnedCompany;
    }

    public String getCustomerNumberOfEmployees() {
        return customerNumberOfEmployees;
    }

    public void setCustomerNumberOfEmployees(String customerNumberOfEmployees) {
        this.customerNumberOfEmployees = customerNumberOfEmployees;
    }

    public Integer getCustomerDateEstablished() {
        return customerDateEstablished;
    }

    public void setCustomerDateEstablished(Integer customerDateEstablished) {
        this.customerDateEstablished = customerDateEstablished;
    }

    public Integer getCustomerDateOfOperations() {
        return customerDateOfOperations;
    }

    public void setCustomerDateOfOperations(Integer customerDateOfOperations) {
        this.customerDateOfOperations = customerDateOfOperations;
    }

    public String getCustomerTurnoverCode() {
        return customerTurnoverCode;
    }

    public void setCustomerTurnoverCode(String customerTurnoverCode) {
        this.customerTurnoverCode = customerTurnoverCode;
    }

    public Integer getCustomerTurnoverAmount() {
        return customerTurnoverAmount;
    }

    public void setCustomerTurnoverAmount(Integer customerTurnoverAmount) {
        this.customerTurnoverAmount = customerTurnoverAmount;
    }

    public String getCustomerTurnoverCurrency() {
        return customerTurnoverCurrency;
    }

    public void setCustomerTurnoverCurrency(String customerTurnoverCurrency) {
        this.customerTurnoverCurrency = customerTurnoverCurrency;
    }

    public Integer getCustomerNumberOfSignatories() {
        return customerNumberOfSignatories;
    }

    public void setCustomerNumberOfSignatories(Integer customerNumberOfSignatories) {
        this.customerNumberOfSignatories = customerNumberOfSignatories;
    }

    public String getCustomerSingleMemberEntity() {
        return customerSingleMemberEntity;
    }

    public void setCustomerSingleMemberEntity(String customerSingleMemberEntity) {
        this.customerSingleMemberEntity = customerSingleMemberEntity;
    }

    public String getCustomerCIBIndicator() {
        return customerCIBIndicator;
    }

    public void setCustomerCIBIndicator(String customerCIBIndicator) {
        this.customerCIBIndicator = customerCIBIndicator;
    }

    @Override
    public String toString() {
        return "CoreEnquireDemographicCommercialData{" + "customerTradingAsName='" + customerTradingAsName + '\'' + ", customerTaxYearEnd='" + customerTaxYearEnd + '\'' + ", customerCountryEstablished='" + customerCountryEstablished + '\'' + ", customerCountryOfOperation='" + customerCountryOfOperation + '\'' + ", customerCountryHeadOffice='" + customerCountryHeadOffice + '\'' + ", customerStateOwnedCompany='" + customerStateOwnedCompany + '\'' + ", customerNumberOfEmployees='" + customerNumberOfEmployees + '\'' + ", customerDateEstablished='" + customerDateEstablished + '\'' + ", customerDateOfOperations='" + customerDateOfOperations + '\'' + ", customerTurnoverCode='" + customerTurnoverCode + '\'' + ", customerTurnoverAmount='" + customerTurnoverAmount + '\'' + ", customerTurnoverCurrency='" + customerTurnoverCurrency + '\'' + ", customerNumberOfSignatories='" + customerNumberOfSignatories + '\'' + ", customerSingleMemberEntity='" + customerSingleMemberEntity + '\'' + ", customerCIBIndicator='" + customerCIBIndicator + '\'' +

                '}';
    }

}
