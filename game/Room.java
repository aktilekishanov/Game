package game;

import actors.Actor;
import inventory.Inventory;

import java.util.ArrayList;

public class Room {

    private Inventory inventory;

    private ArrayList<Actor> actors;

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void actorAddition(Actor actor){
        this.actors.add(actor);
    }

    public Room(Inventory inventory){
        this.inventory = inventory;
        actors = new ArrayList<>();
    }

    public String toString() {
        String output = new String();
        output = "Room: -------------------------------\n";
        output = output + inventory.toString();
        output = output + "Actors:\n";
        for(int i = 0; i < actors.size(); i++){
            output = output + (i+1) + ". " + actors.get(i) + "\n";
        }
        return output;
    }
}
