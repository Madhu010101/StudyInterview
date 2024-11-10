package za.co.fnb.cish.fid.common.api.fidmaster;

import java.util.List;

public class Location {

    private List<DigitalAddress> digitalAddresses;
    private List<EmailAddress> emailAddresses;
    private List<GeographicalAddress> geographicAddresses;
    private String allArrangementStatementAddressIndicator;
    private String locationEntpsTypeCode;
    private String locationTag;
    private String locationUseEntpsTypeCode;
    private String locationActiveIndicator;
    private List<TelephonicAddress> telephonicAddresses;

    public List<DigitalAddress> getDigitalAddresses() {
        return digitalAddresses;
    }

    public void setDigitalAddresses(List<DigitalAddress> digitalAddresses) {
        this.digitalAddresses = digitalAddresses;
    }

    public List<EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(List<EmailAddress> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public List<GeographicalAddress> getGeographicAddresses() {
        return geographicAddresses;
    }

    public void setGeographicAddresses(List<GeographicalAddress> geographicAddresses) {
        this.geographicAddresses = geographicAddresses;
    }

    public String getLocationEntpsTypeCode() {
        return locationEntpsTypeCode;
    }

    public void setLocationEntpsTypeCode(String locationEntpsTypeCode) {
        this.locationEntpsTypeCode = locationEntpsTypeCode;
    }

    public String getLocationTag() {
        return locationTag;
    }

    public void setLocationTag(String locationTag) {
        this.locationTag = locationTag;
    }

    public String getLocationUseEntpsTypeCode() {
        return locationUseEntpsTypeCode;
    }

    public void setLocationUseEntpsTypeCode(String locationUseEntpsTypeCode) {
        this.locationUseEntpsTypeCode = locationUseEntpsTypeCode;
    }

    public List<TelephonicAddress> getTelephonicAddresses() {
        return telephonicAddresses;
    }

    public void setTelephonicAddresses(List<TelephonicAddress> telephonicAddresses) {
        this.telephonicAddresses = telephonicAddresses;
    }

    public String getAllArrangementStatementAddressIndicator() {
        return allArrangementStatementAddressIndicator;
    }

    public void setAllArrangementStatementAddressIndicator(String allArrangementStatementAddressIndicator) {
        this.allArrangementStatementAddressIndicator = allArrangementStatementAddressIndicator;
    }

    public String getLocationActiveIndicator() {
        return locationActiveIndicator;
    }

    public void setLocationActiveIndicator(String locationActiveIndicator) {
        this.locationActiveIndicator = locationActiveIndicator;
    }
}
