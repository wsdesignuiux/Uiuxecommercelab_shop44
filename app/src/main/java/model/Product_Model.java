package model;

public class Product_Model {

    Integer pic;
    String amount,tv1,tv2;

    public Integer getPic() {
        return pic;
    }

    public void setPic(Integer pic) {
        this.pic = pic;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTv1() {
        return tv1;
    }

    public void setTv1(String tv1) {
        this.tv1 = tv1;
    }

    public String getTv2() {
        return tv2;
    }

    public void setTv2(String tv2) {
        this.tv2 = tv2;
    }

    public Product_Model(Integer pic, String amount, String tv1, String tv2) {
        this.pic = pic;
        this.amount = amount;
        this.tv1 = tv1;
        this.tv2 = tv2;
    }
}
