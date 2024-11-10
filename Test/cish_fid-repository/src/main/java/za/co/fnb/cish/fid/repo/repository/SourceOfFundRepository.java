package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.SourceOfFundEntity;

import java.util.List;

public interface SourceOfFundRepository extends JpaRepository<SourceOfFundEntity, Long> {

    List<SourceOfFundEntity> findByStmTpCd(String sourceCode);
}

