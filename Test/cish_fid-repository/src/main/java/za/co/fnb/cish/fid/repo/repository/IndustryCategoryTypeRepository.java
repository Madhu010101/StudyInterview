package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.IndustryCategoryTypeEntity;

import java.util.List;

public interface IndustryCategoryTypeRepository extends JpaRepository<IndustryCategoryTypeEntity, Long> {

    List<IndustryCategoryTypeEntity> findByStmTpCd(String sourceCode);
}
