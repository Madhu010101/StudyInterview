package za.co.fnb.cish.fid.common.api.cis1362.cis1362output;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@JsonPropertyOrder({"customerFNBMarketingConsent", "customerFRBMarketingConsent", "customerThirdPartyConsent", "customerMarketingViaCell", "customerMarketingViaPhone", "customerMarketingViaSMS", "customerMarketingViaEmail", "customerMarketingViaPost"

})
public class CoreEnquireMarketingCommonData implements Serializable {
    @ApiModelProperty(value = "Marketing indicator used by FNB to market FNB. e.g. 'True' or 'False' ")
    private String customerFNBMarketingConsent;

    @ApiModelProperty(value = "Marketing indicator used by associates of FNB. e.g. 'True' or 'False'  ")
    private String customerFRBMarketingConsent;

    @ApiModelProperty(value = " The client consents to information being retrieved from 3rd parties. e.g.  'Y' - customer has given consent to get third party info or\n" + "'N' - customer has not given consent to get third party info or\n" + "\n" + "'P' - customer has not yet specified if they give consent  ")
    private String customerThirdPartyConsent;

    @ApiModelProperty(value = "Use the Cell phone number to contact the customer. e.g. 'True' or 'False'   ")
    private String customerMarketingViaCell;

    @ApiModelProperty(value = "Use the home telephone number to contact the customer. e.g. 'True' or 'False'  ")
    private String customerMarketingViaPhone;


    @ApiModelProperty(value = "Use a SMS to contact the customer for Marketing.. e.g.'True' or 'False' ")
    private String customerMarketingViaSMS;


    @ApiModelProperty(value = " Use the customer email address to contact the customer. e.g. 'True' or 'False'  ")
    private String customerMarketingViaEmail;


    @ApiModelProperty(value = " Use the customer postal address to contact the customer. e.g. 'True' or 'False'  ")
    private String customerMarketingViaPost;

    public String getCustomerFNBMarketingConsent() {
        return customerFNBMarketingConsent;
    }

    public void setCustomerFNBMarketingConsent(String customerFNBMarketingConsent) {
        this.customerFNBMarketingConsent = customerFNBMarketingConsent;
    }

    public String getCustomerFRBMarketingConsent() {
        return customerFRBMarketingConsent;
    }

    public void setCustomerFRBMarketingConsent(String customerFRBMarketingConsent) {
        this.customerFRBMarketingConsent = customerFRBMarketingConsent;
    }

    public String getCustomerThirdPartyConsent() {
        return customerThirdPartyConsent;
    }

    public void setCustomerThirdPartyConsent(String customerThirdPartyConsent) {
        this.customerThirdPartyConsent = customerThirdPartyConsent;
    }

    public String getCustomerMarketingViaCell() {
        return customerMarketingViaCell;
    }

    public void setCustomerMarketingViaCell(String customerMarketingViaCell) {
        this.customerMarketingViaCell = customerMarketingViaCell;
    }

    public String getCustomerMarketingViaPhone() {
        return customerMarketingViaPhone;
    }

    public void setCustomerMarketingViaPhone(String customerMarketingViaPhone) {
        this.customerMarketingViaPhone = customerMarketingViaPhone;
    }

    public String getCustomerMarketingViaSMS() {
        return customerMarketingViaSMS;
    }

    public void setCustomerMarketingViaSMS(String customerMarketingViaSMS) {
        this.customerMarketingViaSMS = customerMarketingViaSMS;
    }

    public String getCustomerMarketingViaEmail() {
        return customerMarketingViaEmail;
    }

    public void setCustomerMarketingViaEmail(String customerMarketingViaEmail) {
        this.customerMarketingViaEmail = customerMarketingViaEmail;
    }

    public String getCustomerMarketingViaPost() {
        return customerMarketingViaPost;
    }

    public void setCustomerMarketingViaPost(String customerMarketingViaPost) {
        this.customerMarketingViaPost = customerMarketingViaPost;
    }

    @Override
    public String toString() {
        return "CoreEnquireMarketingCommonData{" + "customerFNBMarketingConsent='" + customerFNBMarketingConsent + '\'' + "customerFRBMarketingConsent='" + customerFRBMarketingConsent + '\'' + "customerThirdPartyConsent='" + customerThirdPartyConsent + '\'' + "customerMarketingViaCell='" + customerMarketingViaCell + '\'' + "customerMarketingViaPhone='" + customerMarketingViaPhone + '\'' + "customerMarketingViaSMS='" + customerMarketingViaSMS + '\'' + "customerMarketingViaEmail='" + customerMarketingViaEmail + '\'' + "customerMarketingViaPost='" + customerMarketingViaPost + '\'' +

                '}';
    }

}
