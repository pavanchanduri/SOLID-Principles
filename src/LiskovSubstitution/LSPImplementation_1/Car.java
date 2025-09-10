package LiskovSubstitution.LSPImplementation_1;

public class Car extends Vehicle {

    @Override
    public double getInteriorWidth() {
        return getInteriorWidth();
    }

    public double getCabinWidth() {
        return 0.0;
    }
}
