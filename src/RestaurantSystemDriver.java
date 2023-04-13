public class RestaurantSystemDriver {
    public static void main(String[] args) {
        // Create food items
        FoodItem burger = new Burger();
        FoodItem fries = new Fries();
        FoodItem drink = new Drink();

        // Add toppings to food items
        Bacon burger1 = new Bacon(burger);
        Cheese burger2 = new Cheese(burger);
        Cheese fries1 = new Cheese(fries);

        // Create order
        Order order = new Order();
        order.addItem(burger);
        order.addItem(fries);
        order.addItem(drink);

        // Print food item details
        System.out.println("Food Item: " + burger.getDescription());
        System.out.println("Base Price: $" + burger.getCost());
        System.out.println("Toppings: " + burger1.getDescription() +"," + burger2.getDescription());
        float cost1 = (float) burger2.getCost();
        float cost2= (float) burger1.getCost();
        float cost3= (float) burger.getCost();

        System.out.println("Total Cost: $" + ( cost1 + cost2 + cost3)) ;

        System.out.println("Food Item: " + fries.getDescription());
        System.out.println("Base Price: $" + fries.getCost());
        System.out.println("Toppings: " + fries1.getDescription());
        float cost4= (float) fries.getCost();
        float cost5= (float) fries1.getCost();
        System.out.println("Total Cost: $" +(cost4 + cost5));

        System.out.println("Food Item: " + drink.getDescription());
        System.out.println("Base Price: $" + drink.getCost());
        System.out.println("Total Cost: $" + drink.getCost());


        //Calculate total cost before discount
        double totalCostBeforeDiscount = cost1 + cost2+ cost3 + cost4 + cost5 + drink.getCost();
        System.out.println("Total cost before discount: $" + totalCostBeforeDiscount);

        // Apply loyalty discount
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus("Gold", 0.1); // Assuming 10% discount for Gold status
        double totalCostAfterDiscount = loyaltyStatus.applyDiscount(totalCostBeforeDiscount);
        System.out.println("Total cost after discount: $" + totalCostAfterDiscount);
    }
}


