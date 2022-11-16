package Task1.ObjectClasses;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Items> backpack;
    private double maxCapacity= 30.0;
    public Inventory()
    {
        backpack = new ArrayList<Items>();
    }

    public ArrayList<Items> getBackpack() {
        return backpack;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }
}





