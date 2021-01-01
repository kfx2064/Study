package lec08.fileio04.second.stream.e;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOMain {

    public static void fileCopy(File target, String destination) throws Exception {

        File destinationFile = new File(destination);
        boolean destExists = destinationFile.exists();
        if (destExists == true) {
            String showMsg = "이미 파일이 존재하여 복사할 수 없습니다.";
            throw new Exception(showMsg);
        }

        FileInputStream fileInputStream
                 = new FileInputStream(target);
        FileOutputStream fileOutputStream
                = new FileOutputStream(destinationFile);

        byte[] bytes = new byte[1024];
        while (true) {
            int read = fileInputStream.read(bytes);
            if (read == -1) {
                break;
            }
            fileOutputStream.write(bytes, 0, read);
        }

        fileInputStream.close();
        fileOutputStream.close();

    }

    public static void main(String[] args) {

        String targetPath = "C:\\dev\\test.txt";
        String destinationPath = "C:\\dev\\testcopy.txt";

        try {

            fileCopy(new File(targetPath), destinationPath);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
