package lec07.collectioniterator07;

import java.util.*;

/**
 * 이번 강의는 iterator에 대해 실습해 보겠습니다.
 * iterator는 실습을 통해 아는 것이 가장 좋다고 생각하기 때문입니다.
 */
public class IteratorMain {

    public static void main(String[] args) {

        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("1", "모바일사업부");
        dataMap.put("2", "가전사업부");
        dataMap.put("3", "메모리반도체사업부");
        dataMap.put("4", "시스템반도체사업부");
        dataMap.put("5", "자동자전자장비사업부");

        /**
         * 맵 자료구조를 하나 만들어 보았습니다.
         *
         * 입력된 데이터를 한 번 확인해 볼까요?
         */

        System.out.println(dataMap);

        Set<Map.Entry<String, Object>> entrySetData = dataMap.entrySet();
        Iterator<Map.Entry<String, Object>> iteratorData = entrySetData.iterator();

        while (iteratorData.hasNext()) {
            Map.Entry<String, Object> nextData = iteratorData.next();
            System.out.println("키 : " + nextData.getKey() + ", [[[]]] 값 : " + nextData.getValue());
        }

        /**
         * iterator는 이런 식으로 활용할 수 있습니다.
         * 입력된 데이터를 순차적으로 풀어내는 것이지요.
         *
         * 다른 것도 실습해 볼까요?
         */

        List dataList = new ArrayList();
        dataList.add("수원공장");
        dataList.add("파주공장");
        dataList.add("천안공장");
        dataList.add("울산공장");
        dataList.add("창원공장");

        System.out.println(dataList);

        /**
         * List의 데이터를 확인해 보았습니다.
         *
         * listIterator를 사용해 볼까요?
         */

        ListIterator listIterator = dataList.listIterator();

        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            System.out.println("값 추출 : " + next);
        }

        /**
         * 이런 식으로 ListIterator를 사용할 수 있습니다.
         *
         * 값을 순차적으로 뽑아내야 할 때는 이런 것들을 활용할 수 있습니다.
         *
         * Iterator의 사용 목적은 자료구조에서 값을 순차적으로 뽑아내기 위함입니다.
         * 여기서 특이점이 있는데 ListIterator는 List 자료구조에서 주로 사용합니다.
         * 그 외에는 Iterator를 활용하시는 것이 좋습니다.
         *
         * iterator 강의는 여기서 마치겠습니다.
         */

    }

}
