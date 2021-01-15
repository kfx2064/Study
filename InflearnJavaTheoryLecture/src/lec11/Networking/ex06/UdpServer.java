package lec11.Networking.ex06;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Date;

public class UdpServer {

    public static void main(String[] args) throws Exception {
        new UdpServer().doServer();
    }

    public void doServer() {
        try {

            DatagramSocket ds = new DatagramSocket(12345);

            new Thread() {
                public void run() {
                    byte[] by = new byte[65535];

                    DatagramPacket dp = new DatagramPacket(by, by.length);
                    while (true) {
                        try {
                            ds.receive(dp);

                            String data = new String(dp.getData(), 0, dp.getLength());
                            Date date = new Date(System.currentTimeMillis());
                            String msg = data + "\t" + date;

                            DatagramPacket dp2 = new DatagramPacket(msg.getBytes(), msg.getBytes().length,
                                    dp.getSocketAddress());
                            ds.send(dp2);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
