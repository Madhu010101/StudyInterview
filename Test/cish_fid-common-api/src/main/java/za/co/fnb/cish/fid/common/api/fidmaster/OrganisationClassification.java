package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrganisationClassification
{
    @JsonProperty
    private String organisationClassificationTypeCode;
    @JsonProperty
    private String organisationClassificationAttributeName;
    @JsonProperty
    private String organisationClassificationValue;
    @JsonProperty
    private String organisationClassificationActiveIndicator;

    public String getOrganisationClassificationTypeCode() {
        return organisationClassificationTypeCode;
    }

    public void setOrganisationClassificationTypeCode(String organisationClassificationTypeCode) {
        this.organisationClassificationTypeCode = organisationClassificationTypeCode;
    }

    public String getOrganisationClassificationAttributeName() {
        return organisationClassificationAttributeName;
    }

    public void setOrganisationClassificationAttributeName(String organisationClassificationAttributeName) {
        this.organisationClassificationAttributeName = organisationClassificationAttributeName;
    }

    public String getOrganisationClassificationValue() {
        return organisationClassificationValue;
    }

    public void setOrganisationClassificationValue(String organisationClassificationValue) {
        this.organisationClassificationValue = organisationClassificationValue;
    }

    public String getOrganisationClassificationActiveIndicator() {
        return organisationClassificationActiveIndicator;
    }

    public void setOrganisationClassificationActiveIndicator(String organisationClassificationActiveIndicator) {
        this.organisationClassificationActiveIndicator = organisationClassificationActiveIndicator;
    }
}
