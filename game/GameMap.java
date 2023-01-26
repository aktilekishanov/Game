package game;

import inventory.Inventory;
import actors.Player;
import actors.Enemy;

import java.util.ArrayList;
import java.util.Random;

public class GameMap {

    private ArrayList<Room>[] rooms;

    private int maxAmountEnemy;

    public GameMap(int w, int h, int maxAmountEnemy){
        this.maxAmountEnemy = maxAmountEnemy;

        rooms = new ArrayList[w];

        for (int n = 0; n < w; n++){
            rooms[n] = new ArrayList<>(h);

            for (int k = 0; k < h; k++){
                Inventory invent = new Inventory();
                Room roomCurr = new Room(invent);
                rooms[n].add(roomCurr);
            }
        }
    }

    public void randRoom(){
        for (int n = 0; n < rooms.length; n++){
            for (int k = 0; k < rooms[n].size(); k++){
                Inventory invent = new Inventory();
                invent.createInventory();
                rooms[n].get(k).setInventory(invent);
                Random randomNumber = new Random();
                int amountEnemy = randomNumber.nextInt(maxAmountEnemy);

                for (int j = 0; j < amountEnemy; j++){
                    Inventory inventOfEnemy = new Inventory();
                    inventOfEnemy.createInventory();
                    Enemy enemy = new Enemy(inventOfEnemy);
                    rooms[n].get(k).actorAddition(enemy);
                }
            }
        }
    }

    public void setPlayer(Player player){
        Random randomNumber = new Random();

        int w = randomNumber.nextInt(rooms.length);
        int h = randomNumber.nextInt(rooms[w].size());

        rooms[w].get(h).actorAddition(player);
    }

    public void printMap(){
        for (int n = 0; n < rooms.length; ++n){
            for (int k = 0; k < rooms[n].size(); ++k){
                System.out.print(rooms[n].get(k).toString());
            }
            System.out.println();
        }
    }
}
