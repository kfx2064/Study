package ch07.part03.main4;

public class TypeA {

    private static int count1 = 1;

    private int count2 = 2;

    private static void method1() {

    }

    private void method2() {

    }

    public static class TypeB {

        private int count3 = 3;

        private static int count4 = 4;

        public void method3() {
            System.out.println(count1);
            method1();
        }

        public static void method4() {
            System.out.println(count1);
            method1();
        }

    }

}
