package exer01.c;

public class Exer2 {

    public static void main(String[] args) {

        Math add = (int x, int y) -> {
            return x + y;
        };
        
        Math substract = (int x, int y) -> {
            return x - y;  
        };
        
        Math multiply = (x, y) -> {
            return x * y;
        };
        
        Math divide = (x, y) -> x / y;

        int sum = add.operation(100, 20);
        int minus = substract.operation(100, 20);
        int multi = multiply.operation(100, 20);
        int div = divide.operation(100, 20);

        System.out.println("더하기 : " + sum);
        System.out.println("빼기 : " + minus);
        System.out.println("곱하기 : " + multi);
        System.out.println("나누기 : " + div);
        

    }

    interface Math {
        int operation(int x, int y);
    }

}
