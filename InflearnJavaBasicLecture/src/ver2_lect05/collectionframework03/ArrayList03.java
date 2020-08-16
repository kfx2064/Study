package ver2_lect05.collectionframework03;

import java.util.ArrayList;

public class ArrayList03 {

    /**
     * ArrayList에는 많은 메소드들을 지원합니다.
     * 하지만 저는 주로 사용하는 메소드만 알려 드리고자 합니다.
     * 많은 메소드들에 대해서는 저의 5부작, 또는 6부작이 될
     * 자바 강의에서 3부나 4부부터 다룰 이론 강의에서부터
     * 자세히 알려드리고자 합니다.
     *
     * 그럼 코딩을 따라와 주세요.
     */

    public static void main(String[] args) {

        ArrayList sampeList = new ArrayList();
        /**
         * ArrayList를 생성할 때 new 연산자를 통해 생성합니다.
         * new 연산자를 통해 객체를 생성하는 것이죠.
         * 이제 데이터를 넣어볼까요?
         */

        sampeList.add(1);
        sampeList.add("한국");
        sampeList.add(true);

        System.out.println(sampeList.toString());

        /**
         * toString을 통해서 데이터를 출력해 보았습니다.
         * 하지만 저것은 정석적인 방법은 아닙니다.
         * 정석적인 방법으로 출력해 볼까요?
         */

        int sampleSize = sampeList.size();

        /**
         * ArrayList의 크기를 구합니다.
         * 구한 크기는 int형 자료에 담습니다.
         */

        for (int x = 0; x < sampleSize; x++) {
            Object o = sampeList.get(x);
            System.out.println("Object ::: " + o);
        }

        /**
         * 리스트의 크기를 구한 뒤 for문을 실행해 가면서 안의 데이터를 뽑아내는 것입니다.
         * 저것이 보통 리스트를 다룰 때 정석적으로 사용하는 방법입니다.
         * .size 메소드를 통해서 ArrayList의 크기를 구합니다.
         * ArrayList라는 컬렉션 프레임워크에서 지원하는 자료구조의 클래스에서
         * 지원하는 메소드입니다.
         *
         * 제가 앞서 설명 드렸던 것 같습니다.
         * 컬렉션 프레임워크는 자료구조를 편리하게 사용하기 위해 만들어 놓은 것이라고.
         * 일종의 자료구조를 사용하는 도구입니다.
         *
         * 과거에 나온 프로그래밍 언어는 자료구조를 프로그래머가 일일이 짜야했고
         * 짜놓은 자료구조를 사용하는 것에 대한 메소드도 제가 기억하기로는
         * 프로그래머가 짜야 했다고 알고 있습니다.
         * 결국 컬렉션 프레임워크는 자료구조를 잘 사용하기 위해 만들어진 것입니다.
         * 그리고 .size라는 메소드는 그 중 리스트의 크기를 구하기 위한 메소드입니다.
         *
         * 이제부터는 좀 더 다른 것을 보여 드리겠습니다.
         */

        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);
        intArrayList.add(4);
        intArrayList.add(5);

        /**
         * 익숙한 다이아몬드 표시가 보이시죠?
         * 제네릭입니다.
         * 제네릭을 통해 ArrayList의 데이터 형태를 강제해 주는 것입니다.
         * 본래 뜻은 이런 데이터 유형만 사용하세요, 이지만
         * 결국 강제하는 효과도 있습니다.
         * 이를 통해 intArrayList에는 변수명 그대로 int형 숫자만 들어가도록
         * 만들어 놓은 것입니다.
         *
         * 한 번 출력해 볼까요?
         */

        for (int x = 0; x < intArrayList.size(); x++) {
            Integer getInt = intArrayList.get(x);
            System.out.println(x + "번째 getInt ::: " + getInt);
        }

        /**
         * int형 데이터를 출력했습니다.
         * 정확히는 Wrapper 클래스인 Integer를 출력한 것이죠.
         *
         * 이렇게 제네릭을 사용하여 ArrayList의 데이터 타입을 강제해 줄 수 있습니다.
         * List는 목록의 형태를 가진 자료구조이지요.
         * 숫자 데이터를 다룰 때는 Integer 제네릭을 사용하여
         * ArrayList를 만들면 됩니다.
         *
         * 다른 형태도 만들어 볼까요?
         */

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("한국");
        strArrayList.add("미국");
        strArrayList.add("중국");
        strArrayList.add("일본");
        strArrayList.add("러시아");

        /**
         * String 타입의 데이터를 ArrayList에 담았습니다.
         * 이제 출력해 볼까요?
         */

        for (int i = 0; i < strArrayList.size(); i++) {
            String pStr = strArrayList.get(i);
            System.out.println("나라 이름들 : " + pStr);
        }

        /**
         * 나라 이름들이 출력되었습니다.
         * String 데이터 타입들이 강제된 것이죠.
         * 이를 통해서 제네릭을 사용한 ArrayList를 알아볼 수 있습니다.
         * ArrayList를 많이 사용하는 경우가 있습니다.
         * 어떨 때냐면 어떤 특징 분류값을 가지지 않고
         * 목록 형태로 데이터를 많이 담아야 할 때 ArrayList를 써야 합니다.
         *
         * List 타입의 자료구조라면 ArrayList, LinkedList 둘 중 하나를
         * 써야 하는 것이죠.
         * 그 중에서도 ArrayList를 많이 사용합니다.
         *
         * 지금의 간단한 코딩에서는 많이 와닿지 않으실 수 있습니다.
         * 그래서 제가 생각하는 것 중 하나는 샘플 코드를 한 번 짜보면서 실습해 보면
         * 어떨까 하는 것입니다.
         *
         * 그것은 나중에 진행하도록 하겠습니다.
         *
         * 그럼 List에 대한 설명은 이 정도로 하겠습니다.
         *
         * 감사합니다.
         */

    }

}
