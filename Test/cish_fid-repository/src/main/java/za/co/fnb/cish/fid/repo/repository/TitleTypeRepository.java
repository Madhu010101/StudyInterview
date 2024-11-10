package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.TitleTypeEntity;

import java.util.List;

public interface TitleTypeRepository extends JpaRepository<TitleTypeEntity, Long> {

    List<TitleTypeEntity> findByStmTpCd(String sourceCode);

}
