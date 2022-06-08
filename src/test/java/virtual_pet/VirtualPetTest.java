package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void feedThePet() {
        VirtualPet underTest = new VirtualPet("lucy", 5, 4, 3);
        underTest.feedPet();
        assertEquals(1, underTest.getHungerLevel());
    }

    @Test
    public void waterThePet() {
        VirtualPet underTest = new VirtualPet("lucy", 5, 5, 3);
        underTest.waterPet();
        assertEquals(1, underTest.getThirstLevel());
    }

    @Test
    public void sleepThePet() {
        VirtualPet underTest = new VirtualPet("lucy", 5, 4, 8);
        underTest.playPet();
        assertEquals(4, underTest.getBoredomLevel());
    }
}



