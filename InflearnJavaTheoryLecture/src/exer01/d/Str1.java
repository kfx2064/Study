package exer01.d;

public class Str1 {

    public static void main(String[] args) {

        Echo msg1 = (msg) -> {
            System.out.println(msg);
        };

        Echo msg2 = msg -> System.out.println(msg);

        msg1.echo("a");
        msg2.echo("b");

        Process process = () -> System.out.println("no parameter");
        process.echo();

    }

    interface Echo {
        void echo(String msg);
    }

    interface Process {
        void echo();
    }

}
