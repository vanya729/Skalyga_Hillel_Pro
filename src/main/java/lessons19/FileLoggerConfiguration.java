package lessons19;

import java.io.File;

public class FileLoggerConfiguration {

    private File file;
    private LoggingLevel level;
    private long maxFileSize;
    private String logFormat;

    public FileLoggerConfiguration(File file, LoggingLevel currentLevel, long maxFileSize, String format) {
        this.file = file;
        this.level = currentLevel;
        this.maxFileSize = maxFileSize;
        this.logFormat = format;
    }

    public File getFile() {
        return file;
    }

    public LoggingLevel getLevel() {
        return level;
    }

    public long getMaxFileSize() {
        return maxFileSize;
    }

    public String getLogFormat() {
        return logFormat;
    }
}
