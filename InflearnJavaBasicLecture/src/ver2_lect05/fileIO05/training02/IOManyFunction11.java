package ver2_lect05.fileIO05.training02;

import java.awt.*;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class IOManyFunction11 {

    public static void main(String[] args) {

        String path = String.valueOf("C:\\dev\\FileIO\\file2.txt");

        BufferedOutputStream bufferedOutputStream = null;

        try {

            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(path));

            bufferedOutputStream.write('b');
            bufferedOutputStream.write('a');
            bufferedOutputStream.write('n');
            bufferedOutputStream.write('k');
            bufferedOutputStream.write('.');
            bufferedOutputStream.write('\r');
            bufferedOutputStream.write('\n');

            bufferedOutputStream.write("deposit and withdrawal.".getBytes());

            /**
             * bufferedOutputStream입니다.
             * OutputStream 중에 buffer 기능을 쓰는 것이라고 보시면 됩니다.
             * bufferedInputStream과 마찬가지로 뭉텅이로 만들어서 한 번에 보내는 것이죠.
             * 대신 전송횟수는 줄어듭니다.
             *
             * 이게 stream, 즉 통로를 통해서 자주 전송할 때는 속도가 느려집니다.
             * 대신에 데이터를 뭉쳐서 전송 횟수를 떨어뜨리면 속도가 빨라집니다.
             * 이런 차이가 있어요.
             *
             * 나중에 쓰실 일이 있으실 지도 모르겠네요.
             *
             * BufferedInputStream은 읽어 들이는 것,
             * BufferedOutputStream은 밖으로 내보내는 것이라고 보시면 됩니다.
             *
             * input은 파일에서 데이터를 읽어 들여서 프로그램으로 끌고 들어온다고 보시면 되고
             * output은 프로그램에서 작성한 데이터를 바깥의 파일에 쓴다고 보시면 됩니다.
             *
             * 그럼 이번 설명도 여기까지 하겠습니다.
             *
             * 다음 강의에서 뵙겠습니다. 감사합니다.
             */

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {

            Desktop.getDesktop().open(new File(path));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
