package week_5;

public class Human implements Character {
    int health = 100;
    int ammo = 200;
    boolean isDead = false;

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public void setHealth(int damage) {
        this.health -= damage;
    }

    @Override
    public boolean isDead() {
        return this.isDead;
    }

    public void shootAlien() {
        ammo -= 15;
    }
}
