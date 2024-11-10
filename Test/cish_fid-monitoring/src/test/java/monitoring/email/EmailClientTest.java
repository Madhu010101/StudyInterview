package monitoring.email;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import za.co.fnb.cish.fid.monitoring.email.EmailClient;

import java.io.File;
import java.util.logging.Logger;

import static org.mockito.Mockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class EmailClientTest {

    @Autowired
    private EmailClient emailClient;

    @Mock
    private Logger logger;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    public static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(EmailClient.class);

    @Test
    public void sendEmailTest(){
        //SendEmail sendEmail = emailClient.sendEmail();
    }

    @Test
    public void testDelete(){
        long nday = 3;
        String dirPath = "cish_fid-monitoring/src/test/monitor/incoming";
        String extension = ".txt";

        File mockFolder = mock(File.class);
        when(mockFolder.exists()).thenReturn(true);

        File fileOlder = mock(File.class);
        when(fileOlder.getName()).thenReturn("fileOlder.txt");
        when(fileOlder.lastModified()).thenReturn(System.currentTimeMillis() - (6 * 24 * 60 * 60 * 1000));
        when(fileOlder.delete()).thenReturn(true);

        File fileNewer = mock(File.class);
        when(fileNewer.getName()).thenReturn("fileNewer.txt");
        when(fileNewer.lastModified()).thenReturn(System.currentTimeMillis() - (4 * 24 * 60 * 60 * 1000));
        when(fileNewer.delete()).thenReturn(true);

        when(mockFolder.listFiles()).thenReturn(new File[]{fileOlder, fileNewer});

        delete(nday,dirPath,extension);
        Assert.assertNotNull(fileNewer);
        Assert.assertTrue(fileOlder.delete());

    }
    public void delete(long nday, String dirPath,String extension) {
        LOGGER.info("Start Seven day old delete file");
        File fold = new File(dirPath);
        if (fold.exists()) {
            File[] listAllFiles = fold.listFiles();
            long count = System.currentTimeMillis() -
                    (nday * 24 * 60 * 60 * 1000);
            for (File listFile : listAllFiles) {

                if (listFile.getName().endsWith(extension) &&
                        listFile.lastModified() < count) {
                    if (!listFile.delete()) {
                        logger.info("Sorry can't delete");
                    }
                }
            }
        }
        LOGGER.info("End Five day old deleting file");
    }
}
