package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        //Interact with a virtual_pet.VirtualPet object in this method
        VirtualPet lucy = new VirtualPet("lucy", 5, 5, 5);
        Scanner input = new Scanner(System.in);
        while (lucy.petIsAlive()) {
            lucy.petStatus();
            System.out.println("enter a number: \n 1 to feed lucy \n 2 to water lucy \n 3 to play lucy");
            int enter = input.nextInt();
            if (enter == 0) {
                System.out.println("error ! try other num");
            } else if (enter == 1) {
                lucy.feedPet();
                System.out.println("you feed lucy"
                );
            } else if (enter == 2) {
                lucy.waterPet();
                System.out.println("you water lucy");
            } else if (enter == 3) {
                lucy.playPet();
                System.out.println("you play lucy");
            } else {
                System.out.println("invalid option!");
            }
            lucy.tick();
        }
        if (lucy.getThirstLevel() > 10 || lucy.getHungerLevel() > 10) {
            System.out.println("lucy, is died \uD83D\uDE25! \n game over!");
        }
    }
}