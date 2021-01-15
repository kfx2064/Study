package lec11.Networking.ex04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {

    public static void main(String[] args) {
        new UdpClient().doClient();
    }

    public void doClient() {
        try {

            DatagramSocket ds = new DatagramSocket();

            new Thread() {
                public void run() {
                    byte[] by = new byte[65535];
                    DatagramPacket dp = new DatagramPacket(by, by.length);
                    while (true) {
                        try {
                            ds.receive(dp);
                            String data = new String(dp.getData(), 0, dp.getLength());
                            System.out.println(data);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }.start();

            new Thread() {
                public void run() {
                    while (true) {
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        String msg = "data";
                        try {
                            DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length,
                                    InetAddress.getByName("localhost"), 12345);

                            ds.send(dp);
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
