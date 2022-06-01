package virtual_pet;

public class VirtualPet {
        private String petName;
        private int hungerLevel;
        private int thirstLevel;
        private int boredomLevel;



    public VirtualPet(String petName, int hungerLevel, int thirstLevel, int boredomLevel) {
        this.petName = petName;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
    }
    public void feed(){hungerLevel = Math.max(0,hungerLevel-4);
    }
    public void thirst(){thirstLevel= Math.max(0,thirstLevel-4);
    }
    public void sleep (){boredomLevel= Math.max(0,boredomLevel-4);
    }
    public void tick() {
        hungerLevel+=2;
        thirstLevel+=2;
        boredomLevel+=2;
    }


    public void petStatus(){
        System.out.println("my name is: " + petName + "\n" + "my hunger level is: " + hungerLevel + "\n" + "my thirst level is: " + thirstLevel
                + "\n" + "my boredomLevel is: " + boredomLevel);
    }
    public boolean petIsAlive(){
        if (hungerLevel>10) {
            return false;
        }
            else if (thirstLevel>10){
                return false;
            }
            else {return true;}
        }
    public String getPetName() {
        return petName;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }
}


