package virtual_pet;

import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        VirtualPetShelter shelter = new VirtualPetShelter();
        Scanner input = new Scanner(System.in);
        while (shelter.petsAlive()) {
            shelter.showThePetStatus();
            System.out.println("What would you like to do?");
            System.out.println("\t 1: Feed All Pets");
            System.out.println("\t 2: Watering All Pets");
            System.out.println("\t 3: feed specific pet");
            System.out.println("\t 4: Remove a Pet");
            System.out.println("\t 5: Adoption of Pet");
            int response = input.nextInt();
            input.nextLine();

            switch (response) {
                case 1:
                    shelter.feedAllPets();
                    System.out.println("All Pet has been Feeded");
                    break;
                case 2:
                    shelter.waterAllPet();
                    System.out.println("All Pet has been Watered");
                    break;
                case 3:
                    System.out.println("enter name of pet you want to feed");
                    String petName = input.nextLine();
                    shelter.feedSpecificPet(petName);
                    System.out.println("you feed pet" + petName);
                    break;
                case 4:
                    System.out.println("enter name of pet you want to adopt");
                    shelter.removePet(input.nextLine());
                    System.out.println("pet is removed");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            shelter.tick();
        }

    }
}
