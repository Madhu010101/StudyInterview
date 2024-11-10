package za.co.fnb.cish.fid.topic.processor.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constants {
    public static final String RETRY_COUNTER = "retryCounter";
    public static final Integer DB_CONNECTION_SLEEP = 5000;
    public static final String DB_CONNECT_ERROR_MSG = "DB connection error occurred while processing topic processor record, messsageId = {} ";
    public static final String DB_CONNECT_ATTEMPT = "Unable to acquire DB connection, Attempt Number : {} ";
    public static final String FAILURE_CAUSE = "FailureCause";
    public static final String STRING_ZERO = "0";
    public static final Integer INTEGER_ZERO = 0;
    public static final String STRING_NEGATIVE_ONE = "-1";
    public static final Integer INTEGER_NEGATIVE_ONE = -1;
    public static final String IDFR_TP_CD = "UCN";
    public static final String IBM_NULL_VALUE = "\\\\u0000";
    public static final String DLQ = "DLQ.";
    public static final ArrayList<Integer> priority = new ArrayList<>(Arrays.asList(9, 12, 43, 50, 44, 71, 41, 72));
    public static final ArrayList<String> IDTYPE_ISSUER_CONTRY = new ArrayList<>(Arrays.asList("2", "5", "8", "9"));
    public static final String STAR_CHARACTER = "*";
    public static final String IDENTIFIER_SYSTEM_TYPE_CODE = "CIS";
    public static final String INACTIVE_MERGE_IDENTIFIER = "4";
    public static final String YES = "Y";
    public static final String NO = "N";

    public static final Integer IND = 01;
    public static final Integer ORG = 02;

    public static final Integer PARTYCLASSIFICATIONTYPECODE=1;
    public static final Integer ORGANISATIONCLASSIFICATIONTYPECODE=2;

    public static final String SPLIT_CONSTANT ="Z";
    public static final List<String> ORG_TYPES = Arrays.asList("31", "37", "42", "54");
    public static final List<Integer> EMPLOYMENT_STATUS_TYPE = Arrays.asList(2,3,null,0,-1,-2);

    public static final String OCCUPATION_TYPE_RETIRED = "RT";
    public static final String EXPIRYDATE = "20991231";

    public static final ArrayList<Integer> GOVERNMENT_QUASI = new ArrayList<>(Arrays.asList(6,4));
    public static final ArrayList<Integer> FOREIGN_BANK = new ArrayList<>(Arrays.asList(13,4));
    public static final ArrayList<Integer> REGISTERED_TRUST = new ArrayList<>(Arrays.asList(17));
    public static final ArrayList<Integer> OTHER = new ArrayList<>(Arrays.asList(4));

    public static final Integer RT =9;
    public static final Integer GQ =12;
    public static final Integer FR =35;
    public static final String CONTAINER_CONST="-2";
    public static final String STRING_BLANK = "";
    public static final List<String> DEFAULT_MAPPING = Arrays.asList("0", "-1", "-2");
}
