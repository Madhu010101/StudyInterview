package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.RoletypeEntity;

import java.util.List;

public interface RoletypeRepository extends JpaRepository<RoletypeEntity, Long> {

    List<RoletypeEntity> findByStmTpCd(String sourceCode);

}
