package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.GeoAddressTypeEntity;

import java.util.List;

public interface GeoAddressTypeRepository extends JpaRepository<GeoAddressTypeEntity, Long> {

    List<GeoAddressTypeEntity> findByStmTpCd(String sourceCode);
}
