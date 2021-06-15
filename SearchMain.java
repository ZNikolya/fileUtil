package homework.ioExample.fileUtil;


import homework.ioExample.fileUtil.contentSearch.ContentSearch;
import homework.ioExample.fileUtil.fileSearch.FileSearch;

import java.util.Scanner;

public class SearchMain {

    public static void main(String[] args) {

        //1)
        Scanner scanner  = new Scanner(System.in);
        FileSearch fileSearch = new FileSearch();
        System.out.println("Ներմուծեք փաթը");
        String path = scanner.nextLine();
        System.out.println("Ներմուծեք ֆայլի անունը");
        String fileName = scanner.nextLine();
        fileSearch.file(fileSearch.searchFile(path , fileName));


        //2)
        System.out.println("Ներմուծեք փաթը");
        String filePath = scanner.nextLine();
        System.out.println("Ներմուծեք տեքստը");
        String TEXT = scanner.nextLine();
        ContentSearch contentSearch = new ContentSearch();
        contentSearch.contentSearcher(filePath,TEXT);
    }

    
}
