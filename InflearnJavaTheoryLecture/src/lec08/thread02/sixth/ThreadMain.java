package lec08.thread02.sixth;

public class ThreadMain {

    /**
     * interrupted를 실습해 볼 것입니다.
     * interrupted를 만나면 예외를 발생시키면서 쓰레드를 멈춥니다.
     * interrupted는 쓰레드를 종료시킬 때 자주 활용하곤 합니다.
     *
     * 그러면 실습을 진행하겠습니다.
     */

    public static void main(String[] args) {
        Thread thread = new CustomThread();
        thread.start();
        try {
            Thread.sleep(3100);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        thread.interrupt();
    }

}
