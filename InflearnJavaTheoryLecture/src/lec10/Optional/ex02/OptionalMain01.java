package lec10.Optional.ex02;

import java.util.Optional;

public class OptionalMain01 {

    public static void main(String[] args) {

        /**
         * orElseThrow는 값이 없을 경우 에러를 발생시킵니다.
         * 정확히는 예외를 발생시키죠.
         *
         * 업무용 프로그램을 짜다보면 값이 없는 것이 넘어오면 안 되는 경우가 있습니다.
         * 그것은 애초에 비즈니스 로직 자체가 잘못되었다는 의미이죠.
         * 그럴 때 orElseThrow로 예외를 발생시키면 좋습니다.
         *
         * 더욱이 상용 프로그램은 예외 처리에 대한 대비를 합니다.
         * 특정 예외에서는 특정 메시지를 표출시키죠.
         * 해당 특정 메시지를 정해서 표출시키면 사용자나 개발자는
         * 무엇이 잘못되었는지 알 수 있습니다.
         *
         * 그럼 실습을 진행하겠습니다.
         */

        try {
            String s = Optional.ofNullable("nicely done.").orElseThrow(() -> new Exception());
            System.out.println("orElseThrow : " + s);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Object o = Optional.ofNullable(null).orElseThrow(Exception::new);
            System.out.println("orElseThrow : " + o);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Optional<String> or = Optional.ofNullable("Korea").or(() -> Optional.of("Country"));
        System.out.println("or : " + or);
        System.out.println("or get : " + or.get());

        Optional<Object> country = Optional.ofNullable(null).or(() -> Optional.of("Country"));
        System.out.println("or : " + country);
        System.out.println("or get : " + country.get());

    }

}
