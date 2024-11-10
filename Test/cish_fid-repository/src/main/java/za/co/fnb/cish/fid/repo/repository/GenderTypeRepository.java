package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.GenderTypeEntity;

import java.util.List;

public interface GenderTypeRepository extends JpaRepository<GenderTypeEntity, Long> {

    List<GenderTypeEntity> findByStmTpCd(String sourceCode);
}
