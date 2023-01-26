import inventory.Inventory;
import actors.Player;

public class Main {
    public static void main(String[] args) {
        Inventory invent = new Inventory();
        invent.createInventory();

        Player player = new Player(invent);
        Game myGame = new Game(1,3,player,2);

        myGame.printMap();
    }
}
