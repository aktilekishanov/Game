import game.GameMap;
import actors.Player;

public class Game {
    private Player myPlayer;
    private GameMap myGameMap;

    public Game(int w, int h, Player player, int maxAmountEnemy){
        myGameMap = new GameMap(w,h,maxAmountEnemy);
        this.myPlayer = player;
        myGameMap.randRoom();
        myGameMap.setPlayer(player);
    }

    public void printMap(){
        myGameMap.printMap();
    }
}
