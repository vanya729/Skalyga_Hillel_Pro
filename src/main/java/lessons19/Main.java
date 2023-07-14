package lessons19;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File logFile = new File("log.txt");
        DataTransformer dataTransformer = new DataTransformer();
        String convertedDate=  dataTransformer.convert();
        LoggingLevel loggingLevel = LoggingLevel.DEBUG;
        LoggingLevel loggingLevel1 = LoggingLevel.INFO;
        long maxSize = 1024;
        String format = "[%s][%s]%s";

        FileLoggerConfiguration config = new FileLoggerConfiguration(logFile, loggingLevel, maxSize, format);
        FileLoggerConfiguration config1 = new FileLoggerConfiguration(logFile, loggingLevel1, maxSize, format);
        FileLogger logger = new FileLogger(config);
        FileLogger logger1 = new FileLogger(config1);

        System.out.println("Converted date: " + convertedDate);
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger1.debug("This is a debug message");
        logger1.info("This is an info message");
    }
}
