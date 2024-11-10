package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.LocationTypeEntity;

import java.util.List;

public interface LocationTypeRepository extends JpaRepository<LocationTypeEntity, Long> {

    List<LocationTypeEntity> findByStmTpCd(String sourceCode);
}
