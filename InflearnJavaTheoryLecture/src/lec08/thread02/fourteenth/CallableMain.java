package lec08.thread02.fourteenth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {

    public static void main(String[] args) {

        /**
         * 풀의 개수는 2개다.
         * 쓰레드 2개를 가진 풀에서 콜러블 클래스를 호출하면서 동작한다.
         * 동작 결과는 List에 담기는 것이 invokeAll 메서드이고
         * 그냥 하나의 작업만 완료하면 나머지는 exception을 발생시키는 것이
         * invokeAny이다.
         *
         * 그럼 실습하겠다.
         */

        ExecutorService executorServicePool = Executors.newFixedThreadPool(2);
        Callable<String> call1 = new CustomCallable();
        Callable<String> call2 = new CustomCallable();
        Callable<String> call3 = new CustomCallable();

        List<Callable<String>> callableList = new ArrayList<>();
        Collections.addAll(callableList, call1, call2, call3);

        try {
            //List<Future<String>> invokeAllList = executorServicePool.invokeAll(callableList);
            //System.out.println(invokeAllList);
            executorServicePool.invokeAny(callableList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
