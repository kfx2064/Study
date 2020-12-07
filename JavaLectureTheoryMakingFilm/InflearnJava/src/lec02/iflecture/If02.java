package lec02.iflecture;

public class If02 {
	
	public static void main(String[] args) {
		
		//int cashAmount = 10000;
		//int cashAmount = 7000;
		//int cashAmount = 3000;
		int cashAmount = 2000;
		int afterAmount = 0;
		String strMsg1 = "잔금이 3천원 미만입니다. 현금을 인출합니다.";
		String strMsg2 = "잔금이 5천원 초과입니다. 현재 상태를 유지합니다.";
		String strMsg3 = "잔금이 9천원 초과입니다. 초과금을 입금합니다.";
		
		if (cashAmount > 9000) {
			System.out.println(strMsg3);
			afterAmount = cashAmount - (cashAmount - 9000); 
		} else if (cashAmount > 5000) {
			System.out.println(strMsg2);
			afterAmount = cashAmount;
		} else if (cashAmount < 3000) {
			System.out.println(strMsg1);
			afterAmount = 9000;
		} else {
			afterAmount = cashAmount;
		}
		
		System.out.println("잔금입니다. : " + afterAmount);
		
	}

}
