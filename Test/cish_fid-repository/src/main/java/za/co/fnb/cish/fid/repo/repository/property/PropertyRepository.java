package za.co.fnb.cish.fid.repo.repository.property;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.fnb.cish.fid.repo.model.property.Property;

//import java.util.List;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {

   // List<Property> findById(String sourceCode);

}
