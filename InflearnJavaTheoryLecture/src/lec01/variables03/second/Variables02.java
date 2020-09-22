package lec01.variables03.second;

/**
 * 변수 강의 02
 */
public class Variables02 {

    /**
     * 메인 메서드를 만들었습니다.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 상품 VO 객체를 생성합니다.
         * 자세한 내용은 모르셔도 괜찮습니다.
         * 입문 강의를 먼저 수강하고 오신 분들에게는 이해가 가능 내용일 것입니다.
         * 하지만 이 강의만 듣거나 이 강의부터 들으시는 분들에게는 이해가 가지 않으실 겁니다.
         * 객체지향의 기초 지식이 없다면 이해가 되지 않는 것이 정상입니다.
         */
        GoodsVO01 gdsVO01 = new GoodsVO01();
        GoodsVO01 gdsVO02 = new GoodsVO01();

        /**
         * 데이터들을 셋팅합니다.
         * 따라서 해보세요.
         */
        gdsVO01.gdsNo = "gds001";
        gdsVO01.gdsName = "물";
        gdsVO01.gdsPrice = 500;
        gdsVO01.gdsQuantity = 1;

        gdsVO02.gdsNo = "gds002";
        gdsVO02.gdsName = "햇반";
        gdsVO02.gdsPrice = 2000;
        gdsVO02.gdsQuantity = 2;

        /**
         * 각각의 데이터를 다 셋팅해 보았습니다.
         * 데이터를 한 번 출력해 볼까요?
         */
        System.out.println("상품1 번호 : " + gdsVO01.gdsNo);
        System.out.println("상품1 이름 : " + gdsVO01.gdsName);
        System.out.println("상품1 가격 : " + gdsVO01.gdsPrice);
        System.out.println("상품1 수량 : " + gdsVO01.gdsQuantity);

        System.out.println("상품2 번호 : " + gdsVO02.gdsNo);
        System.out.println("상품2 이름 : " + gdsVO02.gdsName);
        System.out.println("상품2 가격 : " + gdsVO02.gdsPrice);
        System.out.println("상품2 수량 : " + gdsVO02.gdsQuantity);

        /**
         * 이렇게 데이터가 출력되는 모습을 확인하실 수 있습니다.
         *
         * 데이터의 타입은 다 다릅니다.
         * 문자열이 있고 정수형이 있지요.
         * 저렇게 다양한 데이터를 포함할 때 참조형을 사용합니다.
         *
         * 참조형을 통해 다양한 데이터들을 표현할 수 있습니다.
         * 실무에 가면 복잡한 데이터를 가진 정보를 표현해야 하는 경우가 있습니다.
         * 그럴 때는 이런 참조형 변수를 사용합니다.
         * 웹 프로그래밍을 하시다 보면 많이 듣는 이야기가 DTO, VO라는 이야기입니다.
         * 이런 것들을 통해 복잡한 데이터를 표현하여 줍니다.
         *
         * 이번 강의는 여기서 마치겠습니다.
         * 다음 강의에서 뵙겠습니다.
         *
         * 감사합니다.
         */

    }

}
