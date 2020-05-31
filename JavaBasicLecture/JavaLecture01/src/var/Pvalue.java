package var;

/**
 * 기본형 변수 설명
 * @author jth45
 * @date   2019. 8. 29.
 */
public class Pvalue {
	
	/**
	 * 메인 메서드입니다.
	 * 앞전에 설명했다시피 메인메서드는 일종의 시작점이라 할 수 있습니다.
	 * 이곳에서 어떤 동작을 시작할 것을 지정해 줄 수 있죠.
	 * 여기다가 코딩을 하겠습니다.
	 * @param args
	 */
	public static void main(String[] args) {
		
		// showBooleanMethod();
		
		// showCharMethod();
		
		// showByteMethod();
		
		// showShortMethod();
		
		// showIntMethod();
		
		showLongMethod();
		
	}
	
	/**
	 * boolean 자료형 설명
	 */
	public static void showBooleanMethod() {
		boolean falseShow = false;
		boolean trueShow = true;
		
		/**
		 * boolean은 true, false를 구분하는 역할을 합니다.
		 * 즉, 참이냐, 거짓이냐를 구분하여 해당 값을 활용하여 어떤 로직을 수행합니다.
		 */
		
		System.out.println(falseShow);
		System.out.println(trueShow);
		
		/**
		 * 저는 일단 따로 메서드로 빼서 코딩을 진행하긴 했습니다.
		 * 하지만 여러분은 코딩 연습할 때 main 메서드 안에서 모든 걸 코딩해 보고 실행해 보는
		 * 연습을 진행하세요.
		 * 저는 설명을 하면서 코드가 너무 메인 메서드에 많이 들어가서 헷갈릴 까봐 따로 빼서
		 * 진행하는 것이기도 합니다.
		 * 그리고 이런 식으로 짜는 것이 객체지향언어의 특징이기도 하죠.
		 * 따로 메서드를 빼서 짜고 그걸 특정 어느 곳에서 호출하고.
		 * 자세한 설명은 뒤에서 하도록 하겠습니다.
		 * 벌써 설명하는 것은 너무 이르다는 판단이 드는군요.
		 * 
		 * boolean을 활용하는 로직을 짜보려 합니다.
		 * 밑의 로직은 너무 이해하려 하지 않아도 됩니다.
		 * 가볍게 보고 지나가세요.
		 */
		
		if(falseShow) {
			System.out.println("if로직이 실행되었습니다. falseShow");
		}
		
		if(trueShow) {
			System.out.println("if로직이 실행되었습니다. trueShow");
		}
		
		/**
		 * if문은 대표적인 조건문 중 하나입니다.
		 * 무슨 소리냐 하면 매개변수, 즉 저 괄호 안에 들어온 값의 참, 거짓 여부를 판단하여
		 * 이후 로직을 실행할지 결정하는 로직입니다.
		 * 코딩을 하다 보면 if문을 사용해야 하는 경우는 매우 많습니다.
		 * 정말 자주 쓰이는 로직이라 할 수 있죠.
		 * 그리고 boolean 타입은 그 자체가 참, 거짓 값을 저장하는 기본 자료형이라
		 * 해당 boolean을 if문에서 사용할 때가 많습니다.
		 * 위에서 falseShow에는 false, 거짓을, trueShow에는 true, 참을
		 * 넣어서 실제로 if문이 trueShow만 구동되는 것을 보셨을 것입니다.
		 * if문은 거짓이면 작동하지 않습니다.
		 * 그리고 작동하지 않으니 그 안에 있는 System.out.println(); 
		 * 즉, 콘솔에 메시지를 찍어주는 로직을 작동시키지 않는 것이죠.
		 * boolean 설명은 이정도로 하겠습니다.
		 */
		
	}
	
	/**
	 * char 자료형 설명
	 */
	public static void showCharMethod() {
		
		char varChar1 = 'ㄱ';
		char varChar2 = '1';
		char varChar3 = 'a';
		//char varChar4 = 'ㄱㄴㄷㄻ';
		//char varchar5 = "굿잡";
		//char varchar6 = 'abc';
		//char varchar7 = "goodjob";
		
		/**
		 * char 형은 캐릭터 형태의 기본형 자료형,
		 * 쉽게 말해서 String이란 자료형이 있는데 이건 문자'열' 자료형이고
		 * 이건 '문자' 자료형입니다.
		 * 그냥 문자 하나가 들어가서 저장된다고 보시면 됩니다.
		 * 저도 열심히 배운 자료형인데
		 * 그동안 프로그래머로 사회 생활하면서 매우 드물게 쓰는 자료형입니다.
		 * 그만큼 쓸 일이 없습니다. 웹 프로그래머에게는요.
		 * 아마도 매우 자원을 절약해서 쓰거나,
		 * 매우 효율적인 프로그램을 짜려고 할 떄나,
		 * 특별히 필요해서거나 할 때 char 형태를 쓰지 않을까 싶습니다.
		 * 한 번 콘솔에 찍어볼까요?
		 */
		
		System.out.println(varChar1);
		System.out.println(varChar2);
		System.out.println(varChar3);
	}
	
	/**
	 * byte 자료형 설명
	 */
	public static void showByteMethod() {
		
		/**
		 * byte는 숫자를 저장할 수 있는 기본형 자료형 중 가장 크기가 작은 자료형입니다.
		 * 크기가 작다는 의미는 저장할 수 있는 한계가 가장 작다는 의미이며
		 * 큰 수를 저장할 수 없는 자료형이라는 뜻입니다.
		 * 그래서 보통 코딩할 때, 컴퓨터 자원을 매우 효율적으로 사용해야 하는 경우가 아니라면,
		 * 잘 안 쓰게 됩니다.
		 * 
		 * 저는 기본형 자료형을 설명하면서 숫자를 저장할 수 있는
		 * 기본형 자료형에 저장 가능한 크기에 대해 자세히 언급하지 않을 겁니다.
		 * 
		 * 저는 입문자를 목표로 강의를 만들고 있으며
		 * 개념을 잡아주는 것을 목표로 하고 있습니다.
		 * 자세한 자료형의 크기와 세세한 내용과 깊은 내용을 알고 싶으시다면,
		 * 저의 강좌로 개념을 잡으시고, 그 이후 좀 더 깊은 내용을 다루는
		 * 강의나 책으로 넘어가시길 권해 드립니다.
		 */
		
		byte varByte = 0;
		
		varByte = 124;
		
		System.out.println("varByte : " + varByte);
		
	}
	
	/**
	 * short 자료형 설명
	 */
	public static void showShortMethod() {
	
		/**
		 * short 자료형은 byte보다는 크고 int보다는 작다고 할 수 있습니다.
		 * 이 역시 컴퓨터 자원을 아끼는 코딩을 할 때는 활용할 수 있겠으나,
		 * 보통은 int와 long을 많이 사용합니다.
		 */
		
		short varShort = 0;
		
		varShort = 123;
		
		System.out.println("varShort : " + varShort);
		
	}
	
	/**
	 * int 자료형 설명
	 */
	public static void showIntMethod() {
		
		/**
		 * 대망의 int형 자료입니다.
		 * 정말 많이 쓰는 자료형입니다.
		 * 보통은 금액 같이 정교하고 큰 숫자를 다루는 것이 아니거나 한다면
		 * 정수형 숫자를 저장하는 자료형으로 int가 매우 많이 쓰입니다.
		 * 거의 대부분의 정수형 자료 저장용으로는
		 * int를 사용하곤 합니다.
		 * 
		 * 프로그래밍을 하다보면 숫자 데이터는 거진 int로 처리한다고 보시면 됩니다.
		 * 좀 더 좁혀서 표현하자면 웹이나 앱 프로그래밍에서는 거의 int로 처리합니다.
		 * 앱은 이제 안드로이드가 코틀린이나 다른 언어로 코딩이 가능하니,
		 * 자바로 쓰는 경우는 점점 더 어찌될지 모르지만요.
		 * 
		 * 좀 더 정교한 값을 계산하거나, 좀 더 큰 값을 계산할 때는 다른 자료형을
		 * 사용하기도 합니다.
		 * 하지만 대부분의 웹 프로그래밍에서는 숫자 계산 시 int형을 사용한다 생각하시면 됩니다.
		 * 이유는 int가 커버할 수 있는 숫자의 범위 내에서 대부분의 계산이 이루어지기 때문이죠.
		 * 
		 * 아래 간단한 사용법을 코딩하겠습니다.
		 */
		
		int varInt = 0;
		varInt = 12345;
		
		System.out.println(varInt);
		
	}
	
	/**
	 * long 자료형 설명
	 */
	public static void showLongMethod() {
		
		/**
		 * 정수형 자료를 표현하는데는 Long 형태의 자료형도 있습니다.
		 * Long 자료형은 int보다 더 큰 범위의 수를 커버할 수 있습니다.
		 * 하지만 이 말은 달리 말하면, Long으로 표현한 변수를 다시 int로 표현한 변수에
		 * 담는데 문제가 생길 수도 있다는 의미가 됩니다.
		 * 형변환이라는 개념인데 후에 배우게 되겠지만,
		 * 형변환이란, 본래 가진 자료형 등의 변수 형태를 다른 변수의 형태로 바꾸는 것입니다.
		 * int a = 0; 이라고 선언된 것을 long b = a; 이런 식으로 해서
		 * long에다가 담는 것이지요.
		 * 하지만 여기서 주의해야 할 점은 int는 long보다 작습니다.
		 * 그래서 int형 변수를 long에 담는 것은 아무 문제가 안 됩니다.
		 * 하지만 long은 자신이 담을 수 있는 숫자의 크기가 int보다 큽니다.
		 * 그렇기 때문에 long으로 만든 변수를 int형으로 형변환하기는 힘듭니다.
		 * 왜냐면 더 큰 걸 더 작은 곳에다가 담을 수 없기 때문입니다.
		 * 
		 * long은 보통 int보다 더 큰 수를 표현하곤 할 떄 사용하곤 합니다.
		 * 하지만 long은 잘 쓰이지 않습니다.
		 * 또는 database와 연동된 프로그램을 할 때는 database의 자료형을 고려하여
		 * long을 쓰기도 합니다.
		 * 그때그때 필요에 맞게 사용하는 것이 자료형입니다.
		 */
		
		long varLong = 0L;
		varLong = 1191L;
		
		System.out.println(varLong);
		
		/**
		 * 형변환의 일종입니다.
		 */
		int varParamInt = 111;
		varLong = varParamInt;
		
		System.out.println(varLong);
		
	}
	
}
