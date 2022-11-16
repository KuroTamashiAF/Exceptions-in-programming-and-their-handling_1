package Task1.Interface;

import Task1.ObjectClasses.Items;

public interface InventoryAndItemsInterface {
    void showInventory();
    void putItInTheInventory(Items item);
    void throwAwayItem(String name);
    void viewInventoryOccupancy();



}
