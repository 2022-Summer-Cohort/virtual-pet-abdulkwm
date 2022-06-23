package virtual_pet;

public abstract class RoboticPet extends VirtualPet implements Walking{
    private int maintenance;
    private int oilLevel;

    public RoboticPet(String petName, String petDescription, int happiness, int health, int maintenance, int oilLevel) {
        super(petName, petDescription, happiness, health);
        this.maintenance = maintenance;
        this.oilLevel = oilLevel;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public void oilRoboticPets() {
        happiness += 4;
        health += 2;
        maintenance -=5;
        oilLevel += 5;

    }
    public void PreformMaintenance() {
        happiness += 5;
        health += 5;
        maintenance -= 5;
        oilLevel -= 6;
    }
    @Override
    public void tick() {
       oilLevel-=5;
       maintenance +=5;
       health+=5;
       happiness+=5;
    }
    @Override
    public void walkAllPet() {
        happiness += 5;
        oilLevel -=5;
        maintenance -=5;
    }

    @Override
    public String toString() {
        return petName + "\t" + petDescription + "\t\t" + happiness + "\t\t" + health+ "\t\t\t\t\t\t\t\t"+ oilLevel + "\t\t\t\t" + maintenance + "\t\t\t\t";
    }
}
