package exer01.a;

public class ExerMain {

    public static void main(String[] args) {

        ExerMain exerMain = new ExerMain();

        Math add = (int x, int y) -> x + y;

        Math substract = (x, y) -> x - y;

        Math multiply = (int x, int y) -> {
            return x * y;
        };

        Math divide = (int x, int y) -> x / y;

        System.out.println("20 + 5 = " + exerMain.operate(20, 5, add));
        System.out.println("20 - 5 = " + exerMain.operate(20, 5, substract));
        System.out.println("20 * 5 = " + exerMain.operate(20, 5, multiply));
        System.out.println("20 / 5 = " + exerMain.operate(20, 5, divide));

        Echo msg1 = (msg) -> {
            System.out.println("Hello! " + msg);
        };

        Echo msg2 = msg -> {
            System.out.println("Hello! " + msg);
        };

        msg1.echo("a");
        msg2.echo("b");

    }

    private int operate(int x, int y, Math math) {
        return math.operation(x ,y);
    }

    interface Math {
        int operation(int x, int y);
    }

    interface Echo {
        void echo(String msg);
    }

    interface Process {
        void echo();
    }

}
