package DependencyInversion.DIPImplementation;

import java.util.List;
import java.util.Arrays;

/**
 * Low level module dependent on abstraction i.e., IProductRepository
 * Thereby upholding DIP
 * SQLProductRepository is dependent on abstraction i.e., IProductRepository
 */
public class SQLProductRepository implements IProductRepository{
    
    public List<String> getAllProductNames() {
        return Arrays.asList("soaps", "toothpaste");
    }
}