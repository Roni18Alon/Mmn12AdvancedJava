/*
Author: Roni Alon 315565176
Alligator class reflect an alligator, its attributes and methods associated with it.
 */
public class Alligator extends Reptile implements Cloneable {

    private Owner alligatorOwner;
    private static final String creepDistance="100000 m";
    private static final String voice = "raaaaa";
    private static final String alligatorFood = "human";
    private static final int numOfLegs=4;
    private static final int alligatorSleepingHours= 5;
    
    //constructor
    public Alligator(String name, int age, String color, int tailLength,Owner other ) {
        super(name, age, color,voice ,numOfLegs, alligatorSleepingHours, alligatorFood, tailLength, creepDistance);
        this.alligatorOwner=new Owner(other);
    }


    public void creep() {
        System.out.println(super.name + " The alligator "+super.move+" for "+creepDistance);
    }

    public void sleep() {
        System.out.println(super.name + " The alligator is sleeping for " + super.animalSleepHours + " hours");
    }

    public void eat() {
        System.out.println(super.name + " The alligator is eating " + alligatorFood);
    }

    public void makeSound() {
        System.out.println(voice);
    }

    public void move() {
        System.out.println(super.name + " The alligator is "+super.move+" he has "+ numOfLegs+" legs");
    }

    public Owner getAlligatorOwner(){
        return this.alligatorOwner;
    }

    public void setAlligatorOwner(Owner other){
        this.alligatorOwner=new Owner(other.getName(), other.getPhoneNumber());
    }

    //returns a string of The animal type
    public String getAnimalType() {
        return "Alligator";
    }

    //override Object equals
    public boolean equals(Object obj){
        if (!(obj instanceof Alligator))
        {
            return false;
        }
        Alligator a = (Alligator) obj;
        return super.equals(a) ;
    }

    //This method returns a string with all The alligator details using inheritance from Reptile and animals classes
    public String toString() {
        return  "The Alligator "+super.toString()+" his owner is:"+this.alligatorOwner.toString();
    }

    //Overriding The clone method
    protected Object clone() throws CloneNotSupportedException {
        Alligator cloned = (Alligator) super.clone();
        cloned.setAlligatorOwner(cloned.alligatorOwner);
        return cloned;
    }

}
