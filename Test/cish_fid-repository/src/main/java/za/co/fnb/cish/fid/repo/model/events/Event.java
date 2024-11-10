package za.co.fnb.cish.fid.repo.model.events;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "event_id_seq")
    @SequenceGenerator(name = "event_id_seq", sequenceName = "event_id_seq", allocationSize = 1)
    private long id;

    private String fid_messages;
    private String transformed_messages;
    private String event_type;
    private boolean event_status;
    private Timestamp date;
    private String keyidentifiernumber;
    private String service_ids;

    public String getKeyidentifiernumber() {
        return keyidentifiernumber;
    }

    public void setKeyidentifiernumber(String keyidentifiernumber) {
        this.keyidentifiernumber = keyidentifiernumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFid_messages() {
        return fid_messages;
    }

    public void setFid_messages(String fid_messages) {
        this.fid_messages = fid_messages;
    }

    public String getTransformed_messages() {
        return transformed_messages;
    }

    public void setTransformed_messages(String transformed_messages) {
        this.transformed_messages = transformed_messages;
    }

    public String getEvent_type() {
        return event_type;
    }

    public void setEvent_type(String event_type) {
        this.event_type = event_type;
    }

    public boolean isEvent_status() {
        return event_status;
    }

    public void setEvent_status(boolean event_status) {
        this.event_status = event_status;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getService_ids() {
        return service_ids;
    }

    public void setService_ids(String service_ids) {
        this.service_ids = service_ids;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", fid_messages='" + fid_messages + '\'' +
                ", transformed_messages='" + transformed_messages + '\'' +
                ", event_type='" + event_type + '\'' +
                ", event_status=" + event_status +
                ", date=" + date +
                ", keyidentifiernumber='" + keyidentifiernumber + '\'' +
                ", service_ids='" + service_ids + '\'' +
                '}';
    }
}
