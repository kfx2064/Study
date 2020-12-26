package lec07.collectionqueue06.first;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue를 구현해 보겠습니다.
 */
public class QueueMain {

    /**
     * 메인메서드를 만들도록 하겠습니다.
     */
    public static void main(String[] args) {

        /**
         * Queue는 인터페이스입니다.
         * 실제로 구체화시키는 클래스는 링크드리스트를 활용하겠습니다.
         */
        Queue<String> queue = new LinkedList<>();
        queue.offer("엔진사업부");
        queue.offer("플랜트사업부");
        queue.offer("방산사업부");
        queue.offer("조선사업부");
        queue.offer("로봇사업부");
        queue.offer("에너지사업부");

        /**
         * 가상의 회사 사업부를 넣어보았습니다.
         * 추가된 자료들을 콘솔창에 찍어보면서 확인해 보겠습니다.
         */

        System.out.println(queue);

        /**
         * poll메서드를 통해 값들을 추출해 보겠습니다.
         */
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            String poll = queue.poll();
            System.out.println("추출된 값 : " + poll);
        }

        /**
         * queue에는 데이터가 남아있을까요?
         * 확인해 보겠습니다.
         */
        System.out.println(queue);

        /**
         * 다른 것을 실습해 보겠습니다.
         */

        queue.add("리조트파트");
        queue.add("호텔파트");
        queue.add("비즈니스호텔파트");
        queue.add("면세점파트");
        queue.add("테마파크파트");

        /**
         * 입력된 데이터를 확인해 보겠습니다.
         */
        System.out.println(queue);

        /**
         * 이걸 반복문을 통해 다른 방식으로 추출해 볼까요?
         */

        for (int i = 0; i < queue.size(); i++) {
            String peek = queue.peek();
            System.out.println("추출된 값 : " + peek);
        }

        /**
         * 큐에서 peek은 스택에서 peek과 유사합니다.
         * 하나의 값만 반복적으로 추출합니다.
         * 그리고 삭제하지도 않죠.
         * 그래서 처음 값만 반복적으로 추출합니다.
         *
         * 남은 큐를 확인해 볼까요?
         */

        System.out.println("남은 큐");
        System.out.println(queue);

        /**
         * 큐에 데이터가 그대로 남아있음을 확인할 수 있습니다.
         *
         * 큐는 First In First Out의 구조입니다.
         * 먼저 들어온 것이 먼저 나가는 구조입니다.
         * 선입선출의 자료구조 형태를 가져야 할 때는 큐를 활용하시면 좋습니다.
         *
         * 그럼 큐의 강의는 여기서 마치겠습니다.
         *
         * 감사합니다.
         */

    }

}
