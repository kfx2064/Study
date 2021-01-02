package lec07.collectionarrays08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysMain {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {0, 5, 3, 1, 2};
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int getValue = Arrays.binarySearch(arr, 1);
		System.out.println("1의 위치는 : " + getValue);
		getValue = Arrays.binarySearch(arr, 5);
		System.out.println("5의 위치는 : " + getValue);
		
		String[] strArr = new String[] {"서울", "경기", "인천", "경상", "전라", "충청", "강원", "제주"};
		System.out.println(Arrays.toString(strArr));
		Arrays.sort(strArr);;
		System.out.println(Arrays.toString(strArr));
		int whereIndex1 = Arrays.binarySearch(strArr, "경기");
		int whereIndex2 = Arrays.binarySearch(strArr, "인천");
		
		System.out.println("경기는 몇 번째 : " + whereIndex1);
		System.out.println("인천은 몇 번째 : " + whereIndex2);
		
		System.out.println();
		
		String[] strCompany = new String[] {"삼성생명", "한화생명", "교보생명", "DB생명"};
		System.out.println(Arrays.toString(strCompany));
		int whereIsInsu1 = Arrays.binarySearch(strCompany, "한화생명");
		int whereIsInsu2 = Arrays.binarySearch(strCompany, "DB생명");
		System.out.println("한화생명 : " + whereIsInsu1);
		System.out.println("DB생명 : " + whereIsInsu2);
		
		Arrays.sort(strCompany);;
		System.out.println(Arrays.toString(strCompany));
		int isInsu1 = Arrays.binarySearch(strCompany, "한화생명");
		int isInsu2 = Arrays.binarySearch(strCompany, "DB생명");
		System.out.println("sort 한화생명 : " + isInsu1);
		System.out.println("sort DB생명 : " + isInsu2);
		
		System.out.println();
		System.out.println();
		
		int[] intArrAlpha = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
		System.out.println(Arrays.toString(intArrAlpha));
		
		int[] arrCopyOf1 = Arrays.copyOf(intArrAlpha, 7);
		System.out.println("7의 길이만큼 복사합니다.");
		System.out.println(Arrays.toString(arrCopyOf1));
		
		System.out.println("3의 길이만큼 복사합니다.");
		int[] arrCopyOf2 = Arrays.copyOf(intArrAlpha, 3);
		System.out.println(Arrays.toString(arrCopyOf2));
		
		System.out.println();
		
		int[] arrCopyOfRange1 = Arrays.copyOfRange(intArrAlpha, 0, 3);
		System.out.println();
		System.out.println(Arrays.toString(intArrAlpha));
		System.out.println("인덱스 0이상 3미만까지");
		System.out.println(Arrays.toString(arrCopyOfRange1));
		System.out.println("인덱스 2이상 5미만까지");
		int[] arrCopyOfRange2 = Arrays.copyOfRange(intArrAlpha, 2, 5);
		System.out.println(Arrays.toString(arrCopyOfRange2));
		
		System.out.println();
		int[] arrFill = new int[3];
		System.out.println("fill()을 수행하기 전과 후입니다.");
		System.out.println(Arrays.toString(arrFill));
		Arrays.fill(arrFill, 3);
		System.out.println(Arrays.toString(arrFill));
		
		int[][] arr2DInt = new int[][] {{1, 2, 3, 4, 5}, {11, 12, 13, 14, 15}};
		System.out.println();
		System.out.println("다차원배열의 데이터를 확인합니다.");
		System.out.println(Arrays.deepToString(arr2DInt));
		
		int[] arrEquals1 = new int[] {1, 2, 3, 4, 5};
		int[] arrEquals2 = new int[] {1, 2, 3, 4, 5};
		boolean boolArrEquals = Arrays.equals(arrEquals1, arrEquals2);
		System.out.println();
		System.out.println("두 개의 일차원 배열이 같은지 확인합니다.");
		System.out.println("값 : " + boolArrEquals);
		
		int[][] arrEquals2D1 = new int[][] {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
		int[][] arrEquals2D2 = new int[][] {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
		boolean boolDeepEquals = Arrays.deepEquals(arrEquals2D1, arrEquals2D2);
		System.out.println();
		System.out.println("2차원 배열 두 개가 같은가 : " + boolDeepEquals);
		
		Integer[] arrForList = new Integer[] {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arrForList));
		List<Integer> listFromArr = Arrays.asList(arrForList);
		int size = listFromArr.size();
		System.out.println("사이즈 : " + size);
		for (int i = 0; i < size; i++) {
			Object o = listFromArr.get(i);
			System.out.println("추출된 값 : " + o);
		}
		
		Integer[] arrInteger = new Integer[] {1, 2, 3, 4, 5};
		List cvtList = new ArrayList(Arrays.asList(arrInteger));
		System.out.println();
		System.out.println(cvtList.toString());
		cvtList.add(10);
		System.out.println(cvtList.toString());
		
	}

}
