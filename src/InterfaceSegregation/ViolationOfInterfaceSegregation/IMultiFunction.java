package InterfaceSegregation.ViolationOfInterfaceSegregation;

/**
 * This interface is a fat interface that violates the Interface Segregation Principle (ISP).
 * It forces classes to implement methods that they may not need, leading to unnecessary complexity.
 * Also, it can lead to misuse of the interface by classes that do not require all functionalities.
 * It also violates the Single Responsibility Principle (SRP) as it combines multiple responsibilities
 * (printing, scanning, and faxing) into a single interface.
 * A better approach would be to create smaller, more focused interfaces for each functionality.
 * For example, separate interfaces for printing, scanning, and faxing.
 * This would allow classes to implement only the methods they need, adhering to the Interface Segregation Principle.
 */
public interface IMultiFunction {

    void printDocument();
    void getPrintSpoolDetails();
    void scanDocument();
    void scanPhoto();
    void faxDocument();
    void getFaxDetails();
}
