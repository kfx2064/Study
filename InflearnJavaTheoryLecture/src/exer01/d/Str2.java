package exer01.d;

public class Str2 {

    public static void main(String[] args) {

        Echo echo1 = (msg) -> System.out.println(msg);
        Echo echo2 = (msg) -> {
            System.out.println(msg);
        };

        Process process = () -> System.out.println("no msg");

        echo1.echo("a");
        echo2.echo("b");
        process.echo();

    }

    interface Echo {
        void echo(String msg);
    }

    interface Process {
        void echo();
    }

}
