package LiskovSubstitution.LSPImplementation_2;

public class InHouseProduct extends Product {

    public InHouseProduct(double discount) {
        super(discount);
    }

    @Override
    public double getDiscount() {
        this.applyExtraDiscount();
        return discount;
    }

    public void applyExtraDiscount() {
        discount = discount*1.5;
    }
    
}
