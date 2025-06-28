package InterfaceSegregation.ISPImplementation;

/** 
 * This class implements the printer and scanner interfaces. 
 * It provides the functionality to print and scan documents.
 * It adheres to the Interface Segregation Principle (ISP) by implementing
 * only the methods that are relevant to its functionality, avoiding unnecessary complexity.
 * This allows for a cleaner design and promotes the Single Responsibility Principle (SRP).
 * Each class is responsible for a specific functionality, making the code easier to maintain and extend.
 */
public class HPPrinterScanner implements IPrinter, IScanner {
    
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
}
