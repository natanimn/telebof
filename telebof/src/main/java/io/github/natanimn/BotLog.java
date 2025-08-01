package io.github.natanimn;
import java.util.logging.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

class LogFormatter extends Formatter {
    // ANSI escape code
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    @Override
    public String format(LogRecord record) {
        StringBuilder builder = new StringBuilder();
        builder.append(ANSI_CYAN);
        builder.append(calcDate(record.getMillis()));
        builder.append(" ");

        String levelName;
        String color;
        String textColor;

        if (record.getLevel().getName().equals("SEVERE")) {
            levelName = "ERROR";
            color = ANSI_RED;
            textColor = ANSI_RED;
        }

        else if (record.getLevel().getName().equals("CONFIG")) {
            levelName = "DEBUG";
            color = ANSI_GREEN;
            textColor = ANSI_WHITE;
        }

        else  if (record.getLevel().getName().equals("WARNING")){
            levelName = record.getLevel().getName();
            color = ANSI_YELLOW;
            textColor = ANSI_YELLOW;
        }

        else {
            levelName = record.getLevel().getName();
            color = ANSI_GREEN;
            textColor = ANSI_GREEN;
        }
        builder.append(color);
        builder.append("[");
        builder.append(levelName);
        builder.append("]");
        builder.append(" - ");
        builder.append(textColor);
        builder.append(record.getMessage());

        Object[] params = record.getParameters();

        if (params != null) {
            builder.append("\t");
            for (int i = 0; i < params.length; i++) {
                builder.append(params[i]);
                if (i < params.length - 1)
                    builder.append(", ");
            }
        }

        builder.append("\n");
        return builder.toString();
    }

    private String calcDate(long milli_sec) {
        SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date resultdate = new Date(milli_sec);
        return date_format.format(resultdate);
    }

}

/**
 * Natanim Negash
 *  3 March 2025
 */    /**
 * Natanim Negash
 *  3 March 2025
 */
public class BotLog {
    static Logger logger;

    static {
        logger = Logger.getLogger("Telebof");
        logger.setUseParentHandlers(false);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        Formatter formatter = new LogFormatter();
        handler.setFormatter(formatter);
        logger.addHandler(handler);
    }

    public static void info(String text){
        logger.info(text);
    }

    public static void error(String text){
        logger.severe(text);
    }

    public static void warn(String text){
        logger.warning(text);
    }

    public static void debug(String text){
        logger.config(text);
    }
}
