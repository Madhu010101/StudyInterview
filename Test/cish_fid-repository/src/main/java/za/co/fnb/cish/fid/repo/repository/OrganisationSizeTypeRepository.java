package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.OrganisationSizeTypeEntity;

import java.util.List;

public interface OrganisationSizeTypeRepository extends JpaRepository<OrganisationSizeTypeEntity, Long> {

    List<OrganisationSizeTypeEntity> findByStmTpCd(String sourceCode);
}
