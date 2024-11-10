package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.DebtCounsellingIndicatorEntity;

import java.util.List;

public interface DebtCounsellingIndicatorRepository extends JpaRepository<DebtCounsellingIndicatorEntity, Long> {

    List<DebtCounsellingIndicatorEntity> findByStmTpCd(String sourceCode);
}
