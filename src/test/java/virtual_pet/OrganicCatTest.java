package virtual_pet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class OrganicCatTest {
    OrganicCat cat = new OrganicCat("lucy", "Organic Cat", 5, 6, 23, 33, 11, 11);
    @Test
    public void shouldBeAbleToCleanCatLitterBoxes(){
        int litterBeforeClean = cat.getLitterBox();
                cat.cleanLitterBox();
        int litterAfterClean = cat.getLitterBox();
        assertEquals((litterBeforeClean + litterAfterClean),12);
    }
}
