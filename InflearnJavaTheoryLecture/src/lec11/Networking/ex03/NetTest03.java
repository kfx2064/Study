package lec11.Networking.ex03;

import java.net.ServerSocket;

public class NetTest03 {

    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(80);
        System.out.println("Http Server 구동");

    }

}
