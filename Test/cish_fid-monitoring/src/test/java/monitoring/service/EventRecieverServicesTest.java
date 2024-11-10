package monitoring.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.SliceImpl;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import za.co.fnb.cish.fid.monitoring.service.EventRecieverService;
import za.co.fnb.cish.fid.repo.model.events.EventLogs;
import za.co.fnb.cish.fid.repo.repository.events.EventLogsRepository;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class EventRecieverServicesTest {

    @Mock
    private EventLogsRepository eventLogsRepository;

    @Test
    public void testReadEvents() throws Exception{

        EventRecieverService eventRecieverService = new EventRecieverService();

        File file = new File("src/test/resources/eventFile/EventMonitoring_20230619.csv");
        byte[] bytes = Files.readAllBytes(file.toPath());
        String message = new String(bytes, StandardCharsets.UTF_8);
        Assert.assertNotNull("Events found",message);
    }
}
