package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerEntityDocumentVerified",
        "customerEntityDocumentVerifiedDate",
        "customerRelatedPartyVerified",
        "customerRelatedPartyVerifiedDate"

})
@Generated("jsonschema2pojo")
public class Cis1356rRegulatoryEnquireZosJuristicKYC {
    @JsonProperty("customerEntityDocumentVerified")
    private String customerEntityDocumentVerified	;

    @JsonProperty("customerEntityDocumentVerifiedDate")
    private Integer customerEntityDocumentVerifiedDate;

    @JsonProperty("customerRelatedPartyVerified")
    private String customerRelatedPartyVerified;

    @JsonProperty("customerRelatedPartyVerifiedDate")
    private Integer customerRelatedPartyVerifiedDate;

    @JsonProperty("customerEntityDocumentVerified")
    public String getCustomerEntityDocumentVerified() {
        return customerEntityDocumentVerified;
    }
    @JsonProperty("customerEntityDocumentVerified")
    public void setCustomerEntityDocumentVerified(String customerEntityDocumentVerified) {
        this.customerEntityDocumentVerified = customerEntityDocumentVerified;
    }
    @JsonProperty("customerEntityDocumentVerifiedDate")
    public Integer getCustomerEntityDocumentVerifiedDate() {
        return customerEntityDocumentVerifiedDate;
    }
    @JsonProperty("customerEntityDocumentVerifiedDate")
    public void setCustomerEntityDocumentVerifiedDate(Integer customerEntityDocumentVerifiedDate) {
        this.customerEntityDocumentVerifiedDate = customerEntityDocumentVerifiedDate;
    }
    @JsonProperty("customerRelatedPartyVerified")
    public String getCustomerRelatedPartyVerified() {
        return customerRelatedPartyVerified;
    }
    @JsonProperty("customerRelatedPartyVerified")
    public void setCustomerRelatedPartyVerified(String customerRelatedPartyVerified) {
        this.customerRelatedPartyVerified = customerRelatedPartyVerified;
    }
    @JsonProperty("customerRelatedPartyVerifiedDate")
    public Integer getCustomerRelatedPartyVerifiedDate() {
        return customerRelatedPartyVerifiedDate;
    }
    @JsonProperty("customerRelatedPartyVerifiedDate")
    public void setCustomerRelatedPartyVerifiedDate(Integer customerRelatedPartyVerifiedDate) {
        this.customerRelatedPartyVerifiedDate = customerRelatedPartyVerifiedDate;
    }

    @Override
    public String toString() {
        return "Cis1356rRegulatoryEnquireZosJuristicKYC{" +
                "customerEntityDocumentVerified='" + customerEntityDocumentVerified + '\'' +
                ", customerEntityDocumentVerifiedDate='" + customerEntityDocumentVerifiedDate + '\'' +
                ", customerRelatedPartyVerified='" + customerRelatedPartyVerified + '\'' +
                ", customerRelatedPartyVerifiedDate='" + customerRelatedPartyVerifiedDate + '\'' +
                '}';
    }

}
