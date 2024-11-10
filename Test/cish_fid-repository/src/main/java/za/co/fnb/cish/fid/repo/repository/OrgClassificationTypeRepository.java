package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.OrgClassificationTypeEntity;

public interface OrgClassificationTypeRepository extends JpaRepository<OrgClassificationTypeEntity, Long> {

}