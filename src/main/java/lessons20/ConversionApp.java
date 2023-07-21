package lessons20;

import lessons20.imp.ConverterServiceImpl;
import lessons20.imp.FileServiceImpl;
import lessons20.service.ConverterService;
import lessons20.service.FileService;
import lessons20.service.exception.ConvertationFault;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ConversionApp {

    public static void main(String[] args) {
        String directoryPath;
        if (args.length == 1) {
            directoryPath = args[0];
        } else {
            directoryPath = ".";
        }

        FileService fileService = new FileServiceImpl();
        ConverterService converterService = new ConverterServiceImpl();

        try {
            List<File> files = fileService.getFiles(Paths.get(directoryPath));

            Files.createDirectories(Paths.get(directoryPath, "converted"));

            StringBuilder logResult = new StringBuilder();

            for (File file : files) {
                String fileName = file.getName();
                String extension = getFileExtension(fileName);

                String newExtension;
                String convertedFileName;
                long startTime = System.currentTimeMillis();
                if (extension.equalsIgnoreCase("json")) {
                    newExtension = "yaml";
                    convertedFileName = fileName.replace(".json", ".yaml");
                } else if (extension.equalsIgnoreCase("yaml")) {
                    newExtension = "json";
                    convertedFileName = fileName.replace(".yaml", ".json");
                } else {
                    continue;
                }

                try {
                    String data = fileService.readFromFile(file.toPath());
                    String convertedData;
                    if (extension.equalsIgnoreCase("json")) {
                        convertedData = converterService.convertJsonToYaml(data);
                    } else {
                        convertedData = converterService.convertYamlToJson(data);
                    }
                    File convertedFile = new File(Paths.get(directoryPath, "converted", convertedFileName).toString());
                    fileService.saveToFile(convertedFile, false, convertedData);

                    long endTime = System.currentTimeMillis();
                    long duration = endTime - startTime;
                    long oldSize = file.length();
                    long newSize = convertedFile.length();

                    logResult.append(fileName).append(" -> ").append(convertedFileName)
                            .append(", тривалість конвертації: ").append(duration).append(" мс")
                            .append(", старий розмір: ").append(oldSize).append(" байт")
                            .append(", новий розмір: ").append(newSize).append(" байт")
                            .append("\n");
                } catch (IOException | ConvertationFault e) {
                    continue;
                }
            }
            if (logResult.length() > 0) {
                File logFile = new File(Paths.get(directoryPath, "result.log").toString());
                fileService.saveToFile(logFile, false, logResult.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getFileExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf(".");
        if (lastDotIndex != -1) {
            return fileName.substring(lastDotIndex + 1);
        }
        return "";
    }
}
