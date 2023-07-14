package lessons19;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger {

    private FileLoggerConfiguration configuration;

    public FileLogger(FileLoggerConfiguration configuration) {
        this.configuration = configuration;
    }

    void log(String mess) throws FileMaxSizeReachedException {
        File file = configuration.getFile();
        Long fileSize = file.length();

        if (fileSize >= configuration.getMaxFileSize()){
            throw new FileMaxSizeReachedException("maximum file size reached\nCurrent size=" + fileSize+" bytes" +
                    "Max size= " +configuration.getMaxFileSize()+ "bytes. Path to file: " +file.getAbsolutePath());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))){
            writer.write(getFormattedLog(mess));
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getFormattedLog(String log) {
        DataTransformer dataTransformer = new DataTransformer();
        String curData =dataTransformer.convert();
        return curData+" "+log;
    }

    void debug(String mess){
        if (configuration.getLevel() == LoggingLevel.DEBUG || configuration.getLevel() == LoggingLevel.INFO){
            try {
                log("[DEBUG]" + mess);
            }catch (FileMaxSizeReachedException e){
                e.printStackTrace();
            }
        }

    }
    void info(String message) {
        if (configuration.getLevel() == LoggingLevel.INFO) {
            try {
                log("[INFO] " + message);
            } catch (FileMaxSizeReachedException e) {
                e.printStackTrace();
            }
        }
    }

}
