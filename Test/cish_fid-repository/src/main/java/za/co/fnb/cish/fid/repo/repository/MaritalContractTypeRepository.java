package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.MaritalContractTypeEntity;

import java.util.List;

public interface MaritalContractTypeRepository extends JpaRepository<MaritalContractTypeEntity, Long> {

    List<MaritalContractTypeEntity> findByStmTpCd(String sourceCode);
}
