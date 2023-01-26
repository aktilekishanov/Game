package inventory;

public class Weapon extends Equipment{
    private int powerAttack;

    public Weapon(int powerAttack) {
        this.powerAttack = powerAttack;
    }

    @Override
    public String toString() {
        return "Item: Weapon | Attack Power:  " + powerAttack + ")";
    }
}
