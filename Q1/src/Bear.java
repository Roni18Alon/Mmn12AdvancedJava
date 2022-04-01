/*
Author: Roni Alon 315565176
Bear class reflect a bear, its attributes and methods associated with it.
*/

public class Bear extends Mammal implements Cloneable{

    private String habitatLocation;
    private static final String voice = "whaaa";
    private static final String bearFood = "Salmon Fish";
    private static final int numOfLegs=2;
    private static final int bearSleepingHours= 12;

    //constructor
    public Bear(String name, int age, String color, boolean isFurry, String species, String habitatLocation) {
        super(name, age, color,voice, numOfLegs, bearSleepingHours, bearFood, isFurry, species);
        this.habitatLocation = habitatLocation;
    }

    public String getHabitatLocation() {
        return this.habitatLocation;
    }

    public void setHabitatLocation(String location) {
        this.habitatLocation = location;
    }

    public void sleep() {
        System.out.println(super.name + " The Bear is sleeping for " + bearSleepingHours + " hours");
    }

    public void eat() {
        System.out.println(super.name + " The Bear is eating " + bearFood);
    }

    public void makeSound() {
        System.out.println(voice);
    }

    public void move() {
        System.out.println(super.name+" The Bear walk on " + numOfLegs);
    }

    //returns a string of the animal type
    public String getAnimalType() {
        return "Bear";
    }
    //override Object equals
    public boolean equals(Object obj) {
        if (!(obj instanceof Bear)) {
            return false;
        }
        Bear b = (Bear) obj;
        return super.equals(b) && this.habitatLocation.equals(b.habitatLocation);
    }
    //This method returns a string with all the bear details using inheritance from mammal and animals classes
    public String toString(){
        return "The Bear "+super.toString()+" he lives in: "+this.habitatLocation;
    }

    //Overriding the clone method
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}