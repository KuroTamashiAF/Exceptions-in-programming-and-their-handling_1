package Task1.Interface;

import Task1.ObjectClasses.Inventory;
import Task1.ObjectClasses.Items;

public class InventoryAndItemsInterfaceImpl implements InventoryAndItemsInterface {
    private Inventory userBackpack;

    public InventoryAndItemsInterfaceImpl(Inventory userBackpack /*Items userItems*/) {
        this.userBackpack = userBackpack;
    }

    public Inventory getUserBackpack() {
        return userBackpack;
    }

    @Override
    public void showInventory() {
        if (userBackpack.getBackpack().isEmpty())
            throw  new RuntimeException("Инвентарь пуст");
        else{
            for (Items item:userBackpack.getBackpack())
            {
                System.out.println(item.toString());
            }
        }







    }
    @Override
    public void putItInTheInventory(Items item) {
        userBackpack.getBackpack().add(item);
        userBackpack.setBeginWeight(item.getWeight());
       if (userBackpack.getBeginWeight() >userBackpack.getMaxCapacity())
           throw new RuntimeException("Инвентарь полон");

    }

    @Override
    public void throwAwayItem(String name) {
        int index = 0;

            for(Items item:userBackpack.getBackpack())
            {
                if(item.getName() == name)
                {
                    userBackpack.setBeginWeight(-item.getWeight());
                    break;
                }
                index+=1;
                if (index >= userBackpack.getBackpack().size())
                {
                    throw new RuntimeException("Такого элемента нет в инвентаре");
                }

            }
            userBackpack.getBackpack().remove(index);


        }

    @Override
    public void viewInventoryOccupancy() {

        System.out.printf("Инвентарь заполнен на %.2f из %.2f \n", userBackpack.getBeginWeight(),userBackpack.getMaxCapacity());

    }
}




