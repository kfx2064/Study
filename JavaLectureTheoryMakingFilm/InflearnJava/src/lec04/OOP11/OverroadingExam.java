package lec04.OOP11;

public class OverroadingExam {
	
	public int calculate() {
		return 1 + 2;
	}
	
	public int calculate(int one, int two) {
		return one + two;
	}
	
	public long calculate(long one, long two) {
		return one + two;
	}
	
	public long calculate(int one, long two) {
		return one + two;
	}
	
	public long calculate(long one, int two) {
		return one + two;
	}
	
	public long calculateLong(long one, long two) {
		return one + two;
	}

}
