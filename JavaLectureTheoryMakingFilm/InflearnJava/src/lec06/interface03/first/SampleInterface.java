package lec06.interface03.first;

public interface SampleInterface {
	
	public void interfaceMethod();
	
	public abstract void abstractMethod();
	
	public String OS_NAME = "windows10";
	public final static String DOWNLOAD_PATH = "C:/";
	
	public class sampleFirst  {
		public int sampleCount = 3;
	}
	
	public static class sampleStaticClass {
		public static int staticSampleCount = 1;
	}
	
	public interface innerInterface {
		public void showMsg();
	}
	
	public enum D {CREATE, READ, UPDATE, DELETE}
	
	public default void defaultMethod() {
		System.out.println("기본 메소드입니다. 자바 1.8 이후부터 사용 가능합니다.");
	}
	
	public static void staticVoidMethod() {
		System.out.println("static 메서드도 사용이 가능합니다. 이 역시 1.8부터 사용이 가능합니다.");
	}
	
	// 이 아래부터
	private void privateMethod() {
		System.out.println("interface 내부의 private 메서드입니다. 자바 11 버전 이후부터 사용이 가능합니다.");
	}
	
	default void callPrivateMethodInmDefaultMethod() {
		privateMethod();
	}

}
