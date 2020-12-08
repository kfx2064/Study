package lec06.polymorphism01.first;

/**
 * 이번엔 조선 회사에 대해 코딩해 보겠습니다.
 */
public class Ships extends Company {

    public int steelPartsCount;  // 철강부품 개수가 필요하겠지요.
    public int builtInMaterialCount;    // 배의 내부를 만들어 줄 내장재가 필요할 것입니다.

    /**
     * 전자와 조선 두 회사 클래스를 만들었습니다.
     *
     * 이제 메인 메서드를 만들어 보겠습니다.
     */

    public void builtShips() {
        System.out.println("배를 만듭니다.");
    }

    public void builtSeaPlant() {
        System.out.println("해양플랜트를 만듭니다.");
    }

    /**
     * 조선회사들의 핵심 사업을 생각하면 저것들이 떠오르는군요.
     * 그럼 전자 회사와 조선 회사 클래스를 만드는 것은 여기까지 하고
     * 메인 메서드로 이동하겠습니다.
     */

}
