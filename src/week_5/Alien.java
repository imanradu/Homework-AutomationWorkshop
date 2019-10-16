package week_5;

public class Alien implements Character {
    int health = 200;
    int energy = 100;
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

    public int biteHuman() {
        this.energy -= 10;
        if (this.energy >= 80)
            return 25;
        else if (this.energy >= 50 && this.energy < 80)
            return 15;
        else
            return 10;
    }

    public int getEnergy() {
        return this.energy;
    }
}
