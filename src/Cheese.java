// Concrete implementation of topping - Cheese
public class Cheese extends ToppingDecorator {
    private String description = "Cheese";
    private double cost = 1.0;

    public Cheese(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}