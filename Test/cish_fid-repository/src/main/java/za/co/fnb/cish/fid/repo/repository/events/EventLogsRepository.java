package za.co.fnb.cish.fid.repo.repository.events;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import za.co.fnb.cish.fid.repo.model.events.EventLogs;

import java.sql.Timestamp;
import java.util.List;

@Repository
@Transactional
public interface EventLogsRepository extends JpaRepository<EventLogs, Long> {

    @Query("select a from EventLogs a where a.status = ?1 order by a.date asc")
    Page<EventLogs> findByStatus(boolean status, Pageable p);

    @Modifying
    @Query("UPDATE EventLogs e SET e.status = :value WHERE e.id IN :ids")
    int updateStatus(@Param("value") boolean status, @Param("ids") List<Long> ids);

    @Query("select e from EventLogs e where e.status = :status AND e.date < :cutOffDate")
    Page<EventLogs> findByStatusAndDate(@Param("cutOffDate") Timestamp cutOffDate, @Param("status") boolean status, Pageable p);

//    @Query("select a from Event a where a.event_status = ?1")
//    List<Event> findBySatus(boolean eventStatus);
//
//    @Query("select a from Event a where a.event_status = ?1")
//    Event updateStatus(Boolean aFalse);


  /*  @Query("select a from Event a where a.event_status = ?1 and  a.traceID = ?2 and a.datetime > ?3 and a.letterType = ?4 order by a.datetime desc")
    List<DocReference> findByAccountAndTraceId(String accountNumber, String traceID, LocalDateTime dateTime, Integer letterTypeCd, Pageable pageable);*/

}
