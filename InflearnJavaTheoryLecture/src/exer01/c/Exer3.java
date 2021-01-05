package exer01.c;

public class Exer3 {

    public static void main(String[] args) {

        Math add = (x, y) -> x + y;
        Math substract = (x, y) -> {
            return x - y;
        };
        Math multiply = (int x, int y) -> x * y;
        Math divide = (int x, int y) -> {
            return x / y;
        };

        int sum = add.operation(100, 20);
        int subs = substract.operation(100, 20);
        int mult = multiply.operation(100, 20);
        int div = divide.operation(100, 20);

        System.out.println("더하기 : " + sum);
        System.out.println("빼기 : " + subs);
        System.out.println("곱하기 : " + mult);
        System.out.println("나누기 : " + div);

    }

    interface Math {
        int operation(int x, int y);
    }

}
