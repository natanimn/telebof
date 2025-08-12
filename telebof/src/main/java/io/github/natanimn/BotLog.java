package io.github.natanimn;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

/**
 * Log writer
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
class LogFormatter extends Formatter {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private final boolean useColor;

    public LogFormatter(boolean useColor) {
        this.useColor = useColor;
    }

    @Override
    public String format(LogRecord record) {
        StringBuilder builder = new StringBuilder();

        String date = calcDate(record.getMillis());
        String levelName;
        String color = "";
        String reset = "";

        if (useColor) reset = ANSI_RESET;

        switch (record.getLevel().getName()) {
            case "SEVERE":
                levelName = "ERROR";
                if (useColor) color = ANSI_RED;
                break;
            case "CONFIG":
                levelName = "DEBUG";
                if (useColor) color = ANSI_WHITE;
                break;
            case "WARNING":
                levelName = "WARN";
                if (useColor) color = ANSI_YELLOW;
                break;
            default:
                levelName = record.getLevel().getName();
                if (useColor) color = ANSI_GREEN;
                break;
        }

        String caller = getCallerClassName();

        builder.append(useColor ? ANSI_CYAN : "")
                .append(date).append(" ")
                .append(color)
                .append("[Telebof][").append(levelName).append("]")
                .append(reset).append(" ")
                .append(caller)
                .append(" - ")
                .append(record.getMessage())
                .append("\n");

        return builder.toString();
    }

    private String calcDate(long millis) {
        String pattern = System.getProperty("telebof.dateFormat", "yyyy-MM-dd HH:mm:ss");
        return new SimpleDateFormat(pattern).format(new Date(millis));
    }

    private String getCallerClassName() {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        boolean foundLoggerClass = false;

        for (StackTraceElement element : stack) {
            String className = element.getClassName();
            if (className.equals(BotLog.class.getName()) || className.startsWith("java.util.logging")) {
                foundLoggerClass = true;
                continue;
            }
            if (foundLoggerClass) {
                return className.substring(className.lastIndexOf('.') + 1);
            }
        }
        return "UnknownClass";
    }
}

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
