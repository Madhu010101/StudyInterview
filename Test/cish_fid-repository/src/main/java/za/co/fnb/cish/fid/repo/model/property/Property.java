package za.co.fnb.cish.fid.repo.model.property;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "property")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prop_id_seq")
    @SequenceGenerator(name = "prop_id_seq", sequenceName = "prop_id_seq", allocationSize = 1)
    private long id;

    private String service_name;
    private long stand_in;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public long getStand_in() {
        return stand_in;
    }

    public void setStand_in(long stand_in) {
        this.stand_in = stand_in;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", service_name='" + service_name + '\'' +
                ", stand_in=" + stand_in +
                '}';
    }
}
