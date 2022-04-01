/*
Author: Roni Alon 315565176
Reptile class reflect a general reptile, its attributes and methods associated with it.
 */
public abstract class Reptile extends Animals {

    protected int tailLength;
    protected String creepDistance;
    protected String move;
    private static final String reptileMove = "creep";

    public Reptile(String name, int age, String color,String voice, int numOfLegs, int animalSleepHours, String animalFood, int tailLength, String creepDistance) {
        super(name, age, color,voice ,numOfLegs, animalSleepHours, animalFood);
        this.tailLength = tailLength;
        this.creepDistance = creepDistance;
        this.move = reptileMove;

    }

    public int getTailLength() {
        return this.tailLength;
    }

    public void setTailLength(int newTailLength) {
        this.tailLength = newTailLength;
    }

    public String getCreepDistance() {
        return this.creepDistance;
    }

    public void setCreepDistance(String distance) {
        this.creepDistance = distance;
    }

    public String getMove() {
        return this.move;
    }

    public abstract void creep();

    public abstract void sleep();

    public abstract void eat();
    public abstract void makeSound();
    public abstract void move();
    public abstract String getAnimalType();

    //override Object equals
    public boolean equals(Object obj) {
        if (!(obj instanceof Reptile)) {
            return false;
        }
        Reptile r = (Reptile) obj;
        return super.equals(r) && this.tailLength == r.tailLength && this.creepDistance.equals(r.creepDistance) && this.move.equals(r.move);
    }
    //This method returns a string with all the Reptile details using inheritance animals classes
    public String toString(){
        return super.toString()+"tail length: "+this.tailLength+"move like: "+this.move+"creep for: "+this.creepDistance;
    }
}
