package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.OrganisationStatusTypeEntity;

import java.util.List;

public interface OrganisationStatusTypeRepository extends JpaRepository<OrganisationStatusTypeEntity, Long> {

    List<OrganisationStatusTypeEntity> findByStmTpCd(String sourceCode);
}
