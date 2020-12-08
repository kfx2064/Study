package lec06.interface01.first;

/**
 * interface 예시를 만들어 보겠습니다.
 */
public interface SampleInterface {

    public void interfaceMethod();

    /**
     * 구현체가 없는 일반 메서드입니다.
     * 인터페이스에 선언되는 메서드의 특징입니다.
     * 구체화된 기능이 없는 것이 그 특징입니다.
     */

    public abstract void abstractMethod();

    /**
     * 추상 메서드입니다.
     * 마찬가지로 구현체가 없습니다.
     */

    public String OS_NAME = "windows10";
    public final static String DOWNLOAD_PATH = "C:/";

    /**
     * 일반 변수와 final과 static을 붙인 일종의 상수라 부르는 변수입니다.
     * 인터페이스에 포함될 수 있습니다.
     */

    public class sampleFirst {

    }

    /**
     * 내부 클래스입니다.
     */

    public static class sampleStaticClass {

    }

    /**
     * static 내부 클래스.
     * 즉 정적 내부 클래스입니다.
     */

    public interface innerInterface {

    }

    /**
     * 인터페이스입니다.
     */

    public enum D {CREATE, READ, UPDATE, DELETE}

    /**
     * enum입니다.
     */

    /**
     * 나열식으로 interface에 적을 수 있는 구성요소들을 적어보았습니다.
     * 이제 아래는 자바 1.8 이후 버전부터 인터페이스에 구성요소로 쓸 수 있는 내용들을 포함시키겠습니다.
     */

    public default void defaultMethod() {
        System.out.println("기본 메소드입니다. 자바 1.8이후부터 사용 가능합니다.");
    }

    public static void staticVoidMethod() {
        System.out.println("static 메서드도 사용이 가능합니다. 이 역시 1.8부터 사용이 가능합니다.");
    }

    /**
     * 아래부터는 자바 9 버전 이후부터 가능한 내용입니다.
     * 저희 강의는 1.8 버전 기준이기 때문에
     * 이런 것들이 있구나, 하고 알아두시고 넘어가는 정도로 보세요.
     * 관심이 있으신 분들은 자바 11 jdk를 설치하시고 따라해 보셔도 됩니다.
     * 11 버전 jdk를 추천하는 이유는 jdk 1.8 이후에 긴 유지보수 기간을 가지는 버전은
     * 11 버전이기 때문입니다.
     * 버전별 유지보수가 지원되는 기간은 다르며
     * 버전마다 긴 유지보수 기간을 지원하는 것이 있고
     * 짧은 기간만 유지보수하고 다음 버전으로 넘어가는 것이 있습니다.
     */

    private void privateMethod() {
        System.out.println("interface 내부의 private 메서드입니다. 자바 11 버전 이후부터 사용이 가능합니다. 다른 메서드 내부에서 호출되었습니다.");
    }

    /**
     * private 메서드는 다른 곳에서 호출될 수 없으므로
     * default 메서드를 사용하여 호출하도록 하겠습니다.
     */

    default void callPrivateMethodInDefaultMethod() {
        privateMethod();
    }

    /**
     * interface 선언은 이 정도로 하겠습니다.
     *
     * 그럼 다음 코딩으로 넘어가겠습니다.
     */

}
