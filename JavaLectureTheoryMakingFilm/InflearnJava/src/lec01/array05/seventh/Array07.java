package lec01.array05.seventh;

public class Array07 {
	
	public static void main(String[] args) {
		
		String[] strArr1 = new String[] {"한국", "미국", "북한", "중국", "러시아", "일본"};
		String[] strArr2 = new String[] {"한반도", "아메리카", "북쪽", "동북아시아", "동유럽", "열도"};
		String[][] strArr3 = new String[][] {strArr1, strArr2};
		
		for (int x = 0; x < strArr3.length; x++) {
			for (int y = 0; y < strArr3[x].length; y++) {
				String strValue = strArr3[x][y];
				System.out.println("strValue : " + strValue);
			}
		}
		
	}

}
