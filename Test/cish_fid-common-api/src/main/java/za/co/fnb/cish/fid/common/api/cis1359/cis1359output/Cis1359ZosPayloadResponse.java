package za.co.fnb.cish.fid.common.api.cis1359.cis1359output;

import com.fasterxml.jackson.annotation.*;

import jakarta.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "replyCode",
        "customerCompanyId",
        "customerNumber",
        "customerEchoToken",
        "warningTable"
})
@Generated("jsonschema2pojo")
public class Cis1359ZosPayloadResponse {

    @JsonProperty("replyCode")
    private Integer replyCode;
    @JsonProperty("customerCompanyId")
    private Integer customerCompanyId;
    @JsonProperty("customerNumber")
    private Long customerNumber;
    @JsonProperty("customerEchoToken")
    private String customerEchoToken;
    @JsonProperty("warningTable")
    private List<RegMaintenWarningTable> warningTable = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("replyCode")
    public Integer getReplyCode() {
        return replyCode;
    }

    @JsonProperty("replyCode")
    public void setReplyCode(Integer replyCode) {
        this.replyCode = replyCode;
    }

    @JsonProperty("customerCompanyId")
    public Integer getCustomerCompanyId() {
        return customerCompanyId;
    }

    @JsonProperty("customerCompanyId")
    public void setCustomerCompanyId(Integer customerCompanyId) {
        this.customerCompanyId = customerCompanyId;
    }

    @JsonProperty("customerNumber")
    public Long getCustomerNumber() {
        return customerNumber;
    }

    @JsonProperty("customerNumber")
    public void setCustomerNumber(Long customerNumber) {
        this.customerNumber = customerNumber;
    }

    @JsonProperty("customerEchoToken")
    public String getCustomerEchoToken() {
        return customerEchoToken;
    }

    @JsonProperty("customerEchoToken")
    public void setCustomerEchoToken(String customerEchoToken) {
        this.customerEchoToken = customerEchoToken;
    }

    @JsonProperty("warningTable")
    public List<RegMaintenWarningTable> getWarningTable() {
        return warningTable;
    }

    @JsonProperty("warningTable")
    public void setWarningTable(List<RegMaintenWarningTable> warningTable) {
        this.warningTable = warningTable;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
