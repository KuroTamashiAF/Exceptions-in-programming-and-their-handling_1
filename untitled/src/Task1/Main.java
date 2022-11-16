package Task1;

import Task1.Interface.InventoryAndItemsInterface;
import Task1.Interface.InventoryAndItemsInterfaceImpl;
import Task1.ObjectClasses.Inventory;
import Task1.ObjectClasses.Items;

public class Main {
    public static void main(String[] args) {
        Inventory HeroInventory = new Inventory();
        Items item1 = new Items("лопата", 3.5);
        Items item2 = new Items("TT26", 1.5);
        Items item3 = new Items("RGD5", 0.5);
        //Items item4 = new Items("Panzer", 1000);
        InventoryAndItemsInterface user  = new InventoryAndItemsInterfaceImpl(HeroInventory);
        user.putItInTheInventory(item1);
        user.putItInTheInventory(item2);
        user.putItInTheInventory(item3);
        //user.putItInTheInventory(item4);
        user.showInventory();
        System.out.println("--------------------------");
        user.viewInventoryOccupancy();
        user.throwAwayItem("лопата");
        user.viewInventoryOccupancy();

    }
}
