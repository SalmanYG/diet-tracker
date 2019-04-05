package model;

public class Bevarage extends Edible {

	public Bevarage(String name, double calories, double portion, double fat, double carbohydrates, double protein) {
		super(name, calories, portion, fat, carbohydrates, protein);
	}

	public String toString() {
		return getPortion() + "ml of " + getName() + ", containing " + getCalories() + " Calories, " + getFat()
				+ "g of fat, " + getCarbohydrates() + "g of carbohydrates, " + getProtein() + "g of protein";
	}
}
