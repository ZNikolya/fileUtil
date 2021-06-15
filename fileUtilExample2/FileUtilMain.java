package homework.ioExample.fileUtil.fileUtilExample2;

import java.io.IOException;
import java.util.Scanner;

public class FileUtilMain {

    public static void main(String[] args) throws IOException {
        FileUtil fileUtil = new FileUtil();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ներմուծեք փաթը");
        String path = scanner.nextLine();
        System.out.println("Ներմուծեք տեքստ");
        String text = scanner.nextLine();
        fileUtil.findLines(path, text);
//
//        System.out.println("Ներմուծեք փաթը՝ չափը տեսնելու համար");
//        String path = scanner.nextLine();
//        fileUtil.printSizeOfPackage(path);


//        System.out.println("Ներմուծեք փաթը, ֆայլի անունը և բառը ");
//        String fileInfo = scan.nextLine();
//        String[] file = fileInfo.split(",");
//        String path = file[0];
//        String fileName = file[1];
//        String content = file[2];
//        fileUtil.createFileWithContent(path,fileName,content);

    }
}
