package lec04;

/**
 * 두 번째
 * 클래스와 객체(2)
 */
public class ObjClass02 {

    /**
     * 먼저 구매문서 클래스를 작성한다.
     * Make ProcurementDocument
     *
     * 작성된 구매문서 클래스를 활용하여 코딩을 해보겠습니다.
     */

    public static void main(String[] args) {
        ProcurementDocument procurementDocument = new ProcurementDocument();

        /**
         * 위와 같이 new 연사자를 통해 객체를 생성해 줍니다.
         * 이를 통해서 클래스를 실제로 활용할 수 있게 되는 것입니다.
         * 이제 코딩을 진행해 보겠습니다.
         */

        procurementDocument.procureRequestDocumentQty = 10;
        procurementDocument.orderRequestDocumentQty = 5;
        procurementDocument.orderDocumentQty = 3;
        procurementDocument.contractDocumentQty = 20;
        procurementDocument.estimateDocumentQty = 25;

        /**
         * 위와 같은 형태로 숫자들을 변수에 할당해 줄 수 있습니다.
         * 할당된 변수들은 생성된 객체의 저장수의 변수에 저장되는 것입니다.
         * 더 간단하게 표현해 볼까요...
         * 객체를 생성합니다.
         * 생성된 객체는 설계된 클래스의 내용을 담고 있습니다.
         * 생성된 객체는 .변수명을 통해 클래스 내부의 변수에 접근이 가능합니다.
         * 해당 변수에 맞는 자료형의 값을 할당해 줄 수 있습니다.
         * 그렇게 값을 할당하면 객체의 각각의 변수에 고유의 값을 가질 수 있습니다.
         *
         * 해당 내용을 출력해 볼까요?
         */

        System.out.println(procurementDocument.procureRequestDocumentQty);
        System.out.println(procurementDocument.orderRequestDocumentQty);
        System.out.println(procurementDocument.orderDocumentQty);
        System.out.println(procurementDocument.contractDocumentQty);
        System.out.println(procurementDocument.estimateDocumentQty);

        /**
         * 위의 System.out.println으로 콘솔에 값을 출력해 볼 수 있습니다.
         * 해당 값들이 셋팅된 것을 확인하실 수 있습니다.
         * 그러면 다음 코딩으로 넘어가 볼까요?
         */

        int getTotalDocuQty = procurementDocument.totalDocumentQtyDailyMake();
        System.out.println("getTotalDocuQty ::: " + getTotalDocuQty);

        int getStaticTotalDocuQty = procurementDocument.staticValueCalculateDailyDocument();
        System.out.println("getStaticTotalDocuQty ::: " + getStaticTotalDocuQty);

        /**
         * 위와 같이 메서드를 불러서 사용이 가능합니다.
         * 각 메서드들은 리턴값을 가진 메서드들입니다.
         * 메서드들은 리턴값을 가지거나 가지지 않는 경우가 있습니다.
         * 리턴값을 가지는 경우는 위에서 보는 바와 같이
         * 각각의 자료형의 변수에 값을 담아서 활용할 수 있습니다.
         * 해당 리턴 자료형 변수에 값을 담아서 해당 값을 콘솔에 찍어봄으로써
         * 실제로 어떤 값이 리턴되는지 확인할 수 있습니다.
         *
         * 지금은 실습을 하는 중이므로 이렇게 값을 찍어보는 것으로 확인해 보는 것입니다.
         * 하지만 실습을 다 하고 나면
         * 해당 변수들을 활용하여 데이터베이스에 값들을 집어넣고 빼고 등의
         * 활용을 할 수 있습니다.
         *
         * 이런 식으로 객체지향을 하실 수 있습니다.
         *
         * 저는 자바의 객체지향의 간단한 면을 맛보여 드렸습니다.
         * 다양한 객체지향 코드를 짜보면 더욱 익숙해질 수 있습니다.
         *
         * 이번 강의는 여기까지 하고 다음 강의로 넘어가겠습니다.
         */
    }

}
