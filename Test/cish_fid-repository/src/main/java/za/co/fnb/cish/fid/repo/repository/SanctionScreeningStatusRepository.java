package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.SanctionScreeningStatusEntity;

import java.util.List;

public interface SanctionScreeningStatusRepository extends JpaRepository<SanctionScreeningStatusEntity, Long> {

    List<SanctionScreeningStatusEntity> findByStmTpCd(String sourceCode);
}
