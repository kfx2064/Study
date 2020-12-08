package lec05.restrictPackage.first;

public class GoodsVO {

    public String goodsName = "쌀";
    protected int goodsCount = 1;
    String goodsUnitName = "가마니";       // default
    private int goodsPrice = 800000;

    public int getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(int goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
}
