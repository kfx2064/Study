package lec02.forlecture;

/**
 * 전통적인 for문을 실습해 보겠습니다.
 *
 * 잘 따라와 주세요.
 */
public class For01 {

    public static void main(String[] args) {

        /**
         * 배열을 만들겠습니다.
         */
        int[] arrIntData1 = new int[5];

        /**
         * 배열에 데이터를 담겠습니다.
         */
        arrIntData1[0] = 10;
        arrIntData1[1] = 5;
        arrIntData1[2] = 3;
        arrIntData1[3] = 1;
        arrIntData1[4] = 15;

        /**
         * 무작위로 데이터를 담았어요.
         * 무작위로 담긴 데이터를 for문을 통해 풀어내겠습니다.
         */

        int arrIntData1Length = arrIntData1.length;

        /**
         * 배열의 길이를 구했습니다.
         * 배열의 길이를 구한 이유는 for 반복문을 수행하기 위함입니다.
         */

        for (int x = 0; x < arrIntData1Length; x++) {
            int getIntData = arrIntData1[x];
            System.out.print("getIntData : " + getIntData + "\t\t");
        }

        /**
         * 데이터를 일정하게 풀어내지요?
         *
         * 다른 식으로도 해볼까요?
         */
        System.out.println("\n\n");

        for (int i = 1; i < arrIntData1Length - 1; i++) {
            int getIntData = arrIntData1[i];
            System.out.print("getIntData : " + getIntData + "\t\t");
        }

        /**
         * 데이터가 중간치만 잘려서 나오지요?
         * for 반복문에서 첫 번째 인덱스는 0부터 시작합니다.
         * 그러므로 1부터 시작하는 것은 두 번째 인덱스부터 바라보는 것입니다.
         * 그리고 총 길이에서 -1을 했으므로 마지막 인덱스는 바라보지 않는 것입니다.
         * 그를 통해 데이터를 중간치만 잘라내어 풀어내는 것입니다.
         */

        System.out.println("\n\n");

        /**
         * 이제 띄엄띄엄 나타내는 것도 해볼까요?
         *
         * 잘 따라와 주세요.
         */

        for (int i = 0; i < arrIntData1Length; i+=2) {
            int getIntData = arrIntData1[i];
            System.out.print("getIntData : " + getIntData + "\t\t");
        }

        /**
         * 중간중간 건너띄어서 데이터를 출력하지요?
         * 인덱스를 하나씩 건너띈 것입니다.
         *
         * 다르게도 해볼까요?
         */
        System.out.println("\n\n");

        for (int i = 0; i < arrIntData1Length; i+=3) {
            int getIntData = arrIntData1[i];
            System.out.print("getIntData : " + getIntData + "\t\t");
        }

        /**
         * 더 듬성듬성 건너띄어서 데이터를 출력하지요?
         * 이런 식으로 for 반복문을 실행할 수 있습니다.
         *
         * 전통적인 for 반복문에 대한 실습은 여기까지 하겠습니다.
         *
         * 그럼 다음 강의에서 뵙겠습니다.
         */

    }

}
