package lec11.Networking.ex01;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class NetMain03 {

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(80);
        System.out.println("서버를 시작합니다.");

        try {

            while (true) {

                Socket accept = serverSocket.accept();

                try {

                    DataOutputStream dataOutputStream
                            = new DataOutputStream(accept.getOutputStream());

                    String msg = "<html><body>";
                    msg += "<h1>Hello, world.<h1>";
                    msg += "</body></html>";

                    byte[] body = msg.getBytes("UTF-8");

                    dataOutputStream.writeBytes("HTTP/1.1 200 OK \r\n");
                    dataOutputStream.writeBytes("Content-Length: " + body.length + "\r\n");
                    dataOutputStream.writeBytes("Content-Type: text/html;charset=utf-8\r\n");
                    dataOutputStream.writeBytes("\r\n");

                    dataOutputStream.write(body, 0, body.length);

                    dataOutputStream.flush();

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    accept.close();
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            serverSocket.close();
        }

    }

}
