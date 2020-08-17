package ch10.part10.main1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead2 {

    public static void read(String path) {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(path));

            while (true) {
                String readLine = br.readLine();
                if (readLine == null)
                    break;
                System.out.println(readLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        String path = "D:/GenerateDummyData/JavaProgrammingRealGuide/src" +
                "/ch10/part10/main1" +
                "/FileRead2.java";
        FileRead2 fr = new FileRead2();
        fr.read(path);
    }

}
