package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.PartyLocationRelationshipEntity;

import java.util.List;

public interface PartyLocationRelationshipRepository extends JpaRepository<PartyLocationRelationshipEntity, Long> {

    List<PartyLocationRelationshipEntity> findByStmTpCd(String sourceCode);
}

