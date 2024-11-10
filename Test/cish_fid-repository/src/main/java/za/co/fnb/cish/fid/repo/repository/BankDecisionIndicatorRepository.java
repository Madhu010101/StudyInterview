package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.BankDecisionIndicatorEntity;

import java.util.List;

public interface BankDecisionIndicatorRepository extends JpaRepository<BankDecisionIndicatorEntity, Long> {

    List<BankDecisionIndicatorEntity> findByStmTpCd(String sourceCode);
}
