package lec08.thread02.thirteenth;

import java.util.concurrent.Callable;

public class CustomCallable implements Callable<String> {

    private String name;

    public CustomCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(i + " ::: " + name);
        }
        return null;
    }

}
