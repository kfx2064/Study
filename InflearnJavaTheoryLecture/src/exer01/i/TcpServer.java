package exer01.i;

import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

    public static void main(String[] args) {

        new TcpServer().doServer();

    }

    public void doServer() {

        try {

            ServerSocket socket = new ServerSocket(12225);
            System.out.println("서버 시작");
            System.out.println(socket.getLocalSocketAddress());
            System.out.println(socket.getInetAddress());
            System.out.println(socket.getLocalPort());
            System.out.println("------------------------------------");

            while (true) {
                final Socket accept = socket.accept();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
