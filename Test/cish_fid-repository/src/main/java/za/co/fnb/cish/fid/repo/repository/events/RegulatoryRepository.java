package za.co.fnb.cish.fid.repo.repository.events;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import za.co.fnb.cish.fid.repo.model.events.RegulatoryLogs;

import java.sql.Timestamp;
import java.util.List;
import org.springframework.data.domain.Pageable;


@Repository
@Transactional
public interface RegulatoryRepository extends JpaRepository<RegulatoryLogs, Long> {
    @Query("select r from RegulatoryLogs r where r.status = ?1 order by r.date asc")
    //List<RegulatoryLogs> findByStatus(boolean status, Pageable p);
    Page<RegulatoryLogs> findByStatus(boolean status, Pageable p);

    @Modifying
    @Query("UPDATE RegulatoryLogs r SET r.status = :value WHERE r.id IN :ids")
    int updateStatusForIds(@Param("value") boolean status, @Param("ids") List<Long> ids);

    @Query("select r from RegulatoryLogs r where r.status = :status AND r.date < :cutOffDate")
    Page<RegulatoryLogs> findByStatusAndDate(@Param("cutOffDate") Timestamp cutOffDate, @Param("status") boolean status, Pageable p);
}
