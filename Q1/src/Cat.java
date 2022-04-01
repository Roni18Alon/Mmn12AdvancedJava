/*
Author: Roni Alon 315565176
Cat class reflect a cat, its attributes and methods associated with it.
*/
public class Cat extends Mammal implements Cloneable {

    private boolean isFat;
    private Owner catOwner;
    private final static String voice = "Meaw";
    private static final String catFood = "Tuna Fish";
    private static final int numOfLegs = 4;
    private static final int catSleepingHours = 6;

    public Cat(String name, int age, String color, boolean isFurry, String species, boolean isFat, Owner other) {
        super(name, age, color, voice, numOfLegs, catSleepingHours, catFood, isFurry, species);
        this.isFat = isFat;
        this.catOwner = new Owner(other);
    }

    public boolean getFat() {
        return this.isFat;
    }

    public void setFat(boolean fat) {
        this.isFat = fat;
    }

    public void sleep() {
        System.out.println(super.name + " The cat is sleeping for " + super.animalSleepHours + " hours");
    }

    public void eat() {
        System.out.println(super.name + " The cat is eating " + catFood);
    }

    public void makeSound() {
        System.out.println(voice);
    }

    public void move() {
        System.out.println(super.name+" The cat walk on " + numOfLegs);
    }

    public Owner getCatOwner() {
        return this.catOwner;
    }

    public void setOwner(Owner other) {
        this.catOwner = new Owner(other.getName(), other.getPhoneNumber());
    }

    //returns a string of the animal type
    public String getAnimalType() {
        return "Cat";
    }

    //override Object equals
    public boolean equals(Object obj) {
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat c = (Cat) obj;
        return super.equals(c) && this.catOwner.equals(c.catOwner) && this.isFat == c.isFat;
        //need to check if we have the same owner....
    }

    //This method returns a string with all the cat details using inheritance from mammal and animals classes
    public String toString() {
        return "The Cat " + super.toString() + " his owner is:" + this.catOwner.toString();
    }

    //Overriding the clone method
    protected Object clone() throws CloneNotSupportedException {
        Cat cloned = (Cat)super.clone();
        cloned.setOwner(cloned.catOwner);
        return cloned;
    }
}
