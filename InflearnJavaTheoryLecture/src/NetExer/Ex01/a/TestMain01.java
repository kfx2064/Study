package NetExer.Ex01.a;

import java.net.URI;
import java.net.URL;

public class TestMain01 {

    public static void print(String name, Object value) {
        System.out.println("[" + name + "] = \t" + value);
    }

    public static void main(String[] args) throws Exception {

        String path = "https://www.localhost:8080/depth1/page.jsp?param1=good&param2=nice";

        URL url = new URL(path);
        System.out.println("URL 함수");

        print("전체경로", path);
        print("getProtocol", url.getProtocol());
        print("getHost", url.getHost());
        print("getPort", url.getPort());
        print("getPath", url.getPath());
        print("getFile", url.getFile());
        print("getQuery", url.getQuery());
        print("getAuthority", url.getAuthority());
        print("getRef", url.getRef());
        print("getDefaultPort", url.getDefaultPort());
        print("toExternalForm", url.toExternalForm());
        System.out.println();

        URI uri = url.toURI();
        System.out.println("URI 함수");
        print("getHost", uri.getHost());
        print("getPort", uri.getPort());
        print("getPath", uri.getPath());
        print("getRawPath", uri.getRawPath());
        print("getQuery", uri.getQuery());
        print("getRawQuery", uri.getRawQuery());
        print("getAuthority", uri.getAuthority());
        print("getRawAuthority", uri.getRawAuthority());
        print("getFragment", uri.getFragment());
        print("getRawFragment", uri.getRawFragment());
        print("getSchemeSpecificPart", uri.getSchemeSpecificPart());
        print("toASCIIString", uri.toASCIIString());
        print("toString", uri.toString());
        System.out.println();

        URI uri2 = new URI("http://www.localhost.com/path1/.././path2/file.jsp");
        URI uri3 = uri2.normalize();
        print("uri2 변경 전", uri2.toString());
        print("uri3 변경 후", uri3.toString());
        System.out.println();

        URI uri4 = new URI("/path1/path2/file.jsp");
        print("uri4 uri", uri3.toString());
        print("uri4 isAbsolute", uri3.isAbsolute());
        System.out.println();

        URI uri5 = new URI("http://example.com/something/more/long");
        URI uri6 = new URI("/path1/path2/file.jsp");
        URI uri7 = uri5.resolve(uri6);
        print("uri5 경로", uri5.toString());
        print("uri6 상대경로", uri6.toString());
        print("uri7 resolve uri", uri7.toString());

    }

}
