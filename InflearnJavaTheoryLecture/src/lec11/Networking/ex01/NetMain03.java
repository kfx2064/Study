package lec11.Networking.ex01;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class NetMain03 {

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("서버를 시작합니다.");

        try {

            while (true) {

                Socket accept = serverSocket.accept();

                try {

                    BufferedReader bufferedReader
                            = new BufferedReader(new InputStreamReader(accept.getInputStream()));

                    String getData = "";

                    while (true) {
                        String readData = bufferedReader.readLine();
                        if (readData == null || readData.equals("")) {
                            break;
                        }
                        System.out.println(readData);
                        if (readData.startsWith("GET")) {
                            getData = readData;
                        }
                    }

                    DataOutputStream dataOutputStream
                            = new DataOutputStream(accept.getOutputStream());

                    dataOutputStream.writeBytes("HTTP/1.1 200 OK \r\n");

                    StringBuffer writeHTMLData = new StringBuffer("<html><body>").append("Hello, world!")
                                                                                    .append("</body></html>");

                    byte[] forSendingData = writeHTMLData.toString().getBytes("UTF-8");

                    dataOutputStream.write(forSendingData, 0, forSendingData.length);
                    dataOutputStream.flush();

                    System.out.println("GET 데이터를 확인합니다.");
                    System.out.println(getData);

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
