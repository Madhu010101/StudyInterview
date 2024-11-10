package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.TurnoverTypeEntity;

import java.util.List;

public interface TurnoverTypeRepository extends JpaRepository<TurnoverTypeEntity, Long> {

    List<TurnoverTypeEntity> findByStmTpCd(String sourceCode);

}
