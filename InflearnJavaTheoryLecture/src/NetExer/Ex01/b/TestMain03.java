package NetExer.Ex01.b;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class TestMain03 {

    public static void main(String[] args) throws Exception {

        URL url = new URL("https://www.naver.com");

        URLConnection conn = url.openConnection();
        InputStream is = conn.getInputStream();

        BufferedReader br
                = new BufferedReader(new InputStreamReader(is, "utf-8"));

        while (true) {
            String readLine = br.readLine();
            if (readLine == null) break;
            System.out.println(readLine);
        }

        br.close();

    }

}
