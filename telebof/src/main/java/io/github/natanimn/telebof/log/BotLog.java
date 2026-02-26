package io.github.natanimn.telebof.log;

import java.text.MessageFormat;
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

    public static void info(String msg, Object... args) {
        if (logger.isLoggable(Level.INFO))
            logger.log(Level.INFO, MessageFormat.format(msg, args));
    }

    public static void warn(String msg, Object...args) {
        if (logger.isLoggable(Level.WARNING))
            logger.log(Level.WARNING, MessageFormat.format(msg, args));
    }

    public static void error(String msg, Object... args) {
        if (logger.isLoggable(Level.SEVERE))
            logger.log(Level.SEVERE, MessageFormat.format(msg, args));
    }

    public static void debug(String msg, Object... args) {
        if (logger.isLoggable(Level.CONFIG))
            logger.log(Level.CONFIG, MessageFormat.format(msg, args));
    }
}
