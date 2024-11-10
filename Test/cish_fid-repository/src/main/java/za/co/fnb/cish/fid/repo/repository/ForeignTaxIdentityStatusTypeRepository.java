package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.ForeignTaxIdentityStatusTypeEntity;

import java.util.List;

public interface ForeignTaxIdentityStatusTypeRepository extends JpaRepository<ForeignTaxIdentityStatusTypeEntity, Long> {

    List<ForeignTaxIdentityStatusTypeEntity> findByStmTpCd(String sourceCode);
}
