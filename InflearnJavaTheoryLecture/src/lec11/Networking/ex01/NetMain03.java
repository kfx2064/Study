package lec11.Networking.ex01;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class NetMain03 {

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(80);
        System.out.println("서버를 시작합니다.");

        try {

            while (true) {

                Socket accept = serverSocket.accept();

                try {

                    BufferedReader bufferedReader
                            = new BufferedReader(new InputStreamReader(accept.getInputStream()));

                    DataOutputStream dataOutputStream
                            = new DataOutputStream(accept.getOutputStream());

                    StringBuffer writeHTMLData =
                            new StringBuffer("<html><body>").append("<h1>Hello, world!</h1>")
                                                            .append("</body></html>");

                    byte[] forSendingData = writeHTMLData.toString().getBytes("UTF-8");

                    dataOutputStream.write(forSendingData, 0, forSendingData.length);
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
