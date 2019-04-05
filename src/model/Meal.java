package model;

import java.io.IOException;
import java.io.Serializable;
import java.util.*;

public class Meal implements Serializable {

    private static final MealList mealList = new MealList();

    private ArrayList<Edible> list;

    public Meal()
    {
		list = new ArrayList<>();
	}

	public ArrayList<Edible> getList()
    {
		return this.list;
	}

	public void add(Edible edible) throws IOException
    {
        list.add(edible);
        mealList.add(this);
    }




	/*public double sumCalories() {

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
	}*/
	
}
