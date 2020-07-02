package ch07.part03.main3;

public class TypeA {

    private static int count1 = 1;

    private int count2 = 2;

    private static void method1() {

    }

    private void method2() {

    }

    public class TypeB {

        private int count3 = 3;

        public void method3() {
            System.out.println(count1);
            System.out.println(count2);
            method1();
            method2();
        }
    }

}
