package lec08.thread02.thirteenth;

import java.util.concurrent.Callable;

public class CustomCallable implements Callable<String> {

    private String name;

    public CustomCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() {
        int index = 0;
        while (true) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
            System.out.println(index + " ::: " + name);
            index++;
        }
        return null;
    }

}
