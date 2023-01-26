package actors;

import inventory.Inventory;

public class Enemy extends Actor{

    public Enemy(Inventory invent){
        this.invent = invent;
    }

    @Override
    public String toString() {
        return "Actor: Enemy\n" + invent.toString();
    }
}
