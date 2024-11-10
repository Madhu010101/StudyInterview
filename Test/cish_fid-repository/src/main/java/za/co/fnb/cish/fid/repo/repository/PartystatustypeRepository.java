package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.PartystatustypeEntity;

import java.util.List;

public interface PartystatustypeRepository extends JpaRepository<PartystatustypeEntity, Long> {

    List<PartystatustypeEntity> findByStmTpCd(String sourceCode);
}
