package lec11.Networking.ex01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Stream;

public class NetMain02 {

    public static void main(String[] args) throws Exception {

        String netPath = "https://www.google.co.kr";
        //String netPath = "https://www.naver.com";
        //String netPath = "https://www.daum.net";

        URL url = new URL(netPath);
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();

        BufferedReader bufferedReader
                = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));

        Stream<String> lines = bufferedReader.lines();
        lines.forEach(i -> System.out.println(i));

        bufferedReader.close();

    }

}
