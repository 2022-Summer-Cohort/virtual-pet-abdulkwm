package virtual_pet;

public abstract class VirtualPet {
    protected String petName;
    protected String petDescription;
    protected int happiness;
    protected int health;

    public VirtualPet(String petName, String petDescription, int happiness, int health) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.happiness = happiness;
        this.health = health;
    }

    public String getPetName() {
        return petName;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return petName + "\t" + petDescription + "\t\t" + happiness + "\t\t" + health;
    }

    public abstract void tick();
    }

