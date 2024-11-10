package za.co.fnb.cish.fid.repo.model.events;

/*import jakarta.persistence.*;*/
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Regulatorylogs")
public class RegulatoryLogs {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reglogs_id_seq")
    @SequenceGenerator(name = "reglogs_id_seq", sequenceName = "reglogs_id_seq", allocationSize = 1)
    private long id;

    private long event_id;
    private String keyidentifiernumber;
    private String request;
    private String response;
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

    public String getKeyidentifiernumber() {
        return keyidentifiernumber;
    }

    public void setKeyidentifiernumber(String keyidentifiernumber) {
        this.keyidentifiernumber = keyidentifiernumber;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getKeyIdentifierNumber() {
        return keyidentifiernumber;
    }

    public void setKeyIdentifierNumber(String keyIdentifierNumber) {
        this.keyidentifiernumber = keyIdentifierNumber;
    }

    @Override
    public String toString() {
        return "RegulatoryLogs{" +
                "id=" + id +
                ", event_id=" + event_id +
                ", keyidentifiernumber='" + keyidentifiernumber + '\'' +
                ", request='" + request + '\'' +
                ", response='" + response + '\'' +
                ", status=" + status +
                ", date=" + date +
                '}';
    }
}
