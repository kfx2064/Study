package ver2_lect05.collectionframework03;

import java.util.*;

public class Map07 {

    /**
     * Map 구조입니다.
     * Map은 Key, Value 형태로 이루어져 있습니다.
     * Key는 고유한 구분 값이 됩니다.
     * 그리고 key에 따라서 Value를 가져옵니다.
     * 일단 실습을 하고 나머지 설명을 해드리겠습니다.
     */

    public static void main(String[] args) {

        /**
         * 먼저 해쉬맵을 실습하겠습니다.
         */

        HashMap hashMap = new HashMap();
        hashMap.put("국가1", "한국");
        hashMap.put("국가2", "미국");
        hashMap.put("국가3", "중국");
        hashMap.put("국가4", "러시아");
        hashMap.put("국가5", "일본");

        System.out.println(hashMap.toString());

        /**
         * 해쉬맵은 순서에 상관없이 들어갑니다.
         */

        LinkedHashMap lkMap = new LinkedHashMap();
        lkMap.put("국가1", "한국");
        lkMap.put("국가2", "미국");
        lkMap.put("국가3", "중국");
        lkMap.put("국가4", "러시아");
        lkMap.put("국가5", "일본");

        System.out.println(lkMap.toString());

        /**
         * 링크드해쉬맵은 순서대로 값이 들어가지요.
         *
         * 둘 다 공통점은 맵을 상속받아 구현된 자료 구조라는 것입니다.
         * 그렇기 때문에 맵 형태의 근본적인 구조는 그대로 가져간다는 것입니다.
         * 맵은 키, 밸류 형태의 구조를 가집니다.
         * 구분값인 키를 통해서 밸류를 추출해 내는 것이죠.
         * 맵과 리스트는 정말 많이 쓰이는 자료 구조입니다.
         *
         * 맵에는 HashMap, TreeMap, LinkedHashMap이 있습니다.
         * 이 중에서 정말 많이 쓰이는 자료구조는 HashMap입니다.
         * HashMap을 가장 많이 쓰고 때로는 LinkedHashMap을 사용합니다.
         * TreeMap은 자주 사용되지 않는 구조이지요.
         *
         * HashMap은 키를 해쉬코드 값으로 분류하여 관리합니다.
         * 해쉬코드라는 것이 궁금하시죠?
         *
         * 지금은 설명해 드려도 잘 이해되시지 않을 겁니다.
         * 해쉬 코드가 무엇인지 잠깐 보여드릴 수 있습니다.
         */

        String testA1 = "a";
        String testA2 = "a";

        int hc1 = testA1.hashCode();
        int hc2 = testA2.hashCode();

        System.out.println("hc1 : " + hc1);
        System.out.println("hc2 : " + hc2);

        String nationName1 = String.valueOf("한국");
        String nationName2 = String.valueOf("한국");

        int nn1hc = nationName1.hashCode();
        int nn2hc = nationName2.hashCode();

        System.out.println("nn1hc : " + nn1hc);
        System.out.println("nn2hc : " + nn2hc);

        /**
         * 위와 같이 고유한 해쉬코드 값을 특정 값들은 가지고 있습니다.
         * 해쉬코드들은 특정 값을 가지고 있고 그런 해쉬코드들을 통해 정렬하는 것이
         * HashMap, LinkedHashMap입니다.
         * HashMap은 key를 HashSet 타입으로 관리합니다.
         * LinkedHashMap은 HashMap의 특징에서 순차적으로 값을 정렬하여 가지고 있다는
         * 특징도 가지고 있습니다.
         * 위에서 LinkedHashMap을 만들어서 값을 넣어봤기에 잘 아실 수 있으실 겁니다.
         *
         * Map은 고유한 key와 value를 가진 값들을 저장하기에 좋습니다.
         * 예를 들자면
         * id : 1
         * procureRequestNo : 20200816001
         * procureItemCd : 0001
         * procureItemNm : 소고기 등심
         * procureUnitCd : 0002
         * procureUnitNm : kg
         * procureQuantity : 10
         * procurePrice : 2000
         *
         * 이런 식의 key, value 값을 저장하기에 적합합니다.
         *
         * 프로그래밍에는 데이터베이스를 사용하지 않는 프로그래밍도 존재할 것입니다.
         * 하지만 프로그래밍에는 대부분이 데이터베이스를 사용하는 프로그래밍입니다.
         * 데이터베이스를 사용할 때는 key, value 형태의 자료구조는 매우 유용한 자료구조 형태입니다.
         *
         * 저는 이 Map과 List를 활용한 샘플 코드를 짜볼 생각이 있습니다.
         *
         * 그럼 맵에 대한 설명은 이 정도로 하겠습니다.
         *
         * 감사합니다.
         */

    }

}

