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
        CustomThread customThread = new CustomThread();
        customThread.start();

        Thread thread = new Thread() {
            public void run() {
                try {
                    Thread.sleep(2000);
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
