package za.co.fnb.cish.fid.common.api.common;

public class ZosRequestWrapper {

    private ZosRequest input = new ZosRequest();

    public ZosRequest getinput() {
        return this.input;
    }

    public void setinput(ZosRequest pInput) {
        this.input = pInput;
    }

    @Override
    public String toString() {
        return "ZosRequestWrapper{" +
                "input=" + input +
                '}';
    }

}
