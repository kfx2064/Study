package ch07.part07.main3.sub3;

public class ProductVo {

    @Anno1(
            value = 1
            , name = "name"
            , dataType = DataType.A
            , child = @Child(value = 1)
    )
    private String productNo;

    @Anno2(
            values = {1, 2}
            , names = {"name1", "name2"}
            , dataTypes = { DataType.A, DataType.B }
            , children = { @Child(value = 1), @Child(value = 2)}
    )
    private String productName;

}
