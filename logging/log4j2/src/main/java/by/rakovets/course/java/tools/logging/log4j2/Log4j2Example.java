package by.rakovets.course.java.tools.logging.log4j2;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Example {
    private static final Logger logger = LogManager.getLogger(Log4j2Example.class);

    public static void main(String[] args) {
        logger.log(Level.DEBUG, "method `log()` with `Level.Debug'");
        logger.trace( "method `trace()`");
        logger.debug( "method `debug()`");
        logger.info( "method `info()`");
        logger.warn( "method `warn()`");
        logger.error( "method `error()`");
        logger.fatal( "method `fatal()`");
    }
}
