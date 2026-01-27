package io.github.natanimn.telebof.log;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Log Writer
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class BotLog {
    private static final Logger logger;

    static {
        logger = Logger.getLogger("io.github.natanimn");
        logger.setUseParentHandlers(false);

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.WARNING);
        handler.setFormatter(new LogFormatter(true));

        logger.addHandler(handler);

        String prop = System.getProperty("telebof.logLevel");
        if (prop != null) {
            try {
                Level level = Level.parse(prop.toUpperCase());
                logger.setLevel(level);
                handler.setLevel(level);
            } catch (IllegalArgumentException e) {
                logger.setLevel(Level.WARNING);
                handler.setLevel(Level.WARNING);
            }
        }
    }

    public static void setLogLevel(Level level) {
        logger.setLevel(level);
        for (Handler h : logger.getHandlers()) {
            h.setLevel(level);
        }
    }

    public static void info(String msg) {
        logger.log(Level.INFO, msg);
    }

    public static void warn(String msg) {
        logger.log(Level.WARNING, msg);
    }

    public static void error(String msg) {
        logger.log(Level.SEVERE, msg);
    }

    public static void debug(String msg) {
        logger.log(Level.CONFIG, msg);
    }
}
