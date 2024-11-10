package za.co.fnb.cish.fid.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.fnb.cish.fid.repo.model.IndustrySpecialityType;

import java.util.List;


public interface IndustrySpecialityTypeRepository  extends JpaRepository<IndustrySpecialityType, Long> {

    List<IndustrySpecialityType> findByStmTpCd(String sourceCode);
}
