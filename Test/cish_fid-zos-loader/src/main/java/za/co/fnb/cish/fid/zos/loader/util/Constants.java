package za.co.fnb.cish.fid.zos.loader.util;

import java.util.Arrays;
import java.util.List;

public class Constants {

    public static final String CIS_CHANNEL_ID = "CUSTOMER";
    public static final String X_REQUEST_ID = "X-Request-ID";
    public static final String COLON = ":";
    public static final String SPACE = " ";
    public static final String YES = "Y";
    public static final String ENQUIRE_ENDPOINT = "/cis/customer/customer-core-inquiry-by-ucn/v1";
    public static final String MAINTAIN_ENDPOINT = "/cis/customer/cre-customer-core-maintain/v1";
    public static final String REG_ENQUIRE_ENDPOINT = "/cis/customer/customer-regulatory-inquiry-by-ucn/v1";
    public static final String REG_MAINTAIN_ENDPOINT = "/cis/customer/cre-customer-regulatory-maintain/v1";
    public static final String STUBID = "CISGWCIS";
    public static final String OPERATOR = "FIDM";
    public static final Integer STANDIN_DELAY = 900000;
    public static final List<Integer> STANDIN_ERROR = Arrays.asList(8519);
    public static final String REG_MAINTENANCE = "cre-customer-regulatory-maintain";
    public static final String CORE_MAINTENANCE = "cre-customer-core-maintain";
    public static final String CORE_INQUIRY = "customer-core-inquiry-by-ucn";
    public static final String REG_INQUIRY = "customer-regulatory-inquiry-by-ucn";
    public static final Integer OLD_TOKEN = 8282;
    public static final Integer EMAIL = 3;
//    public static final Integer CELL = 17;
    public static final String RESIDENTIAL = "CR";
    public static final Integer IND = 01;
    public static final Integer ORG = 02;
    public static final String CELL = "CELL";
    public static final String BUS = "BUS";
    public static final String REGIX = "\\s+";
    public static final String EMPTYSTR = "";
    public static final String STRING_ZERO = "0";
    public static final Integer INTEGER_ZERO = 0;
    public static final String TAXREF  =  "TAXREF";
    public static final String VATREG  =  "VATREG";
    public static final String TIN  =  "TIN";
    public static final List<String> NEGATIVE_LIST = Arrays.asList("0","-1","-2");


    private Constants() {
        throw new IllegalStateException("Utility class");
    }

}
