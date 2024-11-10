package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.SicTypeEntity;

import java.util.List;

public interface SicTypeRepository extends JpaRepository<SicTypeEntity, Long> {

    List<SicTypeEntity> findByStmTpCd(String sourceCode);
}
