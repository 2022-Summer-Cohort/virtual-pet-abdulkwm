package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void feedThePet() {
        VirtualPet underTest = new VirtualPet("lucy", 5, 4, 3);
        underTest.feed();
        assertEquals(1, underTest.getHungerLevel());
    }

    @Test
    public void waterThePet() {
        VirtualPet underTest = new VirtualPet("lucy", 5, 4, 3);
        underTest.thirst();
        assertEquals(0, underTest.getThirstLevel());
    }

    @Test
    public void sleepThePet() {
        VirtualPet underTest = new VirtualPet("lucy", 5, 4, 8);
        underTest.sleep();
        assertEquals(4, underTest.getBoredomLevel());
    }
}



