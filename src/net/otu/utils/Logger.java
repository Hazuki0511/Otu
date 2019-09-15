package net.otu.utils;

public class Logger {

    private static final Logger LOGGER = new Logger();

    public static Logger getLogger() {
        return LOGGER;
    }

    public void log(LogType type, String msg) {
        var typeText = this.getTypeText(type);

        System.out.println(typeText + " " + msg);
    }

    private String getTypeText(LogType type) {
        switch (type) {
            case INFO: {
                return "[INFO]";
            }
            case WARNING: {
                return "[WARNING]";
            }
            case ERROR: {
                return "[ERROR]";
            }
        }
        return null;
    }

    public enum LogType {
        INFO, WARNING, ERROR
    }

}