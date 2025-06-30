package DependencyInversion.DIPImplementation;

import java.util.List;

/**
 * High level module dependent on abstraction i.e., IProductRepository
 * Thereby upholding DIP
 */
public class ProductCatalog {

    IProductRepository productRepository;

    public ProductCatalog(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<String> listAllProducts() {
        return this.productRepository.getAllProductNames();
    }
    
}
