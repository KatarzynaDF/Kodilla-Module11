package com.kodilla.patterns.singleton;

public class Logger {

    private static Logger loggerInstance = null;

    private String lastLog = "";

    private Logger() {
    }

    public static Logger getInstance() {
        if (loggerInstance == null) {
            synchronized (Logger.class) {
                if (loggerInstance == null) {
                    loggerInstance = new Logger();
                }
            }
        }
        return loggerInstance;
    }

    public void open() {
        this.lastLog = lastLog;
        System.out.println("Opening the settings file");
    }

    public void close() {
        this.lastLog = "";
        System.out.println("Closing the settings file");
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}