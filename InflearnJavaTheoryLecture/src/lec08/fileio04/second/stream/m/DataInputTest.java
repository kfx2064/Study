package lec08.fileio04.second.stream.m;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputTest {

    public static void main(String[] args) {

        String strPath = "D:\\dev\\fileIOTest\\testOut.txt";

        DataInputStream dataInputStream = null;

        try {

            dataInputStream = new DataInputStream(new FileInputStream(strPath));

            int bytesLength = "Human".getBytes().length;
            byte[] bytes = new byte[bytesLength];
            int read = dataInputStream.read(bytes);
            String strGetData = new String(bytes, 0, read);
            System.out.println(strGetData);

            String strGetData2 = dataInputStream.readUTF();
            String strGetData3 = dataInputStream.readUTF();
            String strGetData4 = dataInputStream.readUTF();

            System.out.println(strGetData2);
            System.out.println(strGetData3);
            System.out.println(strGetData4);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
