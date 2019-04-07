package model;

import java.io.*;
import java.util.*;

public class Save implements Serializable{

	private HashMap<Date, MealList> saveLog;
	
	public Save() {
		saveLog = new HashMap(31);
	}
	
	public HashMap<Date, MealList> getLog(){
		return this.saveLog;
	}
	
	public void addOneDayLog(Date day, MealList log) {
		getLog().put(day, log);
	}
	
	public Meal getDayLog(Date day, int mealOrder) {
		return getLog().get(day).getTheList().get(mealOrder);
	}
	
	public double getDayCalories(Date day, int mealOrder) {
		return getDayLog(day, mealOrder).sumCalories();
	}
	
	public double getDayProtein(Date day, int mealOrder) {
		return getDayLog(day, mealOrder).sumProtein();
	}
	
	public double getDayCarbo(Date day, int mealOrder) {
		return getDayLog(day, mealOrder).sumCarbo();
	}
	
	public double getDayFats(Date day, int mealOrder) {
		return getDayLog(day, mealOrder).sumFats();
	}
	
	public double getDayBevarage(Date day, int mealOrder) {
		return getDayLog(day, mealOrder).sumBevarage();
	}
	
	public double getTodayCalories(Date day, int mealOrder) {
		
		return getDayLog(day, mealOrder).sumCalories();
	}
	
	public double getTodayProtein(Date day, int mealOrder) {
		return getDayLog(day, mealOrder).sumProtein();
	}
	
	public double getTodayCarbo(Date day, int mealOrder) {
		return getDayLog(day, mealOrder).sumCarbo();
	}
	
	public double getTodayFats(Date day, int mealOrder) {
		return getDayLog(day, mealOrder).sumFats();
	}
	
	public double getTodayBevarage(Date day, int mealOrder) {
		return getDayLog(day, mealOrder).sumBevarage();
	}
	
}
