package za.co.fnb.cish.fid.repo.model.events;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "eventlogs")
public class EventLogs {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "eventlogs_id_seq")
    @SequenceGenerator(name = "eventlogs_id_seq", sequenceName = "eventlogs_id_seq", allocationSize = 1)
    private long id;

    private long event_id;
    private String keyidentifiernumber;
    private String error_description;
    private boolean status;
    private Timestamp date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public long getEvent_id() {
        return event_id;
    }

    public void setEvent_id(long event_id) {
        this.event_id = event_id;
    }

    public String getError_description() {
        return error_description;
    }

    public void setError_description(String error_description) {
        this.error_description = error_description;
    }

    public String getKeyIdentifierNumber() {
        return keyidentifiernumber;
    }

    public void setKeyIdentifierNumber(String keyIdentifierNumber) {
        this.keyidentifiernumber = keyIdentifierNumber;
    }

    @Override
    public String toString() {
        return "EventLogs{" +
                "id=" + id +
                ", event_id=" + event_id +
                ", keyIdentifierNumber='" + keyidentifiernumber + '\'' +
                ", error_description='" + error_description + '\'' +
                ", event_status=" + status +
                ", date=" + date +
                '}';
    }
}
