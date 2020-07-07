package ch07.part07.main3.sub6;

import java.lang.reflect.Field;

public class TestMain {

    public static void main(String[] args) {

        ProductVo p = new ProductVo("a001", "아메리카노", 4000);

        try {
            Field field = ProductVo.class.getDeclaredField("price");
            Prices prices = field.getAnnotation(Prices.class);
            Price[] types = prices.value();
            for (Price price : types) {
                System.out.println("[어노테이션 정보] ::: " + price);
                double value = price.value();
                String nation = price.currency();
                String unitName = price.currencyName();

                double price2 = 1.0 * p.getPrice() / value;

                price2 = ((int)(price2 * 100 + 0.5)) / 100.0;
                System.out.println(nation + " : " + price2 + " " + unitName);
            }

        } catch (NoSuchFieldException nsfe) {
            nsfe.printStackTrace();
        } catch (SecurityException se) {
            se.printStackTrace();
        }

    }

}
