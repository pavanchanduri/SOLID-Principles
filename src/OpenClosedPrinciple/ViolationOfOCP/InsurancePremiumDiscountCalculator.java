package OpenClosedPrinciple.ViolationOfOCP;

/**
 * As it can been seen here that for a new type of insurance,
 * We need to add a new method to compute the insurance discount based on the type of insurance
 * This violates the OCP as we need to modify the InsurancePremiumDiscountCalculator everytime
 */
public class InsurancePremiumDiscountCalculator {
    
    public int calculatePremiumDiscountPercentage(HealthInsuranceCustomerProfile customerProfile) {
        if(customerProfile.isLoyalCustomer()) {
            return 20;
        }
        return 0;
    }

    public int calculatePremiumDiscountPercentage(VehicleInsuranceCustomerProfile customerProfile) {
        if(customerProfile.isLoyalCustomer()) {
            return 15;
        }
        return 0;
    }

}
