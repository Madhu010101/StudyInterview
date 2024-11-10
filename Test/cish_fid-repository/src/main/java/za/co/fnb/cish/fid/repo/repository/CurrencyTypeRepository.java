package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.CurrencyTypeEntity;

public interface CurrencyTypeRepository extends JpaRepository<CurrencyTypeEntity, Long> {
}
