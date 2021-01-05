package exer01.c;

public class Exer1 {

    public static void main(String[] args) {

        Math add = (x, y) -> x + y;
        Math substract = (x, y) -> {
            return x - y;
        };
        Math multiply = (int x, int y) -> x * y;
        Math divide = (int x, int y) -> {
            return x / y;
        };

        Exer1 exer1 = new Exer1();
        int intAdd = exer1.operation(100, 20, add);
        int intSubstract = exer1.operation(100, 20, substract);
        int intMultiply = exer1.operation(100, 20, multiply);
        int intDivide = exer1.operation(100, 20, divide);

        System.out.println("더하기 : " + intAdd);
        System.out.println("빼기 : " + intSubstract);
        System.out.println("곱하기 : " + intMultiply);
        System.out.println("나누기 : " + intDivide);

    }

    interface Math {
        int operation(int x, int y);
    }

    private int operation(int x, int y, Math math) {
        return math.operation(x, y);
    }

}
