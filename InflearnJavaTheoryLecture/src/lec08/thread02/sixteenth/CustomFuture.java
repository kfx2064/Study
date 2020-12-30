package lec08.thread02.sixteenth;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CustomFuture {

    public static String showDataMessage(String title, int size) {
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        for (int i = 0; i < size; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(i + " 예외 발생 ::: " + title);
                e.printStackTrace();
            }
            System.out.println(i + " 쓰레드 ::: " + title);
        }
        String strReturn = "쓰레드 종료 ::: " + title;
        return strReturn;
    }

    public static void main(String[] args) {
        ExecutorService executorServicePool = Executors.newFixedThreadPool(1);

        /**
         * submit 함수를 이용하여 쓰레드를 하나 동작시키겠습니다.
         */
        Future<String> futureFirst = executorServicePool.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return showDataMessage("first thread", 3);
            }
        });

        Future futureSecond = executorServicePool.submit(new Runnable() {
            @Override
            public void run() {
                showDataMessage("second thread", 3);
            }
        });

        Future futureThird = executorServicePool.submit(new Runnable() {
            @Override
            public void run() {
                showDataMessage("third thread", 3);
            }
        });

        Future futureFourth = executorServicePool.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return showDataMessage("네 번째 비교 쓰레드", 2);
            }
        });

        try {
            String returnData = futureFirst.get();
            System.out.println("첫 번째 쓰레드 리턴데이터 : " + returnData);
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /**
         * cancel method를 사용하여 작업을 끝낸다.
         */
        boolean deleteTask = futureThird.cancel(true);
        System.out.println("futureThird는 종료되었는가 ::: " + deleteTask);

        try {
            Object secondReturnData = futureSecond.get();
            System.out.println("두 번째 쓰레드 리턴데이터 : " + secondReturnData);
            Object fourthReturnData = futureFourth.get();
            System.out.println("네 번째 쓰레드 리턴데이터 : " + fourthReturnData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /**
         * cancel method를 사용하여 작업을 끝낸다.
         */
        /*boolean deleteTask = futureThird.cancel(true);
        System.out.println("futureThird는 종료되었는가 ::: " + deleteTask);*/

        /**
         * 쓰레드 풀이 1개 이므로 쓰레드를 순차적으로 진행됩니다.
         * canel method는 대기 상태인 쓰레드만 취소시킬 수 있습니다.
         * 순서상 thread2가 먼저 실행되어 thread3가 대기 중이므로
         * cancel method를 통해 취소시킬 수 있었습니다.
         *
         * 이미 thread3가 실행된 시점으로 코드를 옮겨보면 프로그램이 제대로
         * 동작하지 않는 것을 확인하실 수 있습니다.
         *
         * Future에서 cancel은 이런 식으로 활용이 가능합니다.
         *
         * Future<String>이나 Object를 리턴받는데,
         * Callable은 리턴을 해주기 때문에 get에서 데이터를 받을 수 있습니다.
         * 하지만 Runnable은 리턴 데이터가 없기 때문에 받을 것이 없지요.
         * 이런 차이점이 있습니다.
         */

        System.out.println("메인 메서드 종료");
    }

}
