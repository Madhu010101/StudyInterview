package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Education {
    @JsonProperty
    private String highestQualificationEntpsTypeCode;
    @JsonProperty
    private String qualificationDate;
    @JsonProperty
    private String qualificationSpecialityEntpsTypeCode;
    @JsonProperty
    private String qualificationStartDate;
    @JsonProperty
    private String qualificationProofIndicator;
    @JsonProperty
    private String educationActiveIndicator;


    public String getHighestQualificationEntpsTypeCode() {
        return highestQualificationEntpsTypeCode;
    }

    public void setHighestQualificationEntpsTypeCode(String highestQualificationEntpsTypeCode) {
        this.highestQualificationEntpsTypeCode = highestQualificationEntpsTypeCode;
    }

    public String getQualificationDate() {
        return qualificationDate;
    }

    public void setQualificationDate(String qualificationDate) {
        this.qualificationDate = qualificationDate;
    }

    public String getQualificationSpecialityEntpsTypeCode() {
        return qualificationSpecialityEntpsTypeCode;
    }

    public void setQualificationSpecialityEntpsTypeCode(String qualificationSpecialityEntpsTypeCode) {
        this.qualificationSpecialityEntpsTypeCode = qualificationSpecialityEntpsTypeCode;
    }

    public String getQualificationStartDate() {
        return qualificationStartDate;
    }

    public void setQualificationStartDate(String qualificationStartDate) {
        this.qualificationStartDate = qualificationStartDate;
    }

    public String getQualificationProofIndicator() {
        return qualificationProofIndicator;
    }

    public void setQualificationProofIndicator(String qualificationProofIndicator) {
        this.qualificationProofIndicator = qualificationProofIndicator;
    }

    public String getEducationActiveIndicator() {
        return educationActiveIndicator;
    }

    public void setEducationActiveIndicator(String educationActiveIndicator) {
        this.educationActiveIndicator = educationActiveIndicator;
    }
}
