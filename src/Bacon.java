// Concrete implementation of topping - Bacon
public class Bacon extends ToppingDecorator {
    private String description = "Bacon";
    private double cost = 2.0;

    public Bacon(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return   description;
    }
}