package za.co.fnb.cish.fid.topic.processor.util;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static za.co.fnb.cish.fid.topic.processor.util.Constants.IBM_NULL_VALUE;

import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import za.co.fnb.cish.fid.common.api.fidmaster.*;

@ContextConfiguration(classes = {FirstIdMasterSourceMapper.class})
@ExtendWith(SpringExtension.class)
public class FirstIdMasterSourceMapperTest {

    @Autowired
    private FirstIdMasterSourceMapper firstIdMasterSourceMapper;

    @MockBean(name = "CISReferenceDataUtil")
    private CISReferenceDataUtil cISReferenceDataUtil;

    private ObjectMapper mapper;
    private FirstIdMasterEntity firstId ;


    @Test
    public void testConstructor() {

        FirstIdMasterSourceMapper actualFirstIdMasterSourceMapper = new FirstIdMasterSourceMapper();
        actualFirstIdMasterSourceMapper.setCisReferenceDataUtil(new CISReferenceDataUtil());
    }

    @Test
    public void testCalculateMonths() {
        assertEquals(0L, FirstIdMasterSourceMapper.CalculateMonths("20200301", "20200301"));
    }




    @org.junit.jupiter.api.Test
    @DisplayName("Test for individual")
    void testMap() throws Exception {
        mapper = new ObjectMapper();
        File file = new File("src/test/resources/individual.json");
        Message message1 = mapper.readValue(file, Message.class);
        FirstIdMasterEntity firstId = mapper.readValue(message1.getValue(),FirstIdMasterEntity.class);
        za.env.raw.opm.firstidmasterentity.FirstIdMasterEntity result = firstIdMasterSourceMapper.map(firstId);
        Assertions.assertEquals("JHBANNESBURG",result.getParty().getIndividual().getBirthCityName());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Test for organisation")
    void testMapOrganisation() throws Exception {
        mapper = new ObjectMapper();
        File file = new File("src/test/resources/organisation.json");
        Message message1 = mapper.readValue(file, Message.class);
        FirstIdMasterEntity firstId = mapper.readValue(message1.getValue(),FirstIdMasterEntity.class);
        za.env.raw.opm.firstidmasterentity.FirstIdMasterEntity result = firstIdMasterSourceMapper.map(firstId);
        Assertions.assertEquals("JHBANNESBURG",result.getParty().getIndividual().getBirthCityName());
    }
}

