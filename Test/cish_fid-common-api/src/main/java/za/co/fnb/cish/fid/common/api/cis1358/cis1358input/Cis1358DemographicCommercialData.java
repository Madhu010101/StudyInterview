
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
    "customerName",
    "customerName2",
    "customerTradingAsName",
    "customerTaxYearEnd",
    "customerCountryEstablished",
    "customerCountryOfOperation",
    "customerCountryHeadOffice",
    "customerStateOwnedCompany",
    "customerNumberOfEmployees",
    "customerDateEstablished",
    "customerDateOfOperation",
    "customerTurnoverCode",
    "customerTurnoverAmount",
    "customerNumberOfSignatories",
    "customerVATRegistrationNumber",
    "customerCIBindicator"
})
@Generated("jsonschema2pojo")
public class Cis1358DemographicCommercialData {

    @JsonProperty("customerName")
    private String customerName;
    @JsonProperty("customerName2")
    private String customerName2;
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
    @JsonProperty("customerDateOfOperation")
    private Integer customerDateOfOperation;
    @JsonProperty("customerTurnoverCode")
    private String customerTurnoverCode;
    @JsonProperty("customerTurnoverAmount")
    private Integer customerTurnoverAmount;
    @JsonProperty("customerNumberOfSignatories")
    private Integer customerNumberOfSignatories;
    @JsonProperty("customerVATRegistrationNumber")
    private String customerVATRegistrationNumber;
    @JsonProperty("customerCIBindicator")
    private String customerCIBindicator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customerName")
    public String getCustomerName() {
        return customerName;
    }

    @JsonProperty("customerName")
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @JsonProperty("customerName2")
    public String getCustomerName2() {
        return customerName2;
    }

    @JsonProperty("customerName2")
    public void setCustomerName2(String customerName2) {
        this.customerName2 = customerName2;
    }

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

    @JsonProperty("customerDateOfOperation")
    public Integer getCustomerDateOfOperation() {
        return customerDateOfOperation;
    }

    @JsonProperty("customerDateOfOperation")
    public void setCustomerDateOfOperation(Integer customerDateOfOperation) {
        this.customerDateOfOperation = customerDateOfOperation;
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

    @JsonProperty("customerNumberOfSignatories")
    public Integer getCustomerNumberOfSignatories() {
        return customerNumberOfSignatories;
    }

    @JsonProperty("customerNumberOfSignatories")
    public void setCustomerNumberOfSignatories(Integer customerNumberOfSignatories) {
        this.customerNumberOfSignatories = customerNumberOfSignatories;
    }

    @JsonProperty("customerVATRegistrationNumber")
    public String getCustomerVATRegistrationNumber() {
        return customerVATRegistrationNumber;
    }

    @JsonProperty("customerVATRegistrationNumber")
    public void setCustomerVATRegistrationNumber(String customerVATRegistrationNumber) {
        this.customerVATRegistrationNumber = customerVATRegistrationNumber;
    }

    @JsonProperty("customerCIBindicator")
    public String getCustomerCIBindicator() {
        return customerCIBindicator;
    }

    @JsonProperty("customerCIBindicator")
    public void setCustomerCIBindicator(String customerCIBindicator) {
        this.customerCIBindicator = customerCIBindicator;
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
