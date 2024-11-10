package za.co.fnb.cish.fid.common.api.fidmaster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Correlation {
    @JsonProperty
    private String correlationName;
    @JsonProperty
    private String correlationValue;


    public String getCorrelationName() {
        return correlationName;
    }

    public void setCorrelationName(String correlationName) {
        this.correlationName = correlationName;
    }

    public String getCorrelationValue() {
        return correlationValue;
    }

    public void setCorrelationValue(String correlationValue) {
        this.correlationValue = correlationValue;
    }
}
