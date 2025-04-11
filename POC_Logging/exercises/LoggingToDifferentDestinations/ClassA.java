package LoggingToDifferentDestinations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassA {
    private static final Logger LOGGER = LoggerFactory.getLogger("ClassA");

    public void log(){
        LOGGER.info("This is a log message from Class A!");
    }
}
