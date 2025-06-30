package LiskovSubstitution.ViolationOfLSP_2;

public class InHouseProduct extends Product {

    public InHouseProduct(double discount) {
        super(discount);
    }

    public void applyExtraDiscount() {
        discount = discount*1.5;
    }
    
}
