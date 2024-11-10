package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.DepositTakingInstitutionTypeEntity;

import java.util.List;

public interface DepositTakingInstitutionTypeRepository extends JpaRepository<DepositTakingInstitutionTypeEntity, Long> {

    List<DepositTakingInstitutionTypeEntity> findByStmTpCd(String sourceCode);
}
