package za.co.fnb.cish.fid.repo.repository.events;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;
import za.co.fnb.cish.fid.repo.model.events.Event;

import java.util.List;

@Repository
public interface EventRepository  extends JpaRepository<Event, Long>, EventRepositoryCustom{


    @Query("select a from Event a where a.event_status = ?1 order by a.date asc")
    List<Event> findBySatus(boolean eventStatus, Pageable pageable);

    @Query("select a from Event a where a.event_status = ?1")
    Event updateStatus(Boolean aFalse);

  /*  @Query("select a from Event a where a.event_status = ?1 and  a.traceID = ?2 and a.datetime > ?3 and a.letterType = ?4 order by a.datetime desc")
    List<DocReference> findByAccountAndTraceId(String accountNumber, String traceID, LocalDateTime dateTime, Integer letterTypeCd, Pageable pageable);*/

}
