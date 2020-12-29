package lec08.thread02.ninth;

public class ThreadMain {

    public static void main(String[] args) {
        CustomThread customThread1 = new CustomThread();
        CustomThread customThread2 = new CustomThread();
        CustomThread customThread3 = new CustomThread();

        customThread1.start();
        customThread2.start();
        customThread3.start();

        customThread1.setAvailable(false);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        customThread1.setStop(true);
        customThread2.setStop(true);
        customThread3.setStop(true);

        /**
         * yeild가 선언된 customThread1의 Thread-0은 실행횟수가 적습니다.
         * yeild를 활용하여 특정 쓰레드는 실행 횟수를 줄여줄 수 있습니다.
         * 이를 통해 한정된 컴퓨터 자원을 다른 쓰레드에게 더 많이 할당해 줄 수 있는
         * 멀티쓰레딩 프로그래밍이 가능합니다.
         */
    }

}
