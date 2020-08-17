package ver2_lect05.thread03.one;

public class DoThread extends Thread {

    private String message;
    private int interruptInterval;

    public DoThread(String message, int interruptInterval) {
        this.message = message;
        this.interruptInterval = interruptInterval;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(interruptInterval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(message);
        }
    }

}
