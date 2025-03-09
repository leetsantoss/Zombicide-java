package general.objects;

import general.Player;

public interface Item {
    public void useItem(Player player);
    public String getName();
}
