package exer01.d;

public class Exer1 {

    public static void main(String[] args) {

        Math add = (x, y) -> x + y;

        Exer1 exer1 = new Exer1();
        int operation = exer1.operation(100, 20, add);

        System.out.println("더하기 : " + operation);

    }

    interface Math {
        int operation(int x, int y);
    }

    private int operation(int x, int y, Math math) {
        return math.operation(x, y);
    }

}
