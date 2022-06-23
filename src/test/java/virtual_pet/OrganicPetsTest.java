package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicPetsTest {
    OrganicPet underTest;
    OrganicCat orgCat;
    OrganicDog orgDog;
    @BeforeEach
    public void setUp() {
        orgCat = new OrganicCat("lucy", "Organic Cat", 5, 6, 23, 33, 11, 11);
        orgDog = new OrganicDog("teddy", "Organic dog", 5, 10, 23, 20, 10, 10, 15);
    }
    @Test
    public void feedAllOrganicPetsShouldDecreseHungerLevelIncreaseHappyLevelAndHealthLevel(){
        orgDog.feed();
        assertEquals(orgDog.getHunger(),18);
        assertEquals(orgDog.getHappiness(),6);
        assertEquals(orgDog.getHealth(),12);
        orgCat.feed();
        assertEquals(orgCat.getHunger(),18);
        assertEquals(orgCat.getHappiness(),6);
        assertEquals(orgCat.getHealth(),8);
    }
    @Test
    public void waterAllOrganicPetsShouldDecreseThirstLevelAndIncreaseHealthLevel(){
        orgCat.water();
        assertEquals(orgCat.getThirst(),28);
        assertEquals(orgDog.getHealth(),10);
        orgDog.water();
        assertEquals(orgDog.getThirst(),15);
        assertEquals(orgCat.getHealth(),8);
    }

}
