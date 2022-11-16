package Task1.Interface;

import Task1.ObjectClasses.Inventory;
import Task1.ObjectClasses.Items;

public class InventoryAndItemsInterfaceImpl implements InventoryAndItemsInterface {
    private Inventory userBackpack;
    private Items userItems;

    public InventoryAndItemsInterfaceImpl(Inventory userBackpack, Items userItems) {
        this.userBackpack = userBackpack;
        this.userItems = userItems;
    }

    @Override
    public void showInventory() {
        for (Items item:userBackpack.getBackpack())
        {
            item.toString();
        }

        }



    }

