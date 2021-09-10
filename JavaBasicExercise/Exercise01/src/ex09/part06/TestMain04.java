package ex09.part06;

public class TestMain04 {

    public static void main(String[] args) {

        TestMain04 test = new TestMain04();

        Math add = (x, y) -> x + y;
        Math substract = (int x, int y) -> x - y;
        Math multiply = (int x, int y) -> {
            return x * y;
        };
        Math divide = (int x, int y) -> x / y;

        System.out.println("20 + 5 = " + test.operation(20, 5, add));
        System.out.println("20 - 5 = " + test.operation(20, 5, substract));
        System.out.println("20 * 5 = " + test.operation(20, 5, multiply));
        System.out.println("20 / 5 = " + test.operation(20, 5, divide));

        Echo msg1 = (msg) -> {
            System.out.println("Hello! " + msg);
        };

        Echo msg2 = msg -> System.out.println("Hello! " + msg);

        msg1.echo("a");
        msg2.echo("b");

        Process process = () -> System.out.println("No parameter!");
        process.echo();

    }

    private int operation(int x, int y, Math math) {
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
