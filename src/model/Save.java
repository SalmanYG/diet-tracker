package model;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Save implements Serializable {

    private static Integer date = 1;
    private static ObjectOutputStream out;

    private HashMap<Integer, Meals> saveLog;



    public Save()
    {
        saveLog = new HashMap<>(31);
        try
        {
            out = new ObjectOutputStream(new FileOutputStream("SavedMealList.bin"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("Save created");
    }

    public void add(Meals meals) throws IOException
    {
        saveLog.put(date, meals);
        System.out.println("meal added to hashmap with day: " + date);
        save(saveLog);
        System.out.println("after call to save from add");
    }


    public void save(HashMap<Integer, Meals> saveLog) throws IOException
    {
        out.writeObject(saveLog);
        System.out.println("saveLog saved");
    }
}
