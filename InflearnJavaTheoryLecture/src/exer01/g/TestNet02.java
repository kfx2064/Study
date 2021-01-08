package exer01.g;

import java.net.URI;
import java.net.URL;

public class TestNet02 {

    public static void main(String[] args) throws Exception {

        String path = "https://land.naver.com/news/newsRead.nhn?type=headline&prsco_id=469&arti_id=0000569742";

        URL url = new URL(path);

        URI uri = url.toURI();

        System.out.println("getScheme : " + uri.getScheme());
        System.out.println("getHost : " + uri.getHost());
        System.out.println("getPort : " + uri.getPort());
        System.out.println("getPath : " + uri.getPath());

        System.out.println("getRawPath : " + uri.getRawPath());
        System.out.println("getQuery : " + uri.getQuery());
        System.out.println("getRawQuery : " + uri.getRawQuery());
        System.out.println("getAuthority : " + uri.getAuthority());

        System.out.println("getRawAuthority : " + uri.getRawAuthority());
        System.out.println("getFragment : " + uri.getFragment());
        System.out.println("getRawFragment : " + uri.getRawFragment());
        System.out.println("getSchemeSpecificPart : " + uri.getSchemeSpecificPart());

        System.out.println("toASCIIString : " + uri.toASCIIString());
        System.out.println("toString : " + uri.toString());

    }

}
