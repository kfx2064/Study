package lec11.Networking.ex01;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class NetMain03 {

    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(8080);
        System.out.println("서버를 시작합니다.");

        try {

            while (true) {
                Socket socket = server.accept();

                try {
                    BufferedReader readRequest =
                            new BufferedReader(new InputStreamReader(socket.getInputStream()));

                    String request = "";
                    while (true) {
                        String readLine = readRequest.readLine();
                        if (readLine == null || readLine.equals("")) {
                            break;
                        }
                        System.out.println(readLine);
                        if (readLine.startsWith("GET")) {
                            request = readLine;
                        }
                    }

                    DataOutputStream dos =
                            new DataOutputStream(socket.getOutputStream());

                    String msg = "<html><body>";
                    msg += "<span style='fond-size:30pt; color:red; font-weight:bold;'>";
                    msg += "HTTP 서비스";
                    msg += "</span>";
                    msg += "<br><br><span style='font-weight:bold; font-size:15pt'>";
                    Date date = new Date(System.currentTimeMillis());
                    msg += date.toString();
                    msg += "<br><br>요청내용 = " + request;
                    msg += "</span>";
                    msg += "</body></html>";

                    byte[] body = msg.getBytes("UTF-8");

                    dos.writeBytes("HTTP/1.1 200 OK \r\n");
                    dos.writeBytes("Server:MyServerName\r\n");
                    dos.writeBytes("Cache-Control:private\r\n");
                    dos.writeBytes("Content-Length: " + body.length + "\r\n");
                    dos.writeBytes("Content-Type: text/html;charset=utf-8\r\n");
                    dos.writeBytes("\r\n");

                    dos.write(body, 0, body.length);

                    dos.writeBytes("\r\n");
                    dos.flush();

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    socket.close();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            server.close();
        }

    }

}
