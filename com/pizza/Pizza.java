package com.pizza;

/*
 * Pizza bill generator
 * */

class Pizza {
	private int price;
	private boolean veg;
	private final int extraCheesePrice = 100;
	private final int extraTopAdd = 150;
	private final int takeAwayPrice = 100;
	private int basePizzaPrice;
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraTopAdded = false;
	private boolean isTakeAway = false;
	
	public Pizza() {}

	public Pizza(boolean veg) {
		this.veg = veg;
		this.price = (this.veg) ? 300 : 400;
		basePizzaPrice = this.price;
	}
	
	public void getPizza(boolean veg) {
		this.veg = veg;
		this.price = (this.veg) ? 300 : 400;
		basePizzaPrice = this.price;
	}

	public void addExtraCheese() {
		isExtraCheeseAdded = true;
		System.out.println("Extra cheese is added");
		this.price += extraCheesePrice;
	}

	public void addExtraTop() {
		isExtraTopAdded = true;
		System.out.println("Extra topping is added");
		this.price += extraTopAdd;
	}

	public void takeAway() {
		isTakeAway = true;
		System.out.println("Takeaway");
		this.price += takeAwayPrice;
	}

	public void getBill() {
		System.out.println("Base Pizza Price: " + basePizzaPrice);

		if (isExtraCheeseAdded) {
			System.out.println("Extra Cheese added: " + extraCheesePrice);
		}
		if (isExtraTopAdded) {
			System.out.println("Extra Topping added: " + extraTopAdd);
		}
		if (isTakeAway) {
			System.out.println("Takeaway Charge: " + takeAwayPrice);
		}

		System.out.println("Total Bill: " + this.price);
	}
	
}
