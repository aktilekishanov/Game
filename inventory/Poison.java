package inventory;

public class Poison extends Consumable{
    private int powerDestroy;

    public Poison(int powerDestroy) {
        this.powerDestroy = powerDestroy;
    }

    @Override
    public String toString() {
        return "Item: Poison | Destroy Power: " + powerDestroy + ")";
    }
}
