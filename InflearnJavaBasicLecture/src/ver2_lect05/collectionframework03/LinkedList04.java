package ver2_lect05.collectionframework03;

import java.util.LinkedList;

public class LinkedList04 {

    public static void main(String[] args) {

        /**
         * 링크드 리스트를 한 번 만들어 볼까요?
         *
         * 어레이 리스트와 비슷한 것입니다.
         * 크게 다를 것은 없지만 실습을 해보겠습니다.
         */

        LinkedList lkList = new LinkedList();
        lkList.add("alpha");
        lkList.add("bravo");
        lkList.add("charlie");
        lkList.add("delta");
        lkList.add("echp");

        System.out.println(lkList.toString());

        lkList.add(1, "good");

        System.out.println(lkList.toString());

        /**
         * 위의 것은 무엇일까요?
         * 바로 중간에 데이터를 끼워넣는 것입니다.
         * 인덱스 1의 자리에 good을 끼워넣는 것입니다.
         * 인덱스는 0부터 시작하는 것이죠.
         * 1에 good을 끼워넣으면 두 번째 자리에 good을 끼워넣는 것입니다.
         * 저렇게 중간에 데이터를 저장하는 작업을 많이 할 때는
         * 링크드 리스트가 매우 유리합니다.
         *
         * 하지만 그럴 경우가 드물다는 것이죠.
         * 물론 프로그래밍에서는 드물어도 필요한 경우들이 있습니다.
         *
         * 프로그래머는 언어에서 지원하는 기능,
         * 프레임워크에서 지원하는 기능들을 많이 알고 있는 것이 능력입니다.
         * 많이 알고 있어야 잘 사용할 수 있습니다.
         * 모든 것을 외워서 사용하는 것은 아닙니다.
         * 어떤 기능들이 존재한다고 알고 있어야 하고
         * 그 기능들을 금방금방 찾아서 적용할 줄 알아야 능력입니다.
         * 이것은 기능들의 사용법이 드물어도 알아야 한다는 것과 통합니다.
         * 그 드문 기능들도, 이런 기능들도 지원하는구나, 하고 알아두고 있으면
         * 나중에 검색하여 사용할 수 있게 됩니다.
         *
         * 링크드 리스트는 이 정도로만 하겠습니다.
         *
         * 저는 여기서는 실습 정도의 기능들만 사용하도록 하겠습니다.
         * 나중에 이론 강의를 진행할 때, 자세하게 다룰 예정입니다.
         * 그때를 기대해 주세요.
         *
         * 감사합니다.
         */

    }

}
