package exer01.d;

public class Exer4 {

    public static void main(String[] args) {

        Math add = (x, y) -> x + y;
        Math subs = (int x, int y) -> x - y;
        Math multi = (x, y) -> {
            return x * y;
        };
        Math divide = (int x, int y) -> {
            return x / y;
        };

        int sum = add.operation(100, 20);
        int min = subs.operation(100, 20);
        int mul = multi.operation(100, 20);
        int div = add.operation(100, 20);

        System.out.println("더하기 : " + sum);
        System.out.println("빼기 : " + min);
        System.out.println("곱하기 : " + mul);
        System.out.println("나누기 : " + div);

    }

    interface Math {
        int operation(int x, int y);
    }

}
