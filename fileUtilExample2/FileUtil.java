package homework.ioExample.fileUtil.fileUtilExample2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileUtil {

    public void findLines(String txtPath, String keyword) throws IOException {
        List<String> list = new ArrayList<>();
        String s = " ";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(txtPath));
        while (s != null) {
            s = bufferedReader.readLine();
            list.add(s);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).contains(keyword)) {
                System.out.println((i + 1) + " " + list.get(i));
            }
        }
    }


    public void printSizeOfPackage(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        int size = 0;
        for (File file1 : Objects.requireNonNull(files)) {
            System.out.println(file1.length());
            size += file1.length();
            System.out.println(file1.getName());
        }
        size /= 1024;
        System.out.println("size = " + size + " mb");
    }

    public void createFileWithContent(String path, String filename, String content) {
        path += "\\" + filename + ".txt";
        File file = new File(path);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
