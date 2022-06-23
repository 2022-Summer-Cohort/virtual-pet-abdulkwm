package virtual_pet;
import java.util.HashMap;
import java.util.Map;

public class PetShelter {
    Map<String, VirtualPet> shelter = new HashMap<>();

    public void addPet(VirtualPet petToAdd) {
        shelter.put(petToAdd.getPetName(), petToAdd);
    }

    public void removePet(String pet) {
        shelter.remove(pet);
    }


    public void showAllPets() {
        for (VirtualPet pet : shelter.values()) {
            System.out.println(pet);
        }
    }
    public void feed() {
        for (VirtualPet pet : shelter.values()) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).feed();
            }
        }
    }
    public void water() {
        for (VirtualPet pet : shelter.values()) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).water();
            }
        }
    }

    public void oilRoboticPets() {
        for (VirtualPet pet : shelter.values()) {
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).oilRoboticPets();
            }
        }
    }
    public void preformMaintenance() {
        for (VirtualPet pet : shelter.values()) {
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).PreformMaintenance();
            }
        }
    }
    public void chargeRoboticCat() {
        for (VirtualPet pet : shelter.values()) {
            if (pet instanceof RoboticCat) {
                ((RoboticCat) pet).getCharge();
            }
        }
    }
    public void cleanOrganicDogCages() {
        for (VirtualPet pet : shelter.values()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).cleanDogCage();
            }
        }
    }

    public void cleanOrganicCatLitterBox() {
        for (VirtualPet pet : shelter.values()) {
            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).cleanLitterBox();
            }
        }
    }

    public void walkAllDogs() {
        for (VirtualPet pet : shelter.values()) {
            if (pet instanceof Walking) {
                ((Walking) pet).walkAllPet();
            }
        }
    }
        public void tick() {
            for (VirtualPet pet : shelter.values()) {
                pet.tick();
            }
    }
}

