package lec08.fileio04.second.stream.n;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamTest {

    public static void main(String[] args) {

        String strPath = "D:\\devTest\\testOut.txt";

        OutputStreamWriter outputStreamWriter = null;

        try {

            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(strPath), "UTF-8");
            outputStreamWriter.write("쉬운 날은 어제였다.");
            outputStreamWriter.write("\n");
            outputStreamWriter.append("Easy day is yesterday.");

            Desktop.getDesktop().open(new File(strPath));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStreamWriter != null) {
                    outputStreamWriter.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
