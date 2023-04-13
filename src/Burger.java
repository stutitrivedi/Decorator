// Concrete implementation of food item - Burger
public class Burger implements FoodItem {
    private String description = "Burger";
    private double cost = 5.0;

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return   description;
    }
}