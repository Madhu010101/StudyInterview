package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.HighestQualificationTypeEntity;

import java.util.List;

public interface HighestQualificationTypeRepository extends JpaRepository<HighestQualificationTypeEntity, Long> {
    List<HighestQualificationTypeEntity> findByStmTpCd(String sourceCode);
}
