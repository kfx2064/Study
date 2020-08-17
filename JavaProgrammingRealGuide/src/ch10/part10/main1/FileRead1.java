package ch10.part10.main1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class FileRead1 {

    // 읽기 함수 정의 - throws를 이용한 IOException 예외처리
    public static void read(String path) throws FileNotFoundException, IOException {

        BufferedReader br = new BufferedReader(new FileReader(path));

        while (true) {
            String readLine = br.readLine();
            if (readLine == null) {
                break;
            }
            System.out.println(readLine);
        }

        br.close();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String path = "src/ch10/part01/main1/FileRead1.java";
        FileRead1 fr = new FileRead1();
        fr.read(path);

    }
    
}
