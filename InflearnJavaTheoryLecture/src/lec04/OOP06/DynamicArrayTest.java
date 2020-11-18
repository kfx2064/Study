package lec04.OOP06;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray dArray = new DynamicArray();
        dArray.dynamicMethod("Grape", "WaterMelon", "Apple", "Orange");

        // 배열을 이용할 수도 있다.
        dArray.dynamicMethod(new String[]{"Samsung", "SK", "Hyundai", "LG"});

        /**
         * 이런 것이 동적 파라미터를 이용하는 방법이다.
         */

    }

}
