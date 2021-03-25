package com.debjyoti;

import com.debjyoti.item.ChickenBurger;
import com.debjyoti.item.Coke;
import com.debjyoti.item.Pepsi;
import com.debjyoti.item.VegBurger;

public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
