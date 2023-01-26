package inventory;

import java.util.Random;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> itemCollection;

    public Inventory() {
        itemCollection = new ArrayList<>();
    }

    public void setItemCollection(ArrayList<Item> itemCollection) {
        this.itemCollection = itemCollection;
    }

    public void createInventory(){
        Random randomNumber = new Random();

        // armors
        int amountArmors = randomNumber.nextInt(3);

        for(int n = 0; n <= amountArmors; n++){
            int powerDefense = randomNumber.nextInt(1000);
            itemCollection.add(new Armor(powerDefense));
        }

        // health potion
        int amountHealthPotions = randomNumber.nextInt(4);

        for(int n = 0; n <= amountHealthPotions; n++){
            int powerHealing = randomNumber.nextInt(1000);
            itemCollection.add(new HealthPotion(powerHealing));
        }

        // poison
        int amountPoisons = randomNumber.nextInt(4);

        for(int n = 0; n <= amountPoisons; n++){
            int powerDestroy = randomNumber.nextInt(1000);
            itemCollection.add(new Poison(powerDestroy));
        }

        // weapons
        int amountWeapons = randomNumber.nextInt(3);

        for(int n = 0; n <= amountWeapons; n++){
            int powerAttack = randomNumber.nextInt(1000);
            itemCollection.add(new Weapon(powerAttack));
        }
    }

    @Override
    public String toString() {
        String result = new String();
        result = "Inventory: \n";

        for (int n = 0; n < itemCollection.size(); n++){
            result = result + (n + 1) + ". " + itemCollection.get(n) + "\n";
        }
        return result;
    }
}
