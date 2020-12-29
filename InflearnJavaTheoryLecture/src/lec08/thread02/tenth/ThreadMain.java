package lec08.thread02.tenth;

public class ThreadMain {

    public static void main(String[] args) {
        CustomThread customThread1 = new CustomThread(10);
        CustomThread customThread2 = new CustomThread(5);
        CustomThread customThread3 = new CustomThread(1);

        customThread1.start();
        customThread2.start();
        customThread3.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        customThread1.setStop(true);
        customThread2.setStop(true);
        customThread3.setStop(true);

        /**
         * 실행해 보시면 priority 순위에 따라
         * 쓰레드의 실행 횟수가 다른 것을 확인하실 수 있습니다.
         *
         * 멀티 쓰레딩 프로그래밍을 하실 때는
         * setPriority를 활용하여
         * 쓰레드의 우선 순위를 주고
         * 쓰레드 실행 횟수의 차별을 둘 수 있습니다.
         */
    }

}
