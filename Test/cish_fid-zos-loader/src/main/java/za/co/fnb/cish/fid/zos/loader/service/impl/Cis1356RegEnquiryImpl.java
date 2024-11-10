package za.co.fnb.cish.fid.zos.loader.service.impl;

import org.springframework.stereotype.Component;
import za.co.fnb.cish.fid.common.api.cis1356.cis1356input.Cis1356RegEnquiryRequest;
import za.co.fnb.cish.fid.common.api.cis1356.cis1356input.Cis1356fGetOptions;
import za.co.fnb.cish.fid.common.api.cis1356.cis1356input.Cis1356fPrimaryKey;
import za.co.fnb.cish.fid.common.api.cis1356.cis1356input.Cis1356fSearchKeyOption;
import za.co.fnb.cish.fid.common.api.fidmaster.FirstIdMasterEntity;
import za.co.fnb.cish.fid.zos.loader.util.Constants;

@Component
public class Cis1356RegEnquiryImpl {

    public Cis1356RegEnquiryRequest getCis1356RegEnquiry(FirstIdMasterEntity firstIdMasterEntity, String jurisdictionCountryEntpsCode, Long ucn) {
        Cis1356RegEnquiryRequest cis1356RegEnquiryRequest = new Cis1356RegEnquiryRequest();
        Cis1356fGetOptions cis1356fGetOptions = new Cis1356fGetOptions();
        Cis1356fSearchKeyOption cis1356fSearchKeyOption = new Cis1356fSearchKeyOption();
        Cis1356fPrimaryKey cis1356fPrimaryKey = new Cis1356fPrimaryKey();

        cis1356fGetOptions.setGetAllData(Constants.YES);
        cis1356fGetOptions.setGetCRSData(Constants.YES);
        cis1356fGetOptions.setGetKYCData(Constants.YES);
        cis1356fGetOptions.setGetSOFData(Constants.YES);

        cis1356fPrimaryKey.setCustomerNumber(ucn);
        cis1356fPrimaryKey.setCustomerCompanyId(Integer.valueOf(jurisdictionCountryEntpsCode));
        // cis1362fUcnKey.setCustomerNumber(150L);
        cis1356fSearchKeyOption.setPrimaryKey(cis1356fPrimaryKey);


        cis1356RegEnquiryRequest.setGetOptions(cis1356fGetOptions);
        cis1356RegEnquiryRequest.setSearchKey(cis1356fSearchKeyOption);
        return cis1356RegEnquiryRequest;
    }

}
