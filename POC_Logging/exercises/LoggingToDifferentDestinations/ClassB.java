package LoggingToDifferentDestinations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassB {
    private static final Logger LOGGER = LoggerFactory.getLogger("ClassB");

    public void log(){
        LOGGER.info("This is a log message from Class B!");
    }
}
