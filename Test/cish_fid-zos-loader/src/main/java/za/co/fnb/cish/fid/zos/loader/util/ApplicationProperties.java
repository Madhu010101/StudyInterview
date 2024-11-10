package za.co.fnb.cish.fid.zos.loader.util;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.fnb.cish.fid.repo.model.property.Property;
import za.co.fnb.cish.fid.repo.repository.property.PropertyRepository;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class ApplicationProperties {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationProperties.class);
    Set<Property> propertiesSet = new HashSet<>();
    private PropertyRepository propertyRepository;

    @PostConstruct
    public void initialize() {
        List<Property> propertiesList = propertyRepository.findAll();
        propertiesSet = propertiesList.stream().collect(Collectors.toSet());
        LOGGER.info("propertiesSet:{}", propertiesSet);
    }

    public Set<Property> getPropertiesSet() {
        return propertiesSet;
    }

    public Property getServiceID(String serviceName) {
        Property property = new Property();
        for (Property prop : propertiesSet) {
            if (prop.getService_name().equalsIgnoreCase(serviceName)) {
                property = prop;
            }

        }
        // property = (Property) propertiesSet.stream().filter(property1 -> property1.getService_name().equalsIgnoreCase(serviceName));
        return property;
    }

    public Map<Integer, Long> getproperty() {
        Map<Integer,Long> property = new HashMap();
        for (Property prop : propertiesSet) {
            property.put((int) prop.getId(),prop.getStand_in());

        }

        return property;
    }

    public List<Long> getFIdIds() {
        Map<Long,String> fidIds = new HashMap();

        fidIds = propertiesSet.stream().filter(p -> ((p.getService_name().equalsIgnoreCase(Constants.CORE_MAINTENANCE)) || p.getService_name().equalsIgnoreCase(Constants.REG_MAINTENANCE)) ).collect(Collectors.toMap(Property::getId,Property::getService_name));
        List<Long> propServsList = fidIds.keySet().stream().toList();

        return propServsList;
    }

    @Autowired
    public void setApplicationRepository(PropertyRepository propRepository) {
        this.propertyRepository = propRepository;
    }


}
