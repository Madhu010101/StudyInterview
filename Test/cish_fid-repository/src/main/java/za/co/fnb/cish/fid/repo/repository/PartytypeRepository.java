package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.PartytypeEntity;

import java.util.List;

public interface PartytypeRepository extends JpaRepository<PartytypeEntity, Long> {

    List<PartytypeEntity> findByStmTpCd(String sourceCode);

}
