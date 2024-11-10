package za.co.fnb.cish.fid.common.api.common;

public class ZosRequest {

    private ZosHeaderRequest headerInput = null;
    private ZosFunctionRequest functionInput = null;

    public ZosHeaderRequest getHeaderInput() {
        return headerInput;
    }

    public void setHeaderInput(ZosHeaderRequest headerInput) {
        this.headerInput = headerInput;
    }

    public ZosFunctionRequest getFunctionInput() {
        return functionInput;
    }

    public void setFunctionInput(ZosFunctionRequest functionInput) {
        this.functionInput = functionInput;
    }

}
