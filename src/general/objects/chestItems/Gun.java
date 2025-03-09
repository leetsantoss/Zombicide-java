package general.objects.chestItems;

import general.Player;

class Gun extends Weapon {
    private int ammunition;

    public Gun(){
        super(2);
        this.ammunition = 1;
    }

    public void reload() {
        this.ammunition++;
    } 

    @Override
    public void useItem(Player Player) {
        if (this.ammunition > 0) {
            ammunition --;
            System.out.println("The player shot");
        } else {
            System.out.println("Out of ammunition");
        }
    }

    @Override
    public String getName() {
        return "Gun";
    }

}