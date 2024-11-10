package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.ForeignTaxLiabilityTypeEntity;

import java.util.List;

public interface ForeignTaxLiabilityTypeRepository extends JpaRepository<ForeignTaxLiabilityTypeEntity, Long> {

    List<ForeignTaxLiabilityTypeEntity> findByStmTpCd(String sourceCode);
}
