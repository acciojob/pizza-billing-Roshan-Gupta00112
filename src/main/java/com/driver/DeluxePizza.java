package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
//        super.addExtraCheese();
//        super.addExtraToppings();
        addExtraCheese();
        addExtraToppings();
//        super.setExtraCheeseAdded(false);
//        super.setExtraToppingAdded(false);   // No Extra Cheese & Topping will be given to Deluxe Pizza
    }
}
