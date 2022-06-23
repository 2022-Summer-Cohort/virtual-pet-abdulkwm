package virtual_pet;

public class OrganicCat extends OrganicPet {
    public int litterBox;

    public OrganicCat(String petName, String petDescription, int happiness, int health, int hunger, int thirst, int bored, int litterBox) {
        super(petName, petDescription, happiness, health, hunger, thirst, bored);
        this.litterBox = litterBox;
    }

    public int getLitterBox() {

        return litterBox;
    }

    public void cleanLitterBox() {
        happiness += 6;
        health += 5;
        litterBox-=10;
    }
    @Override
    public void tick() {
        litterBox += 5;
    }
}
