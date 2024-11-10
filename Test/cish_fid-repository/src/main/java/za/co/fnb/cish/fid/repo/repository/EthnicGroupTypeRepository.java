package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.EthnicGroupTypeEntity;

import java.util.List;

public interface EthnicGroupTypeRepository extends JpaRepository<EthnicGroupTypeEntity, Long> {

    List<EthnicGroupTypeEntity> findByStmTpCd(String sourceCode);
}
