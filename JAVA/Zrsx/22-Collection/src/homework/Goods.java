package homework;

public class Goods {
    private String goodName;
    private String goodId;
    private double goodPrice;

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public Goods(String goodName, String goodId, double goodPrice) {
        this.goodName = goodName;
        this.goodId = goodId;
        this.goodPrice = goodPrice;
    }

    public Goods() {
    }
}
