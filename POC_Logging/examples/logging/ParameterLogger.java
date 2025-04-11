package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterLogger {
    private static final Logger LOGGER = LoggerFactory.getLogger(ParameterLogger.class);

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        //LOGGER.info("X = " + x + " Y = "+y); //wrong
        LOGGER.info("X = {}; Y = {}", x,y); //right way
    }
}
