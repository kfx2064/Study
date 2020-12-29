package lec08.thread02.fifteenth;

public class CustomRunnable implements Runnable {

    private String name;

    public CustomRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(i + " ::: " + this.name);
        }
    }

}
