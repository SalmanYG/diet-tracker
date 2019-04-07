package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
		// TODO Auto-generated method stub

		Meal b1 = new Meal();
		Meal b2 = new Meal();
		Meal b3 = new Meal();
		
		Meal l1 = new Meal();
		Meal l2 = new Meal();
		Meal l3 = new Meal();
		
		Meal d1 = new Meal();
		Meal d2 = new Meal();
		Meal d3 = new Meal();
		
		b1.getList().add(new Food("Egg", 345, 51, 2, 6, 45));
		b1.getList().add(new Food("Bacon", 234, 13, 4, 73, 48));
		b1.getList().add(new Bevarage("Milk", 783, 45, 43, 3, 23));
		
		b2.getList().add(new Food("Egg", 323, 55, 7, 17, 67));
		b2.getList().add(new Food("Bacon", 437, 99, 3, 79, 46));
		b2.getList().add(new Bevarage("Milk", 932, 73, 81, 9, 67));
		
		b3.getList().add(new Food("Egg", 345, 76, 3, 9, 85));
		b3.getList().add(new Food("Bacon", 984, 68, 8, 89, 45));
		b3.getList().add(new Bevarage("Milk", 894, 34, 96, 8, 34));
		
		
		
		l1.getList().add(new Food("Chicken", 879, 78, 9, 7, 34));
		l1.getList().add(new Food("Rice", 345, 78, 8, 22, 99));
		l1.getList().add(new Bevarage("Cola", 793, 77, 88, 5, 11));
		
		l2.getList().add(new Food("Chicken", 344, 23, 6, 7, 34));
		l2.getList().add(new Food("Rice", 657, 78, 8, 22, 54));
		l2.getList().add(new Bevarage("Cola", 773, 44, 88, 5, 34));
		
		l3.getList().add(new Food("Chicken", 466, 78, 9, 7, 44));
		l3.getList().add(new Food("Rice", 345, 76, 5, 66, 99));
		l3.getList().add(new Bevarage("Cola", 773, 77, 33, 5, 88));
		
		
		d1.getList().add(new Food("Shawerma", 235, 79, 9, 7, 34));
		d1.getList().add(new Food("Fries", 875, 78, 8, 34, 99));
		d1.getList().add(new Bevarage("Water", 793, 33, 88, 7, 11));
		
		d2.getList().add(new Food("Shawerma", 567, 69, 9, 7, 34));
		d2.getList().add(new Food("Fries", 775, 78, 3, 34, 66));
		d2.getList().add(new Bevarage("Water", 456, 33, 88, 8, 45));
		
		d3.getList().add(new Food("Shawerma", 568, 83, 11, 3, 99));
		d3.getList().add(new Food("Fries", 875, 77, 8, 6, 44));
		d3.getList().add(new Bevarage("Water", 711, 33, 88, 8, 11));
		
		MealList first = new MealList();
		first.Add(b1);
		first.Add(l1);
		first.Add(d1);
		
		MealList second = new MealList();
		second.Add(b2);
		second.Add(l2);
		second.Add(d2);
		
		MealList third = new MealList();
		third.Add(b3);
		third.Add(l3);
		third.Add(d3);
		
		Save save = new Save();
		Date today = new Date();
		save.addOneDayLog(today, first);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("savelog.bin"));
		oos.writeObject(save);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("savelog.bin"));
		Save save2 = (Save) ois.readObject();
		System.out.println(save2.getDayBevarage(today, 0));
		ois.close();
	}

}
