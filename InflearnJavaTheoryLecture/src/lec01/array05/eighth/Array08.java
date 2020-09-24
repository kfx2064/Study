package lec01.array05.eighth;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 배열에 대한 강의를 진행하겠습니다.
 *
 * 잘 따라와 주세요.
 */
public class Array08 {

    /**
     * 메인 메서드를 만듭니다.
     * @param args
     */
    public static void main(String[] args) {

        int[] intArr1 = new int[]{1, 2, 3, 4, 5};

        int[] intArr2 = new int[5];
        System.arraycopy(intArr1, 1, intArr2, 0, 2);
        System.out.println(Arrays.toString(intArr2));

        /**
         * System.arraycopy('원본 배열', 원본 시작 위치, '복사 배열', 복사 배열 시작 위치, 총 길이)
         * 그럼으로써 2개의 데이터를 옮겨 담습니다.
         * intArr2는 5개의 길이입니다.
         * 거기에 인덱스 1인 곳부터 2개의 데이터를 잘라내어 복사되어지는 곳에
         * 첫 번째인 인덱스 0부터 2개의 데이터를 담습니다.
         * 그러므로 2와 3을 담는 것입니다.
         *
         * 다른 걸 테스트 해볼까요?
         */

        int[] anotherArr1 = new int[]{1, 2, 3, 4, 5};
        int[] copyArr1 = new int[5];

        System.arraycopy(anotherArr1, 0, copyArr1, 0, 3);

        /**
         * 이번엔 세 개의 데이터를 원본 배열의 첫 번째 위치부터 추출합니다.
         * 그리고 순서대로 추출된 3개의 데이터를 복사되어지는 곳의 배열에 인덱스 0부터 담습니다.
         *
         * 데이터를 콘솔에 찍어볼까요?
         */

        System.out.println(Arrays.toString(copyArr1));

        /**
         * 이런 식으로 배열을 복사합니다.
         * 하지만 다른 방식도 있어요.
         *
         * 실습해 봅시다.
         */

        copyArr1 = new int[5];

        /**
         * 새롭게 배열의 공간을 생성했습니다.
         * 이제 반복문을 돌리겠습니다.
         * 반복문은 이해하고 있을 필요는 없습니다.
         * 나중에 이해하셔야 할 내용이기 때문이죠.
         * 아직 조건문과 반복문을 배우지 않으셨기 때문에
         * 무슨 내용인지 모르시는 게 당연합니다.
         *
         * 차분하게 강의를 따라와 주세요.
         */

        int anotherLength = anotherArr1.length;

        for (int i = 0; i < anotherLength; i++) {
            System.out.println(anotherArr1[i]);
        }

        /**
         * 데이터가 찍혔죠?
         * 이걸 1부터 3개만 추출해서 담아보겠습니다.
         */

        for (int i = 1; i < 4; i++) {
            int extValue = anotherArr1[i];
            copyArr1[i - 1] = extValue;
        }

        System.out.println(Arrays.toString(copyArr1));

        /**
         * 인덱스 1의 위치부터 3개가 추출되어 배열에 담겼죠?
         * 저런 식으로도 배열의 복사를 할 수 있습니다.
         *
         * 배열을 옮겨담는 방법은 이러한 방법들이 있습니다.
         *
         * 이 정도면 충분하다고 생각하며,
         * 이번 강의는 여기서 마무리하겠습니다.
         *
         * 감사합니다.
         */

    }

}
