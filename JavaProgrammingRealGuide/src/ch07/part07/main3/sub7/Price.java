package ch07.part07.main3.sub7;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
@Repeatable(Prices.class)
public @interface Price {

    public double value();
    public String currency();
    public String currencyName();

}
