// Class representing customer's loyalty status
public class LoyaltyStatus {
    private String status;
    private double discount;

    public LoyaltyStatus(String status, double discount) {
        this.status = status;
        this.discount = discount;
    }

    public double applyDiscount(double totalCost) {
        return totalCost * (1 - discount);
    }
}