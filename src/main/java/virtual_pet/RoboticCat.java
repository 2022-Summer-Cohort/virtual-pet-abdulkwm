package virtual_pet;

public class RoboticCat extends RoboticPet {
    private int chargeLevel;
    public RoboticCat(String petName, String petDescription, int happiness, int health, int maintenance, int oilLevel, int chargeLevel) {
        super(petName, petDescription, happiness, health, maintenance, oilLevel);
        this.chargeLevel = chargeLevel;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void getCharge() {
        chargeLevel += 5;
    }
    @Override
    public void tick() {
        chargeLevel-=5;
        if (chargeLevel>=100){
        System.out.println("charger is full plug out");
    }
    }
}
