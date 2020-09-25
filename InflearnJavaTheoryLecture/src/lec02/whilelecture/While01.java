package lec02.whilelecture;

/**
 * while 반복문 실습 클래스입니다.
 */
public class While01 {

    /**
     * 메인 메서드를 만듭니다.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 간단한 while문부터 실습해 볼까요?
         */
        int markIndex = 0;
        while (markIndex < 5) {
            System.out.println("markIndex : " + markIndex);
            markIndex++;
        }

        /**
         * 0부터 4까지 순차적으로 증가하면서 콘솔에 값이 찍히지요?
         * 증감문을 통해 반복문의 간단한 예를 보였습니다.
         * 그러면 다른 것도 실습해 볼까요?
         */
        
        String[] strCountryArr = new String[]{"한국", "미국", "중국", "러시아", "일본", "베트남", "인도네시아", "필리핀"};
        markIndex = 0;
        int countryLength = strCountryArr.length;
        while (markIndex < countryLength) {
            String strCountry = strCountryArr[markIndex];
            System.out.print("index : " + markIndex + ",  strCountry : " + strCountry + "\t\t\t");
            markIndex++;
        }

        /**
         * 이런 식으로 문자열의 데이터를 뽑아낼 수 있습니다.
         * 각각의 나라 이름을 추출하여 표시하는 것입니다.
         * 이것이 while 문입니다.
         * while문은 쓰레드를 처리할 때 잘 쓰입니다.
         *
         * 그 외에도 다른 실습을 수행해 볼까요?
         */

        System.out.println("\n\n");

        markIndex = 0;
        while (markIndex < countryLength) {
            if (markIndex == 2) {
                break;
            }
            String strCountry = strCountryArr[markIndex];
            System.out.print("index : " + markIndex + ",  strCountry : " + strCountry + "\t\t\t");
            markIndex++;
        }

        /**
         * 인덱스가 2일 때 break;에 걸리면서 멈추지요?
         * 이렇게 while문을 실습해 볼 수 있습니다.
         *
         * 다른 것도 한 번 해볼까요?
         */

        System.out.println("\n\n");

        markIndex = 0;
        System.out.println("2의 배수는 continue를 수행합니다.");
        while (markIndex < countryLength) {
            if (markIndex % 2 == 0) {
                markIndex++;
                continue;
            }
            String strCountry = strCountryArr[markIndex];
            System.out.print("markIndex : " + markIndex + ",  strCountry : " + strCountry + "\t\t\t");
            markIndex++;
        }

        /**
         * 이렇게 해서 인덱스를 증가시킬 수 있습니다.
         * 2로 나눈 나머지는 0일 경우엔 인덱스를 증가시키고 continue 문을 수행합니다.
         * 그 외에는 로직을 그냥 수행하지요.
         * continue를 이렇게 수행하는 것입니다.
         *
         * 이 정도로 하면 while 문에 대한 학습도 충분한 것 같습니다.
         *
         * 감사합니다.
         */

    }

}
