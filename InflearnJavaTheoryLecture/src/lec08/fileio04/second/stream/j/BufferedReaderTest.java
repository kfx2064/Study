package lec08.fileio04.second.stream.j;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderTest {

    public static void main(String[] args) {

        String strPath = "C:\\dev\\test.txt";

        BufferedReader bufferedReader = null;

        try {

            bufferedReader = new BufferedReader(new FileReader(strPath));

            while (true) {
                String strData = bufferedReader.readLine();
                if (strData == null) {
                    break;
                }
                System.out.print(strData);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
