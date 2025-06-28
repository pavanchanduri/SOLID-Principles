package InterfaceSegregation.ISPImplementation;

/**
 * This interface defines the contract for a fax machine.
 * It adheres to the Interface Segregation Principle (ISP) by providing
 * only the methods related to faxing functionality.
 * Classes that implement this interface will only need to provide
 * implementations for the methods they require, promoting a cleaner design.
 */
public interface IFaxMachine {
    void faxDocument();
    void getFaxDetails();
}
