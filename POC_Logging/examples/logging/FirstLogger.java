package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstLogger {
    private static final Logger LOGGER = LoggerFactory.getLogger(FirstLogger.class);

    public static void main(String[] args) {
        //log information
        LOGGER.info("This is my first log message");

        LOGGER.debug("This is a debug message");
    }
}
