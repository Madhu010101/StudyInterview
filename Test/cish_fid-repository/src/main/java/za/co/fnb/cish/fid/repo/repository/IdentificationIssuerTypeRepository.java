package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.IdentificationIssuerTypeEntity;

public interface IdentificationIssuerTypeRepository  extends JpaRepository<IdentificationIssuerTypeEntity, Long> {

}