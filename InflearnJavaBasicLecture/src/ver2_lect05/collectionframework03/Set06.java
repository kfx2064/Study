package ver2_lect05.collectionframework03;

import java.util.ArrayList;
import java.util.HashSet;

public class Set06 {

    /**
     * 이번엔 Set입니다.
     *
     * Set은 별로 쓰이지 않는 자료구조입니다.
     * 현업에서 일하다 보면 정말 많이 쓰는 자료 구조는 Map과 List입니다.
     * Map은 HashMap,
     * List는 ArrayList를 정말 많이 씁니다.
     * Set은 별로 쓰일 일이 없죠.
     * 이유가 있습니다.
     *
     * Set은 자료를 중복하여 입력하지 않습니다.
     * "국가", "한국" 이란 데이터가 존재한다고 합시다.
     * "국가"는 키 값이며 "한국"은 밸류라고 합시다.
     * 보통 키, 밸류 형태로 저장되곤 합니다.
     * Map과 Set은.
     * "국가"라는 key 값에 "한국" 과 "미국" 이 순차적으로 들어가면 어떻게 될까요?
     * 실습을 해봅시다.
     */

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(1);
        System.out.println(hashSet.toString());

        /**
         * 보셨습니까?
         * 1, 2, 1을 입력하면 1과 2만 입력이 됩니다.
         *
         * 다른 예를 들어볼까요?
         */

        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1);
        System.out.println("arrayList : " + arrayList.toString());

        /**
         * ArrayList는 순차적으로 넣은 데이터가 잘 출력되지요?
         * 근데 Set은 중복된 데이터가 걸러집니다.
         *
         * Set은 중복된 데이터를 입력받지 않습니다.
         * 그런 점이 특징이지요.
         *
         * 프로그래밍은 드물게 사용하지만 필요한 경우도 있습니다.
         * Set의 이런 특성을 사용하면 중복된 데이터를 걸러내고
         * 독립된 데이터들만 존재하게 할 수 있습니다.
         * 알고리즘을 짜다보면 그런 경우가 생기게 되지요.
         * 이런 경우들을 잘 생각하여 코딩하시면 됩니다.
         *
         * 그럼 Set에 대한 설명은 이 정도로 하겠습니다.
         *
         * 그리고 Set은 깊게 다루지 않을 것입니다.
         *
         * Set에는 HashSet, TreeSet, LinkedHashSet이 존재합니다.
         * 각각의 특징은 HashSet은 해시코드로 값을 분류하여 넣는다는 것,
         * TreeSet은 트리 구조로 짠다는 것,
         * LinkedHashSet은 Link로 연결된 구조로 짠다는 것입니다.
         *
         * 자주 사용하지 않는 자료구조이므로 입문 강의에서는 이 정도로 설명 드리고 넘어가겠습니다.
         *
         * 감사합니다.
         */
    }

}
