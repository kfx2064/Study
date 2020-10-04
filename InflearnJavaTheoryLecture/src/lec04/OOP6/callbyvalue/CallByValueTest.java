package lec04.OOP6.callbyvalue;

public class CallByValueTest {

    public static void main(String[] args) {

        int first = 3;
        int second = first;

        int third = doSomething(first);
        System.out.println("동일 변수 비교 : " + (first == second));
        System.out.println("메서드로 계산된 값 : " + third);

        /**
         * doSomething 메서드로 값이 4로 변경된 것을 리턴한다.
         * 하지만 callByValue에 의해 int first와 int second의 값은 그대로 유지된다.
         * 즉 어떤 특정 method를 통해서 값을 변경할 수가 없는 것이다.
         * 기본형은 값 자체를 저장하기 때문이다.
         * 이것이 callByValue이다.
         */

        InnerClass1 innerClass1 = new InnerClass1();
        InnerClass1 innerClass2 = innerClass1;

        InnerClass1 innerClass3 = makeNewEntity(innerClass1);
        System.out.println("동일 객체 비교 : " + (innerClass1 == innerClass2));
        System.out.println(innerClass1);
        System.out.println(innerClass2);
        System.out.println("1번과 3번 비교 : " + (innerClass1 == innerClass3));
        /**
         * 결과값을 보면 두 객체는 동일하다는 것을 표시하여 준다.
         * 객체를 프린팅해봐도 동일한 내용의 값이 뜬다.
         * 결국 callByValue 하에서는 method를 사용하여 값을 변경할 수 없다.
         * 참조형의 경우 method의 파라미터로 메모리 주소를 전달하여
         * 메서드 내부에서 주소의 변경, 즉 새로운 객체를 생성하는 작업을 수행하더라도,
         * 외부의 주소를 변경할 수가 없다.
         * 즉 파라미터로 innerClass1의 변수명을 던지면, 해당 변수명에 담긴 주소값은
         * 그대로 유지된 채로 새로운 객체가 생성되어 innerClass3에 담기는 것이다.
         * 그래서 innerClass1과 innerClass3을 비교하면 false가 뜬다.
         */
        System.out.println(innerClass1);
        System.out.println(innerClass3);
        /**
         * 두 개의 변수명을 콘솔에 찍어보면 담긴 값이 다르다는 것을 알 수 있다.
         * 즉 innerClass1을 파라미터로 던져줘서 해당 변수명에 새로운 객체를 생성하여 담아서 리턴하더라도,
         * 메서드 외부에 있는 innerClass1에는 영향을 주지 않는다.
         * 이것이 callByValue이다.
         */

    }

    public static class InnerClass1 {

    }

    public static int doSomething(int one) {
        one++;
        return one;
    }

    public static InnerClass1 makeNewEntity(InnerClass1 innerClass1) {
        innerClass1 = new InnerClass1();
        return innerClass1;
    }

}
