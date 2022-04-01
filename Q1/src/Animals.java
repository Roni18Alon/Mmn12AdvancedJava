public abstract class Animals {
    protected int age;
    protected String name;
    protected String color;
    protected int numOfLegs;
    protected int animalSleepHours;
    protected String animalFood;
    protected String voice;


    public Animals(String name, int age, String color, String voice, int numOfLegs, int animalSleepHours, String animalFood) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.voice = voice;
        this.numOfLegs = numOfLegs;
        this.animalSleepHours = animalSleepHours;
        this.animalFood = animalFood;
    }

    public abstract void sleep();
    public abstract void eat();
    public abstract void makeSound();
    public abstract void move();
    public abstract String getAnimalType();

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }


    public int getNumOfLegs() {
        return this.numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public int getAnimalSleepHours() {
        return this.animalSleepHours;
    }

    public void setAnimalSleepHours(int animalSleepHours) {
        this.animalSleepHours = animalSleepHours;
    }

    public String getAnimalFood() {
        return this.animalFood;
    }

    public void setAnimalFood(String animalFood) {
        this.animalFood = animalFood;
    }

    public String getVoice() {
        return this.voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Animals)) {
            return false;
        }
        Animals a = (Animals) obj;
        return this.age == a.age && this.numOfLegs == a.numOfLegs && this.name.equals(a.name) && this.color.equals(a.color);
    }

    public String toString() {
        return "name is: " + this.name + " color: " + this.color + " age: " + this.age + " voice: " + this.voice + " number of legs: " + numOfLegs + " sleeping hours : " + this.animalSleepHours + " eating: " + this.animalFood;
    }

}
