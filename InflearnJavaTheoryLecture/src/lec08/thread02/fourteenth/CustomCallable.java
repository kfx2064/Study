package lec08.thread02.fourteenth;

import java.util.concurrent.Callable;

public class CustomCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
            System.out.println(i + " ::: " + name);
        }
        return name;
    }

}
