package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.PartyStatureTypeEntity;

import java.util.List;

public interface PartyStatureTypeRepository extends JpaRepository<PartyStatureTypeEntity, Long> {

    List<PartyStatureTypeEntity> findByStmTpCd(String sourceCode);
}
