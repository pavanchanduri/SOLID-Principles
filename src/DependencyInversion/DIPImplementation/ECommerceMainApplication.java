package DependencyInversion.DIPImplementation;

import java.util.List;

public class ECommerceMainApplication {

    public static void main(String[] args) {

        //Dependency Injection in to Product Catalog class
        ProductCatalog productCatalog = new ProductCatalog(ProductFactory.create());
        List<String> productList = productCatalog.listAllProducts();
        productList.forEach(System.out::println);
    }
}