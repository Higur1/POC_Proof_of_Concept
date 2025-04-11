package appenders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RollingFileAppender {
    private static final Logger LOGGER = LoggerFactory.getLogger("RollingFileAppender");
    public static void main(String[] args) {
        LOGGER.trace("TRACE()");
        LOGGER.debug("DEBUG()");
        LOGGER.info("INFO()");
        LOGGER.warn("WARN()");
        LOGGER.error("ERROR()");
    }
}
