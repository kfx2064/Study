package ch08.part02.main3;

public class TestMain1 {

    public static int method(int count) {
        count++;
        System.out.println("st method = " + count);
        return count;
    }

    public static void main(String[] args) {

        int count = 0;
        System.out.println("count = " + count);

        int method = method(count);

        System.out.println("count = " + method);

    }

}
