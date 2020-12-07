package lec02.forlecture;

public class For03 {
	
	public static void main(String[] args) {
		
		int[] arrIntData1 = new int[5];
		arrIntData1[0] = 10;
		arrIntData1[1] = 5;
		arrIntData1[2] = 3;
		arrIntData1[3] = 1;
		arrIntData1[4] = 7;
		
		for (int i = 0; i < arrIntData1.length; i++) {
			int getData = arrIntData1[i];
			System.out.println("i : " + i + ",  getData : " + getData);
			
			if (i == 3) {
				break;
			}
		}
		
		int[] arrData1 = new int[5];
		arrData1[0] = 1;
		arrData1[1] = 2;
		arrData1[2] = 3;
		arrData1[3] = 4;
		arrData1[4] = 5;
		
		for (int getData : arrData1) {
			System.out.print("getData : " + getData + "\t\t");
		}
		
		System.out.println("\n\n");
		
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				continue;
			}
			int getData = arrData1[i];
			System.out.print("i : " + i + ",  " + "getData : " + getData + "\t\t");
		}
		
	}

}
