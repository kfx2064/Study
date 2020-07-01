package ch07.part02.main4;

public class TestMain {



    public static void main(String[] args) {

        ProductVo v1 = new ProductVo();
        ProductVo v2 = new ProductVo();
        ProductVo v3 = new ProductVo();
        ProductVo v4 = new ProductVo();
        ProductVo v5 = new ProductVo();

        System.out.println("객체1 : v1.no [" + v1.no + "]");
        System.out.println("객체2 : v2.no [" + v2.no + "]");
        System.out.println("객체3 : v3.no [" + v3.no + "]");
        System.out.println("객체4 : v4.no [" + v4.no + "]");
        System.out.println("객체5 : v5.no [" + v5.no + "]");

        System.out.println("객체1 : v1.count [" + ProductVo.count + "]");
        System.out.println("객체2 : v2.count [" + ProductVo.count + "]");
        System.out.println("객체3 : v3.count [" + ProductVo.count + "]");
        System.out.println("객체4 : v4.count [" + ProductVo.count + "]");
        System.out.println("객체5 : v5.count [" + ProductVo.count + "]");

        System.out.println("ProductVo.count [" + ProductVo.count + "]");

    }

}