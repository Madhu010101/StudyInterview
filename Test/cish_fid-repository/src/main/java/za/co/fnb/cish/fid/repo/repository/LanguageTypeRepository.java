package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.LanguageTypeEntity;

import java.util.List;

public interface LanguageTypeRepository extends JpaRepository<LanguageTypeEntity, Long> {

    List<LanguageTypeEntity> findByStmTpCd(String sourceCode);
}
