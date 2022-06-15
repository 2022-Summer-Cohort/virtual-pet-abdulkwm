package virtual_pet;

import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PetShelter petShelter = new PetShelter();
        petShelter.showAllPets();
        int userInput = 0;
        System.out.println(" ");
        OrganicCat orgCat = new OrganicCat("lucy", "Organic Cat", 5, 6, 23, 33, 11, 11);
        OrganicDog orgDog = new OrganicDog("teddy", "Organic dog", 5, 10, 23, 20, 10, 10, 15);
        RoboticCat roboCat = new RoboticCat("molli", "robotic cat", 10, 20, 50, 25, 20);
        RoboticDog roboDog = new RoboticDog("doggy", "robotic dog", 15, 20, 24, 22);
        petShelter.addPet(orgCat);
        petShelter.addPet(orgDog);
        petShelter.addPet(roboCat);
        petShelter.addPet(roboDog);

        while (!(userInput == 11) && orgCat.getHunger() <= 100) {

            System.out.println("Here are our pets and their current status:");
            System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOil Level\tMaintenance");
            petShelter.showAllPets();
            System.out.println();
            System.out.println("How would you like to help?");
            System.out.println("1. Feed Organic pet");
            System.out.println("2. Water Organic Pet");
            System.out.println("3. Oil the robotic pets");
            System.out.println("4. Charge Robotic Cat");
            System.out.println("5. Preform maintenance robotic pets");
            System.out.println("6. Clean the dog cages");
            System.out.println("7. Clean the litter box");
            System.out.println("8. Walk all the dogs");
            System.out.println("9. Adopt a pet");
            System.out.println("10. Admit a pet");
            System.out.println("11. Leave");
            input.nextLine();
            userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    petShelter.feed();
                    petShelter.showAllPets();
                    break;
                case 2:
                    petShelter.water();
                    petShelter.showAllPets();
                    break;
                case 3:
                    System.out.println("you oil robotic pets");
                    petShelter.oilRoboticPets();
                    petShelter.showAllPets();
                    break;
                case 4:
                    System.out.println("you charge robotic cat");
                    petShelter.chargeRoboticCat();
                    petShelter.showAllPets();
                    break;
                case 5:
                    System.out.println("you perform maintenance on Robotic pet");
                    petShelter.preformMaintenance();
                    petShelter.showAllPets();
                    break;
                case 6:
                    System.out.println("You clean Dog cages");
                    petShelter.cleanOrganicDogCages();
                    petShelter.showAllPets();
                    break;
                case 7:
                    System.out.println("You clean cat Litter Boxes");
                    petShelter.cleanOrganicCatLitterBox();
                    petShelter.showAllPets();
                    break;
                case 8:
                    System.out.println("You took pets on a walk");
                    petShelter.walkAllDogs();
                    petShelter.showAllPets();
                    break;
                case 9:
                    System.out.println("which pet you want adopt?");
                    petShelter.showAllPets();
                    input.nextLine();
                    String adoptedPetName = input.nextLine();
                    petShelter.removePet(adoptedPetName);
                    System.out.println("You adopt pet : " + adoptedPetName);
                    break;
                case 10:
                    System.out.println("what is the name of pet you want to admit?");
                    String admitPetName = input.nextLine();
                    System.out.println("What is pet description?");
                    System.out.println("1. Organic Cat");
                    System.out.println("2. Organic Dog");
                    System.out.println("3. Robotic Cat");
                    System.out.println("4. Robotic Dog");
                    int inPuts = input.nextInt();
                    switch (inPuts) {
                        case 1:
                            petShelter.addPet(new OrganicCat(admitPetName, "Organic Cat", 10, 5, 5, 7, 7, 9));
                            break;
                        case 2:
                            petShelter.addPet(new OrganicDog(admitPetName, "Organic Dog", 5, 8, 9, 8, 10, 7, 11));
                            break;
                        case 3:
                            petShelter.addPet(new RoboticCat(admitPetName, "Robotic Cat", 10, 18, 19, 15, 10));
                            break;
                        case 4:
                            petShelter.addPet(new RoboticDog(admitPetName, "Robotic Dog", 18, 12, 19, 18));
                            break;
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                default:
                    System.out.println("game over! come back again!");
                    break;
            }
            if (orgCat.getThirst() > 100 || orgCat.getLitterBox() > 100 || orgCat.getHunger() > 100 || orgCat.getHappiness() > 100) {
                System.out.println("your pet died \n come back and play again");
            } else if (orgDog.getSoilDogCage() > 100 || orgDog.getThirst() > 100 || orgDog.getHealth() < 0 || orgDog.getHunger() > 100) {
                System.out.println("your pet died \n come back and play again");
            } else if (roboCat.getChargeLevel() < 0) {
                System.out.println("battery low charge your pet");
            } else if (roboDog.getOilLevel() < 0 || roboCat.getMaintenance() > 100) {
                System.out.println("you need to look your pet it got problem");
            }
//                petShelter.tick();
        }
    }
}

