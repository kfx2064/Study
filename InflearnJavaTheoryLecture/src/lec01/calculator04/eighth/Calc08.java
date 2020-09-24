package lec01.calculator04.eighth;

/**
 * 이번엔 시프트 연산자를 수행해 보겠습니다.
 */
public class Calc08 {

    /**
     * 메인메서드를 만들겠습니다.
     * @param args
     */
    public static void main(String[] args) {

        int first = 10;
        int second = 2;
        first = second >> 2;
        System.out.println("first : " + first);
        /**
         * 0이네요.
         * 다른 계산도 해볼까요?
         */

        second = 2;
        first = second << 2;
        System.out.println("first << 2 : " + first);

        /**
         * 8이군요?
         * 다른 걸 계산해 볼까요?
         */

        second = 2;
        first = second << 1;
        System.out.println("first << 1 : " + first);

        /**
         * 이번엔 4네요?
         * 시프트 연산은 1bit씩 옮긴다고 했지요?
         * 이건 메모리 구조와도 관계가 있습니다.
         * 시프트 연산은 잘 안 쓰입니다.
         * 특히나 웹이나 앱 프로그래밍 방향으로 진출하시면 쓰는 일이 거의 없습니다.
         *
         * 그냥 이런 설명으로만 알아두시고,
         * 굳이 써야하는 순간이 오면 개념만 알아두셨다가
         * 구글링을 통해 다시 상세지식을 떠올리시고
         * 코딩하는 방향으로 하시길 바랍니다.
         *
         * 그럼 이번 강의도 여기서 마치겠습니다.
         * 감사합니다.
         */

    }

}
