import java.util.ArrayList;
import java.util.List;

// Class representing customer's order
public class Order {
    private List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item) {
        items.add(item);
    }

   public double getTotalCost() {
        double totalCost = 0.0;
        for (FoodItem item : items) {
            totalCost += item.getCost() ;
        }
        return totalCost;
    }
   public double getTotalCostWithToppings() {
       double totalCost = 0.0;
       for (FoodItem item : items) {
           totalCost += item.getCost() ; // Inclueesde cost of toppings
       }
       return totalCost;
   }


    public List<FoodItem> getItems() {
        return items;
    }
}