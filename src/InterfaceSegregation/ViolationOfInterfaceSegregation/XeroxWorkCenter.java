package InterfaceSegregation.ViolationOfInterfaceSegregation;

/**
 * Despite implementing the IMultiFunction interface, this class does not need to implement
 * all methods, leading to unnecessary complexity and potential misuse.
 * This is a violation of the Interface Segregation Principle.
 */

public class XeroxWorkCenter implements IMultiFunction {

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
