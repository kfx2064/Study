package ex10.part10;

public class TestMain02 {

    public static void main(String[] args) {

        TestMain02 test = new TestMain02();

        Math add = (x, y) -> x + y;
        Math substract = (int x, int y) -> x - y;
        Math multiply = (int x, int y) -> {
            return x * y;
        };
        Math divide = (x, y) -> x / y;

        System.out.println("20 + 5 = " + test.operation(20, 5, add));
        System.out.println("20 - 5 = " + test.operation(20, 5, substract));
        System.out.println("20 * 5 = " + test.operation(20, 5, multiply));
        System.out.println("20 / 5 = " + test.operation(20, 5, divide));

        Echo msg1 = msg -> System.out.println("Hello " + msg);
        Echo msg2 = (msg) -> {
            System.out.println("Hello " + msg);
        };

        msg1.echo("a");
        msg2.echo("b");

        Process process = () -> System.out.println("Hello world.");
        process.echo();

    }

    interface Math {
        int operation(int x, int y);
    }

    private int operation(int x, int y, Math math) {
        return math.operation(x, y);
    }

    interface Echo {
        void echo(String msg);
    }

    interface Process {
        void echo();
    }

}
