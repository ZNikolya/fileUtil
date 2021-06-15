package homework.ioExample.fileUtil.fileSearch;

import java.io.File;
import java.util.Objects;

public class FileSearch {
    private String path;
    private String fileName;

    //D:\IdeaProjects\2021\src\homework\ioExample\fileSearch


    public void file(Boolean result) {
        System.out.println(result);
    }

    boolean isSearch = false;

    public boolean searchFile(String path, String fileName) {
        this.path = path;
        this.fileName = fileName;
        File file = new File(path);
        for (File list : Objects.requireNonNull(file.listFiles())) {
            if (list.getName().equals(fileName) && list.isFile() && !isSearch) {
                isSearch = true;
            } else if (list.isDirectory() && !isSearch) {
                String newPath = list.getAbsolutePath();
                searchFile(newPath, fileName);
            } else {
                isSearch = false;
            }
        }
        return isSearch;
    }


}
