package lec08.fileio04.second.stream.i;

import java.awt.*;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class BufferedOutTest {

    public static void main(String[] args) {

        String strPath = "D:\\dev\\fileIOTest\\testOut.txt";

        BufferedOutputStream bufferedOutputStream = null;

        try {

            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(strPath));

            bufferedOutputStream.write('S');
            bufferedOutputStream.write('p');
            bufferedOutputStream.write('r');
            bufferedOutputStream.write('i');
            bufferedOutputStream.write('n');
            bufferedOutputStream.write('g');
            bufferedOutputStream.write(' ');
            bufferedOutputStream.write('F');
            bufferedOutputStream.write('r');
            bufferedOutputStream.write('a');
            bufferedOutputStream.write('m');
            bufferedOutputStream.write('e');
            bufferedOutputStream.write('w');
            bufferedOutputStream.write('o');
            bufferedOutputStream.write('r');
            bufferedOutputStream.write('k');
            bufferedOutputStream.write('.');
            bufferedOutputStream.write('\n');

            bufferedOutputStream.write("Servlet 웹프로그래밍".getBytes());

            Desktop.getDesktop().open(new File(strPath));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
