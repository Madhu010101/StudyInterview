package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.NameTypeEntity;

public interface NameTypeRepository extends JpaRepository<NameTypeEntity, Long> {

}