package ver2_lect05.collectionframework03;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListSpeedTest05 {

    public static void main(String[] args) {

        /**
         * 성능 차이를 비교해 보는 코드를 짜보겠습니다.
         * 단순하지만 효율적일 것입니다.
         *
         * 이제 코드를 따라서 짜주세요.
         */

        long startMillis = System.currentTimeMillis();
        ArrayList arList = new ArrayList();

        for (int i = 0; i < 10000000; i++) {
            arList.add(i);
        }

        long endMillis = System.currentTimeMillis();
        long diffMillis = endMillis - startMillis;

        System.out.println("차이 : " + diffMillis);

        startMillis = System.currentTimeMillis();
        LinkedList lkList = new LinkedList();

        for (int i = 0; i < 10000000; i++) {
            lkList.add(i);
        }

        endMillis = System.currentTimeMillis();
        diffMillis = endMillis - startMillis;

        System.out.println("차이 Linked : " + diffMillis);

        /**
         * 이렇게 성능 차이가 납니다.
         * 중요 포인트가 있습니다.
         * 숫자만 추가하는 형태이죠.
         * 실제로는 복잡한 데이터를 추가하는 경우가 있을 것입니다.
         * 그럴 때는 더 느려질 수가 있죠.
         *
         * 이런 점을 염두에 두시면 됩니다.
         *
         * 위에서 System.currentTimeMillis()의 경우
         * 현재 시간을 구하는 메소드입니다.
         * 즉 시작할 때의 현재 시간과 끝날 때의 현재 시간을 구하면 됩니다.
         * 끝지점의 시간과 시작 시간을 빼면
         * 걸린 시간을 구할 수 있습니다.
         * 이를 통해서 얼마나 걸렸는지 파악할 수 있으며 성능 차이도 확인해 볼 수 있습니다.
         * 밀리세컨드이므로 1천 밀리세컨드는 1초가 될 것입니다.
         *
         * 성능 차이 테스트는 이 정도로만 하겠습니다.
         * 감사합니다.
         */

    }

}
