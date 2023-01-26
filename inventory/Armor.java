package inventory;

public class Armor extends Equipment{
    private int powerDefense;

    public Armor(int powerDefense) {
        this.powerDefense = powerDefense;
    }

    @Override
    public String toString() {
        return "Item: Armor  | Defense Power: " + powerDefense + ")";
    }
}
