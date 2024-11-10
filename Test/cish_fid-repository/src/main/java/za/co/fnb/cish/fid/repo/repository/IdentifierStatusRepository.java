package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.IdentifierStatusEntity;

import java.util.List;

public interface IdentifierStatusRepository extends JpaRepository<IdentifierStatusEntity, Long> {

    List<IdentifierStatusEntity> findByStmTpCd(String sourceCode);
}
