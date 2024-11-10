package za.co.fnb.cish.fid.kafka.reader.kinit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author f2865912
 */
public class ExecuteLinuxCommand {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExecuteLinuxCommand.class);

    public String executeCommand(String command) {

        StringBuilder output = new StringBuilder();
        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader
                    = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
        } catch (Exception e) {
            LOGGER.error("Error occurred while trying to execute the command: {}", command, e);
        }
        return output.toString();
    }
}
