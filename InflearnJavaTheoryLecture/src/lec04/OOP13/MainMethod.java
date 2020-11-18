package lec04.OOP13;

public class MainMethod {

    public static void main(String[] args) {

        /**
         * 가변인자를 실습해 보겠습니다.
         * 파라미터를 셋팅하고 메인 메소드를 실행하겠습니다.
         */

        DynamicParameter dynamicParameter = new DynamicParameter();
        String[] strArr = new String[]{"electric", "hydrogen", "oil"};
        dynamicParameter.showDynamic("Hyundai", strArr);

    }

}
