// Concrete implementation of food item - Fries
public class Fries implements FoodItem {
    private String description = "Fries";
    private double cost = 2.0;

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}