package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboticPetTest {
    RoboticPet roboCat = new RoboticCat("molli", "robotic cat", 10, 20, 50, 25, 20);
    RoboticPet roboDog = new RoboticDog("doggy", "robotic dog", 15, 20, 24, 22);
    @Test
    public void oilRoboticPetShouldIncreaseOilLevel(){
        roboCat.oilRoboticPets();
        assertEquals(roboCat.getOilLevel(),30);
        roboDog.oilRoboticPets();
        assertEquals(roboDog.getOilLevel(),27);
    }
    @Test
    public void maintenRoboticDogShouldDecreaseMaintenanceLevelAndIncreaseHappinesLevel(){
        roboCat.PreformMaintenance();
        assertEquals(roboCat.getMaintenance(),45);
        assertEquals(roboCat.getHappiness(),15);
        roboDog.PreformMaintenance();
        assertEquals(roboDog.getMaintenance(), 19);
        assertEquals(roboDog.getHappiness(),20);
    }
}
