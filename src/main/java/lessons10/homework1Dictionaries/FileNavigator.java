package lessons10.homework1Dictionaries;

import java.io.File;
import java.util.*;

public class FileNavigator {
    private Map<String, List<FileData>> fileMap;

    public FileNavigator() {
        fileMap = new HashMap<>();
    }

    public void add(FileData fileData){
        String path =fileData.getPath();
        if (fileMap.containsKey(path)){
            List<FileData> fileDataList = fileMap.get(path);
            fileDataList.add(fileData);
        }else {
            List<FileData> fileDataList = new ArrayList<>();
            fileDataList.add(fileData);
            fileMap.put(path, fileDataList);
        }
    }



    public List<FileData> find (String path){
        if (fileMap.containsKey(path)){
            return fileMap.get(path);
        }else {
            return  new ArrayList<>();
        }
    }


    public  List<FileData> filterBySize(String path, int maxSiz){
        List<FileData> fileDataList = new ArrayList<>();
        if (fileMap.containsKey(path)){
            List<FileData>fileData = fileMap.get(path);
            for (FileData file : fileData){
                if (file.getSize()<= maxSiz){
                    fileDataList.add(file);
                }
            }
        }
        return fileDataList;
    }



    public void remove(String path) {
        fileMap.remove(path);
    }


    public List<FileData> sortBySize() {
        List<FileData> sortedList = new ArrayList<>();
        for (List<FileData> fileList : fileMap.values()) {
            sortedList.addAll(fileList);
        }
        sortedList.sort(new Comparator<FileData>() {
            @Override
            public int compare(FileData f1, FileData f2) {
                return Integer.compare(f1.getSize(), f2.getSize());
            }
        });
        return sortedList;
    }


    public void addFileDataConsistencyCheck(FileData fileData) {
        String path = fileData.getPath();
        if (!path.equals(getKeyPath(path))) {
            System.out.println("Error: Path and key path do not match.");
        } else {
            add(fileData);
        }
    }

    private String getKeyPath(String path) {
        for (String key : fileMap.keySet()) {
            if (path.startsWith(key)) {
                return key;
            }
        }
        return null;
    }
}

