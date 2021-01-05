package exer01.d;

public class Exer2 {

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
        int min = substract.operation(100, 20);
        int mul = multiply.operation(100, 20);
        int div = divide.operation(100, 20);

        System.out.println("더하기 : " + sum);
        System.out.println("빼기 : " + min);
        System.out.println("곱하기 : " + mul);
        System.out.println("나누기 : " + div);

    }

    interface Math {
        int operation(int x, int y);
    }

    private int operation(int x, int y, Math math) {
        return math.operation(x, y);
    }

}
