package zombies;

public interface Zombie {
    public boolean isAlive();
    public String getType(); 
    public void takeDamage(Integer damage);
}