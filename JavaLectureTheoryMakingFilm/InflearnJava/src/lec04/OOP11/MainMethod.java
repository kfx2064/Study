package lec04.OOP11;

public class MainMethod {
	
	public static void main(String[] args) {
		
		OverroadingExam overroadingExam = new OverroadingExam();
		
		int calculate = overroadingExam.calculate();
		int over1 = overroadingExam.calculate(1, 2);
		long over2 = overroadingExam.calculate(1, 3l);
		long over3 = overroadingExam.calculate(1l, 3);
		long over4 = overroadingExam.calculate(2l, 3l);
		
		System.out.println("calculate :" + calculate);
		System.out.println("over1 :" + over1);
		System.out.println("over2 :" + over2);
		System.out.println("over3 :" + over3);
		System.out.println("over4 :" + over4);
				
	}

}
