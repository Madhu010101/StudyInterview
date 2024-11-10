package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceOfFunds {
    @JsonProperty
    private Integer sourceOfFundsAmount;
    @JsonProperty
    private String sourceOfFundsDate;
    @JsonProperty
    private String sourceOfFundsEntpsTypeCode;
    @JsonProperty
    private String sourceOfFundsActiveIndicator;
    @JsonProperty
    private String sourceOfFundsCurrencyEntpsTypeCode;
    @JsonProperty
    private String sourceOfFundsFrequencyEntpsTypeCode;
    @JsonProperty
    private Integer sourceOfFundsPaymentDay;
    @JsonProperty
    private String primarySourceOfFundsIndicator;

    public Integer getSourceOfFundsAmount() {
        return sourceOfFundsAmount;
    }

    public void setSourceOfFundsAmount(Integer sourceOfFundsAmount) {
        this.sourceOfFundsAmount = sourceOfFundsAmount;
    }

    public String getSourceOfFundsDate() {
        return sourceOfFundsDate;
    }

    public void setSourceOfFundsDate(String sourceOfFundsDate) {
        this.sourceOfFundsDate = sourceOfFundsDate;
    }

    public String getSourceOfFundsEntpsTypeCode() {
        return sourceOfFundsEntpsTypeCode;
    }

    public void setSourceOfFundsEntpsTypeCode(String sourceOfFundsEntpsTypeCode) {
        this.sourceOfFundsEntpsTypeCode = sourceOfFundsEntpsTypeCode;
    }

    public String getSourceOfFundsActiveIndicator() {
        return sourceOfFundsActiveIndicator;
    }

    public void setSourceOfFundsActiveIndicator(String sourceOfFundsActiveIndicator) {
        this.sourceOfFundsActiveIndicator = sourceOfFundsActiveIndicator;
    }

    public String getSourceOfFundsCurrencyEntpsTypeCode() {
        return sourceOfFundsCurrencyEntpsTypeCode;
    }

    public void setSourceOfFundsCurrencyEntpsTypeCode(String sourceOfFundsCurrencyEntpsTypeCode) {
        this.sourceOfFundsCurrencyEntpsTypeCode = sourceOfFundsCurrencyEntpsTypeCode;
    }

    public String getSourceOfFundsFrequencyEntpsTypeCode() {
        return sourceOfFundsFrequencyEntpsTypeCode;
    }

    public void setSourceOfFundsFrequencyEntpsTypeCode(String sourceOfFundsFrequencyEntpsTypeCode) {
        this.sourceOfFundsFrequencyEntpsTypeCode = sourceOfFundsFrequencyEntpsTypeCode;
    }

    public Integer getSourceOfFundsPaymentDay() {
        return sourceOfFundsPaymentDay;
    }

    public void setSourceOfFundsPaymentDay(Integer sourceOfFundsPaymentDay) {
        this.sourceOfFundsPaymentDay = sourceOfFundsPaymentDay;
    }

    public String getPrimarySourceOfFundsIndicator() {
        return primarySourceOfFundsIndicator;
    }

    public void setPrimarySourceOfFundsIndicator(String primarySourceOfFundsIndicator) {
        this.primarySourceOfFundsIndicator = primarySourceOfFundsIndicator;
    }
}
