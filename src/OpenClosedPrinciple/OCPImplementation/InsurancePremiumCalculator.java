package OpenClosedPrinciple.OCPImplementation;

/**
 * Here we pass the reference of ICustomerProfile and based on the instance we pass
 * The premium discount is computed
 * For any new type of insurance, we dont need to add a new overloaded method thereby
 * implementing OCP
 */
public class InsurancePremiumCalculator {

    public int calculateInsurancePremiumDiscountPercentage(ICustomerProfile customerProfile) {

        if(customerProfile.isLoyalCustomer()) {
            return 20;
        }
        return 0;
    }
}
