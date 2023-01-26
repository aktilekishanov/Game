package inventory;

public class HealthPotion extends Consumable{
    private int powerHealing;

    public HealthPotion(int powerHealing) {
        this.powerHealing = powerHealing;
    }

    @Override
    public String toString() {
        return "Item: Potion | Healing Power: " + powerHealing + ")";
    }
}
