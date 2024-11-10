package za.co.fnb.cish.fid.repo.repository.events;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.fnb.cish.fid.repo.model.events.SchedulerConfig;

import java.util.List;


@Repository
public interface SchedulerConfigRepository extends JpaRepository<SchedulerConfig,String> {

    List<SchedulerConfig> findAll();

}
