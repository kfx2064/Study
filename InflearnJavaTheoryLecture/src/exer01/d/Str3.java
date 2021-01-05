package exer01.d;

import org.w3c.dom.ls.LSOutput;

public class Str3 {

    public static void main(String[] args) {

        Echo echo1 = (msg) -> {
            System.out.println(msg);
        };
        Echo echo2 = (msg) -> System.out.println(msg);
        Process process = () -> System.out.println("no param");

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
