package lec11.Networking.ex05;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TcpServer {

    public static void main(String[] args) {
        new TcpServer().doServer();
    }

    public void doServer() {

        try {
            ServerSocket socket = new ServerSocket(12225);
            System.out.println("서버시작");
            System.out.println(socket.getLocalSocketAddress());
            System.out.println(socket.getInetAddress());
            System.out.println(socket.getLocalPort());
            System.out.println("-------------------------------");

            while (true) {
                final Socket accept = socket.accept();

                synchronized (accept) {
                    InetAddress inetAddress = accept.getInetAddress();
                    System.out.println("클라이언트 접속-------------------------");
                    System.out.println("getHostAddress = " + inetAddress.getHostAddress());
                    System.out.println("getHostName = " + inetAddress.getHostName());
                }

                InputStream is = accept.getInputStream();
                OutputStream os = accept.getOutputStream();

                new Thread() {
                    public void run() {
                        BufferedReader br =
                                new BufferedReader(new InputStreamReader(is));

                        try {
                            while (true) {
                                String readLine = br.readLine();
                                if (readLine == null) break;
                                System.out.println("[서버화면] " + readLine);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            try {
                                accept.close();
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
                                bw.write("[1] S->C : " + date + "\r\n");
                                bw.flush();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            try {
                                accept.close();
                            } catch (Exception e1) {
                                e1.printStackTrace();
                            }
                        }
                    }
                }.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
