package Task1.ObjectClasses;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Items> backpack;
    private double beginWeight = 0;
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

    public void setBeginWeight(double beginWeight) {
        this.beginWeight += beginWeight;
    }

    public double getBeginWeight() {
        return beginWeight;
    }

}





