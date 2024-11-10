package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"residentialAddressCareOfLine", "residentialAddressStreetLine1", "residentialAddressStreetLine2", "residentialAddressCity", "residentialAddressState", "residentialAddressZipCode", "residentialAddressCountryCode"

})
public class CoreEnquireResidentialAddressData implements Serializable {
    @ApiModelProperty(value = "\"Care of\" Address line. All post delivered to the address supplied will be in care of this person i.e. \"CARE OF NELSON MANDELA\". e.g.  'C/O Rose anne'")
    private String residentialAddressCareOfLine;

    @ApiModelProperty(value = " Complex Address or Street Name & house number. e.g. '88 Jammmer street' ")
    private String residentialAddressStreetLine1;

    @ApiModelProperty(value = " Street Name & house number if Line 1 is a complex. e.g.  'Silverton' ")
    private String residentialAddressStreetLine2;

    @ApiModelProperty(value = "The City(or suburb - large) in which the residence is located in.This must match the postal code. i.e. 'ROSEBANK'. e.g. 'Pretoria'  ")
    private String residentialAddressCity;

    @ApiModelProperty(value = "Province/District. Only mandatory in Zambia and Tanzania. Other countries can be left blank. e.g. 'Gauteng' ")
    private String residentialAddressState;


    @ApiModelProperty(value = "Zip Code for the address in question. e.g. '0127' ")
    private String residentialAddressZipCode;


    @ApiModelProperty(value = " The country code in which the address is located. e.g. 'ZA' ")
    private String residentialAddressCountryCode;


    public String getResidentialAddressCareOfLine() {
        return residentialAddressCareOfLine;
    }

    public void setResidentialAddressCareOfLine(String residentialAddressCareOfLine) {
        this.residentialAddressCareOfLine = residentialAddressCareOfLine;
    }

    public String getResidentialAddressStreetLine1() {
        return residentialAddressStreetLine1;
    }

    public void setResidentialAddressStreetLine1(String residentialAddressStreetLine1) {
        this.residentialAddressStreetLine1 = residentialAddressStreetLine1;
    }

    public String getResidentialAddressStreetLine2() {
        return residentialAddressStreetLine2;
    }

    public void setResidentialAddressStreetLine2(String residentialAddressStreetLine2) {
        this.residentialAddressStreetLine2 = residentialAddressStreetLine2;
    }

    public String getResidentialAddressCity() {
        return residentialAddressCity;
    }

    public void setResidentialAddressCity(String residentialAddressCity) {
        this.residentialAddressCity = residentialAddressCity;
    }

    public String getResidentialAddressState() {
        return residentialAddressState;
    }

    public void setResidentialAddressState(String residentialAddressState) {
        this.residentialAddressState = residentialAddressState;
    }

    public String getResidentialAddressZipCode() {
        return residentialAddressZipCode;
    }

    public void setResidentialAddressZipCode(String residentialAddressZipCode) {
        this.residentialAddressZipCode = residentialAddressZipCode;
    }

    public String getResidentialAddressCountryCode() {
        return residentialAddressCountryCode;
    }

    public void setResidentialAddressCountryCode(String residentialAddressCountryCode) {
        this.residentialAddressCountryCode = residentialAddressCountryCode;
    }

    @Override
    public String toString() {
        return "CoreEnquireResidentialAddressData{" + "residentialAddressCareOfLine='" + residentialAddressCareOfLine + '\'' + "residentialAddressStreetLine1='" + residentialAddressStreetLine1 + '\'' + "residentialAddressStreetLine2='" + residentialAddressStreetLine2 + '\'' + "residentialAddressCity='" + residentialAddressCity + '\'' + "residentialAddressState='" + residentialAddressState + '\'' + "residentialAddressZipCode='" + residentialAddressZipCode + '\'' + "residentialAddressCountryCode='" + residentialAddressCountryCode + '\'' +

                '}';
    }

}
