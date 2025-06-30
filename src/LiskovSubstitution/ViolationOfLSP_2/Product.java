package LiskovSubstitution.ViolationOfLSP_2;

public class Product {

    protected double discount;

    public Product(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    } 
}
