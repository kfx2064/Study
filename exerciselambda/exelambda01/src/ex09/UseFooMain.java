package ex09;

import java.util.function.Function;

public class UseFooMain {

    public static void main(String[] args) throws Exception {

        UseFoo useFoo = new UseFoo();

        Foo foo = parameter -> parameter + " from lamba";

        String result = useFoo.add("Message", foo);

        System.out.println("result : " + result);

        Function<String, String> fn = parameter -> parameter + " from lambda";
        String resultFn = add("Message", fn);

        System.out.println("result after : " + resultFn);

    }

    public static String add(String string, Function<String, String> fn) {
        return fn.apply(string);
    }

}
