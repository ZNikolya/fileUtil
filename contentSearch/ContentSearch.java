package homework.ioExample.fileUtil.contentSearch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class ContentSearch {

    public void contentSearcher(String path, String text){
        File file = new File(path);
        try {
            for (File list : Objects.requireNonNull(file.listFiles())) {
                if (list.isFile()) {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(list.getAbsolutePath()));
                    if (bufferedReader.readLine().contains(text)) {
                        System.out.println(list.getAbsolutePath());
                    }
                }else if(list.isDirectory()){
                    String newPath = list.getAbsolutePath();
                    contentSearcher(newPath,text);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e){
            System.err.println("Տվյալ տեքստը գոյություն չունի");
        }
    }


    }