package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.ForeignTaxIdentityClassTypeEntity;

import java.util.List;

public interface ForeignTaxIdentityClassTypeRepository extends JpaRepository<ForeignTaxIdentityClassTypeEntity, Long> {

    List<ForeignTaxIdentityClassTypeEntity> findByStmTpCd(String sourceCode);
}
