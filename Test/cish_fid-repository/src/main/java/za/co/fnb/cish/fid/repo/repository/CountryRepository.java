package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.CountryEntity;

import java.util.List;

public interface CountryRepository extends JpaRepository<CountryEntity, Long> {

    List<CountryEntity> findByStmTpCd(String sourceCode);
}
