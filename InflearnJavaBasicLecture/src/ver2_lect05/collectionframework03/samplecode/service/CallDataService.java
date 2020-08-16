package ver2_lect05.collectionframework03.samplecode.service;

import java.util.Map;

/**
 * 서비스 인터페이스를 만듭니다.
 */
public interface CallDataService {

    public Object getNationData(String nationName);

    /**
     * 국가 데이터를 가져오는 메소드 뼈대를 만듭니다.
     */

    public String getIndustryData(int paramIndex);

    /**
     * 산업 데이터를 가져오는 메소드 뼈대를 만듭니다.
     */

}
