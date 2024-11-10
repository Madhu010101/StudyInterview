package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeographicalAddress {
    @JsonProperty
    private String addressEntpsTypeCode;
    @JsonProperty
    private String addressLine1;
    @JsonProperty
    private String addressLine2;
    @JsonProperty
    private String buildingName;
    @JsonProperty
    private String careOfName;
    @JsonProperty
    private String cityName;
    @JsonProperty
    private String complexName;
    @JsonProperty
    private String countryEntpsCode;
    @JsonProperty
    private String floorNumber;
    @JsonProperty
    private String postalAreaNumber;
    @JsonProperty
    private String stateDistrictProvinceEntpsTypeCode;
    @JsonProperty
    private String stateDistrictProvinceName;
    @JsonProperty
    private String streetName;
    @JsonProperty
    private String streetNumber;
    @JsonProperty
    private String subAreaName;
    @JsonProperty
    private String suburbName;
    @JsonProperty
    private String suiteName;
    @JsonProperty
    private String unitNumber;

    @JsonProperty
    private String googlePlusCode;


    public String getAddressEntpsTypeCode() {
        return addressEntpsTypeCode;
    }

    public void setAddressEntpsTypeCode(String addressEntpsTypeCode) {
        this.addressEntpsTypeCode = addressEntpsTypeCode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getCareOfName() {
        return careOfName;
    }

    public void setCareOfName(String careOfName) {
        this.careOfName = careOfName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getComplexName() {
        return complexName;
    }

    public void setComplexName(String complexName) {
        this.complexName = complexName;
    }

    public String getCountryEntpsCode() {
        return countryEntpsCode;
    }

    public void setCountryEntpsCode(String countryEntpsCode) {
        this.countryEntpsCode = countryEntpsCode;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getPostalAreaNumber() {
        return postalAreaNumber;
    }

    public void setPostalAreaNumber(String postalAreaNumber) {
        this.postalAreaNumber = postalAreaNumber;
    }

    public String getStateDistrictProvinceEntpsTypeCode() {
        return stateDistrictProvinceEntpsTypeCode;
    }

    public void setStateDistrictProvinceEntpsTypeCode(String stateDistrictProvinceEntpsTypeCode) {
        this.stateDistrictProvinceEntpsTypeCode = stateDistrictProvinceEntpsTypeCode;
    }

    public String getStateDistrictProvinceName() {
        return stateDistrictProvinceName;
    }

    public void setStateDistrictProvinceName(String stateDistrictProvinceName) {
        this.stateDistrictProvinceName = stateDistrictProvinceName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getSubAreaName() {
        return subAreaName;
    }

    public void setSubAreaName(String subAreaName) {
        this.subAreaName = subAreaName;
    }

    public String getSuburbName() {
        return suburbName;
    }

    public void setSuburbName(String suburbName) {
        this.suburbName = suburbName;
    }

    public String getSuiteName() {
        return suiteName;
    }

    public void setSuiteName(String suiteName) {
        this.suiteName = suiteName;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getGooglePlusCode() {
        return googlePlusCode;
    }

    public void setGooglePlusCode(String googlePlusCode) {
        this.googlePlusCode = googlePlusCode;
    }
}
