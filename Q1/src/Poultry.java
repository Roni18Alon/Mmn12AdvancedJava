/*
Author: Roni Alon 315565176
Poultry class reflect a general poultry, its attributes and methods associated with it.
 */
public abstract class Poultry extends Animals  {

    protected String poultryMove;
    protected boolean canFly;

    public Poultry(String name, int age, String color,String voice, int numOfLegs, int animalSleepHours, String animalFood, String poultryMove, boolean canFly) {
        super(name, age, color,voice ,numOfLegs, animalSleepHours, animalFood);
        this.poultryMove = poultryMove;
        this.canFly = canFly;
    }

    public abstract void sleep();
    public abstract void eat();
    public abstract void makeSound();
    public abstract void move();
    public abstract void goFly();
    public abstract String getAnimalType();


    public String getPoultryMove() {
        return this.poultryMove;
    }

    public void setPoultryMove(String move) {
        this.poultryMove = move;
    }

    public boolean getFly() {
        return this.canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    //override Object equals
    public boolean equals(Object obj) {
        if (!(obj instanceof Poultry)) {
            return false;
        }
        Poultry p = (Poultry) obj;
        return super.equals(p) && this.poultryMove.equals(p.poultryMove) && this.canFly == p.canFly;
    }
    //This method returns a string with all the Poultry details using inheritance animals classes
    public String toString(){
        return super.toString()+" moves like: "+this.poultryMove+" can fly: "+this.canFly;
    }
}
