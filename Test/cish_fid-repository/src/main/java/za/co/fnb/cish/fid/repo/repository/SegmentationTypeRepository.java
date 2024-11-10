package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.SegmentationTypeEntity;

import java.util.List;

public interface SegmentationTypeRepository extends JpaRepository<SegmentationTypeEntity, Long> {

    List<SegmentationTypeEntity> findByStmTpCd(String sourceCode);

}
