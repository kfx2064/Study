package ver2_lect05.collectionframework03.samplecode08.service.impl;

import ver2_lect05.collectionframework03.samplecode08.repository.impl.CallDataRepositoryImpl;
import ver2_lect05.collectionframework03.samplecode08.service.CallDataService;

/**
 * CallDataService 인터페이스를 구현한 클래스입니다.
 */
public class CallDataServiceImpl implements CallDataService {

    CallDataRepositoryImpl callDataRepositoryImpl = null;

    public CallDataServiceImpl() {
        System.out.println("CallDataServiceImpl 기본생성자");
        callDataRepositoryImpl = CallDataRepositoryImpl.getInstance();
    }

    /**
     * 싱글턴으로 구현한 CallDataRepositoryImpl 객체를 가져옵니다.
     */

    @Override
    public Object getNationData(String nationName) {
        return callDataRepositoryImpl.getNationData(nationName);
    }

    /**
     * 본래 데이터베이스를 사용하여 구현하면,
     * Service에서는 업무적인 논리적 처리를 구현합니다.
     * 그러면서 Transaction이란 기능도 추가하죠.
     * 만약 데이터베이스 작업을 하다가 예외가 발생할 경우,
     * 저장이나 수정, 삭제 등을 되돌리는 작업을 수행하는 것입니다.
     *
     * 여기서는 가상의 데이터베이스 기능을 사용하는 것입니다.
     */

    @Override
    public String getIndustryData(int paramIndex) {
        return callDataRepositoryImpl.getIndustryData(paramIndex);
    }

    /**
     * 산업 데이터를 가져옵니다.
     * 파라미터로는 인덱스를 사용합니다.
     */

}
