package za.co.fnb.cish.fid.common.api.cis1356.cis1356input;

public class Cis1356fGetOptions {

    private String getKYCData;
    private String getCRSData ;
    private String getSOFData;
    private String getAllData;

    public String getGetKYCData() {
        return getKYCData;
    }

    public void setGetKYCData(String getKYCData) {
        this.getKYCData = getKYCData;
    }

    public String getGetCRSData() {
        return getCRSData;
    }

    public void setGetCRSData(String getCRSData) {
        this.getCRSData = getCRSData;
    }

    public String getGetSOFData() {
        return getSOFData;
    }

    public void setGetSOFData(String getSOFData) {
        this.getSOFData = getSOFData;
    }

    public String getGetAllData() {
        return getAllData;
    }

    public void setGetAllData(String getAllData) {
        this.getAllData = getAllData;
    }

    @Override
    public String toString() {
        return "Cis1356fGetOptions{" +
                "getKYCData='" + getKYCData + '\'' +
                ", getCRSData='" + getCRSData + '\'' +
                ", getSOFData='" + getSOFData + '\'' +
                ", getAllData='" + getAllData + '\'' +
                '}';
    }
}
