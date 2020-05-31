package Chapter4;

public class FlowEx22 {
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		
		for(int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		
		/**
		 * for(int tmp : arr)
		 * 
		 * for(각각 반복문을 돌면서 하나씩 얻어올 값 : 배열, 리스트 등 전체 값이 들어있는 변수명)
		 * 
		 * 향상된 for문은 일반적인 for문과 달리 배열이나 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용할 수 있다는 제약이 존재
		 */
		
		System.out.println();
		System.out.println("sum=" + sum);
	}

}
