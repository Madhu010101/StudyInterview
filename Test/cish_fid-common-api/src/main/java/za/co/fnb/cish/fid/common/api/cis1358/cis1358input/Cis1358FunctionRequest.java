
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
import za.co.fnb.cish.fid.common.api.common.ZosFunctionRequest;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "inputData",
    "demographicCommonData",
    "demographicIndividualData",
    "demographicCommercialData",
    "contactCommonData",
    "contactIndividualData",
    "contactCommercialData",
    "residentialAddressData",
    "mailingAddressData",
    "qualificationEmployerDetails",
    "marketingCommonData",
    "segmentationCommonData"
})
@Generated("jsonschema2pojo")
public class Cis1358FunctionRequest extends ZosFunctionRequest {

    @JsonProperty("inputData")
    private Cis1358InputData inputData;
    @JsonProperty("demographicCommonData")
    private Cis1358DemographicCommonData demographicCommonData;
    @JsonProperty("demographicIndividualData")
    private Cis1358DemographicIndividualData demographicIndividualData;
    @JsonProperty("demographicCommercialData")
    private Cis1358DemographicCommercialData demographicCommercialData;
    @JsonProperty("contactCommonData")
    private Cis1358ContactCommonData contactCommonData;
    @JsonProperty("contactIndividualData")
    private Cis1358ContactIndividualData contactIndividualData;
    @JsonProperty("contactCommercialData")
    private Cis1358ContactCommercialData contactCommercialData;
    @JsonProperty("residentialAddressData")
    private Cis1358ResidentialAddressData residentialAddressData;
    @JsonProperty("mailingAddressData")
    private Cis1358MailingAddressData mailingAddressData;
    @JsonProperty("qualificationEmployerDetails")
    private Cis1358QualificationEmployerDetails qualificationEmployerDetails;
    @JsonProperty("marketingCommonData")
    private Cis1358MarketingCommonData marketingCommonData;
    @JsonProperty("segmentationCommonData")
    private Cis1358SegmentationCommonData segmentationCommonData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("inputData")
    public Cis1358InputData getInputData() {
        return inputData;
    }

    @JsonProperty("inputData")
    public void setInputData(Cis1358InputData inputData) {
        this.inputData = inputData;
    }

    @JsonProperty("demographicCommonData")
    public Cis1358DemographicCommonData getDemographicCommonData() {
        return demographicCommonData;
    }

    @JsonProperty("demographicCommonData")
    public void setDemographicCommonData(Cis1358DemographicCommonData demographicCommonData) {
        this.demographicCommonData = demographicCommonData;
    }

    @JsonProperty("demographicIndividualData")
    public Cis1358DemographicIndividualData getDemographicIndividualData() {
        return demographicIndividualData;
    }

    @JsonProperty("demographicIndividualData")
    public void setDemographicIndividualData(Cis1358DemographicIndividualData demographicIndividualData) {
        this.demographicIndividualData = demographicIndividualData;
    }

    @JsonProperty("demographicCommercialData")
    public Cis1358DemographicCommercialData getDemographicCommercialData() {
        return demographicCommercialData;
    }

    @JsonProperty("demographicCommercialData")
    public void setDemographicCommercialData(Cis1358DemographicCommercialData demographicCommercialData) {
        this.demographicCommercialData = demographicCommercialData;
    }

    @JsonProperty("contactCommonData")
    public Cis1358ContactCommonData getContactCommonData() {
        return contactCommonData;
    }

    @JsonProperty("contactCommonData")
    public void setContactCommonData(Cis1358ContactCommonData contactCommonData) {
        this.contactCommonData = contactCommonData;
    }

    @JsonProperty("contactIndividualData")
    public Cis1358ContactIndividualData getContactIndividualData() {
        return contactIndividualData;
    }

    @JsonProperty("contactIndividualData")
    public void setContactIndividualData(Cis1358ContactIndividualData contactIndividualData) {
        this.contactIndividualData = contactIndividualData;
    }

    @JsonProperty("contactCommercialData")
    public Cis1358ContactCommercialData getContactCommercialData() {
        return contactCommercialData;
    }

    @JsonProperty("contactCommercialData")
    public void setContactCommercialData(Cis1358ContactCommercialData contactCommercialData) {
        this.contactCommercialData = contactCommercialData;
    }

    @JsonProperty("residentialAddressData")
    public Cis1358ResidentialAddressData getResidentialAddressData() {
        return residentialAddressData;
    }

    @JsonProperty("residentialAddressData")
    public void setResidentialAddressData(Cis1358ResidentialAddressData residentialAddressData) {
        this.residentialAddressData = residentialAddressData;
    }

    @JsonProperty("mailingAddressData")
    public Cis1358MailingAddressData getMailingAddressData() {
        return mailingAddressData;
    }

    @JsonProperty("mailingAddressData")
    public void setMailingAddressData(Cis1358MailingAddressData mailingAddressData) {
        this.mailingAddressData = mailingAddressData;
    }

    @JsonProperty("qualificationEmployerDetails")
    public Cis1358QualificationEmployerDetails getQualificationEmployerDetails() {
        return qualificationEmployerDetails;
    }

    @JsonProperty("qualificationEmployerDetails")
    public void setQualificationEmployerDetails(Cis1358QualificationEmployerDetails qualificationEmployerDetails) {
        this.qualificationEmployerDetails = qualificationEmployerDetails;
    }

    @JsonProperty("marketingCommonData")
    public Cis1358MarketingCommonData getMarketingCommonData() {
        return marketingCommonData;
    }

    @JsonProperty("marketingCommonData")
    public void setMarketingCommonData(Cis1358MarketingCommonData marketingCommonData) {
        this.marketingCommonData = marketingCommonData;
    }

    @JsonProperty("segmentationCommonData")
    public Cis1358SegmentationCommonData getSegmentationCommonData() {
        return segmentationCommonData;
    }

    @JsonProperty("segmentationCommonData")
    public void setSegmentationCommonData(Cis1358SegmentationCommonData segmentationCommonData) {
        this.segmentationCommonData = segmentationCommonData;
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
