package week_5;

public class Alien implements Character {
    int health = 200;
    int energy = 100;
    boolean isDead = false;
    int damage;

    @Override
    public int getHealth() {
        /**
         * return the Alien health
         */
        return this.health;
    }

    @Override
    public void setHealth(int damage) {
        /**
         * decrement the Alien health
         */
        this.health -= damage;
    }

    @Override
    public boolean isDead() {
        /**
         * return 1 if the Alien is dead
         */
        if(this.health == 0)
            this.isDead = true;
        return this.isDead;
    }

    public int getDamage() {
        /**
         * return the Alien damage
         */
        return this.damage;
    }

    public void biteHuman() {
        /**
         * set the damage
         */
        this.energy -= 10;
        if (this.energy >= 80)
            this.damage = 25;
        else if (this.energy >= 50 && this.energy < 80)
            this.damage = 15;
        else
            this.damage = 10;
    }

    public int getEnergy() {
        /**
         * return the Alien energy
         */
        return this.energy;
    }
}
