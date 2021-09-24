package ex11.part01;

public class TestMain01 {

    public static void main(String[] args) {

        TestMain01 testMain01 = new TestMain01();

        Math add = (x, y) -> x + y;
        Math substract = (int x, int y) -> x - y;
        Math multiply = (int x, int y) -> {
            return x * y;
        };
        Math divide = (x, y) -> x / y;

        System.out.println("20 + 5 = " + testMain01.operation(20, 5, add));
        System.out.println("20 - 5 = " + testMain01.operation(20, 5, substract));
        System.out.println("20 * 5 = " + testMain01.operation(20, 5, multiply));
        System.out.println("20 / 5 = " + testMain01.operation(20, 5, divide));

        Echo msg1 = msg -> System.out.println("Hello " + msg);
        Echo msg2 = (msg) -> {
            System.out.println("Hello " + msg);
        };

        msg1.msg("a");
        msg2.msg("b");

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
        void msg(String msg);
    }

    interface Process {
        void echo();
    }

}
