package model;

import java.io.*;
import java.util.HashMap;

public class MealList implements Serializable {

    private static Integer day = 1;

      HashMap<Integer, Meal> list;

    public MealList()
    {
        list = new HashMap<>();
        System.out.println("MealList created");
    }

    public void add(Meal meal) throws IOException
    {
        list.put(day, meal);
        day++;
        System.out.println("meal added to hashmap with day: " + day);
        SavingHandler.save(this);
        System.out.println("after call to save from add");
    }

    private static class SavingHandler {
        private static ObjectOutputStream out;

        static
        {
            try
            {
                out = new ObjectOutputStream(new FileOutputStream("SavedMealList.bin"));
                System.out.println("handler created");
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }


        public static void save(MealList mealList) throws IOException
        {
            out.writeObject(mealList);
            System.out.println("mealList saved");
        }
    }
}
