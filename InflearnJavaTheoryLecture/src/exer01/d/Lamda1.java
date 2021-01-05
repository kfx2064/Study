package exer01.d;

public class Lamda1 {

    public static void main(String[] args) {

        MathNoneParam mathNoneParam1 = () -> System.out.println("show this method.");
        MathNoneParam mathNoneParam2 = () -> System.out.println("this is sparta");

        Math math1 = (x, y) -> x + y;
        Math math2 = (x, y) -> x * y;
        Math math3 = (int x, int y) -> {
            return x / y;
        };
        Math math4 = (int x, int y) -> {
            return x - y;
        };

        mathNoneParam1.noParamOperator();
        mathNoneParam2.noParamOperator();

        math1.operator(100, 20);
        math2.operator(100, 20);
        math3.operator(100, 20);
        math4.operator(100, 20);

    }

    interface Math {
        int operator(int x, int y);
    }

    interface MathNoneParam {
        void noParamOperator();
    }

}
