package InterfaceSegregation.ISPImplementation;

/**
 * This class implements the IPrinter interface.
 * It provides the functionality to print documents and get print spool details.
 * It adheres to the Interface Segregation Principle (ISP) by implementing
 * only the methods that are relevant to its functionality, avoiding unnecessary complexity.
 * This allows for a cleaner design and promotes the Single Responsibility Principle (SRP).
 */
public class CanonPrinter implements IPrinter {

    @Override
    public void printDocument() {
        System.out.println("Printing document...");
    }

    @Override
    public void getPrintSpoolDetails() {
        System.out.println("Getting print spool details...");
    }
}
