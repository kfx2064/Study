package exer01.g;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class TestNet03 {

    public static void main(String[] args) throws Exception {

        URL url =
                new URL("https://land.naver.com/news/newsRead.nhn?type=headline&prsco_id=469&arti_id=0000569742");

        URLConnection conn = url.openConnection();
        InputStream is = conn.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));

        while (true) {
            String readLine = br.readLine();
            if (readLine == null) {
                break;
            }
            System.out.println(readLine);
        }
        br.close();

    }

}
