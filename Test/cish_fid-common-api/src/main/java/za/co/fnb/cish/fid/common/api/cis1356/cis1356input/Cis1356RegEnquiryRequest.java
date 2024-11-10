package za.co.fnb.cish.fid.common.api.cis1356.cis1356input;

import za.co.fnb.cish.fid.common.api.common.ZosFunctionRequest;


public class Cis1356RegEnquiryRequest extends ZosFunctionRequest {

    private Cis1356fGetOptions getOptions;
    private Cis1356fSearchKeyOption searchKey;

    public Cis1356fGetOptions getGetOptions() {
        return getOptions;
    }

    public void setGetOptions(Cis1356fGetOptions getOptions) {
        this.getOptions = getOptions;
    }

    public Cis1356fSearchKeyOption getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(Cis1356fSearchKeyOption searchKey) {
        this.searchKey = searchKey;
    }

    @Override
    public String toString() {
        return "Cis1356RegEnquiryRequest{" +
                "getOptions=" + getOptions +
                ", searchKey=" + searchKey +
                '}';
    }
}


