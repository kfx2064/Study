package lec04;

/**
 * 구매문서 클래스
 */
public class ProcurementDocument {

    /**
     * 각각의 변수를 선언합니다.
     * 구매요청문서수량
     * 발주요청문서수량
     * 발주문서수량
     * 계약문서수량
     * 견적문서수량
     *
     * 실무보다는 좀 더 가벼운 형태로 구매문서 클래스의 변수를 선언해 보았습니다.
     */

    public int procureRequestDocumentQty;
    public int orderRequestDocumentQty;
    public int orderDocumentQty;
    public int contractDocumentQty;
    public int estimateDocumentQty;

    /**
     * 매일 생산되는 구매 전체 문서 생산량을 계산하는 메서드입니다.
     * 클래스는 이렇게 변수와 메서드로 구성됩니다.
     * 변수는 어떤 값들을 저장하는 저장공간,
     * 메서드는 계산하는 로직이 담겨 있는 공간입니다.
     *
     * 무슨 말을 하는 건지 감이 잘 안 오시죠?
     *
     * 변수는 어떤 값들을 저장하는 공간, 이렇게 생각하세요.
     * 1, 2, 3 이런 값들을 저장하거나,
     * 구매문서, 발주문서, 입고문서, 출고문서,
     * 이렇게 문자열을 저장하거나 하는 것입니다.
     *
     * 아래의 메서드는 되돌려지는 값이 int,
     * 메서드명은 totalDocumentQtyDailyMake인 메서드입니다.
     */
    public int totalDocumentQtyDailyMake() {

        /**
         * 아래의 계산식은 int totalDocument라는 변수에 각각 생산된 구매문서를 담는 공간이 됩니다.
         *
         * 문득 의문이 드실 겁니다.
         * 그냥 변수만 각각 더하고 totalDocument라는 값이 리턴되니,
         * 어떻게 계산되는 거지요? 하고 말입니다.
         *
         * procureRequestDocumentQty라는 변수에 이 ProcurementDocument라는 클래스를 활용하여
         * 각각의 변수에 값을 셋팅하는 것입니다.
         *
         * 말이 조금 어려우실 수 있습니다.
         *
         * 객체 지향의 개념을 배우지 않았으니까요.
         *
         * 일단 클래스 설계를 해놓고 각각의 변수에 값을 할당하는 겁니다.
         * 정확히는 설계된 클래스를 활용할 곳에서,
         * 객체를 생성하여 해당 객체에 변수들의 공간에 값을 할당하는 겁니다.
         * 생성된 객체가 원래 생성될 때 참고한 클래스에 선언된 변수명의 공간에
         * 값들을 할당하는 겁니다.
         * 그리고 해당 값들을 이용하여 아래와 같은 계산을 하는 것입니다.
         * 만약 객체를 생성하고 값을 할당하지 않는다면?
         * 제대로 계산이 되지 않을 겁니다.
         * 아래와 같은 메서드를 짜는 형태는 변수들에 값을 할당하고
         * 계산한다고 전제하는 것입니다.
         */

        int totalDocument = procureRequestDocumentQty + orderRequestDocumentQty + orderDocumentQty
                + contractDocumentQty + estimateDocumentQty;

        return totalDocument;
    }

    /**
     * 위와 같이 메서드를 작성하였습니다.
     * 그런데 문득 의문이 드실 겁니다.
     * 그냥 값이 할당된 메서드도 필요하지 않을까요? 라고 말입니다.
     *
     * 네, 가능합니다.
     *
     * 아래와 같이 짜보겠습니다.
     */

    public int staticValueCalculateDailyDocument() {
        int totalDocuCnt = 0;

        /**
         * 아래와 같은 형태로 값을 짤 수가 있습니다.
         * int 값을 하드코딩한 형태로 짤 수 있는 것이지요.
         *
         * 보통 하드코딩한 값을 활용하는 경우는 별로 없습니다.
         * 하드코딩을 하기 보다는 여러 군데에서 값을 동적으로 받아와서
         * 활용하는 것이 일반적인 것이지요.
         * 데이터베이스에서 조회하여 가져온 값이라든가,
         * 화면에서 넘겨받은 값을 활용하는 것이라든가 말입니다.
         */

        totalDocuCnt = 10 + 5 + 1 + 3 + 5;

        return totalDocuCnt;
    }

    /**
     * 위와 같은 형태로 메서드를 짤 수가 있습니다.
     * 구매문서에 대한 클래스는 위와 같이 짜고
     * 다시 해당 구매문서 클래스를 활용하는 곳으로 넘어가 보겠습니다.
     */

}
