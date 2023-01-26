package actors;

import inventory.Inventory;

public class Player extends Actor{
    public Player(Inventory inventory){
        this.invent = inventory;
    }

    @Override
    public String toString() {
        return "Actor type: Player\n" + invent.toString();
    }
}
