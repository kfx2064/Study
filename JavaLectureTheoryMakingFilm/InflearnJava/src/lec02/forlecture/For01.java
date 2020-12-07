package lec02.forlecture;

public class For01 {
	
	public static void main(String[] args) {
		
		int[] arrIntData1 = new int[5];
		arrIntData1[0] = 10;
		arrIntData1[1] = 5;
		arrIntData1[2] = 3;
		arrIntData1[3] = 1;
		arrIntData1[4] = 15;
		
		int arrIntData1Length = arrIntData1.length;
		
		for (int x = 0; x < arrIntData1Length; x++) {
			int getIntData = arrIntData1[x];
			System.out.print("getIntData : " + getIntData + "\t\t");
		}
		
		System.out.println("\n\n");
		
		for (int i = 1; i < arrIntData1Length - 1; i++) {
			int getIntData = arrIntData1[i];
			System.out.print("getIntData : " + getIntData + "\t\t");
		}
		
		System.out.println("\n\n");
		
		for (int i = 0; i < arrIntData1Length; i+=2) {
			int getIntData = arrIntData1[i];
			System.out.print("getIntData : " + getIntData + "\t\t");
		}
		
		System.out.println("\n\n");
		
		for (int i = 0; i < arrIntData1Length; i+=3) {
			int getIntData = arrIntData1[i];
			System.out.print("getIntData : " + getIntData + "\t\t");
		}
		
	}

}
