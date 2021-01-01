package lec08.fileio04.second.stream.k;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWriterTest {

    public static void main(String[] args) {

        String strPath = "C:\\dev\\testOut.txt";

        BufferedWriter bufferedWriter = null;

        try {

            bufferedWriter = new BufferedWriter(new FileWriter(strPath));

            bufferedWriter.write('D');
            bufferedWriter.write('a');
            bufferedWriter.write('t');
            bufferedWriter.write('a');
            bufferedWriter.write(' ');
            bufferedWriter.write('a');
            bufferedWriter.write('n');
            bufferedWriter.write('d');
            bufferedWriter.write(' ');
            bufferedWriter.write('i');
            bufferedWriter.write('n');
            bufferedWriter.write('f');
            bufferedWriter.write('o');
            bufferedWriter.write('r');
            bufferedWriter.write('m');
            bufferedWriter.write('a');
            bufferedWriter.write('t');
            bufferedWriter.write('i');
            bufferedWriter.write('o');
            bufferedWriter.write('n');
            bufferedWriter.write('.');
            bufferedWriter.write('\n');

            String strData = "Have a nice day.";
            bufferedWriter.write(strData);
            bufferedWriter.write('\n');

            char[] charData = "System".toCharArray();

            bufferedWriter.write(charData);

            bufferedWriter.flush();

            Desktop.getDesktop().open(new File(strPath));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
