/*
Author: Roni Alon 315565176
Duck class reflect a duck, its attributes and methods associated with it.
 */
public class Duck extends Poultry implements Cloneable{

    private static final String voice = "Quack";
    private static final String duckFood = "seeds";
    private static final boolean duckFly=false;
    private static final int numOfLegs=2;
    private static final String duckMove = "swims";
    private static final int duckSleepingHours= 1;

    //constructor
    public Duck(String name, int age, String color) {
        super(name, age, color,voice, numOfLegs, duckSleepingHours,duckFood, duckMove, duckFly);
    }


    public void sleep() {
        System.out.println(super.name + " The duck is sleeping for " + super.animalSleepHours + " hours");
    }

    public void eat() {
        System.out.println(super.name + " The duck is eating " + duckFood);
    }

    public void makeSound() {
        System.out.println(voice);
    }

    public void move() {
        System.out.println(super.name + " The duck has " + numOfLegs+ " legs but he is mostly "+duckMove);
    }

    public void goFly() {
        if (duckFly) {
            System.out.println(super.name+ " The duck is Flying");
        }
        else System.out.println(super.name+ " The duck can't Fly");
    }

    //returns a string of The animal type
    public String getAnimalType() {
        return "Duck";
    }

    //override Object equals
    public boolean equals(Object obj){
        if (!(obj instanceof Duck))
        {
            return false;
        }
        Duck d = (Duck) obj;
        return super.equals(d) ;
    }
    //This method returns a string with all The duck details using inheritance from poultry and animals classes
    public String toString() {
        return  "The duck " + super.toString() ;
    }

    //Overriding The clone method
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
