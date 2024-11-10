package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.OrgCategoryTypeEntity;

import java.util.List;

public interface OrgCategoryTypeRepository extends JpaRepository<OrgCategoryTypeEntity, Long> {

    List<OrgCategoryTypeEntity> findByStmTpCd(String var1);

}
