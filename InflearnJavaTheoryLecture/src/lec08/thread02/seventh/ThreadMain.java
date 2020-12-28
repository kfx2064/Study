package lec08.thread02.seventh;

/**
 * suspend, resume, stop을 실습하겠습니다.
 * suspend는 일시정지, resume은 재시작, stop은 멈추는 것입니다.
 * deprecated 된 메서드들이라서
 * 다른 것을 사용하시길 추천합니다.
 *
 * 그럼 실습하겠습니다.
 */
public class ThreadMain {

    public static void main(String[] args) {

        /**
         * 본체 쓰레드를 동작시키겠습니다.
         * 본체 쓰레드를 돌리고, 다른 쓰레드를 하나 더 만들어서
         * 해당 다른 쓰레드에서 본체 쓰레드의 suspend, resume, stop 메서드를
         * 실습해 보도록 하겠습니다.
         */

        CustomThread customThread = new CustomThread();
        customThread.start();

        Thread thread = new Thread() {
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                System.out.println("thread suspend()");
                customThread.suspend();

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }

                System.out.println("thread resume()");
                customThread.resume();

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }

                System.out.println("thread stop()");
                customThread.stop();

                System.out.println("쓰레드 종료");
            }
        };

        thread.start();
    }

}
