package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicDogTest {
    OrganicDog dog = new OrganicDog("teddy", "Organic dog", 5, 10, 23, 20, 10, 10, 15);
@Test
    public void shouldCleanDogcages(){
    dog.cleanDogCage();
    assertEquals(dog.getCageCleanLines(),5);
}
@Test
    public void walkingDogsShouldDecreaseSoilDogCage(){
    dog.walkAllPet();
    assertEquals(dog.getSoilDogCage(),5);
}
}
