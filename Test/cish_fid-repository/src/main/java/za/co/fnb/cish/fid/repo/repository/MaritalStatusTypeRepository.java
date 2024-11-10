package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.MaritalStatusTypeEntity;

import java.util.List;

public interface MaritalStatusTypeRepository extends JpaRepository<MaritalStatusTypeEntity, Long> {

    List<MaritalStatusTypeEntity> findByStmTpCd(String sourceCode);
}
