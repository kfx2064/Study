package lec02.whilelecture;

public class While01 {
	
	public static void main(String[] args) {
		
		int markIndex = 0;
		while (markIndex < 5) {
			System.out.println("markIndex : " + markIndex);
			markIndex++;
		}
		
		String[] strCountryArr = new String[] {"한국", "미국", "중국", "러시아", "일본", "베트남", "인도네시아", "필리핀"};
		markIndex = 0;
		int countryLength = strCountryArr.length;
		while (markIndex < countryLength) {
			String strCountry = strCountryArr[markIndex];
			System.out.print("index : " + markIndex + ",  strCountry : " + strCountry + "\t\t\t");
			markIndex++;
		}
		
		System.out.println("\n\n");
		
		markIndex = 0;
		while (markIndex < countryLength) {
			if (markIndex == 2) {
				break;
			}
			String strCountry = strCountryArr[markIndex];
			System.out.print("index : " + markIndex + ",  strCountry : " + strCountry + "\t\t\t");
			markIndex++;
		}
		
		System.out.println("\n\n");
		
		markIndex = 0;
		System.out.println("2의 배수는 continue를 수행합니다.");
		while (markIndex < countryLength) {
			if (markIndex % 2 == 0) {
				markIndex++;
				continue;
			}
			String strCountry = strCountryArr[markIndex];
			System.out.print("markIndex :" + markIndex + ",  strCountry : " + strCountry + "\t\t\t");
			markIndex++;
		} 
		
	}

}
