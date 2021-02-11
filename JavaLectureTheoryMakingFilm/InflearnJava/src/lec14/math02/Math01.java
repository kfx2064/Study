package lec14.math02;

public class Math01 {
	
	public static void main(String[] args) {
		
		double random = Math.random();
		System.out.println(random);
		
		System.out.println("====================================");
		
		int random1 = (int) Math.random();
		System.out.println(random1);
		
		System.out.println("====================================");
		
		for (int i = 0; i < 10; i++) { 
			int intResult = (int) (Math.random() * 10);
			System.out.println(i + " === " + intResult);
		}
		
		System.out.println("====================================");
		
		for (int i = 0; i < 20; i++) {
			int intResult = (int) (Math.random() * 10 + 1);
			System.out.print(intResult + " || ");
		}
		System.out.println();
		
		System.out.println("====================================");
		
		int abs1 = Math.abs(-1);
		int abs2 = Math.abs(1);
		double abs3 = Math.abs(10.1);
		double abs4 = Math.abs(-10.1);
		
		System.out.println("abs1 : " + abs1);
		System.out.println("abs2 : " + abs2);
		System.out.println("abs3 : " + abs3);
		System.out.println("abs4 : " + abs4);
		
		System.out.println("====================================");
		
		double ceil1 = Math.ceil(10.5);
		double ceil2 = Math.ceil(0.00001);
		double ceil3 = Math.ceil(20.0);
		double ceil4 = Math.ceil(20.01);
		
		System.out.println("ceil1 : " + ceil1);
		System.out.println("ceil2 : " + ceil2);
		System.out.println("ceil3 : " + ceil3);
		System.out.println("ceil4 : " + ceil4);
		
		System.out.println("====================================");
		
		double floor1 = Math.floor(10.5);
		double floor2 = Math.floor(10.0);
		double floor3 = Math.floor(0.0003);
		double floor4 = Math.floor(20.0);
		double floor5 = Math.floor(20.001);
		System.out.println("floor1 : " + floor1);
		System.out.println("floor2 : " + floor2);
		System.out.println("floor3 : " + floor3);
		System.out.println("floor4 : " + floor4);
		System.out.println("floor5 : " + floor5);
		
		int intFloor1 = (int) floor1;
		int intFloor2 = (int) floor2;
		int intFloor3 = (int) floor3;
		int intFloor4 = (int) floor4;
		int intFloor5 = (int) floor5;
		System.out.println("intFloor1 : " + intFloor1);
		System.out.println("intFloor2 : " + intFloor2);
		System.out.println("intFloor3 : " + intFloor3);
		System.out.println("intFloor4 : " + intFloor4);
		System.out.println("intFloor5 : " + intFloor5);
		
		System.out.println("====================================");
		
		long round1 = Math.round(20.5);
		long round2 = Math.round(20.1);
		long round3 = Math.round(20.7);
		System.out.println("round1 : " + round1);
		System.out.println("round2 : " + round2);
		System.out.println("round3 : " + round3);
		
		System.out.println("====================================");
		
		int max1 = Math.max(10, 2);
		double max2 = Math.max(10.1, 20.1);
		
		System.out.println("max1 : " + max1);
		System.out.println("max2 : " + max2);
		
		System.out.println("====================================");
		
		int min1 = Math.min(10, 2);
		double min2 = Math.min(10.5, 2.5);
		
		System.out.println("min1 : " + min1);
		System.out.println("min2 : " + min2);
		
		System.out.println("====================================");
		
		double pow1 = Math.pow(2, 3);
		double pow2 = Math.pow(2.1, 3.2);
		
		System.out.println("pow1 : " + pow1);
		System.out.println("pow2 : " + pow2);
		
		System.out.println("====================================");
		
		double sqrt1 = Math.sqrt(9);
		double sqrt2 = Math.sqrt(3);
		
		System.out.println("sqrt1 : " + sqrt1);
		System.out.println("sqrt2 : " + sqrt2);
		
		System.out.println("====================================");
		
		double sin = Math.sin(9);
		double cos = Math.cos(9);
		double tan = Math.tan(9);
		
		System.out.println("sin : " + sin);
		System.out.println("cos : " + cos);
		System.out.println("tan : " + tan);
		
	}

}
