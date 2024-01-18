import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Shelter {
    private Map<String, VirtualPet> pets = new HashMap<>();

    public void addPet(VirtualPet pet) {
        this.pets.put(pet.getName(), pet);
    }

    public VirtualPet inspectPet(String petName) {
        return this.pets.get(petName);
    }

    public Collection<VirtualPet> displayColl() {
        return this.pets.values();
    }

    public void adoption(String petName) {
        this.pets.remove(petName);
    }

    public void feedShelter() {
        for (Entry<String, VirtualPet> fedPet : pets.entrySet()) {
            fedPet.getValue().feed();
        }
    }
    public void goToSleep() {
        for (Entry<String, VirtualPet> restedPet : pets.entrySet()) {
            restedPet.getValue().sleep();
        }
    }

    public void hydrateShelter() {
        for (Entry<String, VirtualPet> hydratedPet : pets.entrySet()) {
            hydratedPet.getValue().pourWater();
        }
    }

    public void playWithPet(String petName) {
        this.pets.get(petName).play();
    }

    public void healAnimals(){
        for (Entry<String, VirtualPet> healPet : pets.entrySet()){
            healPet.getValue().heal();
        }
    }

    public String inspectDescription(String petName) {
        return this.pets.get(petName).getDescription();
    }

    public String inspectName(String petName) {
        return this.pets.get(petName).getName();
    }

    public void timeInShelter() {
        for (Entry<String, VirtualPet> agedPet : pets.entrySet()) {
            String key = agedPet.getKey();
            pets.get(key).Activity();
        }
    }

    public String displayStatus() {
        String statusOfShelter = "";
        for (Entry<String, VirtualPet> petStat : pets.entrySet()) {
            statusOfShelter += "Name: " + petStat.getValue().getName() + "   " + "Age: " + petStat.getValue().getAge()
                    + "  " + "Hunger: " + petStat.getValue().getHunger() + "   " + "playfulness: "
                    + petStat.getValue().getPlayfulness() + "   " + "Thirst: " + petStat.getValue().getThirst() + "   "
                    + "Sleepiness: " + petStat.getValue().getSleepiness() + "   " + "Health: "+ petStat.getValue().getHealth()+"\n" + "";
        }
        return statusOfShelter;

    }
}
// private String bird;
// private String dog;
// private String cat;
// private String fish;
// private String monkey;
// private String lizard;
// private String snake;
// private String turtle;
// private String name;
// private int hunger;
// private int thirst;
// private int sleepiness;
// private int playfulness;
// private int health;

// public Shelter(String bird, String dog, String cat, String fish, String
// this.lizard = lizard;
// this.snake = snake;
// this.turtle = turtle;
// }

// public String getBird() {
// return this.bird;
// }

// public void setBird(String bird) {
// this.bird = bird;
// }

// public String getDog() {
// return this.dog;
// }

// public void setDog(String dog) {
// this.dog = dog;
// }

// public String getCat() {
// return this.cat;
// }

// public void setCat(String cat) {
// this.cat = cat;
// }

// public String getFish() {
// return this.fish;
// }

// public void setFish(String fish) {
// this.fish = fish;
// }

// public String getMonkey() {
// return this.monkey;
// }

// public void setMonkey(String monkey) {
// this.monkey = monkey;
// }

// public String getLizard() {
// return this.lizard;
// }

// public void setLizard(String lizard) {
// this.lizard = lizard;
// }

// public String getSnake() {
// return this.snake;
// }

// public void setSnake(String snake) {
// this.snake = snake;
// }

// public String getTurtle() {
// return this.turtle;
// }

// public void setTurtle(String turtle) {
// this.turtle = turtle;
// }

// }
