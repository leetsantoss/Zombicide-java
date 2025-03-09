package general.objects.chestItems;

import general.Player;
import general.objects.Item;

class HealingPotion implements Item {
    private int power;

    public HealingPotion(int power) {
        this.power = power;
    }

    @Override
    public void useItem(Player player) {
        player.heal(power);
        System.out.println("The player used a healing potion and recovered " + power + " health points");
    }

    @Override
    public String getName() {
        return "Healing Potion";
    }
}