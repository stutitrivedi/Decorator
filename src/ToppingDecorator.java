// Abstract decorator class for toppings
public abstract class ToppingDecorator implements FoodItem {
    protected FoodItem foodItem;

    public ToppingDecorator(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public double getCost() {
        return foodItem.getCost();
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription();
    }
}