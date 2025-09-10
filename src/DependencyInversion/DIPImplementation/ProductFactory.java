package DependencyInversion.DIPImplementation;

public class ProductFactory {

    public static IProductRepository create() {
        return new SQLProductRepository();
    }
}
