package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.OrganisationTypeEntity;

import java.util.List;

public interface OrganisationTypeRepository extends JpaRepository<OrganisationTypeEntity, Long> {
    List<OrganisationTypeEntity> findByStmTpCd(String sourceCode);
}
