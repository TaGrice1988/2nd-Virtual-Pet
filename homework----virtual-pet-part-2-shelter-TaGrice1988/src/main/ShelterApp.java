
    import java.util.Scanner;

public class ShelterApp {
        public static void main(String[] args) {
            Scanner setup = new Scanner(System.in);
    
            System.out.println("Welcome to Digipet");
    
            System.out.println("What would you like to name your pet?");
    
            String petName = setup.nextLine();
System.out.println("Describe your pet.");
            String petDescription = setup.nextLine();
            VirtualPet pet = new VirtualPet(0, 0, 0, 0, 0, 0, petName, petDescription);
            Shelter shelter = new Shelter();
            shelter.addPet(pet);
            while (true) {
                // System.out.println("                            ..,,,,,,,,,.. \r\n" + //
                //         "                     .,;%%%%%%%%%%%%%%%%%%%%;,. \r\n" + //
                //         "                   %%%%%%%%%%%%%%%%%%%%////%%%%%%, .,;%%;, \r\n" + //
                //         "            .,;%/,%%%%%/////%%%%%%%%%%%%%%////%%%%,%%//%%%, \r\n" + //
                //         "        .,;%%%%/,%%%///%%%%%%%%%%%%%%%%%%%%%%%%%%%%,////%%%%;, \r\n" + //
                //         "     .,%%%%%%//,%%%%%%%%%%%%%%%%@@%a%%%%%%%%%%%%%%%%,%%/%%%%%%%;, \r\n" + //
                //         "   .,%//%%%%//,%%%%///////%%%%%%%@@@%%%%%%///////%%%%,%%//%%%%%%%%, \r\n" + //
                //         " ,%%%%%///%%//,%%//%%%%%///%%%%%@@@%%%%%////%%%%%%%%%,/%%%%%%%%%%%%% \r\n" + //
                //         ".%%%%%%%%%////,%%%%%%%//%///%%%%@@@@%%%////%%/////%%%,/;%%%%%%%%/%%% \r\n" + //
                //         "%/%%%%%%%/////,%%%%///%%////%%%@@@@@%%%///%%/%%%%%//%,////%%%%//%%%' \r\n" + //
                //         "%//%%%%%//////,%/%a`  'a%///%%%@@@@@@%%////a`  'a%%%%,//%///%/%%%%% \r\n" + //
                //         "%///%%%%%%///,%%%%@@aa@@%//%%%@@@@S@@@%%///@@aa@@%%%%%,/%////%%%%% \r\n" + //
                //         "%%//%%%%%%%//,%%%%%///////%%%@S@@@@SS@@@%%/////%%%%%%%,%////%%%%%' \r\n" + //
                //         "%%//%%%%%%%//,%%%%/////%%@%@SS@@@@@@@S@@@@%%%%/////%%%,////%%%%%' \r\n" + //
                //         "`%/%%%%//%%//,%%%///%%%%@@@S@@@@@@@@@@@@@@@S%%%%////%%,///%%%%%' \r\n" + //
                //         "  %%%%//%%%%/,%%%%%%%%@@@@@@@@@@@@@@@@@@@@@SS@%%%%%%%%,//%%%%%' \r\n" + //
                //         "  `%%%//%%%%/,%%%%@%@@@@@@@@@@@@@@@@@@@@@@@@@S@@%%%%%,/////%%' \r\n" + //
                //         "   `%%%//%%%/,%%%@@@SS@@SSs@@@@@@@@@@@@@sSS@@@@@@%%%,//%%//%' \r\n" + //
                //         "    `%%%%%%/  %%S@@SS@@@@@Ss` .,,.    'sS@@@S@@@@%'  ///%/%' \r\n" + //
                //         "      `%%%/    %SS@@@@SSS@@S.         .S@@SSS@@@@'    //%%' \r\n" + //
                //         "               /`S@@@@@@SSSSSs,     ,sSSSSS@@@@@' \r\n" + //
                //         "             %%//`@@@@@@@@@@@@@Ss,sS@@@@@@@@@@@'/ \r\n" + //
                //         "           %%%%@@00`@@@@@@@@@@@@@'@@@@@@@@@@@'//%% \r\n" + //
                //         "       %%%%%%a%@@@@000aaaaaaaaa00a00aaaaaaa00%@%%%%% \r\n" + //
                //         "    %%%%%%a%%@@@@@@@@@@000000000000000000@@@%@@%%%@%%% \r\n" + //
                //         " %%%%%%a%%@@@%@@@@@@@@@@@00000000000000@@@@@@@@@%@@%%@%% \r\n" + //
                //         "%%%aa%@@@@@@@@@@@@@@0000000000000000000000@@@@@@@@%@@@%%%% \r\n" + //
                //         "%%@@@@@@@@@@@@@@@00000000000000000000000000000@@@@@@@@@%%%%%");
                // System.out.println("\n" + pet.getName() + "'s status:");
                // System.out.println("age:"+pet.getAge());
                // System.out.println("Hunger: " + pet.getHunger());
                // System.out.println("playfulness: " + pet.getPlayfulness());
                // System.out.println("Thirst:" + pet.getThirst());
                // System.out.println("Sleepiness: " + pet.getSleepiness());
                // System.out.println("health:"+ pet.getHealth());
                System.out.println("This is the status of your pets");
                System.out.println(shelter.displayStatus());
                
    
                System.out.println("\nWhat do you want to do?");
                System.out.println("1. Feed your pet");
                System.out.println("2. Play with your pet");
                System.out.println("3. Fill your pet's water bowl");
                System.out.println("4. Give your pet a nap");
                System.out.println("5. give medicine");
                System.out.println("6.Add Pet to Shelter");
                System.out.println("7. Remove Pet from Shelter");
                System.out.println("8. Quit the game");
                System.out.println("9. Display Description.");
    
                int choice = setup.nextInt();
                setup.nextLine();
    
                shelter.timeInShelter();
    
                switch (choice) {
    
                    case 1:
                        shelter.feedShelter();
                        System.out.println("You fed" + pet.getName());
                        break;
                    case 2:
                        shelter.playWithPet(petName);
                        System.out.println(pet.getName() + " played with you.");
                        break;
                    case 3:
                        shelter.hydrateShelter();
                        System.out.println(pet.getName() + " gave your pet water your dog");
                        break;
                    case 4:
                        shelter.goToSleep();
                        System.out.println(pet.getName() + " took a nap");
                        break;
                    case 5:
                    shelter.healAnimals();
                    System.out.println(pet.getName() +"treated your pet");
                    break;
                    case 6:
                    System.out.println("What would you like to name your new pet you added to the shelter?");
                    String newPetName = setup.nextLine();
                    if(newPetName == petName) {
                        System.out.println("that pet already is in your possession");
                        break;
                    } else {System.out.println("Describe your new pet");
                    String newDescription = setup.nextLine();
                    VirtualPet newPet = new VirtualPet(0, 100, 0, 0, 0, 100, newPetName, newDescription);
                    shelter.addPet(newPet);
                    System.out.println(newPetName + " Has been added to the shelter!");
                    break; }
                    
                case 7:
                    System.out.println("Which pet would you like to remove from the shelter?");
                    String oldYeller = setup.nextLine();
                    shelter.adoption(oldYeller);
                    break;

                    case 8:
                        System.out.println("Thanks for playing! See Ya!.");
                        System.exit(0);
                        break;
                        case 9:
                        System.out.println("Which pet description would you like?");
                        String describe=setup.nextLine();
                        System.out.println( "\n"+shelter.inspectName(describe)+"  "+shelter.inspectDescription(describe)+"\n");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
    if (pet.getHunger() == 100) {
                    System.out.println("\nYour pet has starved to death, yikes");
                } else if (pet.getThirst() == 100) {
                    System.out.println("\n Your pet has died of thirst, ya hate to see it");
                } else if (pet.getSleepiness() == 100) {
                    System.out.println("\nYour pet grew wings and flew to heaven'");
                } else if (pet.getPlayfulness() == 0) {
                    System.out.println("Did you even love this dog, because he's dead now?! ;(");
                } else if (pet.getHealth() == 0) {
                    System.out.println("Damn he's dead; sorry for your loss");
                }
    
                if (pet.getHunger() == 100 || pet.getThirst() == 100 || pet.getSleepiness() == 100
                        || pet.getPlayfulness() == 0) {
                    System.out.println("\n" + pet.getName() + "'s status:");
                    System.out.println("Age: " + pet.getAge() + "Yr's Old");
                    System.out.println("Hunger: " + pet.getHunger()) ;
                    System.out.println("Playfulness: " + pet.getPlayfulness());
                    System.out.println("Thirst:" + pet.getThirst());
                    System.out.println("Sleepiness: " + pet.getSleepiness());
                    System.out.println("health:"+ pet.getHealth()+"\n");
                    System.out.println(pet.getName() + " has lived to " + pet.getAge() + " Yr's Old!\n");
                    System.out.println("Play again and try to raise you pet to a higher age");
                    setup.close();
                    System.exit(0);
                }
    
            }
        }
    
    }