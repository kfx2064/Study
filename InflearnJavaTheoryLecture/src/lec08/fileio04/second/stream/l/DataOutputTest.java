package lec08.fileio04.second.stream.l;

import java.awt.*;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataOutputTest {

    public static void main(String[] args) {

        String strPath = "C:\\dev\\testOut.txt";

        DataOutputStream dataOutputStream = null;

        try {

            dataOutputStream = new DataOutputStream(new FileOutputStream(strPath));

            byte[] bytes = "Human".getBytes();
            dataOutputStream.write(bytes);

            String strData1 = "알고리즘";
            String strData2 = "자료구조";
            String strData3 = "프로그래밍";
            dataOutputStream.writeUTF(strData1);
            dataOutputStream.writeUTF(strData2);
            dataOutputStream.writeUTF(strData3);

            Desktop.getDesktop().open(new File(strPath));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataOutputStream != null) {
                    dataOutputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
