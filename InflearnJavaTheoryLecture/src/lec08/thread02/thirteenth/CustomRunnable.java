package lec08.thread02.thirteenth;

public class CustomRunnable implements Runnable {

    private String name;

    public CustomRunnable(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(i + " ::: " + name);
        }
    }

}
