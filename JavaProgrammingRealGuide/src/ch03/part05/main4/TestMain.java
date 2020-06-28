package ch03.part05.main4;

import ch03.part05.main4.service.ProductService;
import ch03.part05.main4.vo.ProductVo;

public class TestMain {

    public static void main(String[] args) {

        ProductVo product1 = new ProductVo();
        product1.setProductNo("a001");
        product1.setProductName("아메리카노");
        product1.setPrice(4000);

        ProductVo product2 = new ProductVo();
        product2.setProductNo("a002");
        product2.setProductName("카페라떼");
        product2.setPrice(4300);

        ProductVo product3 = new ProductVo();
        product3.setProductNo("a003");
        product3.setProductName("카페모카");
        product3.setPrice(4500);

        ProductService productService = new ProductService();

        productService.insertProduct(product1);
        productService.insertProduct(product2);
        productService.insertProduct(product3);

        int price = product1.getPrice() + 200;
        product1.setPrice(price);
        int updateProduct = productService.updateProduct(product1);

        productService.deleteProduct("a003");

        ProductVo productVo = productService.getProduct("a001");

    }

}
