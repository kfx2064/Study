package ex06.part02;

public class TestMain01 {

    public static void main(String[] args) {

        TestMain01 test = new TestMain01();

        Math add = (int x, int y) -> x + y;

        Math substract = (x, y) -> x - y;

        Math multiply = (int x, int y) -> { return x * y; };

        Math divdie = (int x, int y) -> x / y;

        System.out.println("20 + 5 = " + test.operate(20, 5, add));
        System.out.println("20 - 5 = " + test.operate(20, 5, substract));
        System.out.println("20 x 5 = " + test.operate(20, 5, multiply));
        System.out.println("20 / 5 = " + test.operate(20, 5, divdie));

        Echo msg1 = (msg) -> {
            System.out.println("Hello! " + msg);
        };

        Echo msg2 = msg -> System.out.println("Hello! " + msg);

        msg1.echo("a");
        msg2.echo("b");

        Process process = () -> System.out.println("no parameter!");
        process.echo();

    }

    private int operate(int x, int y, Math math) {
        return math.operation(x, y);
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
