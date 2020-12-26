package lec07.collectionarrays08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 이번에는 Arrays에 대해 학습하도록 하겠습니다.
 */
public class ArraysMain {

    /**
     * 메인메서드를 만듭니다.
     */
    public static void main(String[] args) {

        /**
         * 배열을 하나 선언하도록 하겠습니다.
         * Arrays를 여러가지로 실습해 보기 위함입니다.
         */

        int[] arr = new int[]{0, 5, 3, 1, 2};
        System.out.println(arr);
        /**
         * 데이터가 보이지 않죠?
         * 데이터를 확인할 수 있도록 toString을 활용하겠습니다.
         */

        System.out.println(Arrays.toString(arr));

        /**
         * Arrays.toString() 메서드를 활용하면 안에 존재하는 데이터를 확인해 볼 수 있습니다.
         * 이번엔 정렬과 특정 데이터의 위치를 확인하는 메서드를 활용해 보겠습니다.
         */

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        /**
         * 데이터가 순차적으로 정렬되었죠?
         * 이번에는 정렬된 데이터에서 특정 데이터를 찾아보겠습니다.
         */

        int getValue = Arrays.binarySearch(arr, 1);
        System.out.println("1의 위치는 : " + getValue);
        getValue = Arrays.binarySearch(arr, 5);
        System.out.println("5의 위치는 : " + getValue);

        /**
         * 다른 것을 실습해 볼까요?
         */

        String[] strArr = new String[]{"서울", "경기", "인천", "경상", "전라", "충청", "강원", "제주"};
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        int whereIndex1 = Arrays.binarySearch(strArr, "경기");
        int whereIndex2 = Arrays.binarySearch(strArr, "인천");

        System.out.println("경기는 몇 번째 : " + whereIndex1);
        System.out.println("인천은 몇 번째 : " + whereIndex2);

        /**
         * 이런 식으로 활용이 가능합니다.
         * binarySearch와 sort를 활용해 보았습니다.
         * binarySearch가 제대로 동작하기 위해서는 sort를 통해 데이터를 먼저 정렬해 주어야 합니다.
         * 다른 것을 테스트 해볼까요?
         */

        String[] strCompany = new String[]{"삼성생명", "한화생명", "DB생명", "교보생명"};
        System.out.println(Arrays.toString(strCompany));
        int whereIsInsu1 = Arrays.binarySearch(strCompany, "한화생명");
        int whereIsInsu2 = Arrays.binarySearch(strCompany, "DB생명");
        System.out.println("한화생명 : " + whereIsInsu1);
        System.out.println("DB생명 : " + whereIsInsu2);

        /**
         * 데이터가 이상하게 나오죠?
         * -1 값이 떴다는 것은 제대로 된 인덱스를 찾이 못했다는 것과 같은 의미입니다.
         * sort를 수행해 볼까요?
         */

        Arrays.sort(strCompany);
        System.out.println(Arrays.toString(strCompany));
        int isInsu1 = Arrays.binarySearch(strCompany, "한화생명");
        int isInsu2 = Arrays.binarySearch(strCompany, "DB생명");
        System.out.println("sort 한화생명 : " + isInsu1);
        System.out.println("sort DB생명 : " + isInsu2);

        /**
         * index 값이 제대로 나오죠?
         * binarySearch를 사용하기 위해서는
         * sort 메서드를 통해 정렬을 먼저 수행하고 난 후
         * 사용해야 합니다.
         *
         * 이번엔 다른 것을 또 실습해 봅시다.
         */

        int[] intArrAlpha = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(intArrAlpha));

        /**
         * 배열이 잘 만들어진 것을 확인하였습니다.
         * 그 다음 진행하겠습니다.
         */

        int[] arrCopyOf1 = Arrays.copyOf(intArrAlpha, 7);
        System.out.println("7의 길이만큼 복사합니다.");
        System.out.println(Arrays.toString(arrCopyOf1));

        System.out.println("3의 길이만큼 복사합니다.");
        int[] arrCopyOf2 = Arrays.copyOf(intArrAlpha, 3);
        System.out.println(Arrays.toString(arrCopyOf2));

        /**
         * 복사하는 길이만큼 잘 되는 것을 확인하실 수 있죠?
         *
         * 다른 것도 실습하겠습니다.
         */

        int[] arrCopyOfRange1 = Arrays.copyOfRange(intArrAlpha, 0, 3);
        System.out.println();
        System.out.println(Arrays.toString(intArrAlpha));
        System.out.println("인덱스 0이상 3미만까지");
        System.out.println(Arrays.toString(arrCopyOfRange1));
        System.out.println("인덱스 2이상 5미만까지");
        int[] arrCopyOfRange2 = Arrays.copyOfRange(intArrAlpha, 2, 5);
        System.out.println(Arrays.toString(arrCopyOfRange2));

        /**
         * 잘 되죠?
         * 그 다음 것을 실습해 보겠습니다.
         */

        System.out.println();
        int[] arrFill = new int[3];
        System.out.println("fill()을 수행하기 전과 후입니다.");
        System.out.println(Arrays.toString(arrFill));
        Arrays.fill(arrFill, 3);
        System.out.println(Arrays.toString(arrFill));

        /**
         * 잘 동작합니다.
         *
         * 다른 것도 확인해 볼까요?
         */
        int[][] arr2DInt = new int[][]{{1, 2, 3, 4, 5}, {11, 12, 13, 14, 15}};
        System.out.println();
        System.out.println("다차원배열의 데이터를 확인합니다.");
        System.out.println(Arrays.deepToString(arr2DInt));

        int[] arrEquals1 = new int[]{1, 2, 3, 4, 5};
        int[] arrEquals2 = new int[]{1, 2, 3, 4, 5};
        boolean boolArrEquals = Arrays.equals(arrEquals1, arrEquals2);
        System.out.println();
        System.out.println("두 개의 일차원 배열이 같은지 확인합니다.");
        System.out.println("값 : " + boolArrEquals);

        /**
         * 다차원 배열은 좀 더 다른 방식으로 확인합니다.
         */

        int[][] arrEquals2D1 = new int[][]{{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        int[][] arrEquals2D2 = new int[][]{{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        boolean boolDeepEquals = Arrays.deepEquals(arrEquals2D1, arrEquals2D2);
        System.out.println();
        System.out.println("2차원 배열 두 개가 같은가 : " + boolDeepEquals);

        /**
         * 잘 확인되지요?
         * 마지막 실습입니다.
         */

        Integer[] arrForList = new Integer[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arrForList));
        List<Integer> listFromArr = Arrays.asList(arrForList);
        int size = listFromArr.size();
        System.out.println("사이즈 : " + size);
        for (int i = 0; i < listFromArr.size(); i++) {
            Object o = listFromArr.get(i);
            System.out.println("추출된 값 : " + o);
        }

        /**
         * 여기서 한 가지 문제가 있습니다.
         * 기본값 int를 사용하면 제대로 수행되지 않습니다.
         * 그래서 Wrapper 클래스를 활용하셔야 합니다.
         *
         * 또 문제가 하나 더 있습니다.
         * asList 메서드를 통해 만들어진 List에는 데이터가 더해지지 않습니다.
         */
        //listFromArr.add(1);

        /**
         * 이유는 list의 크기가 변경되지 않기 때문입니다.
         * 이걸 극복하기 위해서는 new 연산자를 활용해야 합니다.
         */

        Integer[] arrInteger = new Integer[]{1, 2, 3, 4, 5};
        List cvtList = new ArrayList(Arrays.asList(arrInteger));
        System.out.println();
        System.out.println(cvtList.toString());
        cvtList.add(10);
        System.out.println(cvtList.toString());

        /**
         * 잘 확인하셨지요?
         *
         * Arrays는 배열과 관련된 메서드들을 제공하여 줍니다.
         * 배열을 좀 더 편리하게 사용할 수 있는 메서드들을 제공하여 주죠.
         *
         * 그럼 이번 강의는 여기서 마치겠습니다.
         */

    }

}
