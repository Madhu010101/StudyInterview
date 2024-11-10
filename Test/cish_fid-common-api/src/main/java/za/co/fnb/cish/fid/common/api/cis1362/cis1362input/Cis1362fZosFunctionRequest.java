package za.co.fnb.cish.fid.common.api.cis1362.cis1362input;

import za.co.fnb.cish.fid.common.api.common.ZosFunctionRequest;


public class Cis1362fZosFunctionRequest extends ZosFunctionRequest {

    private Cis1362fReplyOptions replyOptions;
    private Cis1362fSearchKeyOption searchKeyOption;

    public Cis1362fReplyOptions getReplyOptions() {
        return replyOptions;
    }

    public void setReplyOptions(Cis1362fReplyOptions replyOptions) {
        this.replyOptions = replyOptions;
    }

    public Cis1362fSearchKeyOption getSearchKeyOption() {
        return searchKeyOption;
    }

    public void setSearchKeyOption(Cis1362fSearchKeyOption searchKeyOption) {
        this.searchKeyOption = searchKeyOption;
    }
}


