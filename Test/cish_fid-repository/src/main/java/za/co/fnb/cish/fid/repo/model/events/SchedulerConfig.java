package za.co.fnb.cish.fid.repo.model.events;


import jakarta.persistence.*;

@Entity
@Table(name = "schedulerConfig")
public class SchedulerConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "scheduler_id_seq")
    @SequenceGenerator(name = "scheduler_id_seq", sequenceName = "scheduler_id_seq", allocationSize = 1)
    private long id;

    private String scheduler_name;
    private String scheduler_value;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getScheduler_name() {
        return scheduler_name;
    }

    public void setScheduler_name(String scheduler_id) {
        this.scheduler_name = scheduler_id;
    }

    public String getScheduler_value() {
        return scheduler_value;
    }

    public void setScheduler_value(String value) {
        this.scheduler_value = value;
    }

    @Override
    public String toString() {
        return "scheduler{" +
                "id=" + id +
                ", scheduler_id=" + scheduler_name +
                ", value='" + scheduler_value +
                '}';
    }
}
