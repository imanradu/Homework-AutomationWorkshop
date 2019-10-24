package week_5;

public class Alien implements Character {
    int health = 200;
    int energy = 100;
    boolean isDead = false;
    int damage;

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

    public int getDamage() {
        return this.damage;
    }

    public void biteHuman() {
        this.energy -= 10;
        if (this.energy >= 80)
            this.damage = 25;
        else if (this.energy >= 50 && this.energy < 80)
            this.damage = 15;
        else
            this.damage = 10;
    }

    public int getEnergy() {
        return this.energy;
    }
}
