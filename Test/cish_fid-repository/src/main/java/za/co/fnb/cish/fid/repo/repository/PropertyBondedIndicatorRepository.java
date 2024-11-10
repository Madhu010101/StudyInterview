package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.PropertyBondedIndicatorEntity;

import java.util.List;

public interface PropertyBondedIndicatorRepository extends JpaRepository<PropertyBondedIndicatorEntity, Long> {

    List<PropertyBondedIndicatorEntity> findByStmTpCd(String sourceCode);
}
