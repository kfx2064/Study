package lec02.forlecture;

/**
 * 반복믄 실습 클래스입니다.
 */
public class For03 {

    public static void main(String[] args) {

        /**
         * 배열을 만들겠습니다.
         *
         * 배열에 각 데이터를 담도록 하겠습니다.
         */

        int[] arrIntData1 = new int[5];
        arrIntData1[0] = 10;
        arrIntData1[1] = 5;
        arrIntData1[2] = 3;
        arrIntData1[3] = 1;
        arrIntData1[4] = 7;

        /**
         * 이제 만들어진 배열을 가지고 실습을 하겠습니다.
         */

        for (int i = 0; i < arrIntData1.length; i++) {

            int getData = arrIntData1[i];
            System.out.println("i : " + i + ",   getData : " + getData);

            if (i == 3) {
                break;
            }
        }

        /**
         * 인덱스 3까지만 실행하고 멈추지요?
         * 해당 반복문에서 특이점은 break; 문입니다.
         * break 문을 사용해서 중간에 인덱스를 멈출 수가 있어요.
         *
         * break; 문의 용도는 저런 용도인데 저렇게 단순하게 사용하진 않습니다.
         * 보통은 어떤 특정 문장을 만나거나 특정 데이터를 만나면 멈추라는 의미로 주로 쓰이지요.
         *
         * 그럼 break 문을 실습했으니 다른 것도 실습해 볼까요?
         */

        int[] arrData1 = new int[5];
        arrData1[0] = 1;
        arrData1[1] = 2;
        arrData1[2] = 3;
        arrData1[3] = 4;
        arrData1[4] = 5;

        /**
         * 위의 순차적인 데이터를 그냥 출력해 볼까요?
         */


        for (int getData : arrData1) {
            System.out.print("getData : " + getData + "\t\t");
        }

        /**
         * 데이터를 순차적으로 출력하는 것을 확인했지요?
         * 이번엔 향상된 for문을 사용해서 continue 문을 사용해 보겠습니다.
         *
         * 한 번 실습해 볼까요?
         */
        System.out.println("\n\n");

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                continue;
            }
            int getData = arrData1[i];
            System.out.print("i : " + i + ",   " + "getData : " + getData + "\t\t");
        }

        /**
         * 인덱스가 표시되지요?
         * 인덱스가 표시되는 것을 확인해 보면 2로 나누면 0이 안 되는 경우들입니다.
         * 즉 continue는 더 이상 로직을 수행하지 말고 멈추고 다시 원래 지점으로 돌아가라는 뜻입니다.
         * 반복문은 계속 해당하는 조건이 참일 경우에 반복되지요?
         * i가 2일 때 2로 나누면 0이 되겠지요?
         * 그럼 continue 문이 들어있는 if 조건문이 실행이 될 겁니다.
         * 그리고 continue를 만날 거구요.
         * continue를 만나면 다시 반복문의 조건으로 돌아갑니다.
         * 왜냐면 코드의 순서를 그렇게 짜놨거든요.
         * 코드를 짜놓은 순서대로 반복문이 수행되는 것입니다.
         *
         * 이 정도로 실습하면 break와 continue를 알아두기에 충분한 것 같습니다.
         *
         * 감사합니다.
         */

    }

}
