package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.PropertyOwnershipTypeEntity;

import java.util.List;

public interface PropertyOwnershipTypeRepository extends JpaRepository<PropertyOwnershipTypeEntity, Long> {

    List<PropertyOwnershipTypeEntity> findByStmTpCd(String sourceCode);
}
