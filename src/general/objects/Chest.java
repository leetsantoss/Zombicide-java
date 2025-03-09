package general.objects;

public class Chest {
    private Item item;

    public Chest(Item item) {
        this.item = item;
    }

    public Item open(){
        System.out.println("You found a" + item.getName());
        return this.item;   
    }
}