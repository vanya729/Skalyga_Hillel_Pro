package lessons20.imp;

import lessons20.service.FileService;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileServiceImpl implements FileService {

    @Override
    public List<File> getFiles(Path path) throws IOException {
        List<File> fileList = new ArrayList<>();
        Files.walk(path)
                .filter(Files::isRegularFile)
                .forEach(file -> fileList.add(file.toFile()));
        return fileList;
    }

    @Override
    public void saveToFile(File file, boolean append, String value) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, append))) {
            writer.write(value);
        }
    }

    @Override
    public String readFromFile(Path path) {
        try {
            return Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override
    public boolean isFileFormat(File file, String ext) {
        return file.getName().endsWith("." + ext);
    }

    @Override
    public String getFileName(File file) {
        return file.getName();
    }
}
