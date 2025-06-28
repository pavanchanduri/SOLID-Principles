package InterfaceSegregation.ISPImplementation;

/**
 * This interface defines the contract for a scanner.
 * It adheres to the Interface Segregation Principle (ISP) by providing
 * only the methods related to scanning functionality.
 * Classes that implement this interface will only need to provide
 * implementations for the methods they require, promoting a cleaner design.
 */
public interface IScanner {
    void scanDocument();
    void scanPhoto();
}
