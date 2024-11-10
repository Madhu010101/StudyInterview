package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import java.util.List;

//@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerEchoToken",
        "customerOldCompanyId",
        "customerOldNumber",
        "customerCompanyId",
        "customerNumber",
        "customerType",
        "customerName",
        "customerName2",
        "replyCode",
        "generalCommonData",
        "generalIndividualData",
        "generalCommercialData",
        "kycCommonData",
        "kycIndividualData",
        "kycCommercialData",
        "sourceOfFundsCommonData",
        "foreignTaxRegulatoryCommonData",
        "ifrs9CommercialData",
        "warningTable"
})
@Generated("jsonschema2pojo")
public class Cis1356rZosPayloadResponse {

    @JsonProperty("customerEchoToken")
    private String customerEchoToken;

    @JsonProperty("customerOldCompanyId")
    private Integer customerOldCompanyId;

    @JsonProperty("customerOldNumber")
    private Long customerOldNumber;

    @JsonProperty("customerCompanyId")
    private Integer customerCompanyId;

    @JsonProperty("customerNumber")
    private Long customerNumber;

    @JsonProperty("customerType")
    private String customerType;

    @JsonProperty("customerName")
    private String customerName;

    @JsonProperty("customerName2")
    private String customerName2;

    @JsonProperty("replyCode")
    private Integer replyCode;

    @JsonProperty("generalCommonData")
    private Cis1356rRegulatoryEnquireZosCommonData generalCommonData;
    @JsonProperty("generalIndividualData")
    private Cis1356rRegulatoryEnquireZosIndividualData generalIndividualData;

    @JsonProperty("generalCommercialData")
    private Cis1356rRegulatoryEnquireZosCommercialData generalCommercialData;

    @JsonProperty("kycCommonData")
  private Cis1356rKycCommonData kycCommonData;


    @JsonProperty("kycIndividualData")
    private Cis1356rRegulatoryEnquireZosIndividualCustomerPayload kycIndividualData;

    @JsonProperty("kycCommercialData")
    private Cis1356rRegulatoryEnquireZosJuristicKYC kycCommercialData;

    @JsonProperty("sourceOfFundsCommonData")
    private Cis1356rRegulatoryEnquireZosSourceofFundInfo sourceOfFundsCommonData;

    @JsonProperty("foreignTaxRegulatoryCommonData")
    private Cis1356rRegulatoryEnquireZosTaxData foreignTaxRegulatoryCommonData;

    @JsonProperty("ifrs9CommercialData")
    private Cis1356rRegulatoryEnquireZosIfrs9CommercialData ifrs9CommercialData;

    @JsonProperty("warningTable")
    private List<Cis1356rRegulatoryEnquireZosWarningTable> warningTable;

    @JsonProperty("customerEchoToken")
    public String getCustomerEchoToken() {
        return customerEchoToken;
    }

    @JsonProperty("customerEchoToken")
    public void setCustomerEchoToken(String customerEchoToken) {
        this.customerEchoToken = customerEchoToken;
    }

    @JsonProperty("customerOldCompanyId")
    public Integer getCustomerOldCompanyId() {
        return customerOldCompanyId;
    }
    @JsonProperty("customerOldCompanyId")
    public void setCustomerOldCompanyId(Integer customerOldCompanyId) {
        this.customerOldCompanyId = customerOldCompanyId;
    }
    @JsonProperty("customerOldNumber")
    public Long getCustomerOldNumber() {
        return customerOldNumber;
    }
    @JsonProperty("customerOldNumber")
    public void setCustomerOldNumber(Long customerOldNumber) {
        this.customerOldNumber = customerOldNumber;
    }
    @JsonProperty("customerNumber")
    public Long getCustomerNumber() {
        return customerNumber;
    }
    @JsonProperty("customerNumber")
    public void setCustomerNumber(Long customerNumber) {
        this.customerNumber = customerNumber;
    }

    @JsonProperty("customerCompanyId")
    public Integer getCustomerCompanyId() {
        return customerCompanyId;
    }

    @JsonProperty("customerCompanyId")
    public void setCustomerCompanyId(Integer customerCompanyId) {
        this.customerCompanyId = customerCompanyId;
    }


    @JsonProperty("customerType")
    public String getCustomerType() {
        return customerType;
    }

    @JsonProperty("customerType")
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

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

    @JsonProperty("replyCode")
    public Integer getReplyCode() {
        return replyCode;
    }

    @JsonProperty("replyCode")
    public void setReplyCode(Integer replyCode) {
        this.replyCode = replyCode;
    }

    @JsonProperty("generalCommonData")
    public Cis1356rRegulatoryEnquireZosCommonData getGeneralCommonData() {
        return generalCommonData;
    }

    @JsonProperty("generalCommonData")
    public void setGeneralCommonData(Cis1356rRegulatoryEnquireZosCommonData generalCommonData) {
        this.generalCommonData = generalCommonData;
    }

    @JsonProperty("generalIndividualData")
    public Cis1356rRegulatoryEnquireZosIndividualData getGeneralIndividualData() {
        return generalIndividualData;
    }

    @JsonProperty("generalIndividualData")
    public void setGeneralIndividualData(Cis1356rRegulatoryEnquireZosIndividualData generalIndividualData) {
        this.generalIndividualData = generalIndividualData;
    }

    @JsonProperty("generalCommercialData")
    public Cis1356rRegulatoryEnquireZosCommercialData getGeneralCommercialData() {
        return generalCommercialData;
    }

    @JsonProperty("generalCommercialData")
    public void setGeneralCommercialData(Cis1356rRegulatoryEnquireZosCommercialData generalCommercialData) {
        this.generalCommercialData = generalCommercialData;
    }

    public Cis1356rKycCommonData getKycCommonData() {
        return kycCommonData;
    }

    public void setKycCommonData(Cis1356rKycCommonData kycCommonData) {
        this.kycCommonData = kycCommonData;
    }

    @JsonProperty("kycIndividualData")
    public Cis1356rRegulatoryEnquireZosIndividualCustomerPayload getKycIndividualData() {
        return kycIndividualData;
    }

    @JsonProperty("kycIndividualData")
    public void setKycIndividualData(Cis1356rRegulatoryEnquireZosIndividualCustomerPayload kycIndividualData) {
        this.kycIndividualData = kycIndividualData;
    }

    @JsonProperty("kycCommercialData")
    public Cis1356rRegulatoryEnquireZosJuristicKYC getKycCommercialData() {
        return kycCommercialData;
    }

    @JsonProperty("kycCommercialData")
    public void setKycCommercialData(Cis1356rRegulatoryEnquireZosJuristicKYC kycCommercialData) {
        this.kycCommercialData = kycCommercialData;
    }

    @JsonProperty("sourceOfFundsCommonData")
    public Cis1356rRegulatoryEnquireZosSourceofFundInfo getSourceOfFundsCommonData() {
        return sourceOfFundsCommonData;
    }

    @JsonProperty("sourceOfFundsCommonData")
    public void setSourceOfFundsCommonData(Cis1356rRegulatoryEnquireZosSourceofFundInfo sourceOfFundsCommonData) {
        this.sourceOfFundsCommonData = sourceOfFundsCommonData;
    }

    @JsonProperty("foreignTaxRegulatoryCommonData")
    public Cis1356rRegulatoryEnquireZosTaxData getForeignTaxRegulatoryCommonData() {
        return foreignTaxRegulatoryCommonData;
    }

    @JsonProperty("foreignTaxRegulatoryCommonData")
    public void setForeignTaxRegulatoryCommonData(Cis1356rRegulatoryEnquireZosTaxData foreignTaxRegulatoryCommonData) {
        this.foreignTaxRegulatoryCommonData = foreignTaxRegulatoryCommonData;
    }

    @JsonProperty("ifrs9CommercialData")
    public Cis1356rRegulatoryEnquireZosIfrs9CommercialData getIfrs9CommercialData() {
        return ifrs9CommercialData;
    }

    @JsonProperty("ifrs9CommercialData")
    public void setIfrs9CommercialData(Cis1356rRegulatoryEnquireZosIfrs9CommercialData ifrs9CommercialData) {
        this.ifrs9CommercialData = ifrs9CommercialData;
    }

    @JsonProperty("warningTable")
    public List<Cis1356rRegulatoryEnquireZosWarningTable> getWarningTable() {
        return warningTable;
    }

    @JsonProperty("warningTable")
    public void setWarningTable(List<Cis1356rRegulatoryEnquireZosWarningTable> warningTable) {
        this.warningTable = warningTable;
    }

    @Override
    public String toString() {
        return "Payload{" +
                "customerEchoToken=" + customerEchoToken +
                ", customerOldCompanyId=" + customerOldCompanyId +
                ", customerOldNumber=" + customerOldNumber +
                ", customerCompanyId=" + customerCompanyId +
                ", customerNumber=" + customerNumber +
                ", customerType=" + customerType +
                ", customerName=" + customerName +
                ", customerName2=" + customerName2 +
                ", replyCode=" + replyCode +
                ", generalCommonData=" + generalCommonData +
                ", generalIndividualData=" + generalIndividualData +
                ", generalCommercialData=" + generalCommercialData +
                ", kycCommonData=" + kycCommonData +
                ", kycIndividualData=" + kycIndividualData +
                ", kycCommercialData=" + kycCommercialData +
                ", sourceOfFundsCommonData=" + sourceOfFundsCommonData +
                ", foreignTaxRegulatoryCommonData=" + foreignTaxRegulatoryCommonData +
                ", ifrs9CommercialData=" + ifrs9CommercialData +
                ", warningTable=" + warningTable +
                '}';
    }
}
