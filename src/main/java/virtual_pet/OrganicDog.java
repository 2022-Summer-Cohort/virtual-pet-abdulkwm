package virtual_pet;

public class OrganicDog extends OrganicPet implements Walking {
    private int soilDogCage;
    private int cageCleanLines;

    public OrganicDog(String petName, String petDescription, int happiness, int health, int hunger, int thirst, int bored, int soilDogCage, int cageCleanLines) {
        super(petName, petDescription, happiness, health, hunger, thirst, bored);
        this.soilDogCage = soilDogCage;
        this.cageCleanLines = cageCleanLines;
    }

    public int getSoilDogCage() {
        return soilDogCage;
    }

    public int getCageCleanLines() {
        return cageCleanLines;
    }

    public void cleanDogCage() {
        happiness += 5;
        cageCleanLines-=10;
    }
    @Override
    public void tick() {
       soilDogCage += 5;
       cageCleanLines +=5;
       health += 5;
       happiness += 5;
    }
    @Override
    public void walkAllPet() {
        happiness += 5;
        health += 5;
        soilDogCage -= 5;

    }

}
