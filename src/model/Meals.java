package model;

import java.util.ArrayList;

public class Meals {
    private ArrayList<Meal> meals;

    public Meals()
    {
        meals = new ArrayList<>(3);
    }

    public void addMeal(Meal meal)
    {
        meals.add(meal);
    }

    public ArrayList<Meal> getMeals()
    {
        return meals;
    }
}
