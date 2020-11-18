package lec04.OOP05;

public class MethodDesc {

    /**
     * 메서드의 구성
     *
     * 메서드는 크게 선언부와 구현부로 이루어져 있다.
     */

    void printInfo() {
        System.out.println("Hello, world.");
    }

    /**
     * void는 반환타입, printInfo는 메서드 이름이다.
     * 괄호 안은 매개변수를 담는 곳이다.
     */

    void printInfo(String goodsName) {

    }

    /**
     * 이와 같은 메서드 선언을 하게 되면 String goodsName은 파라미터가 된다.
     * 즉 매개변수가 된다는 의미이다.
     * String은 매개변수의 타입, goodsName은 매개변수의 이름이 된다.
     *
     * 다른 예도 살펴보자.
     */

    int calculateSum(int quantity, int price) {
        int totalPrice = quantity * price;
        return totalPrice;
    }

    /**
     * 이런 형태의 메서드도 가능하다.
     * 이런 형태의 메서드는 계산된 값을 return 문을 통해 되돌려 주는 것이다.
     * 해당 메서드의 반환 타입은 int이다.
     * 반환 타입 int를 충족시키려면 계산된 결과값의 타입도 int여야 한다.
     *
     * 그렇기 때문에 두 개의 int 값의 곱하기를 int형 변수에 담고 리턴해 주는 것이다.
     *
     * 메서드의 이름을 읽을 때는 의미를 알 수 있는 것으로 지어야 한다.
     * 낙타등표기법이라 부르는 방법으로 지어야 한다.
     * 읽었을 때 자연스럽게 의미가 해석되어야 하는 것이 좋은 메서드 명명법이다.
     */

    int addMaterial(int newInput) {
        int remainValue = 0;
        remainValue = remainValue + newInput;
        return remainValue;
    }

    /**
     * 이 메서드에서 매개변수는 newInput이다.
     * remainValue는 지역변수라고 할 수 있다.
     * addMaterial이란 메서드명은 자연스럽게 읽힐 수 있다.
     * 물질을 더한다라는 의미가 되기 때문이다.
     * remainValue는 지역변수이기 때문에
     * 메서드의 사용이 끝나면 더 이상 사용이 불가하다.
     * 그리고 메서드 내부에서만 사용이 가능하다.
     * 그렇기 때문에 이름도 지역변수이다.
     */

}
