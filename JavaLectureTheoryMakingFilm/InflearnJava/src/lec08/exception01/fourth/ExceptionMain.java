package lec08.exception01.fourth;

public class ExceptionMain {
	
	public void divideMath(int parameter) throws ArithmeticException {
		
		if (parameter > 12) {
			System.out.println("1년에는 12개월이 최대치입니다.");
			throw new ArithmeticException();
		} else {
			System.out.println("연봉 3억일 경우 월급이 얼마인지 계산합니다.");
			int calculateValue = 300000000 / parameter;
			System.out.println("월급 : " + calculateValue);
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			
			ExceptionMain exceptionMain = new ExceptionMain();
			exceptionMain.divideMath(13);
			
		} catch (ArithmeticException ae) {
			System.out.println("계산 예외가 발생하였습니다.");
			ae.printStackTrace();
		} catch (Exception e) {
			System.out.println("예외가 발생하였습니다.");
			e.printStackTrace();
		}
		
	}

}
