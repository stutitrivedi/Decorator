// Concrete implementation of food item - Drink
public class Drink implements FoodItem {
    private String description = "Drink";
    private double cost = 1.0;

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}