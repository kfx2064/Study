package lec11.Networking.ex01;

import java.net.URI;
import java.net.URL;

public class NetMain01 {

    public static void doPrintingMsg(String strObj, Object objValue) {
        System.out.println("[Title] : " + strObj + "\t\t == [Value] : " + objValue);
    }

    public static void main(String[] args) throws Exception {

        String internetPath = "https://www.localhost.com:8080/depthOne/loginPage.jsp?" +
                            "parameter1=admin&parameter2=password";

        URL url = new URL(internetPath);
        System.out.println("URL 정보입니다.");
        doPrintingMsg("String path", internetPath);
        doPrintingMsg("protocol", url.getProtocol());
        doPrintingMsg("host", url.getHost());
        doPrintingMsg("port", url.getPort());
        doPrintingMsg("url path", url.getPath());
        doPrintingMsg("file", url.getFile());
        doPrintingMsg("query", url.getQuery());
        doPrintingMsg("authority", url.getAuthority());
        doPrintingMsg("ref", url.getRef());
        doPrintingMsg("defaultPort", url.getDefaultPort());
        doPrintingMsg("toExternalForm", url.toExternalForm());
        System.out.println("============================================================");

        URI uri = url.toURI();

        System.out.println("URI 정보입니다.");
        doPrintingMsg("scheme", uri.getScheme());
        doPrintingMsg("host", uri.getHost());
        doPrintingMsg("port", uri.getPort());
        doPrintingMsg("path", uri.getPath());
        doPrintingMsg("rawPath", uri.getRawPath());
        doPrintingMsg("query", uri.getQuery());
        doPrintingMsg("rawQuery", uri.getRawQuery());
        doPrintingMsg("authority", uri.getAuthority());
        doPrintingMsg("rawAuthority", uri.getRawAuthority());
        doPrintingMsg("fragment", uri.getFragment());
        doPrintingMsg("rawFragment", uri.getRawFragment());
        doPrintingMsg("schemeSpecificPart", uri.getSchemeSpecificPart());
        doPrintingMsg("toASCIIString", uri.toASCIIString());
        doPrintingMsg("toString", uri.toString());
        System.out.println("============================================================");

    }

}
