package ex09;

@FunctionalInterface
interface Foo {

    String method(String string);

}

public class UseFoo {

    public String add(String string, Foo foo) {
        return foo.method(string);
    }

}
