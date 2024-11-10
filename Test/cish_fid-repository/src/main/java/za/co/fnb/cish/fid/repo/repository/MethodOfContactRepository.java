package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.MethodOfContactEntity;

import java.util.List;

public interface MethodOfContactRepository extends JpaRepository<MethodOfContactEntity, Long> {

    List<MethodOfContactEntity> findByStmTpCd(String sourceCode);
}
