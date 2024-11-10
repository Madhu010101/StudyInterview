package monitoring.service;

import org.hibernate.query.sql.internal.ParameterRecognizerImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.SliceImpl;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import za.co.fnb.cish.fid.monitoring.service.RegulatoryReceiverService;
import za.co.fnb.cish.fid.repo.model.events.RegulatoryLogs;
import za.co.fnb.cish.fid.repo.repository.events.RegulatoryRepository;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class RegulatoryServiceTest {

    @Mock
    private RegulatoryRepository regulatoryRepository;

    @Mock
    private RegulatoryReceiverService regulatoryReceiverService;

    @Test
    public void testReadRegulatoryMessage() throws Exception{
        regulatoryReceiverService = new RegulatoryReceiverService();

        File file = new File("src/test/resources/regulatoryFile/RegMonitoring_20230619.csv");
        byte[] bytes = Files.readAllBytes(file.toPath());
        String message = new String(bytes, StandardCharsets.UTF_8);

        Assert.assertNotNull(message);
    }
}
