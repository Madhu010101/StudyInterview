package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.BusinessRescueIndicatorEntity;

import java.util.List;

public interface BusinessRescueIndicatorRepository extends JpaRepository<BusinessRescueIndicatorEntity, Long> {

    List<BusinessRescueIndicatorEntity> findByStmTpCd(String sourceCode);
}
