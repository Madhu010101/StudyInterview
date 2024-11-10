package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.KycStatusTypeEntity;

import java.util.List;

public interface KycStatusTypeRepository extends JpaRepository<KycStatusTypeEntity, Long> {

    List<KycStatusTypeEntity> findByStmTpCd(String sourceCode);
}
