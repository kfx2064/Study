package exer01.g;

import java.net.URL;

public class TestNet01 {

    public static void main(String[] args) throws Exception {

        String path = "https://land.naver.com/news/newsRead.nhn?type=headline&prsco_id=469&arti_id=0000569742";

        URL url = new URL(path);

        System.out.println("path: " + path);
        System.out.println("protocol : " + url.getProtocol());
        System.out.println("host : " + url.getHost());
        System.out.println("port : " + url.getPort());

        System.out.println("getPath : " + url.getPath());
        System.out.println("getFile : " + url.getFile());
        System.out.println("getQuery : " + url.getQuery());
        System.out.println("getAuthority : " + url.getAuthority());

        System.out.println("getRef : " + url.getRef());
        System.out.println("getDefaultPort : " + url.getDefaultPort());
        System.out.println("toExternalForm : " + url.toExternalForm());
        System.out.println();

    }

}

