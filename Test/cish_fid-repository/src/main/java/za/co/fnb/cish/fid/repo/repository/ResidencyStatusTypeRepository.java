package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.ResidencyStatusTypeEntity;

import java.util.List;

public interface ResidencyStatusTypeRepository extends JpaRepository<ResidencyStatusTypeEntity, Long> {

    List<ResidencyStatusTypeEntity> findByStmTpCd(String sourceCode);

}
