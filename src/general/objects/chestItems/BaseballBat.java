package general.objects.chestItems;

import general.Player;

class BaseballBat extends Weapon {
    public BaseballBat() {
        super(2);
    }

    @Override
    public void useItem(Player player){
        System.out.println("You equiped a Baseball Bat");
    }

    @Override
    public String getName() {
        return "Baseball Bat";
    }
}