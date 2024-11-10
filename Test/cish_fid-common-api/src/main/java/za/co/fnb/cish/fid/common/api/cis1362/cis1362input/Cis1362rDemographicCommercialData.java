package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customerTradingAsName", "customerTaxYearEnd", "customerCountryEstablished", "customerCountryOfOperation", "customerCountryHeadOffice", "customerStateOwnedCompany", "customerNumberOfEmployees", "customerDateEstablished", "customerDateOfOperations", "customerTurnoverCode", "customerTurnoverAmount", "customerTurnoverCurrency", "customerNumberOfSignatories", "customerSingleMemberEntity", "customerCIBIndicator"

})
@Generated("jsonschema2pojo")
public class Cis1362rDemographicCommercialData implements Serializable {

    @JsonProperty("customerTradingAsName")
    private String customerTradingAsName;

    @JsonProperty("customerTaxYearEnd")
    private Integer customerTaxYearEnd;

    @JsonProperty("customerCountryEstablished")
    private String customerCountryEstablished;

    @JsonProperty("customerCountryOfOperation")
    private String customerCountryOfOperation;

    @JsonProperty("customerCountryHeadOffice")
    private String customerCountryHeadOffice;

    @JsonProperty("customerStateOwnedCompany")
    private String customerStateOwnedCompany;

    @JsonProperty("customerNumberOfEmployees")
    private String customerNumberOfEmployees;

    @JsonProperty("customerDateEstablished")
    private Integer customerDateEstablished;

    @JsonProperty("customerDateOfOperations")
    private Integer customerDateOfOperations;

    @JsonProperty("customerTurnoverCode")
    private String customerTurnoverCode;

    @JsonProperty("customerTurnoverAmount")
    private Integer customerTurnoverAmount;

    @JsonProperty("customerTurnoverCurrency")
    private String customerTurnoverCurrency;

    @JsonProperty("customerNumberOfSignatories")
    private Integer customerNumberOfSignatories;

    @JsonProperty("customerSingleMemberEntity")
    private String customerSingleMemberEntity;

    @JsonProperty("customerCIBIndicator")
    private String customerCIBIndicator;

    @JsonProperty("customerTradingAsName")
    public String getCustomerTradingAsName() {
        return customerTradingAsName;
    }

    @JsonProperty("customerTradingAsName")
    public void setCustomerTradingAsName(String customerTradingAsName) {
        this.customerTradingAsName = customerTradingAsName;
    }

    @JsonProperty("customerTaxYearEnd")
    public Integer getCustomerTaxYearEnd() {
        return customerTaxYearEnd;
    }

    @JsonProperty("customerTaxYearEnd")
    public void setCustomerTaxYearEnd(Integer customerTaxYearEnd) {
        this.customerTaxYearEnd = customerTaxYearEnd;
    }

    @JsonProperty("customerCountryEstablished")
    public String getCustomerCountryEstablished() {
        return customerCountryEstablished;
    }

    @JsonProperty("customerCountryEstablished")
    public void setCustomerCountryEstablished(String customerCountryEstablished) {
        this.customerCountryEstablished = customerCountryEstablished;
    }

    @JsonProperty("customerCountryOfOperation")
    public String getCustomerCountryOfOperation() {
        return customerCountryOfOperation;
    }

    @JsonProperty("customerCountryOfOperation")
    public void setCustomerCountryOfOperation(String customerCountryOfOperation) {
        this.customerCountryOfOperation = customerCountryOfOperation;
    }

    @JsonProperty("customerCountryHeadOffice")
    public String getCustomerCountryHeadOffice() {
        return customerCountryHeadOffice;
    }

    @JsonProperty("customerCountryHeadOffice")
    public void setCustomerCountryHeadOffice(String customerCountryHeadOffice) {
        this.customerCountryHeadOffice = customerCountryHeadOffice;
    }

    @JsonProperty("customerStateOwnedCompany")
    public String getCustomerStateOwnedCompany() {
        return customerStateOwnedCompany;
    }

    @JsonProperty("customerStateOwnedCompany")
    public void setCustomerStateOwnedCompany(String customerStateOwnedCompany) {
        this.customerStateOwnedCompany = customerStateOwnedCompany;
    }

    @JsonProperty("customerNumberOfEmployees")
    public String getCustomerNumberOfEmployees() {
        return customerNumberOfEmployees;
    }

    @JsonProperty("customerNumberOfEmployees")
    public void setCustomerNumberOfEmployees(String customerNumberOfEmployees) {
        this.customerNumberOfEmployees = customerNumberOfEmployees;
    }

    @JsonProperty("customerDateEstablished")
    public Integer getCustomerDateEstablished() {
        return customerDateEstablished;
    }

    @JsonProperty("customerDateEstablished")
    public void setCustomerDateEstablished(Integer customerDateEstablished) {
        this.customerDateEstablished = customerDateEstablished;
    }

    @JsonProperty("customerDateOfOperations")
    public Integer getCustomerDateOfOperations() {
        return customerDateOfOperations;
    }

    @JsonProperty("customerDateOfOperations")
    public void setCustomerDateOfOperations(Integer customerDateOfOperations) {
        this.customerDateOfOperations = customerDateOfOperations;
    }

    @JsonProperty("customerTurnoverCode")
    public String getCustomerTurnoverCode() {
        return customerTurnoverCode;
    }

    @JsonProperty("customerTurnoverCode")
    public void setCustomerTurnoverCode(String customerTurnoverCode) {
        this.customerTurnoverCode = customerTurnoverCode;
    }

    @JsonProperty("customerTurnoverAmount")
    public Integer getCustomerTurnoverAmount() {
        return customerTurnoverAmount;
    }

    @JsonProperty("customerTurnoverAmount")
    public void setCustomerTurnoverAmount(Integer customerTurnoverAmount) {
        this.customerTurnoverAmount = customerTurnoverAmount;
    }

    @JsonProperty("customerTurnoverCurrency")
    public String getCustomerTurnoverCurrency() {
        return customerTurnoverCurrency;
    }

    @JsonProperty("customerTurnoverCurrency")
    public void setCustomerTurnoverCurrency(String customerTurnoverCurrency) {
        this.customerTurnoverCurrency = customerTurnoverCurrency;
    }

    @JsonProperty("customerNumberOfSignatories")
    public Integer getCustomerNumberOfSignatories() {
        return customerNumberOfSignatories;
    }

    @JsonProperty("customerNumberOfSignatories")
    public void setCustomerNumberOfSignatories(Integer customerNumberOfSignatories) {
        this.customerNumberOfSignatories = customerNumberOfSignatories;
    }

    @JsonProperty("customerSingleMemberEntity")
    public String getCustomerSingleMemberEntity() {
        return customerSingleMemberEntity;
    }

    @JsonProperty("customerSingleMemberEntity")
    public void setCustomerSingleMemberEntity(String customerSingleMemberEntity) {
        this.customerSingleMemberEntity = customerSingleMemberEntity;
    }

    @JsonProperty("customerCIBIndicator")
    public String getCustomerCIBIndicator() {
        return customerCIBIndicator;
    }

    @JsonProperty("customerCIBIndicator")
    public void setCustomerCIBIndicator(String customerCIBIndicator) {
        this.customerCIBIndicator = customerCIBIndicator;
    }

}
