package by.rakovets.course.java.tools.logging.slf4j;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jExample {
    private static final Logger logger = LoggerFactory.getLogger(Slf4jExample.class);

    public static void main(String[] args) {
        logger.trace("method `trace()`");
        logger.debug("method `debug()`");
        logger.info("method `info()`");
        logger.warn("method `warn()`");
        logger.error("method `error()`");
    }
}
