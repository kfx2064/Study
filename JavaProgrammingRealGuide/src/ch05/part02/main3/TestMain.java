package ch05.part02.main3;

public class TestMain {

    public static void main(String[] args) {

        String[] arr = new String[]{"a", "b", "c"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println();

        for (String s : arr) {
            System.out.println("자료조회 = " + s);
        }

    }

}
