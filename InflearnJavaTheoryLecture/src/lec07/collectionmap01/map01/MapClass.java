package lec07.collectionmap01.map01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 컬렉션 프레임워크에서 맵입니다.
 * 컬렉션 프레임워크는 매우 중요합니다.
 * 자바에서 객체지향 다음으로 중요한 개념이라고 개인적으로 생각합니다.
 * 컬렉션 프레임워크를 얼마나 잘 다루느냐에 따라
 * 알고리즘을 짜는 효율이 달라집니다.
 * 
 * 이유가 궁금하시겠죠?
 * 컬렉션 프레임워크는 자료구조를 간편하게 구현해 놓은 것입니다.
 * 자료구조는 자료를 어떤 형태로 저장할지 구조를 짜놓은 것을 의미합니다.
 * 그리고 알고리즘은 이런 자료, 영어로는 데이터이죠.
 * 데이터를 매우 효율적으로, 그리고 효과적으로 처리하는 절차를 의미합니다.
 * 그래서 자료구조와 알고리즘은 쌍으로 움직입니다.
 * 
 * 컬렉션 프레임워크를 잘 사용하면 자료구조를 잘 사용하는 것과 
 * 동일한 효과를 낼 수 있습니다.
 * 그 다음 남은 것은 효율적인 자료구조를 통해서 효과가 높은
 * 알고리즘을 짜는 것이죠.
 * 그래서 컬렉션 프레임워크를 잘 쓰는 것은 실무에서 중요합니다.
 *
 * 그럼 시작하겠습니다.
 */
public class MapClass {

    public static void main(String[] args) {

        /**
         * 맵을 선언하겠습니다.
         */
        Map<String, Object> sampleMap = new HashMap<>();

        /**
         * 다이아몬드 표시는 제네릭입니다.
         * 벌써 잊지 않으셨겠지요?
         * 자료의 형태를 명시적으로 알려주는 것입니다.
         *
         * map은 key와 value로 구성됩니다.
         *
         * map의 key는 String, value는 Object로 지정하는 것입니다.
         * 실무에서 정말 많이 쓰이는 map의 형태입니다.
         */

        sampleMap.put("과일", "바나나");
        sampleMap.put("곡물", "쌀");
        sampleMap.put("견과", "호두");
        sampleMap.put("채소", "토마토");
        sampleMap.put("우육", "토시살");
        sampleMap.put("돈육", "삼겹살");
        sampleMap.put("계육", "다리살");

        /**
         * 이런 식으로 데이터를 추가해 줄 수 있습니다.
         * 앞의 것은 key 값. 뒤에 것의 value인 것이지요.
         * 자, 다음 코딩을 따라와 주세요.
         */

        System.out.println(sampleMap.toString());

        /**
         * 저장된 값들을 확인할 수 있죠?
         * 저것은 제대로 된 방식은 아닙니다.
         * 하지만 코딩 중간중간에 값을 확인하는 로직을 넣을 때 즐겨 활용됩니다.
         * 다만 단점은 null 값인데 toString 메서드를 사용하려면 null 예외가 발생합니다.
         */

        //Map nullMap = null;
        //System.out.println(nullMap.toString());

        /**
         * 실습해 보니까 바로 확인이 되지요?
         * 그럼 다음 것을 보겠습니다.
         */

        Object chicken = sampleMap.get("계육");
        System.out.println(chicken);

        /**
         * get 메서드를 통해서 값을 하나 추출했습니다.
         * map에서 value를 추출할 때는 get 메서드를 통해서 추출해야 합니다.
         * map 자료구조는 key가 명확하게 정해져 있을 때 사용하면 그 효과가 배가 됩니다.
         * 이제부터는 메서드를 하나씩 써보는 걸 해볼까요?
         */

        boolean isChicken = sampleMap.containsKey("계육");
        boolean isFreshLeg = sampleMap.containsValue("다리살");

        System.out.println("isChicken : " + isChicken);
        System.out.println("isFreshLeg : " + isFreshLeg);

        Set<Map.Entry<String, Object>> entries = sampleMap.entrySet();
        Set<String> keySetstrings = sampleMap.keySet();
        boolean isEmpty = sampleMap.isEmpty();
        Collection<Object> values = sampleMap.values();
        int size = sampleMap.size();

        System.out.println("entries : " + entries);
        System.out.println("keySetstrings : " + keySetstrings);
        System.out.println("isEmpty : " + isEmpty);
        System.out.println("values : " + values);
        System.out.println("size : " + size);

        /**
         * 이렇게 각각의 메서드를 사용해 봤습니다.
         * 정말 자주 쓰이는 메서드는 put과 get입니다.
         * 그 외의 메서드는 그때그때마다 구글에서 찾아가면서 써도 무방한 메서드입니다.
         * 물론 이론 시험을 보실 때는 사용하시는 교재를 보시고 잘 외우신 다음에 보셔야겠죠.
         */

        Map<String, Object> copyMap = new HashMap<>();
        boolean empty = copyMap.isEmpty();

        System.out.println("copyMap is empty : " + empty);

        copyMap.putAll(sampleMap);
        boolean equals = sampleMap.equals(copyMap);

        System.out.println("같은가 : " + equals);

        /**
         * isEmpty, putAll, equals를 다르게 실습해 보았습니다.
         *
         * 그럼 이번 강의는 여기서 마치겠습니다.
         */

    }

}
















