package exer01.d;

public class Lamda3 {

    public static void main(String[] args) {

        Math add = (x, y) -> x + y;
        Math subs = (x, y) -> {
            return x - y;
        };
        Math mul = (int x, int y) -> x * y;
        Math div = (int x, int y) -> {
            return x / y;
        };

        int op1 = add.operator(100, 20);
        int op2 = subs.operator(100, 20);
        int op3 = mul.operator(100, 20);
        int op4 = div.operator(100, 20);

        System.out.println("더하기 : " + op1);
        System.out.println("빼기 : " + op2);
        System.out.println("곱하기 : " + op3);
        System.out.println("나누기 : " + op4);

    }

    interface Math {
        int operator(int x, int y);
    }

    private int operator(int x, int y, Math math) {
        return math.operator(x, y);
    }

}
