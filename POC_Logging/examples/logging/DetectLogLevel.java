package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

public class DetectLogLevel {
    private static final Logger LOGGER = LoggerFactory.getLogger("DetectLogLevel");

    public static void main(String[] args) {
        //if info is disabled, the message will be deleted
        //LOGGER.info("Result: {}", calculate());

        //all levels has isXEnable()
        if(LOGGER.isInfoEnabled()){
            LOGGER.info("Result: {}", calculate());
        }
        //another way
        if(LOGGER.isEnabledForLevel(Level.INFO)){
            LOGGER.info("Result: {}", calculate());
        }
    }
    //simulating calc
    private static int calculate(){
        System.out.println("Calculating...");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return 10;
    }
}
