package lec08.fileio04.second.stream.o;

import com.sun.jdi.event.ExceptionEvent;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamTest {

    public static void main(String[] args) {

        String strPath = "D:\\dev\\fileIOTest\\testOut.txt";

        BufferedReader bufferedReader = null;
        InputStreamReader inputStreamReader = null;

        try {

            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(strPath), "UTF-8"));

            while (true) {
                String strData = bufferedReader.readLine();
                if (strData == null) {
                    break;
                }
                System.out.println(strData);
            }

            inputStreamReader = new InputStreamReader(new FileInputStream(strPath), "UTF-8");

            while (true) {
                int read = inputStreamReader.read();
                if (read == -1) {
                    break;
                }
                char readChar = (char) read;
                System.out.print(readChar);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
