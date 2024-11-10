package za.co.fnb.cish.fid.common.api.cis1356.cis1356output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "pkiData",
        "skiData",
        "akiData",
        "ekycData",
        "kycFields",
        "uboData"


})
@Generated("jsonschema2pojo")
public class Cis1356rKycCommonData {

    @JsonProperty("pkiData")
    private Cis1356rPkiData pkiData;

    @JsonProperty("skiData")
    private Cis1356rSkiData skiData;

    @JsonProperty("akiData")
    private Cis1356rRegulatoryEnquireZosAKIData akiData;

    @JsonProperty("ekycData")
    private Cis1356rRegulatoryEnquireZosEKYCData ekycData;

    @JsonProperty("kycFields")
    private Cis1356rKycFields kycFields;


    @JsonProperty("uboData")
    private Cis1356rRegulatoryEnquireZosUboData uboData;


    public Cis1356rPkiData getPkiData() {
        return pkiData;
    }

    public void setPkiData(Cis1356rPkiData pkiData) {
        this.pkiData = pkiData;
    }

    public Cis1356rSkiData getSkiData() {
        return skiData;
    }

    public void setSkiData(Cis1356rSkiData skiData) {
        this.skiData = skiData;
    }

    public Cis1356rRegulatoryEnquireZosAKIData getAkiData() {
        return akiData;
    }

    public void setAkiData(Cis1356rRegulatoryEnquireZosAKIData akiData) {
        this.akiData = akiData;
    }

    public Cis1356rRegulatoryEnquireZosEKYCData getEkycData() {
        return ekycData;
    }

    public void setEkycData(Cis1356rRegulatoryEnquireZosEKYCData ekycData) {
        this.ekycData = ekycData;
    }

    public Cis1356rKycFields getKycFields() {
        return kycFields;
    }

    public void setKycFields(Cis1356rKycFields kycFields) {
        this.kycFields = kycFields;
    }

    public Cis1356rRegulatoryEnquireZosUboData getUboData() {
        return uboData;
    }

    public void setUboData(Cis1356rRegulatoryEnquireZosUboData uboData) {
        this.uboData = uboData;
    }
}
