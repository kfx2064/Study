package var;

public class Pvalue1 {
	
	public static void main(String[] args) {
		
		// showFloatMethod();
		showDoubleMethod();
		
	}
	
	public static void showFloatMethod() {

		/**
		 * float 자료형은 실수를 나타내기 위한 자료형입니다.
		 * 큰 차이라 하면 int와 long이 둘 다 정수형 자료형을 나타내는 것이지만,
		 * 담을 수 있는 자료의 크기의 차이가 있는 것처럼,
		 * float과 double에도 담을 수 있는 자료의 크기의 차이가 있습니다.
		 * float은 double보다 작은 크기입니다.
		 * 
		 * 보통 float과 double을 선택함에 있어 double을 선택하는 경우가
		 * 더 많습니다.
		 * 일단 float은 자료를 선언해 줄 때 숫자 뒤에 f를 붙여줘야 한다는 규칙이 있습니다.
		 * 그리고 double은 float보다 자료의 크기가 크기 때문에,
		 * 곱하기나 나누기를 수행할 경우, 수행된 값의 크기가 더 정밀하다는 점도 있습니다.
		 * 
		 * 그러나 뭐니뭐니 해도 double의 가장 큰 장점은 굳이 뒤에 f를 붙이지 않아도 
		 * 된다는 점입니다.
		 * 그렇기 때문에 아무래도 double을 선택하는 경우가 더 많지 않을까... 합니다.
		 */
		
		float fValue = 0.0f;
		
		System.out.println("fValue : " + fValue);
		
		float cmpValue = 3.0f;
		fValue = 10.0f;
		
		float saveValue = 0.0f;
		
		System.out.println("fValue : " + fValue);
		System.out.println("cmpValue : " + cmpValue);
		
		saveValue = fValue / cmpValue;
		
		/**
		 * 간단하게 float 자료형으로 나누기를 해보았습니다.
		 * 이외에도 더하기, 빼기, 곱하기 등도 할 수 있습니다.
		 * float 자료형은 double 자료형보다 좀 더 작은 크기의
		 * 데이터를 담는 용도로 쓰는 실수형 자료형이라고 아시면 좋습니다.
		 */
		System.out.println("float 자료형의 값을 나눈 값 : " + saveValue);
		
	}
	
	public static void showDoubleMethod() {
		
		/**
		 * double 자료형은 float과 마찬가지로 실수형 자료형입니다.
		 * double 자료형은 float과는 달리 뒤에 f를 붙이지 않아도 됩니다.
		 * 그냥 실수를 적어서 선언해 주면 되는 것이지요.
		 * 코드를 보겠습니다.
		 */
		
		double originalDouble = 0.0;
		
		System.out.println("double 원본 : " + originalDouble);
		
		/**
		 * double 자료형의 데이터 원본입니다.
		 * 보통 정수, 실수형 자료형을 초기화할 때는 0으로 초기화를 합니다.
		 * 프로그래머들마다, 개발자마다 특징이 있겠지요.
		 * 저는 숫자형태의 자료형들은 0으로 초기화하는 것을 선호합니다.
		 * 이유는 초기화를 함으로써 확실한 값을 셋팅해 주고 시작한다는 의미가 있습니다.
		 * 개인 선호이기도 하며 배우고, 경험하며 쌓아간 코딩 스타일이라,
		 * 처음 시작하시는 분들은 저의 이 코딩 스타일을 따라하시는 것도 약간의 도움이 됩니다.
		 */
		
		double multipleDouble = 2.5;
		originalDouble = 1.3;
		
		double saveDouble = 0.0;
		
		System.out.println("multipleDouble : " + multipleDouble);
		System.out.println("originalDouble : " + originalDouble);
		
		saveDouble = originalDouble * multipleDouble;
		
		System.out.println("double 곱하기 결과 : " + saveDouble);
		
		multipleDouble = 0.0;
		originalDouble = 0.0;
		saveDouble = 0.0;
		
		/**
		 * 위에서 선언한 방식이 자료형을 초기화시켜주는 방식입니다.
		 * 0.0이란 값을 셋팅하여 이전에 수행한 계산식이나 기타 등등의 결과값들을
		 * 일종의 지우는 역할을 수행하는 것입니다.
		 * 그런 다음엔 다시 이 변수들을 사용하여 새로운 double 자료형의
		 * 값들을 셋팅해서 사용할 수 있습니다.
		 */
		
		multipleDouble = 3.0;
		originalDouble = 10.0;
		saveDouble = originalDouble / multipleDouble;
		
		/**
		 * 간단하게 나누기의 결과도 확인할 수 있습니다.
		 * float과의 차이가 보이실 겁니다.
		 * 좀 더 확연하게 볼까요?
		 */
		
		System.out.println("saveDouble 나누기 : " + saveDouble);
		
		float tmpOrgFloat = 10.0f;
		float tmpDivFloat = 3.0f;
		float tmpSaveFloat = 0.0f;
		
		tmpSaveFloat = tmpOrgFloat / tmpDivFloat;
		
		System.out.println("saveFloat 나누기 : " + tmpSaveFloat);
		
		/**
		 * 일부로 소수점이 매우 긴 값으로 나누기를 했습니다.
		 * 소수점의 차이를 확인할 수 있습니다.
		 * double이 float보다 긴 걸 확인할 수 있습니다.
		 * 이유는 간단합니다.
		 * double이 float보다 포함할 수 있는 자료의 크기가 크니까요.
		 * 그리고 소수점의 값을 더 많이 표현할 수록 값은 더 정밀해진다는 점이 있습니다.
		 * 사족이니 위의 내용은 굳이 기억하지 않아도 됩니다.
		 * double과 float의 설명을 여기서 마치겠습니다.
		 */
		
	}

}
