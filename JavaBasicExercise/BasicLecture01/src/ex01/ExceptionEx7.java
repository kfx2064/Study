package ex01;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class ExceptionEx7 {

    public static void main(String[] args) throws Exception {

        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            if(ae instanceof ArithmeticException) {
                System.out.println("true");
            }

            if(ae instanceof ArithmeticException) {
                System.out.println("instanceof ae");
            }

            System.out.println("ArithmeticException");

        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println(6);

    }

}
