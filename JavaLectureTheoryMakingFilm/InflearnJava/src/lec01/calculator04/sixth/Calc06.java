package lec01.calculator04.sixth;

public class Calc06 {
	
	public static void main(String[] args) {
		
		int first = 10;
		int second = 50;
		
		boolean cmpOrCondition = (first == 10) || (second == 50);
		System.out.println("cmpOrCondition : " + cmpOrCondition);
		
		cmpOrCondition = (first == 20) || (second == 50);
		System.out.println("cmpOrCondition : " + cmpOrCondition);
		
		cmpOrCondition = (first == 20) || (second == 60);
		System.out.println("cmpOrCondition : " + cmpOrCondition);
		
		first = 10;
		second = 20;
		
		cmpOrCondition = ((first > 9) && (second < 21));
		System.out.println("and조건 cmpOrCondition : " + cmpOrCondition);
		
		first = 1;
		second = 5;
		
		cmpOrCondition = (first < 1) && (second > 6);
		System.out.println("and cmpOrCondition : " + cmpOrCondition);
		
		cmpOrCondition = (first > 2) && (second < 6);
		System.out.println("and cmpOrCondition : " + cmpOrCondition);
		
		first = 2;
		second = 4;
		
		cmpOrCondition = first != 2;
		System.out.println("cmpOrCondition 2가 아니다 : " + cmpOrCondition);
		cmpOrCondition = second != 1;
		System.out.println("cmpOrCondition 1이 아니다 : " + cmpOrCondition);
		
	}

}
