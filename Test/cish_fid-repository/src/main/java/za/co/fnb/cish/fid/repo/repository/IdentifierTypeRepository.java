package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.IdentifierTypeEntity;

import java.util.List;

public interface IdentifierTypeRepository extends JpaRepository<IdentifierTypeEntity, Long> {

    List<IdentifierTypeEntity> findByStmTpCd(String sourceCode);
}
