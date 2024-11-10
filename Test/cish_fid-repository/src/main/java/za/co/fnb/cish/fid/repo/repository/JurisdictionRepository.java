package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.JurisdictionEntity;

import java.util.List;

public interface JurisdictionRepository extends JpaRepository<JurisdictionEntity, Long> {

    List<JurisdictionEntity> findByStmTpCd(String sourceCode);
}
