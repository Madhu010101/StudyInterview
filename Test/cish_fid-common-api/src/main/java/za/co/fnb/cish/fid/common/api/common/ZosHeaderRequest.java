package za.co.fnb.cish.fid.common.api.common;

public class ZosHeaderRequest {

    private String originatingChannel;
    private Integer branch;
    private Integer terminal;
    private String operatorID;
    private String stubName;

    public String getStubName() {
        return stubName;
    }

    public void setStubName(String stubName) {
        this.stubName = stubName;
    }

    public String getOriginatingChannel() {
        return originatingChannel;
    }

    public void setOriginatingChannel(String originatingChannel) {
        this.originatingChannel = originatingChannel;
    }

    public Integer getBranch() {
        return branch;
    }

    public void setBranch(Integer branch) {
        this.branch = branch;
    }

    public Integer getTerminal() {
        return terminal;
    }

    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    public String getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(String operatorID) {
        this.operatorID = operatorID;
    }

}
