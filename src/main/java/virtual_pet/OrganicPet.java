package virtual_pet;

public abstract class OrganicPet extends VirtualPet {
    private int hunger;
    private int thirst;
    private int bored;

    public OrganicPet(String petName, String petDescription, int happiness, int health, int hunger, int thirst, int bored) {
        super(petName, petDescription, happiness, health);
        this.hunger = hunger;
        this.thirst = thirst;
        this.bored = bored;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBored() {
        return bored;
    }

    public void feed() {
        hunger -= 5;
        happiness += 1;
        health += 2;
    }

    public void water() {
        thirst -= 5;
        happiness += 1;
        health += 2;
    }
    @Override
    public void tick() {
        hunger += 5;
        thirst+= 5;
        bored += 5;
    }

    @Override
    public String toString() {
        return petName + "\t" + petDescription + "\t\t" + happiness + "\t\t" + health
                + "\t\t" + hunger + "\t\t" + thirst + "\t\t" + bored +"\t\t";
    }
}
