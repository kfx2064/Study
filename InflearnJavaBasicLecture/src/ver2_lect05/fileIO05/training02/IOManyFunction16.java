package ver2_lect05.fileIO05.training02;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.channels.Pipe;
import java.util.Calendar;

public class IOManyFunction16 {

    /**
     * IO에서 자주 쓰이는 기능들만 추려서 설명을 드렸습니다.
     * 나중에 이어서 만들 이론 편에서는 내용을 최대한 상세하게 다뤄 볼 예정이예요.
     * 하지만 그전에는 입문 강의에 맞게 자주 쓰는 내용,
     * 쉽게 이해가 되는 내용 위주로 설명을 드리려고 합니다.
     *
     * 그럼 마지막으로 쓰레드 사이에서 사용하는 PipedInputStream, PipedOutputStream에 대해 설명 드리겠습니다.
     */

    public static void main(String[] args) throws Exception {

        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream(pis);

        Thread thread1 = new Thread() {
            public void run() {
                try {
                    while (true) {
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        String time = Calendar.getInstance().getTime().toString();
                        pos.write(time.getBytes());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        thread1.start();

        /**
         * 쓰레드를 두 개 돌릴 겁니다.
         * 위의 쓰레드는 매번 시간을 입력하는 것이구요,
         * 아래에 작성할 쓰레드는 매번 PipedOutputStream에 입력된 시간 값을
         * PipedInputStream을 통해서 읽어들이는 것입니다.
         */

        Thread thread2 = new Thread() {
            public void run() {
                byte[] byteBowl = new byte[1024];
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    try {
                        int read = pis.read(byteBowl);
                        System.out.println(new String(byteBowl, 0, read));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread2.start();

        /**
         * 코드 작성이 끝났으면 실행을 시켜보죠.
         * 1초씩 증가하면서 찍히는 것을 확인할 수 있죠?
         * 이렇게 하여 PipedInputStream과 PipedOutputStream을 확인해 보았습니다.
         *
         * 이보다 더 다양한 Stream 종류들이 존재해요.
         * 하지만 대표적인 것이라 할 수 있는 것들만 다뤄 봤습니다.
         * 언제가 될지 장담은 못 드리지만,
         * 빠른 시일 내에 찾아뵙게들 이론 강의에서
         * 해당 내용들을 자세히 다뤄볼까 합니다.
         * 그럼 감사합니다.
         * 다음 강의에서 뵙겠습니다.
         */

    }

}
