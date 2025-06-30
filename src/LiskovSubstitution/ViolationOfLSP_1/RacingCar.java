package LiskovSubstitution.ViolationOfLSP_1;

/**
 * In a racing car, there is no cabin and the interior is called
 * Cockpit and thereby getCabinWidth method doesn't make sense
 * 
 */
public class RacingCar extends Car {

    @Override
    public double getCabinWidth() {
        return 0.0;
    }

    public double getCockpitWidth() {
        return 0.0;
    } 
}
