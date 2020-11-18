package lec04.OOP13;

public class DynamicParameter {

    /**
     * 가변인자입니다.
     * 가변인자는 여러 개의 파라미터를 하나의 변수로 받을 수 있습니다.
     * 그냥 이론만 들으면 좀 어려운 개념입니다.
     * 실습을 통해서 따라와 보세요.
     */

    public void showDynamic(String carName, String... energy) {

        System.out.println("차 이름 : " + carName);

        int energyLength = energy.length;

        /**
         * 가변인자로 받은 파라미터를 풀어놓는 반복문을 하나 작성할 것입니다.
         * 따라서 쳐보세요.
         */

        for (String en : energy) {
            System.out.println("에너지 : " + en);
        }

    }

}
