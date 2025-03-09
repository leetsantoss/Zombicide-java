package general.objects.chestItems;

import general.objects.Item;

abstract class Weapon implements Item {
    private int damage;

    public Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }
}
