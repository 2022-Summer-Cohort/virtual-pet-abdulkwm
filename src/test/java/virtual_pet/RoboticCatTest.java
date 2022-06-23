package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboticCatTest {
    RoboticCat roboCat = new RoboticCat("molli", "robotic cat", 10, 20, 50, 25, 20);
    @Test
    public void chargingRoboCatSHouldIncreaseChargerLevel(){
        roboCat.getCharge();
        assertEquals(roboCat.getChargeLevel(),25);
    }
}
