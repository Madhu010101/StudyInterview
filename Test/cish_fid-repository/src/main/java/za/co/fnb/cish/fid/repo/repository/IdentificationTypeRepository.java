package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.IdentificationTypeEntity;

import java.util.List;

public interface IdentificationTypeRepository extends JpaRepository<IdentificationTypeEntity, Long> {

    List<IdentificationTypeEntity> findByStmTpCd(String sourceCode);
}
