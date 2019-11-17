package week_5;

public class Human implements Character {
    int health = 100;
    int ammo = 200;
    boolean isDead = false;
    int damage;

    @Override
    public int getHealth() {
        /**
         * return the human health
         */
        return this.health;
    }

    @Override
    public void setHealth(int damage) {
        /**
         * decrement the human health
         */
        this.health -= damage;
    }

    @Override
    public boolean isDead() {
        /**
         * return 1 if the human is dead
         */
        if(this.health == 0)
            this.isDead = true;
        return this.isDead;
    }

    public int getDamage() {
        return this.damage;
    }

    public void shootAlien() {
        /**
         * decrement the ammo and set the damage
         */
        this.ammo -= 15;
        this.damage = 25;
    }

    public int getAmmo() {
        /**
         * return the ammo
         */
        return this.ammo;
    }
}
