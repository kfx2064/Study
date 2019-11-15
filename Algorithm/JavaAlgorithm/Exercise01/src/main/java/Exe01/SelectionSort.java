package Exe01;

public class SelectionSort {

    /**
     * i와 j의 값을 바꿈
     */
    public static void swapElements(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * start로부터 시작하는 최소값을 찾고(start 포함)
     * 배열의 마지막 위치로 이동
     */
    public static int indexLowest(int[] array, int start) {

        int lowIndex = start;

        // 시작 지점부터 배열의 끝까지
        for(int i = start; i < array.length; i++) {
            /*
             i번째 값이 현재 최소값이라고 지정된 인덱스에 담긴 배열의 값보다 작다면,
             index를 서로 교체해 줌으로써 최소값의 위치를 다시 지정한다.
             */
            if(array[i] < array[lowIndex]) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }

    /**
     * 선택 정렬을 사용해서 요소를 정렬
     */
    public static void selectionSort(int[] array) {
        // 입력된 배열의 크기만큼 for문을 돌린다.
        /**
         * 현재 입력된 인덱스를 기준으로 배열의 최소값을 구한다.
         * 0부터 시작하므로 배열의 가장 첫번째 값부터 최소값을 구한다.
         * 구한 최소값 index를 가지고 값을 바꿔준다.
         * 그렇게 함으로써 0, 1, 2, 3, 4, 5로 인덱스가 증가되면서
         * 첫번째부터 최소값을 찾게 되는 것이고,
         * 해당 최소값 index를 가지고 현재 지정된 값과 바꾸어 준다.
         * 그를 통해 선택 정렬의 형태로 배열의 첫번째부터
         * 최소값부터 값이 정렬되는 것이다.
         */

        for(int i = 0; i < array.length; i++) {
            int j = indexLowest(array, i);
            swapElements(array, i, j);
        }
    }

    public static void main(String[] args) throws Exception {
        int paramArray[] = new int[]{10, 5, 4, 9, 8, 2, 1, 3, 7};
        selectionSort(paramArray);
        System.out.println(paramArray.toString());
    }

}
