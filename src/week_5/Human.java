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
        if(this.health == 0)
            this.isDead = true;
        return this.isDead;
    }

    public int shootAlien() {
        this.ammo -= 15;
        return 25;
    }

    public int getAmmo() {
        return this.ammo;
    }
}
