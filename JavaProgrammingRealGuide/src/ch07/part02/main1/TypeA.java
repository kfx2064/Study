package ch07.part02.main1;

public class TypeA {

    // 정적 전역변수
    private static String var1 = "var1";

    // 전역변수
    private String var2 = "var2";

    // 정적 초기화 블럭
    static {
        System.out.println("\t정적 초기화 블록 :  var1 [" + var1 + "]");
    }

    // 초기화 블럭
    {
        System.out.println("\t초기화 블록 : var1[" + var1 + "], var2[" + var2 + "]");
    }

    public TypeA() {
        System.out.println("\t생성자함수1 : var1[" + var1 + "], var2[" + var2 + "]");
    }

    public TypeA(String param) {
        String msg = "\t생성자함수2 : var1[" + var1 + "]";
        msg += ", var2[" + var2 + "]";
        msg += ", param[" + param + "]";
        System.out.println(msg);
    }

}
