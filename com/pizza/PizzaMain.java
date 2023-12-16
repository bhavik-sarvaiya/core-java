package com.pizza;

public class PizzaMain {
	public static void main(String[] args) {
        Pizza basePizza = new Pizza();
        //new Pizza(false);
        
        
        basePizza.addExtraTop();
        basePizza.addExtraCheese();
        basePizza.getBill();
        basePizza.takeAway();
        basePizza.getPizza(false);
        
    }
}
