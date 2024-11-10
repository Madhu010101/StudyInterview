package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.QualificationSpecialityTypeEntity;

import java.util.List;

public interface QualificationSpecialityTypeRepository extends JpaRepository<QualificationSpecialityTypeEntity, Long> {
    List<QualificationSpecialityTypeEntity> findByStmTpCd(String sourceCode);
}

