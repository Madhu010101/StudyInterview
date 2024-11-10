package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.OccupationTypeEntity;

import java.util.List;

public interface OccupationTypeRepository extends JpaRepository<OccupationTypeEntity, Long> {

    List<OccupationTypeEntity> findByStmTpCd(String sourceCode);
}
