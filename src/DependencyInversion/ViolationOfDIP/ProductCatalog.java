package DependencyInversion.ViolationOfDIP;

/**
 * The high level module ProductCatalog is dependent on the low level module
 * SQLProductRepository which is a violation of DIP.
 */

public class ProductCatalog {

    public void listAllProducts() {
        SQLProductRepository sqlProductRepository = new SQLProductRepository();
        sqlProductRepository.getAllProductNames();
    }
}
