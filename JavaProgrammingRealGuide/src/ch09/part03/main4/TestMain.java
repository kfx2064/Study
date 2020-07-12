package ch09.part03.main4;

public class TestMain {
    public static void main(String[] args) {

        ChildClass c = new ChildClass();

        AbstractClass c1 = c;

        if (c1 instanceof ChildClass) {
            ChildClass c2 = (ChildClass) c1;
        }

    }
}
