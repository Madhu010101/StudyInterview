package za.co.fnb.cish.fid.kafka.reader.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author f2865912
 */
public class TopicProcessor {

    @JsonProperty
    private String topic;

    @JsonProperty
    private String key;

    @JsonProperty
    private String value;

    public TopicProcessor() {
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
