package model;

import java.io.*;
import java.util.HashMap;

public class MealList implements Serializable {

    private static Integer day = 1;
    private static ObjectOutputStream out;

    private HashMap<Integer, Meal> list;

    public MealList()
    {
        list = new HashMap<>();
        try
        {
            out = new ObjectOutputStream(new FileOutputStream("SavedMealList.bin"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("MealList created");
    }

    public void add(Meal meal) throws IOException
    {
        list.put(day, meal);
        day++;
        System.out.println("meal added to hashmap with day: " + day);
        save(this);
        System.out.println("after call to save from add");
    }


    public void save(MealList mealList) throws IOException
    {
        out.writeObject(mealList);
        System.out.println("mealList saved");
    }
}
