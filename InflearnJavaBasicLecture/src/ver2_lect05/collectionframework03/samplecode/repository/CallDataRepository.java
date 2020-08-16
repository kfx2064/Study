package ver2_lect05.collectionframework03.samplecode.repository;

import java.util.List;
import java.util.Map;

/**
 * 레포지토리 인터페이스입니다.
 * 여기서는 레포지토리 임플리먼트에서 사용할 기본적인 메소드들을 정의해 줍니다.
 *
 * 이것이 인터페이스의 기능이기도 합니다.
 * 여러가지 기능이 있지만
 * 해당 인터페이스를 구현하여 사용하는 클래스는
 * 인터페이스에 정의된 기능 목록을 무조건 사용해야 하는 점이 있습니다.
 */
public interface CallDataRepository {

    /**
     * 국가 데이터를 가져오는 메소드 기능입니다.
     * 국가 이름을 파라미터로 하여 국가 데이터를 가져오는 것입니다.
     */
    public Object getNationData(String nationName);

    /**
     * 산업 데이터를 가져오는 메소드 기능입니다.
     * 파라미터는 인덱스를 파라미터로 하여 String 타입의 산업 데이터를 가져옵니다.
     */
    public String getIndustryData(int paramIndex);

    /**
     * 이렇게 하여 가상의 데이터베이스에서 데이터를 불러올 작업을 할 클래스를
     * 구현하기 위한 뼈대인 인터페이스를 만들었습니다.
     */

}
