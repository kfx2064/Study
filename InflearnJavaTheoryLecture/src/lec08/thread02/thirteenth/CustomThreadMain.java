package lec08.thread02.thirteenth;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CustomThreadMain {

    public static void main(String[] args) {

        /**
         * 쓰레드풀 객체를 생성합니다.
         */
        ExecutorService executorServicePool = Executors.newFixedThreadPool(2);
        //ExecutorService executorServicePool = Executors.newFixedThreadPool(3);

        /**
         * Runnable 객체를 생성합니다.
         */
        Runnable rn1 = new CustomRunnable("Runnable1");
        Runnable rn2 = new CustomRunnable("Runnable2");

        /**
         * Callable 객체를 생성합니다.
         */
        Callable<String> call1 = new CustomCallable("Callable1");
        Callable<String> call2 = new CustomCallable("Callable2");

        /**
         * execute()로 runnable 1을 실행합니다.
         */
        executorServicePool.execute(rn1);

        /**
         * submit으로 나머지를 실행합니다.
         */
        Future<?> futureSubmit1 = executorServicePool.submit(rn2);
        Future futureSubmit2 = executorServicePool.submit(call1);
        Future futureSUbmit3 = executorServicePool.submit(call2);

        System.out.println("메인 메서드 종료.");

        /**
         * fixed 쓰레드 풀이 2개이므로, 한 번에 두 개씩 번갈아 가면서
         * 실행되는 것을 확인할 수 있다.
         * 쓰레드 풀에서 대기 중인 쓰레드만 불러와서 사용이 가능하다.
         */

    }

}
