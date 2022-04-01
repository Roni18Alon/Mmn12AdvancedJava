/*
Author: Roni Alon 315565176
Dog class reflect a dog, its attributes and methods associated with it.
 */

public class Dog extends Mammal implements Cloneable {

    private boolean isTrained;
    private Owner owner;
    private final static String voice = "Woof";
    private static final String dogFood = "bonzo";
    private static final int numOfLegs=4;
    private static final int dogSleepingHours= 8;

    //constructor
    public Dog(String name, int age, String color, boolean isFurry, String species, boolean isTrained,Owner other) {
        super(name, age, color,voice ,numOfLegs, dogSleepingHours, dogFood, isFurry, species);
        this.isTrained = isTrained;
        this.owner= new Owner(other);
    }


    public boolean getIsTrained() {
        return this.isTrained;
    }

    public void setIsTrained(boolean value) {
        this.isTrained = value;
    }


    public void sleep() {
        System.out.println(super.name + " the dog is sleeping for " + dogSleepingHours + " hours");
    }

    public void eat() {
        System.out.println(super.name + " the dog is eating " + dogFood);
    }

    public void makeSound() {
        System.out.println(voice);
    }

    public void move() {
        System.out.println("walk on"+numOfLegs);
    }

    public Owner getOwner(){
        return this.owner;
    }

    public void setOwner(Owner other){
        this.owner=new Owner(other.getName(), other.getPhoneNumber());
    }

    //returns a string of the animal type
    public String getAnimalType() {
        return "Dog";
    }

    //override Object equals
    public boolean equals(Object obj){
        if (!(obj instanceof Dog))
        {
            return false;
        }
        Dog d = (Dog)obj;
        return super.equals(d) && this.isTrained==d.isTrained && owner.equals(d.owner);
    }

    //This method returns a string with all the dog details using inheritance from mammal and animals classes
    public String toString(){
        return "The Dog "+super.toString()+" his owner is: "+this.owner.toString();
    }


    //Overriding the clone method
    protected Object clone() throws CloneNotSupportedException {
        Dog cloned = (Dog)super.clone();
        cloned.setOwner(cloned.owner);
        return cloned;
    }

}
