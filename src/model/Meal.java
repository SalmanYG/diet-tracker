package model;

import java.util.*;

public class Meal {

	private ArrayList<Edibles> eatList;

	public Meal() {
		eatList = new ArrayList();
	}

	public ArrayList<Edibles> getList() {
		return this.eatList;
	}

	public double sumCalories() {

		double sumCal = 0.0;
		for (int i = 0; i < getList().size(); i++) {
			sumCal += getList().get(i).getCalories();
		}

		return sumCal;
	}

	public double sumProtein() {

		double sumPro = 0.0;
		for (int i = 0; i < getList().size(); i++) {
			sumPro += getList().get(i).getProtein();
		}

		return sumPro;
	}
	
	public double sumCarbo() {

		double sumCarbo = 0.0;
		for (int i = 0; i < getList().size(); i++) {
			sumCarbo += getList().get(i).getCarbohydrates();
		}

		return sumCarbo;
	}
	
	public double sumFats() {

		double sumFat = 0.0;
		for (int i = 0; i < getList().size(); i++) {
			sumFat += getList().get(i).getFat();
		}

		return sumFat;
	}
	
	public double sumBevarage() {
		
		double totalML = 0;
		for (int i = 0; i < getList().size(); i++) {
			if(getList().get(i).getClass().getSimpleName().equalsIgnoreCase("bevarage"))
				totalML += getList().get(i).getPortion();
		}
		
		return totalML;
	}
	
	public String toString() {
		String result = "";
		for (int i = 0; i < getList().size(); i++) {
			result += getList().get(i).toString() + "\n";
		}
		return result;
	}
	
}
