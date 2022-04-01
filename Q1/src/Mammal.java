/*
Author: Roni Alon 315565176
Mammal class reflect a general mammal, its attributes and methods associated with it.
 */
public abstract class  Mammal extends Animals{

    protected boolean isFurry;
    protected String species;

    public Mammal(String name,int age, String color,String voice,int numOfLegs,int animalSleepHours,String animalFood,boolean isFurry,String species){
        super(name,age,color,voice,numOfLegs,animalSleepHours,animalFood); //send to Animal constructor
        this.isFurry=isFurry;
        this.species=species;
    }
    public abstract void sleep();
    public abstract void eat();
    public abstract void makeSound();
    public abstract void move();
    public abstract String getAnimalType();

    public boolean getFurry() {
        return this.isFurry;
    }

    public void setFurry(boolean furry) {
        this.isFurry = furry;
    }
    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    //override Object equals
    public boolean equals (Object obj) {
        if (!(obj instanceof Mammal)) {
            return false;
        }
        Mammal m = (Mammal) obj;
        return super.equals(m) && this.species.equals(m.species);
    }
    //This method returns a string with all the Mammal details using inheritance animals classes
    public String toString(){
        return super.toString()+ " species: "+this.species+" furry: "+this.isFurry;
    }
}
