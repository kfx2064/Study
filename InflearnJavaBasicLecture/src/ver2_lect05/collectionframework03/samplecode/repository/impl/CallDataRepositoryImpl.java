package ver2_lect05.collectionframework03.samplecode.repository.impl;

import ver2_lect05.collectionframework03.samplecode.repository.CallDataRepository;

import java.util.Map;

/**
 * CallDataRepository를 구현한 클래스입니다.
 */
public class CallDataRepositoryImpl implements CallDataRepository {

    /**
     * 싱글턴 패턴을 이용하여 DataRepository 객체를 가져옵니다.
     */

    DataRepository dataRepository = DataRepository.getInstance();

    private static CallDataRepositoryImpl instance = new CallDataRepositoryImpl();

    public static CallDataRepositoryImpl getInstance() {
        return instance;
    }

    /**
     * CallDataRepositoryImpl에 대한 싱글턴 패턴 구현 방식입니다.
     */

    private CallDataRepositoryImpl() {
        System.out.println("CallDataRepositoryImpl 기본생성자");
    }

    /**
     * 싱글턴 패턴을 구현하기 위해 private 접근 제한자를 사용한 기본 생성자입니다.
     */

    @Override
    public Map<String, Object> getNationData(String nationName) {
        return (Map<String, Object>) dataRepository.savedDataLkMap.get(nationName);
    }

    /**
     * 싱글턴 패턴 형태로 구현된 객체의 맵에서 특정 국가 데이터를 빼오는 메소드입니다.
     * 이것은 데이터베이스를 실제로 구현하여 사용할 경우,
     * 데이터베이스에서 데이터를 빼오는 작업을 이곳에서 구현합니다.
     */

    @Override
    public String getIndustryData(int paramIndex) {
        return dataRepository.saveDataArrList.get(paramIndex);
    }

    /**
     * 특정 산업 데이터를 빼오는 메소드의 논리 작업을 처리합니다.
     */
}
