package ch07.part07.main3.sub3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface Anno1 {

    public int value();
    public String name();
    public DataType dataType();
    public Child child();

}
