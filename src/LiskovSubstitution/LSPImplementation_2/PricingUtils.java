package LiskovSubstitution.LSPImplementation_2;

import java.util.List;
import java.util.ArrayList;

public class PricingUtils {

    public static void main(String[] args) {
        
        Product p1 = new Product(20);
        Product p2 = new Product(15);

        /**
         * The objects can now be replaced by their subtypes without any affect to the functionality
         */
        InHouseProduct p3 = new InHouseProduct(30);
        //Product p3 = new InHouseProduct(30);

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);

        for(Product product: productList) {
            System.out.println(product.getDiscount());
        }

    }
    
}
