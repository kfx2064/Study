package lec04.OOP6.callbyreference;

public class CallByReferenceTest {

    public static int primitiveMethod(int value) {
        return value += 1;
    }

    public static void main(String[] args) {

        int value = 0;
        System.out.println("value = " + value);

        int returnValue = primitiveMethod(value);

        System.out.println("value = " + value);
        System.out.println("returnValue = " + returnValue);
        /**
         * int는 기본형이다.
         * 기본형은 파라미터로 값이 전달되었을 경우,
         * 리턴되는 새로운 값만 변화가 있을 뿐,
         * 기존의 값은 변화가 없다.
         * main method의 원본 int value에는 변화가 없는 것이다.
         * 하지만 return 되는 값을 확인하여 보면 값의 변화를 확인해 볼 수 있다.
         */

        /**
         * 이젠 callByReference를 진행해 보자.
         */
        AClass aClass = new AClass();
        aClass.setValue(1);
        System.out.println("aClass 변수의 value 값 :" + aClass.getValue());

        callByReferenceMethod(aClass);

        System.out.println("aClass의 파라미터를 이용한 변경 시 value의 값 : " + aClass.getValue());

        /**
         * 위는 객체를 새로 생성하는 것이 아니다.
         * 즉 new 연산자를 통해 참조변수에 새로운 객체를 생성하는 과정을 거치지 않았다.
         * 대신에 기존에 생성된 객체의 참조변수를 파라미터로 넘겨준 뒤 해당 메서드 내에서
         * 파라미터로 넘어 온 참조변수의 객체의 값 변경을 수행하였다.
         * 하지만 참조형 변수 내부 속성에 해당하는 value는 변경이 가능하다.
         * 이것이 callByReference이다.
         */

        /**
         * 지금까지의 설명이 복잡하게 느껴졌을 것이다.
         * callByValue와 callByReference의 개념은 어려운 개념이기도 하다.
         * 하지만 쉽게 이해하자면,
         * 파라미터로 기본형의 값을 전달해 주어도,
         * 해당 원본 변수의 값은 변경되지 않는다는 것이다.
         * 리턴되는 값만 변경되어 되돌아 오고, 해당 값을 새로운 변수에 담거나,
         * 기존 변수에 담는 형식을 취해서 값을 변경하는 것만 가능하다는 것이다.
         *
         * callByReference는 객체의 주소값을 담은 참조변수를 파라미터로 넘겨준다.
         * 그리고 해당 메서드 내에서 객체의 주소값을 이용하여 객체의 내부속성에 접근한 후
         * 내부 속성 값을 변경해 주면, 기존의 참조변수에 담긴 객체의 내부속성에도 변경이
         * 일어난다는 것이다.
         *
         * 이것이 callByReference이고 지금까지 실습을 통해 확인해 본 내용이다.
         *
         * 이번 강의는 여기서 마치겠습니다.
         * 감사합니다.
         */

    }

    /**
     * callByReference를 확인해 보기 위한 절차를 진행한다.
     * inner 클래스를 하나 만든다.
     */
    public static class AClass {
        private int value = 0;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public static void callByReferenceMethod(AClass aClass) {
        aClass.setValue(aClass.getValue() + 1);
    }

}
