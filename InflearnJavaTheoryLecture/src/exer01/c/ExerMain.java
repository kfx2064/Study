package exer01.c;

import java.util.function.IntBinaryOperator;

public class ExerMain {

    public static void main(String[] args) {

        Math add = (int x, int y) -> {
            return x + y;
        };

        Math substract = (int x, int y) -> {
            return x - y;
        };

        Math multiply = (x, y) -> {
            return x * y;
        };

        Math dividie = (x, y) -> {
            return x / y;
        };

        ExerMain exerMain = new ExerMain();
        int opSum = exerMain.operation(100, 20, add);
        int opSubs = exerMain.operation(100, 20, substract);
        int opMulti = exerMain.operation(100, 20, multiply);
        int opDiv = exerMain.operation(100, 20, dividie);

        System.out.println("더하기 : " + opSum);
        System.out.println("빼기 : " + opSubs);
        System.out.println("곱하기 : " + opMulti);
        System.out.println("나누기 : " + opDiv);

    }

    interface Math {
        int operation(int x, int y);
    }

    int operation(int x, int y, Math math) {
        return math.operation(x, y);
    }

}
