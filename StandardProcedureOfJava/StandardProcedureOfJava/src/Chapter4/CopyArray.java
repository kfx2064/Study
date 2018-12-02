package Chapter4;

import java.util.Arrays;

public class CopyArray {
	
	static String cpuName;
	
	public static void main(String[] args) {		
		
		int[] orgArray = {1, 2, 3, 4, 5};
		int[] copyArray = new int[5];
		
		System.out.println("copyArrayToString : " + Arrays.toString(copyArray));
		System.out.println();
		
		for(int i = 0; i < orgArray.length; i++) {
			copyArray[i] = orgArray[i];					
		}
		
		System.out.println("copyArrayToString : " + Arrays.toString(copyArray));
	}
	
}