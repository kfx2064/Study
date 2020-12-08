package lec06.polymorphism02.first;

/**
 * 우리나라에서 큰 산업군들 중 두 곳을 뽑아보겠습니다.
 * 전자와 조선입니다.
 * 굉장히 많은 고용 창출을 일으키는 분야들 중 하나로 알고 있습니다.
 */
public class Electronics extends Company {

    public int electricalPartsCount; // 전기부품
    public int electronicsPartsCount; // 전자제품

    /**
     * 공통으로 필요한 요소 이외에 전자회사에서는 전기부품과 전자부품이 필요할 것입니다.
     * 그 외에 다양한 부품들이 필요하겠지만 일단 단순하게 떠오르는 것들이 저것들이군요.
     *
     * 그럼 이어서 코딩하겠습니다.
     */

    public void makeMobileDevice() {
        System.out.println("모바일 전자제품을 만듭니다.");
    }

    public void homeDevice() {
        System.out.println("가전제품을 만듭니다.");
    }

    public void systemDevice() {
        System.out.println("시스템 전자제품을 만듭니다.");
    }

    public void coreDeivce() {
        System.out.println("핵심 전자제품을 만듭니다.");
    }

    /**
     * 전자회사의 활동으로 예상해 본 것들을 메서드들로 만들었습니다.
     *
     * 그럼 조선회사 클래스로 넘어가 보겠습니다.
     */

}
