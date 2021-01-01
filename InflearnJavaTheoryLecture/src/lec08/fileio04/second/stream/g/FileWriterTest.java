package lec08.fileio04.second.stream.g;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;

public class FileWriterTest {

    public static void main(String[] args) {

        String strFilePath = "C:\\dev\\test2.txt";
        FileWriter fileWriter = null;

        try {

            fileWriter = new FileWriter(strFilePath);

            fileWriter.write('J');
            fileWriter.write('a');
            fileWriter.write('v');
            fileWriter.write('a');
            fileWriter.write(' ');
            fileWriter.write('a');
            fileWriter.write('n');
            fileWriter.write('d');
            fileWriter.write(' ');
            fileWriter.write('S');
            fileWriter.write('p');
            fileWriter.write('r');
            fileWriter.write('i');
            fileWriter.write('n');
            fileWriter.write('g');
            fileWriter.write('.');
            fileWriter.write('\n');

            char[] writeMsg = "구슬이 많아도 꿰어야 보배다.\n".toCharArray();
            fileWriter.write(writeMsg);

            String strDataMsg = "스트링으로 써보겠습니다.";
            fileWriter.write(strDataMsg);

            Desktop.getDesktop().open(new File(strFilePath));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}

