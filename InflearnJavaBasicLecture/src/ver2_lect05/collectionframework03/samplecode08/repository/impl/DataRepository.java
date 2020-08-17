package ver2_lect05.collectionframework03.samplecode08.repository.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * 데이터 레포지토리를 생성하겠습니다.
 *
 * 일종의 데이터베이스 역할을 수행하는 클래스입니다.
 * 가상의 데이터베이스라고 하겠습니다.
 */
public class DataRepository {

    private static DataRepository instance = new DataRepository();

    public static DataRepository getInstance() {
        return instance;
    }

    /**
     * 이 패턴은 싱글턴 패턴이라 부르는 형태입니다.
     * 디자인 패턴에서 배울 수 있는 것이죠.
     * 어려운 패턴입니다.
     * 싱글턴 패턴을 구현하면 장점은 객체를 한 개만 생성해서 계속 사용할 수 있다는 점입니다.
     * 객체 한 개를 생성해서 계속 사용할 수 있으므로
     * 하나의 객체의 값을 여러 곳에서 공통으로 사용할 수 있다는 것입니다.
     * 싱글턴 객체는 메모리의 사용을 줄이기 위해서도 사용하지만
     * 동일한 객체의 데이터를 사용하기 위해서도 씁니다.
     */

    public LinkedHashMap<String, Object> savedDataLkMap = null;
    public ArrayList<String> saveDataArrList = null;

    /**
     * 링크드해쉬맵과 어레이리스트는 스태틱으로 선언하였습니다.
     * 이를 통해 모든 곳에서 객체 생성없이 불러올 수 있습니다.
     * 또 하나의 장점이 있습니다.
     * 이 객체를 가진 곳에서는 모두 동일한 데이터를 활용할 수 있다는 점입니다.
     */

    private DataRepository() {

        System.out.println("DataRepository 생성자");

        savedDataLkMap = new LinkedHashMap<>();
        saveDataArrList = new ArrayList<>();

        /**
         * 기본 생성자에서 데이터들을 셋팅합니다.
         * 맵과 리스트에서 데이터들을 셋팅함으로써
         * 가상의 데이터베이스 역할을 수행하게 합니다.
         */

        savedDataLkMap.put("국가1", "한국");
        savedDataLkMap.put("국가2", "미국");
        savedDataLkMap.put("국가3", "중국");
        savedDataLkMap.put("국가4", "일본");
        savedDataLkMap.put("국가5", "러시아");

        saveDataArrList.add("전자");
        saveDataArrList.add("자동차");
        saveDataArrList.add("조선");
        saveDataArrList.add("IT");
        saveDataArrList.add("디스플레이");
        saveDataArrList.add("건설");
        saveDataArrList.add("에너지");
    }

}
