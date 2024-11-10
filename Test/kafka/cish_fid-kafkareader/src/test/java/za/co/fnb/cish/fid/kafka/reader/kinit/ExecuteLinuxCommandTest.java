package za.co.fnb.cish.fid.kafka.reader.kinit;

import org.junit.Test;

public class ExecuteLinuxCommandTest {

    private ExecuteLinuxCommand executeLinuxCommand;

    @Test
    public void executeCommand() {
        executeLinuxCommand = new ExecuteLinuxCommand();
        executeLinuxCommand.executeCommand("");
    }
}