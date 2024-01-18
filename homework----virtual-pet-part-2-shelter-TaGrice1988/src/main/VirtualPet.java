public class VirtualPet{
    private String description;
private double age;
private int playfulness;
private int sleepiness;
private int hunger;
private int thirst;
private int health;

private String Name;

public VirtualPet(double age, int playfulness, int sleepiness, int hunger, int thirst, int health, String name, String description) {
    this.age = 1;
    this.playfulness = 100;
    this.sleepiness = 0;
    this.hunger = 0;
    this.thirst = 0;
    this.health = 100;
    Name = name;
    this.description=description;
}


    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public double getAge() {
        return this.age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getPlayfulness() {
        return this.playfulness;
    }

    public void setPlayfulness(int playfulness) {
        this.playfulness = playfulness;
    }



    public int getSleepiness() {
        return this.sleepiness;
    }

    public void setSleepiness(int sleepiness) {
        this.sleepiness = sleepiness;
    }

    public int getHunger() {
        return this.hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return this.thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }


 public void play() {
playfulness += 10;
if(playfulness > 100) {
    playfulness= 100;
}
}

public void heal(){
health +=10;
if(health > 100) {
health = 100;

}


}

public void feed(){
hunger-=10;
if(hunger < 0){
hunger = 0;

}

}

public void pourWater(){
thirst-=10;
if(thirst < 0){
thirst = 0;

}

}

public void sleep(){
sleepiness -=5;
if(sleepiness < 0){
sleepiness = 0;

}

}


public void Activity(){
    age += 0.5;
health -=(5+Math.floor(age));
if(health < 0){
health = 0;

}

playfulness -=(5+Math.floor(age));
if(playfulness < 0){
    playfulness=0;

}

thirst +=(5+Math.floor(age));
if(thirst > 100){
thirst=100;

}

hunger +=(5+Math.floor(age));
if(hunger > 100){
hunger=100;

}

sleepiness +=(5+Math.floor(age));
if(sleepiness > 100){
sleepiness=100;

}

}
}