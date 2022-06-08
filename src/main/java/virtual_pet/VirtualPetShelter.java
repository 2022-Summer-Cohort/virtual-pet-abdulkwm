package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelter {
    private int shelterPopulation;
    private ArrayList<VirtualPet> shelter;

    public VirtualPetShelter() {
        shelter = new ArrayList<>();
        shelter.add(new VirtualPet("santa", 1, 1, 2));
        shelter.add(new VirtualPet("lucy", 2, 2, 2));
        shelter.add(new VirtualPet("molly", 1, 2, 2));
        shelter.add(new VirtualPet("jack", 1, 1, 2));
        this.shelterPopulation = shelter.size();
    }

    public void addPet(VirtualPet pet) {
        shelter.add(pet);
    }

    public void removePet(String petName) {
        shelter.remove(findPetByName(petName));

    }

    public VirtualPet findPetByName(String petName) {
        for (VirtualPet temporaryPet : shelter) {
            if (temporaryPet.getPetName().equalsIgnoreCase(petName)) {
                return temporaryPet;
            }
        }
        return null;
    }

    public void showThePetStatus() {
        for (VirtualPet virtualPet : shelter) {
            virtualPet.petStatus();
        }
    }

    public void feedAllPets() {
        for (VirtualPet virtualPet : shelter) {
            virtualPet.feedPet();
        }
    }

    public void waterAllPet() {
        for (VirtualPet virtualPet : shelter) {
            virtualPet.waterPet();
        }
    }

    public void playAllPet() {
        for (VirtualPet virtualPet : shelter) {
            virtualPet.playPet();
        }
    }

    public void feedSpecificPet(String petName) {
        findPetByName(petName).feedPet();
    }

    public void waterSpecificPet(String petName) {
        findPetByName(petName).waterPet();
    }

    public void admitToVertualPetShelter(String petName) {
        shelter.add(new VirtualPet(petName, 5, 4, 7));
    }

    public void tick() {
        for (VirtualPet value : shelter) {
            value.tick();
        }
    }

    public boolean petsAlive() {
        for (VirtualPet pet : shelter) {
            if (!pet.petIsAlive()) {
                return false;
            }
        }
        return true;
    }

    public int petPopulation() {
        return shelter.size();
    }

    public ArrayList<VirtualPet> getShelter() {
        return shelter;
    }
}
