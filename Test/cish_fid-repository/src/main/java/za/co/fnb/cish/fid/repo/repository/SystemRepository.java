package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.SystemEntity;

import java.util.List;

public interface SystemRepository extends JpaRepository<SystemEntity, Long> {

    List<SystemEntity> findByStmTpCd(String sourceCode);
}