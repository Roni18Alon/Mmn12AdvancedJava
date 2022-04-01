/*
Author: Roni Alon 315565176
Parrot class reflect a parrot, its attributes and methods associated with it.
 */
public class Parrot extends Poultry implements Cloneable{

    private boolean canTalk;
    private Owner parrotOwner;
    private static final String voice = "tweet";
    private static final String parrotFood = "seeds";
    private static final boolean parrotFly = true;
    private static final String parrotMove = "jumps";
    private static final int numOfLegs = 2;
    private static final int parrotSleepingHours = 3;


    public Parrot(String name, int age, String color, boolean canTalk, Owner other) {
        super(name, age, color, voice, numOfLegs, parrotSleepingHours, parrotFood, parrotMove, parrotFly);
        this.canTalk = canTalk;
        this.parrotOwner = new Owner(other);
    }

    public boolean getTalk() {
        return this.canTalk;
    }

    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }

    public void sleep() {
        System.out.println(super.name + " the parrot is sleeping for " + super.animalSleepHours + " hours");
    }

    public void eat() {
        System.out.println(super.name + " the parrot is eating " + parrotFood);
    }

    public void makeSound() {
        System.out.println(voice);
    }

    public void move() {
        System.out.println(super.name + " the parrot has " + numOfLegs + " legs but he is mostly " + parrotMove);
    }

    public void goFly() {
        System.out.println(super.name + " the duck can fly? " + canFly);
    }

    public Owner getParrotOwner(){
        return this.parrotOwner;
    }

    public void setparrotOwner(Owner other){
        this.parrotOwner=new Owner(other.getName(), other.getPhoneNumber());
    }

    //returns a string of the animal type
    public String getAnimalType() {
        return "Parrot";
    }

    //override Object equals
    public boolean equals(Object obj) {
        if (!(obj instanceof Parrot)) {
            return false;
        }
        Parrot p = (Parrot) obj;
        return super.equals(p) && this.parrotOwner.equals(p.parrotOwner) && this.canTalk == p.canTalk;
    }

    //This method returns a string with all the dog details using inheritance from poultry and animals classes
    public String toString() {
        return "The parrot " + super.toString() + " can talk: " + this.canTalk + " his owner: " + parrotOwner.toString();
    }

    //Overriding the clone method
    protected Object clone() throws CloneNotSupportedException {
        Parrot cloned = (Parrot) super.clone();
        cloned.setparrotOwner(cloned.parrotOwner);
        return cloned;
    }
}
