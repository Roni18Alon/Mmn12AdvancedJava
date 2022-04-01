/*
Author: Roni Alon 315565176
Rooster class reflect a rooster, its attributes and methods associated with it.
 */
public class Rooster extends Poultry implements Cloneable {

    private String hourOfMorningCall; //the hour the rooster will start to call with his voice
    private static final String voice = "cock-a-doodle-doo";
    private static final String roosterFood = "Leftovers";
    private static final boolean roosterFly = false;
    private static final int numOfLegs = 2;
    private static final int roosterSleepingHours= 6;
    private static final String poultryMove= "walk";

    public Rooster(String name, int age, String color, String hourOfMorningCall) {
        super(name, age, color, voice, numOfLegs, roosterSleepingHours, roosterFood, poultryMove, roosterFly);
        this.hourOfMorningCall = hourOfMorningCall;
    }

    public String getHourOfMorningCall() {
        return this.hourOfMorningCall;
    }

    public void setHourOfMorningCall(String hour) {
        this.hourOfMorningCall = hour;
    }

    public void sleep() {
        System.out.println(super.name + " the rooster is sleeping for " + super.animalSleepHours + " hours");
    }

    public void eat() {
        System.out.println(super.name + " the rooster is eating " + roosterFood);
    }

    public void makeSound() {
        System.out.println(voice);
    }

    public void move() {
        System.out.println("walk on" + numOfLegs);
    }

    public void goFly() {
        if (roosterFly) {
            System.out.println(super.name+ " the rooster is Flying");
        }
        else System.out.println(super.name+ " the rooster can't Fly");
    }

    //returns a string of the animal type
    public String getAnimalType() {
        return "Rooster";
    }

    //override Object equals
    public boolean equals(Object obj) {
        if (!(obj instanceof Rooster)) {
            return false;
        }
        Rooster r = (Rooster) obj;
        return super.equals(r) && this.hourOfMorningCall.equals(r.hourOfMorningCall);
        //need to check if we have the same owner....
    }
    //This method returns a string with all the dog details using inheritance from poultry and Animals classes
    public String toString() {
        return "The rooster " + super.toString() + " will wake you up in: " + this.hourOfMorningCall ;
    }
    //Overriding the clone method
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
