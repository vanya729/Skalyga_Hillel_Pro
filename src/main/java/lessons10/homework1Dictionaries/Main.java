package lessons10.homework1Dictionaries;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();


        FileData file1 = new FileData("javaFirstLesson.txt", 1024, "/path/to/file");
        fileNavigator.add(file1);

        FileData file2 = new FileData("firstApp.java", 2048, "/path/to/file");
        fileNavigator.add(file2);

        FileData file3 = new FileData("document.docx", 4096, "/path/to/document");
        fileNavigator.add(file3);


        List<FileData> fileList = fileNavigator.find("/path/to/file");
        System.out.println("Files in /path/to/file:");
        for (FileData file : fileList) {
            System.out.println(file.getName());
        }


        List<FileData> filteredList = fileNavigator.filterBySize("/path/to/file", 3072);
        System.out.println("\nFiles in /path/to/file with size <= 3000 bytes:");
        for (FileData file : filteredList) {
            System.out.println(file.getName());
        }


        fileNavigator.remove("/path/to/file");


        FileData inconsistentFile = new FileData("inconsistent.txt", 1024, "/another/path/");
        fileNavigator.addFileDataConsistencyCheck(inconsistentFile);

        List<FileData> sortedList = fileNavigator.sortBySize();
        System.out.println("Sorted files by size:");
        for (FileData file : sortedList) {
            System.out.println(file.getName());
        }
    }
}

