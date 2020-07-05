package ch07.part07.main1;

import javax.swing.*;
import java.security.ProtectionDomain;

public class ProductView extends JFrame {

    public ProductView() {

        this.setSize(300, 300);

        ProductVo product1 = new ProductVo("a001", "아메리카노", 4000);
        ProductVo product2 = new ProductVo("a002", "카페라떼", 4300);
        ProductVo product3 = new ProductVo("a003", "카페모카", 4500);

        TableGroup<ProductVo> tableGroup = new TableGroup<>(ProductVo.class
                , new ProductVo[]{product1, product2, product3});

        this.add(tableGroup.getTablePanel());

        this.setVisible(true);

    }

    public static void main(String[] args) throws Exception {
        new ProductView();
    }

}
