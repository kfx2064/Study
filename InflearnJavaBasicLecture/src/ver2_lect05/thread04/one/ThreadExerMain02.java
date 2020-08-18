package ver2_lect05.thread04.one;

public class ThreadExerMain02 {

    /**
     * 쓰레드는 크게 Runnable과 Thread 를 사용한 두 가지 방법이 있습니다.
     * Runnable은 interface를 implements하는 방법이고
     * Thread는 class를 extends하는 방법입니다.
     *
     * 두 개에는 큰 차이가 있습니다.
     * Thread를 상속받게 되면 Thread 내의 메소드들을 구현하여
     * 해당 메소드들에 새로운 내용을 정의해 줄 수 있습니다.
     * 하지만 Runnable 인터페이스를 사용하게 될 경우
     * run만 사용하게 됩니다.
     *
     * 그렇다면 뭐가 그렇게 크게 다를까요?
     *
     * 쓰레드를 구체적으로, 자세하게 구현하기 위해서는 Thread 클래스를 사용해야 합니다.
     * Runnable 인터페이스를 사용하면 run을 통해 간단하게 구동시킬 수 있다는 장점이 있습니다.
     *
     * 좀 더 깊숙한 내용은 이론 편에서 기대해 주세요.
     *
     * 입문 레벨에서는 너무 깊숙히 설명 드리면 헷갈리기만 하기 때문입니다.
     *
     * 실습해 볼까요?
     */

    public static void main(String[] args) {

        System.out.println("메인함수 실행");

        /* 쓰레드 객체 생성 */
        Thread thread1 = new DoThread("Alpha", 1000);
        Thread thread2 = new DoThread("Bravo", 700);

        Thread thread3 = new Thread(new DoRunnable("Charlie", 300));

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("메인 함수 종료");

        /**
         * 쓰레드들이 실행되는 것을 확인할 수 있습니다.
         * Runnable을 사용한 것과 Thread를 사용한 것의 차이가 느껴지시죠?
         * Thread를 상속받은 것은 해당 클래스를 상속받았기 때문에
         * 저렇게 구현할 수 있습니다.
         * 하지만 Runnable은 다르죠.
         *
         * 각각의 쓰레드 원본 클래스에서는 반복문이 세 번 돌면서
         * interrupt되는 구간이 있습니다.
         * 해당 구간 뒤에는 message가 찍히는 것을 볼 수 있죠.
         *
         * 쓰레드는 이렇게 사용할 수 있습니다.
         *
         * 쓰레드를 웹 프로그래밍을 할 때는 잘 사용하지 않습니다.
         * 하지만 HTTP 통신을 하는 웹 프로그래밍이 아닌
         * 네트워킹을 구현하거나
         * 안드로이드 프로그래밍을 할 때는 쓰레드를 정말 많이 쓰곤 합니다.
         *
         * 그럼 다음 강의로 건너가겠습니다.
         */


    }

}
