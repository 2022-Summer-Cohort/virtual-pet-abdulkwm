package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    @Test
    public void petIsRemoveFromVirtualPetShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        int numOfAnimals = underTest.petPopulation();
        underTest.removePet("lucy");
        assertEquals(numOfAnimals -1, underTest.petPopulation());
    }

    @Test
    public void specificPetShouldBeFeeded() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        int numOfAnimals = underTest.petPopulation();
        underTest.feedSpecificPet("santa");
        assertEquals(numOfAnimals +1,underTest.petPopulation() +1);
    }

    @Test
    public void allPetsshouldBeFeeded() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        int numOfPets = underTest.petPopulation();
        int[] pets = new int[numOfPets];
        for (int i = 0; i < numOfPets; i++) {
            pets[i] = underTest.getShelter().get(i).getHungerLevel();
        }
        underTest.feedAllPets();
        for (int i = 0; i < numOfPets; i++) {
            assertEquals(Math.max(pets[i] - 2, 0), underTest.getShelter().get(i).getHungerLevel());
        }

    }

    @Test
    void allPetShouldBeWatered() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        int numOfPets = underTest.petPopulation();
        int[] pets = new int[numOfPets];
        for (int i = 0; i < numOfPets; i++) {
            pets[i] = underTest.getShelter().get(i).getThirstLevel();
        }
        underTest.waterAllPet();
        for (int i = 0; i < numOfPets; i++) {
            assertEquals(Math.max(pets[i] - 3, 0), underTest.getShelter().get(i).getThirstLevel());
        }
    }

}
