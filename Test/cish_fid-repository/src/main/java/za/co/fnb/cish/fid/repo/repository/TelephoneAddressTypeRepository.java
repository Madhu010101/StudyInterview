package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.TelephoneAddressTypeEntity;

import java.util.List;

public interface TelephoneAddressTypeRepository extends JpaRepository<TelephoneAddressTypeEntity, Long> {

    List<TelephoneAddressTypeEntity> findByStmTpCd(String sourceCode);
}
