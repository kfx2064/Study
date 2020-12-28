package lec08.thread02.fifth;

public class CustomThread extends Thread {

    private int size;

    public CustomThread(String name, int size) {
        this.size = size;
        setName(name);
    }

    public void run() {
        Thread thread = Thread.currentThread();
        for (int i = 0; i < size; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i + " : " + thread.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
