package InterfaceSegregation.ViolationOfInterfaceSegregation;

/**
 * This interface violates the Interface Segregation Principle (ISP) by forcing
 * classes to implement methods that they do not use. This class that only needs
 * to print documents and should not be forced to implement methods for
 * scanning and faxing documents.
 */
public class CanonPrinter implements IMultiFunction {

    @Override
    public void printDocument() {
        System.out.println("Printing document...");
    }

    @Override
    public void getPrintSpoolDetails() {
        System.out.println("Getting print spool details...");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning document...");
    }

    @Override
    public void scanPhoto() {
        System.out.println("Scanning photo...");
    }

    @Override
    public void faxDocument() {
        System.out.println("Faxing document...");
    }

    @Override
    public void getFaxDetails() {
        System.out.println("Getting fax details...");
    }
}
