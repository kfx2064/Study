package ex10.part01;

public class TestMain08 {

    public static void main(String[] args) {

        TestMain08 test = new TestMain08();

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

        Echo msg1 = msg -> System.out.println("Hello! " + msg);
        Echo msg2 = (msg) -> System.out.println("Hello! " + msg);

        msg1.echo("a");
        msg2.echo("b");

        Process process = () -> System.out.println("Good day.");
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
