package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.StateProvinceEntity;

import java.util.List;

public interface StateProvinceRepository extends JpaRepository<StateProvinceEntity, Long> {

    List<StateProvinceEntity> findByStmTpCd(String sourceCode);
}

