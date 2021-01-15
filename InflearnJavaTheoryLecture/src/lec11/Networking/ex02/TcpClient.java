package lec11.Networking.ex02;

import java.io.*;
import java.net.Socket;
import java.util.Date;

public class TcpClient {

    public static void main(String[] args) {
        new TcpClient().doClient();
    }

    public void doClient() {
        try {
            Socket socket = new Socket("localhost", 12225);

            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            new Thread() {
                public void run() {
                    BufferedReader br = new BufferedReader(new InputStreamReader(is));
                    try {
                        while (true) {
                            String readLine = br.readLine();
                            if (readLine == null) break;
                            System.out.println("[클라이언트화면] " + readLine);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        try {
                            socket.close();
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }.start();

            new Thread() {
                public void run() {
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
                    try {
                        while (true) {
                            try {
                                Thread.sleep(3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            Date date = new Date(System.currentTimeMillis());
                            bw.write("[2] C->S : " + date + "\r\n");
                            bw.flush();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        try {
                            socket.close();
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
