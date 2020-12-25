package lec07.collectionmap01.mapentry01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 이번에는 MapEntry를 실습해 보겠습니다.
 *
 * 우선 메인 메서드를 만들어 주세요.
 */
public class MapEntry {

    public static void main(String[] args) {

        /**
         * 이전에 실습한 코드를 가져다가 붙여넣겠습니다.
         */

        Map<String, Object> sampleMap = new HashMap<>();

        sampleMap.put("과일", "바나나");
        sampleMap.put("곡물", "쌀");
        sampleMap.put("견과", "호두");
        sampleMap.put("채소", "토마토");
        sampleMap.put("우육", "토시살");
        sampleMap.put("돈육", "삼겹살");
        sampleMap.put("계육", "다리살");

        /**
         * 맵은 준비됐구요, Entry가 무엇인지 직접 코드를 만들어 가면서 확인해 봅시다.
         */

        Set<Map.Entry<String, Object>> entries = sampleMap.entrySet();
        Iterator<Map.Entry<String, Object>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Object> next = iterator.next();
            System.out.println("키 : " + next.getKey() + ", 값 : " + next.getValue());
        }

        /**
         * 이런 식으로 활용할 수 있습니다.
         * 키값을 몰라도 키를 추출할 수 있죠?
         * 맵에서 키값을 모를 때 이런 구조로 풀어내면 잘 사용하실 수 있습니다.
         *
         * 다른 방식으로 풀어내는 것을 코드를 짜보고 이번 강의를 마치겠습니다.
         */
        System.out.println();

        for (Map.Entry<String, Object> entry : sampleMap.entrySet()) {
            System.out.println("키 : " + entry.getKey() + ", 밸류 : " + entry.getValue());
        }

        /**
         * 이런 식으로도 풀어낼 수 있습니다.
         * 그럼 이번 강의는 여기서 마치겠습니다.
         *
         * 감사합니다.
         */

    }

}




