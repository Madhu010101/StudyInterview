package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.TimeFrequencyTypeEntity;

public interface TimeFrequencyTypeRepository extends JpaRepository<TimeFrequencyTypeEntity, Long> {
}
