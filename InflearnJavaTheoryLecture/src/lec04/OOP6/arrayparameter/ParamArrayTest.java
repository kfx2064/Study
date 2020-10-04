package lec04.OOP6.arrayparameter;

public class ParamArrayTest {

    public static void main(String[] args) {
        ParamArray pa = new ParamArray();
        String[] pStrArray = new String[]{"Korea", "USA", "China", "Japan", "Russia"};
        pa.printInfoParamArray(pStrArray);

        /**
         * 동적 파라미터와 배열 파라미터에 큰 차이가 없어 보일 수도 있다.
         * 강사인 본인도 별 차이를 못 느낀다.
         * 동적 파라미터를 쓰는 경우는 드문 편이다.
         * 보통 동적 파라미터를 써야 한다면, 같은 타입의 변수를 자료구조의 형태로 넣어줘야
         * 하는 경우일 텐데, 그럴 때는 컬렉션 프레임워크의 자료구조를 활용한다.
         * 컬렉션 프레임워크에는 키, 밸류 형태의 맵 자료구조와
         * 배열과 유사한 형태의 리스트 자료구조가 존재한다.
         * 결국 이런 자료구조들을 활용하여 파라미터로 넘겨주면,
         * 동적 파라미터와 같은 효과를 보게 된다.
         */
    }

}
