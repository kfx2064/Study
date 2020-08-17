package lec04;

/**
 * 구매품목문서
 */
public class ProcureItemDocument {

    public int id;                          // 구매품목 아이디입니다.
    public String procureItemName;          // 구매품목명입니다.
    public String procureItemUnitName;      // 구매품목단위명입니다.
    public int procureItemQty;              // 구매품목수량입니다.
    public int procureItemPrice;            // 구매품목가격입니다.

    /**
     * 위와 같이 변수명을 선언하여 각각의 의미있는 변수명에 필요한 값을 할당할 수 있습니다.
     */

    /**
     * 아래의 내용은 구매품목수량과 가격을 곱하는 것입니다.
     * 이 로직을 수행하고 난 다음에 결과값을 변수에 담습니다.
     * 담긴 변수를 리턴해 줍니다.
     * 이를 통해서 수량과 가격을 곱한 내용을 리턴해 주는 것입니다.
     * 이것으로 메서드를 활용해 볼 수 있습니다.
     * 다른 식을 활용해 볼까요?
     */
    public int addProcureItemQtyPrice() {
        int result = 0;
        result = procureItemQty * procureItemPrice;
        return result;
    }

    /**
     * 아래의 void가 붙은 메서드는 아무런 리턴값도 하지 않는 메서드입니다.
     * 이런 메서드는 보통 내부에서 로직을 수행하고 아무 것도 리턴하지 않고 끝냅니다.
     * 이런 메서드들이 필요한 경우가 있습니다.
     * 예를 들자면 void를 통해서 어떤 값을 리턴하지 않고
     * 그저 내부에서 로직을 수행하고 데이터베이스에 값을 저장수정삭제 등을 하고 끝내는 경우가 있습니다.
     * 아직 감이 잘 안 오실 겁니다.
     *
     * 코딩은 하다보면 늡니다.
     * 반복숙달이 정말 좋죠.
     * 그리고 좋은 코드들을 보며 참고하며 코딩하는 것도 정말 좋습니다.
     * 좋은 코드들을 따라치면서 반복숙달하다 보면은 코드의 품질이 좋아집니다.
     * 그리고 해당 코드들을 따라 치면서 더 좋은 코드를 작성하게 되고,
     * 더 좋은 코드를 작성함으로써,
     * 나중에 실무에서 더 나은 프로그램을 짤 수 있습니다.
     *
     * 아래의 내용은 리턴이 없는 void 형태의 메서드입니다.
     */
    public void showEachVariableValue() {
        System.out.println("id ::: " + id);
        System.out.println("procureItemName ::: " + procureItemName);
        System.out.println("procureItemUnitName ::: " + procureItemUnitName);
        System.out.println("procureItemQty ::: " + procureItemQty);
        System.out.println("procureItemPrice ::: " + procureItemPrice);

        /**
         * 리턴이 없는 void 형태의 메서드에서 각각의 값들을 출력하는 내용을 짜보았습니다.
         * 이런 형태로 값을 출력하는 void 메서드를 짜긴 했는데,
         * 보통 실무 수준에서는 이런 코드를 짜진 않을 겁니다.
         * 거의 안 짜겠죠.
         * 하지만 void 메서드에는 이런 것도 있다, 라는 것을 알아두시면 좋습니다.
         */
    }

    /**
     * 아래의 메서드는 리턴값이 String인 메서드입니다.
     * 이런 메서드를 짜는 이유는 메서드는 return값의 형태로 다양한 형태를 넣을 수 있습니다.
     * 기본형, 참조형 변수 둘 다 가능하죠.
     * 리턴값의 존재 유무는 가장 추상적으로 생각해서 설명해 드리겠습니다.
     * 메서드 내부에서 어떤 로직을 수행합니다.
     * 로직의 수행이 끝났습니다.
     * 로직의 수행결과값이 나옵니다.
     * 해당 값을 전역변수... 아직 안 배운 개념이죠?
     * 다양한 형태를 통해 다른 곳에서도 사용할 수 있을 것입니다.
     * 하지만 메서드에서 리턴값으로 값을 리턴해 주면,
     * 메서드를 호출한 곳에서 바로 값을 리턴 받아 활용할 수 있습니다.
     * 이전 강의 시간에 배운 형태처럼 말이죠.
     * 아래의 코드를 짜보겠습니다.
     */
    public String concatStringValues() {
        String returnValue = "";
        returnValue = "안녕하세요." + " 구매문서품목 클래스입니다.";
        return returnValue;
    }

    /**
     * 위와 같은 형태로 코드를 짤 수가 있습니다.
     * 여러번 강의를 하면서 반복하지만, 보통 하드코딩된 값을 넣을 일은 별로 없습니다.
     * 보통 값을 유기적으로 받아와서 활용하죠.
     * 하지만 저는 말씀 드렸다시피 샘플 코드를 보여드리기 위해 하드코딩을 해서 보여 드립니다.
     * 해당 메서드는 나중에 다른 클래스에서 활용함로써
     * 어떻게 동작하는지 보여 드리겠습니다.
     * 여기까지 메서드들을 짜놓고 클래스의 동작을 보겠습니다.
     */

}
