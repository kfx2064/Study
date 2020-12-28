package lec08.thread02.first;

public class CustomRunnable implements Runnable {

    private String message;
    private int time;

    public CustomRunnable(String message, int time) {
        this.message = message;
        this.time = time;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(time);
                System.out.println("Runnable 메시지 : " + message);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
