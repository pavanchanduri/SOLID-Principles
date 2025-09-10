package DependencyInversion.ViolationOfDIP;

import java.util.List;
import java.util.Arrays;

public class SQLProductRepository {

    public List<String> getAllProductNames() {
        return Arrays.asList("soaps", "toothpaste");
    }
}