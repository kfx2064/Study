package lec08.thread02.fifteenth;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadMain {

    public static void main(String[] args) {
        ExecutorService executorServicePool = Executors.newFixedThreadPool(2);

        CustomRunnable customRunnable1 = new CustomRunnable("쓰레드1");
        CustomRunnable customRunnable2 = new CustomRunnable("쓰레드2");
        CustomRunnable customRunnable3 = new CustomRunnable("쓰레드3");
        CustomRunnable customRunnable4 = new CustomRunnable("쓰레드4");

        executorServicePool.execute(customRunnable1);
        executorServicePool.execute(customRunnable2);
        executorServicePool.execute(customRunnable3);

        executorServicePool.shutdown();
        //executorServicePool.shutdownNow();

        executorServicePool.execute(customRunnable4);

        /**
         * shutdown은 그 이후 새로 진행되는 작업만 막습니다.
         * shutdownNow는 실행 대기 작업은 취소하고 현재 진행 중인 작업은
         * interruptedException을 발생시키고 마저 진행합니다.
         */

        try {
            /**
             * 이제 작성하는 메서드는 메인 메서드를 해당 시간만큼 대기시킬 것입니다.
             * 그래서 메인 메서드의 마지막에 메인 메서드 종료는
             * awaitTermination이 끝나고 실행될 것입니다.
             * 해당 시간 이내에 작업이 완료되면 boolean 값은 true를 리턴하고,
             * 완료되지 않으면 false를 리턴할 것입니다.
             */
            //boolean at = executorServicePool.awaitTermination(12000, TimeUnit.MILLISECONDS);
            boolean at = executorServicePool.awaitTermination(3000, TimeUnit.MILLISECONDS);
            System.out.println("결과 : " + at);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("메인 메서드 종료.");
    }

}