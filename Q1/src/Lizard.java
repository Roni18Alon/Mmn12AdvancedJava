/*
Author: Roni Alon 315565176
Lizard class reflect a lizard, its attributes and methods associated with it.
 */

public class Lizard extends Reptile implements Cloneable {

    private static final String creepDistance="300 m";
    private static final String voice = "mmmmm";
    private static final String lizardFood = "mosquitoes";
    private static final int numOfLegs=4;
    private static final int lizardSleepingHours= 17;

    public Lizard(String name, int age, String color, int tailLength) {
        super(name, age, color,voice ,numOfLegs, lizardSleepingHours, lizardFood, tailLength, creepDistance);
    }

    public void creep() {
        System.out.println(super.name + " The lizard "+super.move+" for "+creepDistance);
    }

    public void sleep() {
        System.out.println(super.name + " The lizard is sleeping for " + super.animalSleepHours + " hours");
    }

    public void eat() {
        System.out.println(super.name + " The lizard is eating " + lizardFood);
    }

    public void makeSound() {
        System.out.println(voice);
    }

    public void move() {
        System.out.println(super.name + " The lizard is "+super.move+" he has "+ numOfLegs+" legs");
    }

    //returns a string of the animal type
    public String getAnimalType() {
        return "Lizard";
    }
    //override Object equals
    public boolean equals(Object obj){
        if (!(obj instanceof Lizard))
        {
            return false;
        }
        Lizard l = (Lizard) obj;
        return super.equals(l) ;
    }
    //This method returns a string with all the lizard details using inheritance from Reptile and animals classes
    public String toString(){
        return "The Lizard "+super.toString();
    }

    //Overriding the clone method
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
