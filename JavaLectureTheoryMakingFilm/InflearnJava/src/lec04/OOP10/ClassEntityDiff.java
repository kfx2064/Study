package lec04.OOP10;

public class ClassEntityDiff {
	
	int normalValue = 10;
	static int staticValue = 20;
	
	int normalValue2 = staticValue;
	//static staticValue2 = normalValue;
	
	static void callStaticMethod() {
		System.out.println(staticValue);
		System.out.println();
	}
	
	void callNormalMethod() {
		System.out.println(staticValue);
		System.out.println(normalValue);
	}
	
	static void sampleStaticMethod() {
		System.out.println("스태틱 메서드.");
	}
	
	void sampleNormalMethod() {
		System.out.println("일반 메서드.");
	}
	
	static void doStaticMethod() {
		sampleStaticMethod();
	}
	
	void doNormalMethod() {
		sampleStaticMethod();
		sampleNormalMethod();
	}

}
