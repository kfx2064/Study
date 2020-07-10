package ch08.part02.main4.sub2;

public class TestMain {

    public static void method(String str) {
        str += " - 문자열 추가";
    }

    public static void method(StringBuffer sb) {
        sb.append("- 문자열 추가");
    }

    public static void main(String[] args) {

        String str = "메인 str";
        StringBuffer sb = new StringBuffer("메인 sb");
        System.out.println("String 초기 값 = " + str);
        System.out.println("StringBuffer 초기 값 = " + sb.toString());

        method(str);
        method(sb);

        System.out.println("String 변경 값 = " + str);
        System.out.println("StringBuffer 변경 값 = " + sb.toString());

    }

}
