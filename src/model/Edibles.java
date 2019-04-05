package model;

public class Edibles {
	private String name;
	private double portion, calories, fat, carbohydrates, protein;

	public Edibles(String name, double calories, double portion, double fat, double carbohydrates, double protein) {
		this.name = name;
		this.calories = calories;
		this.portion = portion;
		this.fat = fat;
		this.carbohydrates = carbohydrates;
		this.protein = protein;
	}
	// gets

	public String getName() {
		return name;
	}

	public double getCalories() {
		return calories;
	}

	public double getCarbohydrates() {
		return carbohydrates;
	}

	public double getPortion() {
		return portion;
	}

	public double getFat() {
		return fat;
	}

	public double getProtein() {
		return protein;
	}

	// sets

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public void setCarbohydrates(double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPortion(double portion) {
		this.portion = portion;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}
}
