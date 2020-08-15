package lec04;

import com.sun.security.jgss.GSSUtil;

/**
 * 세 번째
 * 클래스와 객체(3)
 */
public class ObjClass03 {


    public static void main(String[] args) {

        /**
         * 메인 메서드에서 객체를 생성하고 활용하기 시작합니다.
         */

        ProcureItemDocument procureItemDocument = new ProcureItemDocument();

        /**
         * 구매품목문서를 객체 생성했습니다.
         * 이제 객체의 각 변수에 값을 할당해 보겠습니다.
         */

        procureItemDocument.id = 1;
        procureItemDocument.procureItemName = "의자";
        procureItemDocument.procureItemUnitName = "개";
        procureItemDocument.procureItemPrice = 1000;
        procureItemDocument.procureItemQty = 1;

        /**
         * 위와 같이 값을 셋팅합니다
         * id는 1 이란 정수값을 셋팅해 주었죠.
         * 보통 id 값은 데이터베이스와 연계된 프로그래밍을 할 때 많이 활용합니다.
         * auto increment나 sequence를 통해 자동 증가하는 값을 할당하죠.
         * 데이터베이스를 배울 때 알게되는 개념이긴 한데,
         * auto increment를 하면서 자동 증가하는 값을 할당하거나
         * sequence를 통해 자동 증가하는 값을 할당하여
         * 고유의 값을 가지게 합니다.
         *
         * primary key의 형태로 지정하는 것이죠.
         * primary key는 기본키라고 합니다.
         * 기본키는 데이터베이스를 배울 때 알게 되는 개념입니다.
         * not null 형태를 가지고 오로지 고유하게 존재하는 값인 것입니다.
         * 무슨 의미인지 잘 안 와닿는 게 데이터베이스를 안 배우셨다면 정상입니다.
         * 즉 값을 무조건 가지고 있어야 하고 해당 값은 다른 값과 동일하게 중복되는
         * 값이어서는 안 된다는 것입니다.
         * 너무 먼 곳까지 강의가 나가는군요.
         * 다시 되돌아오겠습니다.
         *
         * 그리고 아래에 각각의 이름, 수량, 가격 등의 값들을 할당합니다.
         * 해당 값을 다 할당하면 생성된 객체에 값이 셋팅되는 것입니다.
         *
         * 그런 다음 아래에 메서드 콜을 해보겠습니다.
         */

        int addItemQtyPrice = procureItemDocument.addProcureItemQtyPrice();
        System.out.println("addItemQtyPrice ::: " + addItemQtyPrice);
        String concatStrVal = procureItemDocument.concatStringValues();
        System.out.println("concatStrVal ::: " + concatStrVal);
        procureItemDocument.showEachVariableValue();

        /**
         * 위와 같은 형태로 메서들을 콜하여 쓸 수 있습니다.
         * 메서드들의 내용은 각각의 클래스를 설계하면서 설명 드렸죠?
         * 해당 내용을 구현한 형태라고 보시면 됩니다.
         *
         * 클래스들의 내용들을 이정도로 설명하고 다음부터 이론 설명에 들어가겠습니다.
         */

    }

}
