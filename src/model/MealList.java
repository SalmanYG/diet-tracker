package model;

import java.io.*;
import java.util.ArrayList;

public class MealList implements Serializable{

	private ArrayList<Meal> theList;
	
	public MealList() {
		theList = new ArrayList(3);
	}
	
	public ArrayList<Meal> getTheList(){
		return theList;
	}
	
	public void Add(Meal meal) {
		getTheList().add(meal);
	}
	
	
}
