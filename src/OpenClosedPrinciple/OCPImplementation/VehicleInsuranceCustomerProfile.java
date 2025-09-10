package OpenClosedPrinciple.OCPImplementation;

import java.util.Random;

public class VehicleInsuranceCustomerProfile implements ICustomerProfile {

    @Override
    public boolean isLoyalCustomer(){
        return new Random().nextBoolean();
    }
}
