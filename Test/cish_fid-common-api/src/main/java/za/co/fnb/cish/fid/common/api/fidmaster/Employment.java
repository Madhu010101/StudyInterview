package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employment {

    @JsonProperty
    private double annualGrossIncomeAmount;
    @JsonProperty
    private String employerName;
    @JsonProperty
    private String employmentEndDate;
    @JsonProperty
    private String employmentStartDate;
    @JsonProperty
    private String occupationEntpsTypeCode;
    @JsonProperty
    private String employmentActiveIndicator;
    @JsonProperty
    private String primaryEmploymentIndicator;
    @JsonProperty
    private double nettIncomeAmount;
    @JsonProperty
    private String nettIncomeCurrencyEntpsTypeCode;
    @JsonProperty
    private String nettIncomeFrequencyEntpsTypeCode;
    @JsonProperty
    private Integer nettIncomePaymentDay;
    @JsonProperty
    private String employmentStatusEntpsTypeCode;

    public double getAnnualGrossIncomeAmount() {
        return annualGrossIncomeAmount;
    }

    public void setAnnualGrossIncomeAmount(double annualGrossIncomeAmount) {
        this.annualGrossIncomeAmount = annualGrossIncomeAmount;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmploymentEndDate() {
        return employmentEndDate;
    }

    public void setEmploymentEndDate(String employmentEndDate) {
        this.employmentEndDate = employmentEndDate;
    }

    public String getEmploymentStartDate() {
        return employmentStartDate;
    }

    public void setEmploymentStartDate(String employmentStartDate) {
        this.employmentStartDate = employmentStartDate;
    }

    public String getOccupationEntpsTypeCode() {
        return occupationEntpsTypeCode;
    }

    public void setOccupationEntpsTypeCode(String occupationEntpsTypeCode) {
        this.occupationEntpsTypeCode = occupationEntpsTypeCode;
    }

    public String getEmploymentActiveIndicator() {
        return employmentActiveIndicator;
    }

    public void setEmploymentActiveIndicator(String employmentActiveIndicator) {
        this.employmentActiveIndicator = employmentActiveIndicator;
    }

    public String getPrimaryEmploymentIndicator() {
        return primaryEmploymentIndicator;
    }

    public void setPrimaryEmploymentIndicator(String primaryEmploymentIndicator) {
        this.primaryEmploymentIndicator = primaryEmploymentIndicator;
    }

    public double getNettIncomeAmount() {
        return nettIncomeAmount;
    }

    public void setNettIncomeAmount(double nettIncomeAmount) {
        this.nettIncomeAmount = nettIncomeAmount;
    }

    public String getNettIncomeCurrencyEntpsTypeCode() {
        return nettIncomeCurrencyEntpsTypeCode;
    }

    public void setNettIncomeCurrencyEntpsTypeCode(String nettIncomeCurrencyEntpsTypeCode) {
        this.nettIncomeCurrencyEntpsTypeCode = nettIncomeCurrencyEntpsTypeCode;
    }

    public String getNettIncomeFrequencyEntpsTypeCode() {
        return nettIncomeFrequencyEntpsTypeCode;
    }

    public void setNettIncomeFrequencyEntpsTypeCode(String nettIncomeFrequencyEntpsTypeCode) {
        this.nettIncomeFrequencyEntpsTypeCode = nettIncomeFrequencyEntpsTypeCode;
    }

    public Integer getNettIncomePaymentDay() {
        return nettIncomePaymentDay;
    }

    public void setNettIncomePaymentDay(Integer nettIncomePaymentDay) {
        this.nettIncomePaymentDay = nettIncomePaymentDay;
    }

    public String getEmploymentStatusEntpsTypeCode() {
        return employmentStatusEntpsTypeCode;
    }

    public void setEmploymentStatusEntpsTypeCode(String employmentStatusEntpsTypeCode) {
        this.employmentStatusEntpsTypeCode = employmentStatusEntpsTypeCode;
    }
}
