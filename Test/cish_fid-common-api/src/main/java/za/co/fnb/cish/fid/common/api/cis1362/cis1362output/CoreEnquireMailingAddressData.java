package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"mailingAddressCareOfLine", "mailingAddressStreetLine1", "mailingAddressStreetLine2", "mailingAddressCity", "mailingAddressState", "mailingAddressZipCode", "mailingAddressCountryCode"

})
public class CoreEnquireMailingAddressData implements Serializable {
    @ApiModelProperty(value = "\"Care of\" Address line. All post delivered to the address supplied will be in care of this person i.e. \"CARE OF NELSON MANDELA\". e.g.  'C/O Rose anne'")
    private String mailingAddressCareOfLine;

    @ApiModelProperty(value = " Complex Address or Street Name & house number. e.g. \"Unit 1 Whatever estate\" ")
    private String mailingAddressStreetLine1;

    @ApiModelProperty(value = " Street Name & house number if Line 1 is a complex. e.g.  'Silverton' ")
    private String mailingAddressStreetLine2;

    @ApiModelProperty(value = "The City(or suburb - large) in which the residence is located in.This must match the postal code. i.e. 'ROSEBANK'. e.g. '88 Jammer street'  ")
    private String mailingAddressCity;

    @ApiModelProperty(value = "Province/District. Only mandatory in Zambia and Tanzania. Other countries can be left blank. e.g. 'Gauteng' ")
    private String mailingAddressState;


    @ApiModelProperty(value = "Zip Code for the address in question. e.g. '0127' ")
    private String mailingAddressZipCode;


    @ApiModelProperty(value = " The country code in which the address is located. e.g. 'ZA' ")
    private String mailingAddressCountryCode;

    public String getMailingAddressCareOfLine() {
        return mailingAddressCareOfLine;
    }

    public void setMailingAddressCareOfLine(String mailingAddressCareOfLine) {
        this.mailingAddressCareOfLine = mailingAddressCareOfLine;
    }

    public String getMailingAddressStreetLine1() {
        return mailingAddressStreetLine1;
    }

    public void setMailingAddressStreetLine1(String mailingAddressStreetLine1) {
        this.mailingAddressStreetLine1 = mailingAddressStreetLine1;
    }

    public String getMailingAddressStreetLine2() {
        return mailingAddressStreetLine2;
    }

    public void setMailingAddressStreetLine2(String mailingAddressStreetLine2) {
        this.mailingAddressStreetLine2 = mailingAddressStreetLine2;
    }

    public String getMailingAddressCity() {
        return mailingAddressCity;
    }

    public void setMailingAddressCity(String mailingAddressCity) {
        this.mailingAddressCity = mailingAddressCity;
    }

    public String getMailingAddressState() {
        return mailingAddressState;
    }

    public void setMailingAddressState(String mailingAddressState) {
        this.mailingAddressState = mailingAddressState;
    }

    public String getMailingAddressZipCode() {
        return mailingAddressZipCode;
    }

    public void setMailingAddressZipCode(String mailingAddressZipCode) {
        this.mailingAddressZipCode = mailingAddressZipCode;
    }

    public String getMailingAddressCountryCode() {
        return mailingAddressCountryCode;
    }

    public void setMailingAddressCountryCode(String mailingAddressCountryCode) {
        this.mailingAddressCountryCode = mailingAddressCountryCode;
    }

    @Override
    public String toString() {
        return "CoreEnquireMailingAddressData{" + "mailingAddressCareOfLine='" + mailingAddressCareOfLine + '\'' + "mailingAddressStreetLine1='" + mailingAddressStreetLine1 + '\'' + "mailingAddressStreetLine2='" + mailingAddressStreetLine2 + '\'' + "mailingAddressCity='" + mailingAddressCity + '\'' + "mailingAddressState='" + mailingAddressState + '\'' + "mailingAddressZipCode='" + mailingAddressZipCode + '\'' + "mailingAddressCountryCode='" + mailingAddressCountryCode + '\'' +

                '}';
    }

}
