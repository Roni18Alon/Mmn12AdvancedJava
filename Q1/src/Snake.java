/*
Author: Roni Alon 315565176
Snake class reflect a snake, its attributes and methods associated with it.
 */
public class Snake extends Reptile implements Cloneable{

    private Owner snakeOwner;
    private static final String creepDistance = "100 m";
    private static final String voice = "kssssss";
    private static final String snakeFood = "rats";
    private static final int numOfLegs = 0;
    private static final int snakeSleepingHours= 3;

    //constructor
    public Snake(String name, int age, String color, int tailLength,Owner other) {
        super(name, age, color, voice, numOfLegs, snakeSleepingHours, snakeFood, tailLength, creepDistance);
        this.snakeOwner = new Owner(other);
    }


    public void creep() {
        System.out.println(super.name + " the snake " + super.move + " for " + creepDistance);
    }

    public void sleep() {
        System.out.println(super.name + " the snake is sleeping for " + super.animalSleepHours + " hours");
    }

    public void eat() {
        System.out.println(super.name + " the snake is eating " + snakeFood);
    }

    public void makeSound() {
        System.out.println(voice);
    }

    public void move() {
        System.out.println(super.name + " the snake is " + super.move + " he has " + numOfLegs + " legs");
    }

    public Owner getSnakeOwner() {
        return this.snakeOwner;
    }

    public void setSnakeOwner(Owner other) {
        this.snakeOwner = new Owner(other.getName(), other.getPhoneNumber());
    }

    //returns a string of the animal type
    public String getAnimalType() {
        return "Snake";
    }
    //override Object equals
    public boolean equals(Object obj) {
        if (!(obj instanceof Snake)) {
            return false;
        }
        Snake s = (Snake) obj;
        return super.equals(s) && this.snakeOwner.equals(s.snakeOwner);
    }
    //This method returns a string with all the alligator details using inheritance from Reptile and animals classes
    public String toString() {
        return "The Snake " + super.toString() + " his owner is: " + this.snakeOwner.toString();
    }

    //Overriding the clone method
    protected Object clone() throws CloneNotSupportedException {
        Snake cloned = (Snake) super.clone();
        cloned.setSnakeOwner(cloned.snakeOwner);
        return cloned;
    }

}
