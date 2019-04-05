import model.Bevarage;
import model.Food;
import model.Meal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Test {


    public static void main(String[] args) throws IOException
    {
        /*HashMap<Integer, ArrayList<Meal>> smthn = new HashMap(31);

        Meal bf = new Meal();
        Meal ln = new Meal();
        Meal dn = new Meal();

        bf.getList().add(new Food("Burger", 23, 234, 54, 656, 34));
        ln.getList().add(new Food("Chicken Soup", 29.5, 244, 675, 83, 12));
        dn.getList().add(new Bevarage("Milk", 63, 352, 53, 90, 323));

        ArrayList<Meal> daily = new ArrayList(3);
        daily.add(bf);
        daily.add(ln);
        daily.add(dn);

        smthn.put(1, daily);
        System.out.println(smthn.get(1).get(1).sumCalories());*/





        Meal breakfast = new Meal();
        breakfast.add(new Food("Burger", 23, 234, 54, 656, 34));
        breakfast.add(new Bevarage("Milk", 63, 352, 53, 90, 323));

        Meal lunch = new Meal();
        lunch.add(new Food("Burger", 23, 234, 54, 656, 34));

        Meal dinner = new Meal();
        dinner.add(new Bevarage("Milk", 63, 352, 53, 90, 323));





    }


}
