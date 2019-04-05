package model;

public class Food extends Edibles {
	public Food(String name, double calories, double portion, double fat, double carbohydrates, double protein) {
		super(name, calories, portion, fat, carbohydrates, protein);
	}

	public String toString() {
		return getPortion() + "grams of " + getName() + ", containing " + getCalories() + " Calories, " + getFat()
				+ "g of fat, " + getCarbohydrates() + "g of carbohydrates, " + getProtein() + "g of protein";
	}
}
